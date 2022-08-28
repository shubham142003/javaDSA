import java.util.Scanner;

public class Largestnum {
    static int max(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = in.nextInt();
        System.out.println("Enter second number: ");
        int second = in.nextInt();
        System.out.println("Enter third number: ");
        int third = in.nextInt();
        max(first,second,third);
        System.out.println("The largest number is :"+max(first,second,third));
        int minum = min(first,second,third);
        System.out.println("The smallest number is :"+minum);

    }

}
