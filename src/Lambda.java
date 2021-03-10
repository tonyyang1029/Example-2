import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lambda {
    private Runnable runnable = null;
    private ActionListener listener = null;

    public Lambda() {
        runnable = () -> System.out.println("Greeting from Lambda runnable.");

        listener = e -> {
            System.out.println("Event fired at: " + e.getWhen());
            System.out.println("Event command: " + e.getActionCommand());
        };
    }

    public void run() {
        Thread thread = new Thread(runnable);
        thread.run();
    }

    public void start() {
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public void printEvent(ActionEvent event) {
        listener.actionPerformed(event);
    }
}
