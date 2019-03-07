import java.util.Scanner;

public class Engine {
    public static String makeAbba (){
        Scanner input =  new Scanner(System.in);

        System.out.println("Please input A?");
        String a = input.next();
        System.out.println("Please input B?");
        String b = input.next();
        return (a+b+b+a);
    }
    public static void main (String [] args){
        System.out.println(makeAbba());
    }
}



