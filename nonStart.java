import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class nonStart {
    public static String nonStart (String str1, String str2){
        return (str1.substring(1,str1.length()) + str2.substring(1,str2.length()));
        }
    public static void main (String [] args){
      String Word1 = "Hello";
      String Word2 = "World";
      if(Word1.length()<1)
      {System.out.println("Error (Word 1)");
      return;}
        if(Word2.length()<1)
        {  System.out.println("Error (Word 2)");
        return;}
     System.out.print(nonStart(Word1,Word2));
      }
    }



