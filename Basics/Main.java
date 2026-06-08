package com.shannu;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= input.nextLine();
        String reverse="";
        for(int i = str.length()-1;i>=0;i--) {
            //MARKRAM
            //0123456
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("the word is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}