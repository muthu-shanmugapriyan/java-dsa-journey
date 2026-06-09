package com.shannu;
import java.util.Arrays;

public class MaxOfArray {
    static void main(String[] args) {
        int [] arr={25,36,4,9,86};
      int ans=  max(arr);
        System.out.println(ans);
    }
    static int max(int [] arr){
        int maxval=arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}

