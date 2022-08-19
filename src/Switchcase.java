import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day =in.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("These are weekdays");
            case 6,7 -> System.out.println("These are weekends");
            default -> System.out.println("A week have only 7 days");
        }

//        String fruit =in.next();
//        switch (fruit){
//            case "Apple" -> System.out.println("a  very sweet fruit");
//            case "Mango" -> System.out.println("a  sweet yellow fruit");
//            case "Graps" -> System.out.println("a  sweet green fruit");
//            default -> System.out.println("please Enter a valid fruit");
//        }

    }
}
