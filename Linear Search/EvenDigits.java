package com.shannu;

import javax.management.StringValueExp;

public class EvenDigits {
    static void main(String[] args) {
        int [] arr={22,33,53,-2,4441,4};
        int ans = findNums(arr);
        System.out.println(ans);

    }
    static int findNums(int []arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            int num=arr[i];
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int digit= Integer.toString(num).length();
        if (num <0){
            digit = digit-1;
        }
        if(digit%2==0){
            return true;
        }
        return false;
    }
}
