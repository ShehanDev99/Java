import java.util.Scanner;
public class Exercise15 {

    // Weight Conversion Program
    public static void main(String[] args){

        double weight;
        double newWeight;
        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("1. lbs to kgs: ");
        System.out.println("2. kgs to lbs: ");

        System.out.println("Enter your choice (1 or 2): ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("Your weight in kgs: " + newWeight+ "kg");
        }
        else if(choice == 2){
            System.out.println("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592;
            System.out.println("Your weigth in lbs: "+ newWeight +"lbs");

        }
        else{
            System.out.println("Invalid choice.");
        }
        scanner.close();

    }
    
}
