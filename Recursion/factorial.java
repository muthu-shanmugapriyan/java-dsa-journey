package com.easy;

public class factorial {
    static void main(String[] args) {
        int n=5;
        factorial(5);
        int ans = factorial(n);
        System.out.println(ans);
    }
    static int factorial(int n){
        if(n<=1){
            return 1;
        }

        return n*factorial(n-1) ;
    }
}
