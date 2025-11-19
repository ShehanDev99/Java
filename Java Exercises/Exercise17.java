import java.util.Scanner;
public class Exercise17 {

    //Temperature Conversion Program In Java.
    public static void main(String[] args){
        double temp;
        double newTemp;
        String unit;

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit (C/F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C"))? (temp-32)*5/9 : (temp*5/9) +32;
        System.out.printf("%.2f %s",newTemp,unit);

        scanner.close();




    }
    
}
