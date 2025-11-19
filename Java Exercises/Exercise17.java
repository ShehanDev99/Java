public class Exercise17 {

    //Ternary Operator in Java.

    //Variable = (condition) ? expressionTrue : expressionFalse;
    public static void main(String[] args){
        int score = 75;
        int age = 20;
        String email = "janirushehan16@gmail.com";
        String result;

        result = (score >= 40 && score < 50) ? "S" : ((score >= 50 && score < 65) ? "C": ((score >= 65 && score < 75) ? "B" : ((score >= 75 && score <= 100)? "A" : "Invali Marks"  )));
        System.out.println("Grade: " + result);

        String domain = (email.contains("gmail.com")) ? "Valid Emil Address " : "Invalid Email Address";
        System.out.println(domain);

        String eligilility = (age >= 18) ? "You are Eligible to Watch this movie." : "You are not Eligible to Watch this movie.";
        System.out.println(eligilility);


    }

    
}
