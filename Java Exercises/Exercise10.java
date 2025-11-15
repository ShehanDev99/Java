public class Exercise10 {
    //Printf Statement in Java.
    //printf is a method used to format output.
    public static void main(String[] args){

        //1 Format Specifiers

        String name = "Shehan";
        int age = 20;
        char first_letter = 'S';
        double height = 5.6;
        boolean isStudent = true;

        System.out.printf("Hello, my name is %s\n",name);
        System.out.printf("I am %d years old\n",age);
        System.out.printf("%c is the first letter of my name\n",first_letter);
        System.out.printf("My height is %f feet\n",height);
        System.out.printf("isStudent: %b\n",isStudent);  

        //Multiple Format Specifiers
        System.out.printf("%s is %d years old and he is %f feet in height.\n",name,age,height);

        //2.precision

        double pi = 3.14159265359;
        double e = 2.71828182846;
        
        System.out.printf("%.3f\n",pi);
        System.out.printf("%.3f\n",e);

        //3.Flags

        //+ = output a plus
        // , = comma grouping separator
        //( = negative numbers in parentheses
        // space = leave a space for positive numbers

        double number1 = 10500.123;
        double number2 = -10500.123;
        double number3 = 102530.145;

        System.out.printf("%+.2f\n",number1);
        System.out.printf("%+.2f\n",number2);
        System.out.printf("%+.2f\n",number3);

        System.out.printf("%,.2f\n",number1);
        System.out.printf("%,.2f\n",number2);
        System.out.printf("%,.2f\n",number3);

        System.out.printf("%(.2f\n",number1);
        System.out.printf("%(.2f\n",number2);
        System.out.printf("%(.2f\n",number3);

        System.out.printf("% .2f\n",number1);
        System.out.printf("% .2f\n",number2);
        System.out.printf("% .2f\n",number3);

        //4.Width

        // 0 = pad with zeros
        // number = right justified padding
        // negative number = left justified padding

        int id1= 1;
        int id2= 23;
        int id3= 456;
        int id4= 7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);






 
    }
    
}
