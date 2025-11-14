import java.util.Scanner;
public class Exercise3 {

    //USER INPUTS IN JAVA
    public static void main(String[] args){

        String name;
        int age;
        double gpa;
        boolean isEnrolled;
        char grade;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Enter your GPA: ");
        gpa = scanner.nextDouble();
        System.out.print("Are you enrolled (true/false): ");
        isEnrolled = scanner.nextBoolean();
        System.out.print("Enter your grade (A-F): ");
        grade = scanner.next().charAt(0); //The character at index 0 of the String input
        
        System.out.println("\nYour name is: "+ name);
        System.out.println("Your age is: "+ age);
        System.out.println("Your GPA is: "+ gpa);
        if(isEnrolled){
            System.out.println("You are enrolled.");
        } else {
            System.out.println("You are not enrolled.");
        }
        System.out.println("Your grade is: "+ grade);
        scanner.close();

    }
    
}
