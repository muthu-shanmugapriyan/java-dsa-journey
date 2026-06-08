package com.shannu;
import java.util.Scanner;
public class Fibonacci {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();
        int first= 0, second=1;
        for(int i =1; i<=n;i++){
            System.out.print(first +" ");
            int next = first+ second;
            first= second;
            second=next;
        }
    }

}
