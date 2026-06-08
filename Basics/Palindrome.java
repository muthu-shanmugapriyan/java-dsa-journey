package com.shannu;
import java.util.Scanner;
public class Palindrome {
    static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("ENter a String:");
        String str= in.nextLine();
        String reverse= "";
        for(int i=str.length()-1; i>=0;i--){
            reverse= reverse+ str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("The word is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
