import java.util.Scanner;
public class Exercise7 {

    //IF Statements In java.
    public static void main(String[] args){

        String name;
        int age;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();


        //GROUP1
        if(name.isEmpty()){
            System.out.println("You didn't enter a name.❌");
        }
        else{
            System.out.println("Hello, "+ name+ "!");
        }

        //GROUP2
        if(age>=60){
            System.out.println("You are a senior citizen.🧓");
        }
        else if(age>=18){
            System.out.println("You are a adult.👨‍🦰");
        }
        else if(age==0){
            System.out.println("You are a baby.👶");
        }
        else if(age<0){
            System.out.println("You haven't been born yet!🌟");
        }
        else{
            System.out.println("You are a minor.");
        }

        //GROUP3
        if(isStudent){
            System.out.println("You are a Student !🧑‍🎓");
        }
        else {
            System.out.println("You are not a Student !🏢");
        }

        scanner.close();





    }

    
}
