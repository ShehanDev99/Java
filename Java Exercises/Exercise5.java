public class Exercise5 {

    //Arithmetic Operators In Java.
    public static void main(String[] args){
        //1.Matheamatical  Operators.
        int a = 10;
        int b = 5;
        int c;

        c = a+b;
        System.out.println(c);
        c = a-b;
        System.out.println(c);
        c = a*b;
        System.out.println(c);
        c = a/b;
        System.out.println(c);
        c = a%b; 
        System.out.println(c);

        //2.Argumented Assignment Operators.

        int x = 10;
        

        x+=2; //x= x+2;
        System.out.println(x);
        x-=2; //x= x-2;
        System.out.println(x);
        x*=3; //x= x*3;
        System.out.println(x);
        x/=2; //x= x/2;
        System.out.println(x);
        x%=2; //x= x%2;
        System.out.println(x);
        

        //3.Increment and Decrement Operators.

        int i = 10;

        i ++; //x= x+1;
        System.out.println(i);
        i--; //x= x-1;
        System.out.println(i);

        //4.Order of Operations.

        //P-E-M-D-A-S

        int result = 3+4*(7-3)/2;

        System.out.println(result);





       

    }
    
}
