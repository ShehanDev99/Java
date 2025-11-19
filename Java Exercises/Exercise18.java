import java.util.Scanner;
public class Exercise18 {

    //Enhanced Switch Statement in Java.
    public static void main(String[] args){
        String day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day: ");
        day = scanner.nextLine().toLowerCase();

        //  Method(1)
        /*
        switch(day){
            case "monday" -> System.out.println("It's a weekday.");
            case "tuesday" -> System.out.println("It's a weeksday.");
            case "wednesday" -> System.out.println("It's a weekday.");
            case "thursday" -> System.out.println("It's a weeksday.");
            case "friday" -> System.out.println("It's a weekday.");
            case "saturday" -> System.out.println("It's a weeksday.");
            case "sunday" -> System.out.println("It's a weekday.");
            default -> System.out.println(day + " is not a day.");


        }
        */

        // Method(2)

        switch(day){
            case "monday","tuesday","wednesday","thursday","friday" -> 
                System.out.println("It's a weekday.");
            case "saturday","sunday" -> 
                System.out.println("It's a weekend.");
            default -> 
                System.out.println(day + " is not a day.");
        }
        scanner.close();


    }
    
}
