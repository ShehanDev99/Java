public class Exercise13 {


    //String Methods In Java.
    public static void main(String[] args){

        String name = "Janiru Shehan    ";

        int length  = name.length();
        System.out.println(length); //Number of characters in the name.
        
        char letter = name.charAt(0);
        System.out.println(letter);//find a character at given index.

        int index = name.indexOf(" ");
        System.out.println(index);
        
        int lastIndex = name.lastIndexOf("h");
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.trim();
        System.out.println(name);

        name = name.replace("a" ,"o");
        System.out.println(name);

        if (name.isEmpty()){
            System.out.println("Your name is Empty");
            
        }
        else{
            System.out.println("Hello,"+    name);
            
        }
        
        if(name.equals("Password")){
            System.out.println("Your name can't be password!");

        }
        else{
            System.out.println("Hello, "+ name );
        }


        


        






    }

}