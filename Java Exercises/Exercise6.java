import java.util.Scanner;
public class Exercise6 {

    //SHOPPING CART PROGRAM
    public static void main(String[] args){

        String item;
        String currency="$";
        double price;
        int quantity;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like to buy: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like to buy: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou bought " + quantity + " " + item+ "/s");
        System.out.println("Your total is: "+ currency+ total);
        scanner.close();
        



    }
    
}
