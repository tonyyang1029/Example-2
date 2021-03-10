import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    /*String[] arrayOfStrings;
    int[][] arrayOfArrayOfInt;

    Object[] oa = arrayOfStrings;

    Comparable[] ca = arrayOfStrings;

    Object[] oa2 = arrayOfArrayOfInt;

    Object o = arrayOfStrings;
    Cloneable c = arrayOfArrayOfInt;
    Serializable s = arrayOfArrayOfInt[0];*/

    byte[] buffer = new byte[1024];
    String[] lines = new String[50];

    String[] greetings = new String[] {
            "Hello",
            "Hi",
            "Howdy"
    };
    int[] smallPrimes = new int[] {
            2,  3,  5,  7,
            11, 13, 17, 19
    };


    private String askQuestion(String question, String[] tips) {
        System.out.println(question + " " + Arrays.asList(tips).toString());
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void askQuestion() {
        String response = askQuestion("Do you want to quit?", new String[] {"Yes", "No"});
        System.out.println("Response: " + response);
    }

    private double computeAreaOfTriangle(Point p1, Point p2, Point p3) {
        return 10;
    }

    private double computeAreaOfTriangle(Point[] points) {
        return 20;
    }

    public void computeAreaOfTriangle() {
        double area = computeAreaOfTriangle(new Point(1, 2),
                                            new Point(3, 4),
                                            new Point(3, 2));
        System.out.println("Area 1: " + area);

        area = computeAreaOfTriangle(new Point[] {
                new Point(1, 2),
                new Point(3, 4),
                new Point(3, 2)
        });
        System.out.println("Area 2: " + area);
    }

    public void showSample() {
        String question = "Do you want to quit?";
        String[] responses = new String[2];
        responses[0] = "Yes";
        responses[1] = "No";

        System.out.println(question + " (" + responses[0] + "/" + responses[1] + "): ");

        byte[][] data = new byte[][] {
                { 1,  2,  3,  4},
                { 4,  5,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16}
        };
    }

    public void showSample2() {
        int[] primes = {2, 3, 5, 7, 11, 13, 19, 23};
        int sumOfPrimes = 0;

        for (int i = 0; i < primes.length; i++) {
            sumOfPrimes += primes[i];
        }
        System.out.println("Sum 1: " + sumOfPrimes);

        sumOfPrimes = 0;
        for (int p : primes) {
            sumOfPrimes += p;
        }
        System.out.println("Sum 2: " + sumOfPrimes);
    }
}
