package com.easy;

public class Nto1 {
    static void main(String[] args) {
        int n=5;
        call(n);


    }
    static void call(int n){
        if(n==0){
        return;
        }
        System.out.println(n);
        call(n-1);
    }
}

