import java.util.Random;
public class Exercise8 {

    //RANDOM NUMBERS
    public static void main(String[] args){

        int number;
        double decimalNumber;
        boolean side;

        Random random = new Random();

        //Print a random integer
        number = random.nextInt(1,6);
        System.out.println(number);

        //print a random double
        decimalNumber = random.nextDouble(1.0,10.0);
        System.out.println(decimalNumber);
        
        //print a random boolean
        side = random.nextBoolean();
        if(side){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }



    }
    
}
