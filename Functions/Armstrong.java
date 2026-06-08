package com.shannu;
import java.util.Scanner;
public class Armstrong {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        boolean ans=isArmstrong(n);
        System.out.println(ans);
    }

    static boolean isArmstrong(int n) {
        int temp = n;
        int order = String.valueOf(n).length();
        int sum=0;
        while(temp>0){
           int r=temp%10;
           sum += (int)Math.pow(r,order);
           temp/=10;
        }
        if (sum==n){
            return true;
        }
        return false;
//         or
//        return sum==n;
    }

}
