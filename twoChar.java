import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class twoChar   {
    public static String twoChar   (String str1,int n) {
if (str1.length()-2<n)
    return (str1.substring(0,2));
else
        return (str1.substring(n,n+2));

        }

        public static void main (String[] args){
            String Word1 = "Hello";
            int n = 1;

            if (Word1.length()<2){
                System.out.println("Error");
                return;}
            System.out.print(twoChar (Word1,n));


        }

    }

