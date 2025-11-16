import java.util.Scanner;
public class Exercise11 {
    //Java Compound Interset Calculator
    public static void main(String[] args){
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interset rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times the intersset is compounded: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+(rate / timesCompounded), timesCompounded*years);

        System.out.printf("The amount after %d years is %.2f \n",years,amount);

        scanner.close();


        
    
    }
    
}
