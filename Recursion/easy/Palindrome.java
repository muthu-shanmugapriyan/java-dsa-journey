package com.easy;

public class Palindrome {
    static int sum=0;
    static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum= sum*10+rem;
        rev(n/10);
    }
    static boolean palindrome(int n){
       rev(n);
        if(n==sum){
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        int n=12344321;
        System.out.println(palindrome(n));

    }
}
