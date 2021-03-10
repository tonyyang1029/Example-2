import java.util.ArrayList;
import java.util.List;

public class ObjectExample {
    public void showSample1() {
        Point p = new Point(1, 2);
        Point q = p;

        System.out.println("p.x : " + p.x);
        q.x = 13;
        System.out.println("p.x : " + p.x);
    }

    public void showSample2() {
        char[] greet = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(greet);

        char[] cuss = greet;
        cuss[4]  = '!';
        System.out.println(greet);
    }

    public void showSample3() {
        int x = 100;
        System.out.println(x);

        changePrimitive(x);
        System.out.println(x);
    }

    private void changePrimitive(int x) {
        while (x > 0) {
            x--;
        }
    }

    public void showSample4() {
        Point p = new Point(3, 4);
        System.out.println(p.toString());

        changeReference(p);
        System.out.println(p.toString());
    }

    private void changeReference(Point p) {
        while (p.x > 0) {
            p.x--;
        }
    }

    public void showSample5() {
        String letter = "o";
        String s = "hello";
        String t = "hell" + letter;
        if (s == t) {
            System.out.println("s == t : true");
        }
        if (s.equals(t)) {
            System.out.println("s.equals(t) : true");
        }

        byte[] a = {1, 2, 3};
        byte[] b = a.clone();
        if (a == b) {
            System.out.println("a == b : true");
        }
    }

    public void showSample6() {
        Integer i = 0;
        Number n = 0.0f;
        int j = i;
        i++;
        Integer k = i + 2;
        i = null;
        j = i;

        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        int ii = numbers.get(0);
    }
}
