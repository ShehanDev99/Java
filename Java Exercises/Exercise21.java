import java.util.Scanner;
public record Exercise21() {

    //While loops in Java.
    public static void main(String[] args){

        String name = "";
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        //Standerd While loop 
        while(name.isEmpty()){
            System.out.print("Enter Your Name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);

        //Do-While loop
        

        do{
            System.out.print("Enter Your age: ");
            age = scanner.nextInt();

        }while(age < 0 );

        System.out.println("Your age is " + age);

        scanner.close();
        
    }
    
}
