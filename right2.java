import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class right2 {
    public static String right2  (String str1){
        return (str1.substring(str1.length()-2,str1.length()) + str1.substring(0,str1.length()-2));
        }
    public static void main (String [] args){
      String Word1 = "Hello";
      if(Word1.length()<2)
      {
          System.out.println("Error");
          return;
      }
     System.out.print(right2 (Word1));
      }
    }



