import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class firstHalf {
    public static String firstHalf (String str){
        int length = str.length();
        return (str.substring(0,length/2));
        }
    public static void main (String [] args){
      String Word = "Hello";
     System.out.print(firstHalf(Word));
      }
    }



