package com.problems;

public class Dice {
    static void main(String[] args) {
        ans("",4);
    }
    static void ans(String p,int target){
       if(target==0){
           System.out.println(p);
           return;
       }
       for(int i =1; i<=6 && i<=target;i++){
           ans(p+i,target-i);
       }
    }
}
