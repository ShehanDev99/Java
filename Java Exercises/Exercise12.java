public class Exercise12 {
    //Nested If Statement in Java
    public static void main(String[] args){
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 100.0;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a Senior Discount of 20% ");
                System.out.println("You get a Student Discount of 10% ");
                price *=0.7;
            }
            else{
                System.out.println("You get a Student of 10%");
                price *=0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("You get a Senior Discount of 20%");
                price *=0.8;
            }
            else{
                price *=1;

            }
        }
        System.out.printf("The price of the ticket is: $%.2f ",price);
    }
    
}
