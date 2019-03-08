import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class endsLy {
    public static Boolean endsLy (String str1) {

if(str1.length()<2){
    return false;}
switch(str1.substring(str1.length() - 2, str1.length())) {
            case "ly":
                return true;
        default:
                return false;}
        }

        public static void main (String[] args){
            String Word1 = "Helly";
            System.out.println(Word1.length());
            System.out.println(Word1.substring(Word1.length()-2, Word1.length()));
            System.out.print(endsLy(Word1));


        }

    }

