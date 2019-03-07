import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class comboString {
    public static String comboString (String str1, String str2){
        if(str1.length()>str2.length()){
            return (str2+str1+str2);
        }
        else
        return (str1+str2+str1);
        }
    public static void main (String [] args){
      String Word1 = "Hello";
      String Word2 = "Me";
     System.out.print(comboString(Word1,Word2));
      }
    }



