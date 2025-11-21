import java.util.Scanner;
public class Exercise19 {

    //Calculator Program in java.
    public static void main(String[] args){
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Can't divide by Zero!");
                    validOperator = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            default -> {
                System.out.println("Invalid operator! ");
                validOperator = false;
            }
        }

        if(validOperator){
            System.out.println(result);
        }

        
        


    




    }
   
    
}