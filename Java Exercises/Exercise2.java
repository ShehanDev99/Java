//Variables in Java

public class Exercise2 {

    public static void main(String[] args){

       //Two steps to create a variable✅
         //1. Declare a variable
         //2. Assign a value to the variable

         //Two categories of variables:
           //1. Primitive Data Types
           //2. Non-Primitive Data Types(Reference Data Types)
            //Primitive Data Types:
              //1. byte
              //2. short
              //3. int
              //4. long
              //5. float
              //6. double
              //7. char
              //8. boolean
            //Non-Primitive Data Types:
              //1. String
              //2. Arrays
              //3. Classes
              //4. Interfaces

        int age = 20;
        int year = 2025;
        int count = 10;

        double price = 19.99;
        double  tax = 1.5;
        double totalprice = 21.49;

        char grade = 'A';
        char section = 'B';
        char initial = 'J';

        boolean isStudent = true;
        boolean isGraduated = false;
        boolean hasJob = true;

        String name = "Shehan";
        String city = "Colombo";
        String country = "Sri Lanka";

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");
        System.out.println("I live in " + city + ", " + country + ".");

        System.out.println("I got " + grade + "grade in my Exams.");

        System.out.println("The initial price of the product is $" + price);
        System.out.println("The tax is $" + tax);
        System.out.println("The total price is $" + totalprice);

        if(isStudent){
            System.out.println("I am a Student.");
        }
        else{
            System.out.println("I am Not a Student.");
        }

        if(isGraduated){
            System.out.println("I have Graduated.");
        }
        else{
            System.out.println("I have Not Graduated.");
        }


    }

    
}
