import java.util.Scanner;

public class Engine {
    public static String helloName (){
        Scanner input =  new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = input.next();
        return("Hello"+" "+Name);
    }
    public static void main (String [] args){
        System.out.println(helloName());
    }

}



