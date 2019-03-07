import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class withoutEnd2 {
    public static String withoutEnd2(String str1) {
        switch (str1.length()) {
            case 0:
                return (str1);
            case 1 :
                return (str1.substring(0,0));
            case 2:
                return (str1.substring(0,0));
            default:
                return (str1.substring(1,str1.length()-1));

        }
    }

    public static void main (String [] args){
      String Word1 = "Hello";
     System.out.print(withoutEnd2(Word1));
      }
    }



