import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID =in.nextInt();
        String department = in.next();
        switch (empID){
            case 1 -> System.out.println("Employe name - Shubham gumasta");
            case 2 -> System.out.println("Employe name - Shubh Gumasta");
            case 3 ->{
                    System.out.println("Employe name - Shubham ");
                switch (department){
                    case "IT" -> System.out.println("Shubh's department is IT");
                    case "Management" -> System.out.println(" No,Shubh's department is IT");
                    default -> System.out.println(" No,Deparmennt is Entereed");
                }
            }
            default -> System.out.println("Enter valid ID");
        }
    }

}
