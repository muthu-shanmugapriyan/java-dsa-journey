package com.shannu;

import java.util.Arrays;

public class ArraysWithFunctions {
    static void main(String[] args) {
        int []nums={2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int []arr){
//        arr[0]=69;
        for(int i=0;i< arr.length;i++){
            arr[i]*=arr[i];
        }
    }

}
