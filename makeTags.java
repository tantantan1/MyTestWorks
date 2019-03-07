import java.util.Scanner;

public class Engine {
    public static String makeTags (String tag, String word){
        Scanner input =  new Scanner(System.in);

        return ("<"+tag+">"+word+"/<"+tag+">");
    }
    public static void main (String [] args){
        System.out.println(makeTags("i","Hello"));
    }

}



