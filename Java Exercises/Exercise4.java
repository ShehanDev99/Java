import java.util.Scanner;
public class Exercise3 {

    //MADLIBS GAME
    public static void main(String[] args){
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an adjective (Description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter a adjective (Description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday i go to a " + adjective1 + " Zoo .");
        System.out.println("There was a beautifull " + noun1 + " .");
        System.out.println("It was a " + adjective2 + " day .");
        System.out.println("I " + verb1 + " happily .");
        System.out.println("What a " + adjective3 + " day it was !");

        scanner.close();




    }
    
}
