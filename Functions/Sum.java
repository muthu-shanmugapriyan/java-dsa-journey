package com.shannu;
import java.util.Scanner;
public class Sum {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int a=in.nextInt();
        int b = in.nextInt();
       int ans=sum2(a,b);
        System.out.println("Sum is :"+ans);

    }
    static int sum2(int a,int b){
        int sum=a+b;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a= in.nextInt();
        int b=in.nextInt();
        System.out.println(a+b);
    }
}
