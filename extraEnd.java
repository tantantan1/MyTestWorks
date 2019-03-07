import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class extraEnd {
    public static String extraEnd (String str){
        int length = str.length();
        return (str.substring(length-2,length));
        }
    public static void main (String [] args){
      String Word = "Hello";
        if (Word.length() <2)
        {
            System.out.println("Error");
            return;
        }
        for (int R = 0;R<3;R++)
     System.out.print(extraEnd(Word));
      }
    }



