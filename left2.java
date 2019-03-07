import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class left2 {
    public static String left2 (String str1){
        return (str1.substring(2,str1.length()) + str1.substring(0,2));
        }
    public static void main (String [] args){
      String Word1 = "Heee1";
      if(Word1.length()<2)
      {
          System.out.println("Error");
          return;
      }
     System.out.print(left2(Word1));
      }
    }



