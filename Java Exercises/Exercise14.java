import java.util.Scanner;
public class Exercise14 {
    //Substring Methods in Java.
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.println("Username: "+username);
            System.out.println("Domain: "+domain);


        }
        else{
            System.out.println("Invalid email format.");
        }

        scanner.close();



        


        
        
        


    }


}
