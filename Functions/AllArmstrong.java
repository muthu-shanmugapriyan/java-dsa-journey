package com.shannu;

public class AllArmstrong {
    static void main(String[] args) {
        for (int i =100;i<1000;i++){
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
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
