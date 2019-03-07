import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class firstTwo {
    public static String firstTwo (String str){
        int length = str.length();
        if (length <2)
            return(str);
        return (str.substring(0,2));
        }
    public static void main (String [] args){
      String Word = "Hello";
     System.out.print(firstTwo(Word));
      }
    }



