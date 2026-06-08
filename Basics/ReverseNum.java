package com.shannu;

import java.util.Scanner;

public class ReverseNum {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= in.nextInt();
//        String reverse="";
        //string approach
        int reverse=0;
        while (n>0){
            int rem= n%10;
//            reverse = reverse+rem;
            reverse= reverse*10+rem;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
