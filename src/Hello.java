import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        String name = INPUT.nextLine();

        System.out.println("Hello "+ name);
    }
}