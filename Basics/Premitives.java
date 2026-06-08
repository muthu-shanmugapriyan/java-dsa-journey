package com.shannu;

import java.util.Scanner;

public class Premitives {
    static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.print("Enter starting NUmber: ");
        int start= input.nextInt();
        System.out.print("Enter End NUmber: ");
        int end= input.nextInt();
        boolean found = false;
        for(int num= start;num<=end;num++)
        {
            int original= num;
            int sum=0;
            int digits= String.valueOf(num).length();

            while(original>0){
                int digit = original%10;
                sum += Math.pow(digit,digits);
                original/=10;
            }
            if(sum==num){

                System.out.println(num);
                found= true;
            }

        }
        if(!found){
            System.out.println("NO amstrong numbers in this Range");
        }


    }
}
