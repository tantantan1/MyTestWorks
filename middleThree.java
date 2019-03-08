import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class middleThree    {
    public static String middleThree  (String str1) {
    return (str1.substring(str1.length()/2-1, str1.length()/2+2));

        }

        public static void main (String[] args){
            String Word1 = "Hello";
            if (Word1.length()<3){
                System.out.println("Error");
                return;}
            System.out.print(middleThree  (Word1));


        }

    }

