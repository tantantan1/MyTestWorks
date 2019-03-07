import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class middleTwo {
    public static String middleTwo(String str1) {
        return (str1.substring( (str1.length()/2)-1,(str1.length()/2)+1));
    }



    public static void main (String [] args){
      String Word1 = "School";
      if(Word1.length() <2 || Word1.length() % 2 != 0 )
      {
          System.out.println("Error");
          return;
      }
     System.out.print(middleTwo(Word1));

      }
    }



