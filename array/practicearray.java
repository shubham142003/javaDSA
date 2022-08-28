import java.util.Arrays;
import java.util.Scanner;

public class practicearray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("Enter 7 numbers : ");
        for (int i = 0; i<arr.length; i++){

            arr[i]=in.nextInt();
        }
        System.out.println("Array elements are -"+Arrays.toString(arr));
    }
}
