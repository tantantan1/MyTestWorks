import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class nTwice  {
    public static String nTwice  (String str1,int n) {
return (str1.substring(0,n-1)+ str1.substring (n,str1.length()));

        }

        public static void main (String[] args){
            String Word1 = "Hello";
            int n = 5;
            if (n<=0 || n>Word1.length()){
                System.out.println("Error");
                return;}
            System.out.print(nTwice (Word1,n));


        }

    }

