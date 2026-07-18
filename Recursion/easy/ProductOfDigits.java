package com.easy;

public class ProductOfDigits {
    static void main(String[] args) {
        int n=10;
        int ans =fun(n);
        System.out.println(ans);
    }
    static  int fun (int n){
        if(n%10 ==n){
            return n;
        }
        return (n%10)* fun(n/10);
    }
}
