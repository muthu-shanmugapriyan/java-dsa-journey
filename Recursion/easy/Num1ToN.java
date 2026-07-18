package com.easy;

public class Num1ToN {
    static void main(String[] args) {
//        fun(1,6);
        funrev(5);
    }
//    static void fun(int s,int e){
//        System.out.println(s);
//        if(s==e){
//            return ;
//        }
//
//        fun(s+1,e);
//
//    }
//or
    static void funrev (int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
}

