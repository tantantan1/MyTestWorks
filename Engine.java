import java.util.Scanner;

public class Engine {

    public static void main (String [] args){
        Scanner input =  new Scanner(System.in);
System.out.println("What is your name?");
String Name = input.next();
        System.out.println("Hello"+" "+Name);
        input.close();

    }


}
