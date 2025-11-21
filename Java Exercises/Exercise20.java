import java.util.Scanner;
public class Exercise20 {

    //Logical Operators in Java.
    public static void main(String[] args){
        // && = AND
        // || = OR
        // ! = NOT

        double temp;
        String username;
        String idnumber;
        boolean israin = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();

        if(temp >= 25 && temp <= 45){
            System.out.println("It's Summer ");
        }
        else if(temp < 0 || temp >= 45 ){
            System.out.println("It's hard to live here !");
        }

        else if( temp != 0 || temp != 100){
            System.out.println("There's no ice or Boil water ");
        }
        if(!israin){
            System.out.println("It's  not rain heavily !");

        }

        System.out.print("Enter Your new username: ");
       
        username = scanner.nextLine();
        
        
        if(username.length()<4 || username.length() > 12){
            System.out.println("Username must be 4-12 characters!");

        }
        else if(username.length()>4 && username.length() < 12){
            System.out.println("Username: " + username);
        }

        System.out.print("Enter your NIC number: ");
        idnumber = scanner.nextLine();

        if(idnumber.isEmpty() || idnumber.length() >12){
            System.out.print("ID number must be 12 characters !");
        }
        else{
            System.out.println("ID number: "+idnumber);
        }

        scanner.close();





    }
    
}
