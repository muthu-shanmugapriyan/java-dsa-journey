package com.easy;

public class SumOfDigits {
    static void main(String[] args) {
        int n=1000;
        int ans =fun(n);
        System.out.println(ans);
    }
    static int fun (int n){
        if(n==0){
            return 0;
        }
        return (n%10)+fun(n/10);
    }
}
