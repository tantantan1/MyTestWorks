import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class theEnd {
    public static String theEnd  (String str1, boolean check) {
        if (check == true) {
            return (str1.substring(0, 1));
        } else {
            return (str1.substring(str1.length() - 1, str1.length()));
        }
    }

    public static void main (String [] args){
      String Word1 = "Hello";
      if(Word1.length() == 0)
      {System.out.println("Error");
      return;
      }
     boolean Check = false;

     System.out.print(theEnd (Word1,Check));
      }
    }



