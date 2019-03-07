import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class withoutEnd {
    public static String withoutEnd (String str){
        int length = str.length();
        return (str.substring(1,length-1));
        }
    public static void main (String [] args){
      String Word = "Hellllo";
      if(Word.length() < 2)
      {
          System.out.println("Error");
          return;
      }
     System.out.print(withoutEnd(Word));
      }
    }



