package com.shannu;

import java.util.Arrays;

public class ArrayManipulation {
    static void main(String[] args) {
        int []arr={20,50,60,7,25,30};
        System.out.println(Arrays.toString(arr));
        change(arr);
        String sarr=Arrays.toString(arr);

        System.out.println(sarr);
    }

     static void change(int[] arr) {
        arr[0]=69;
         for(int i=0;i< arr.length;i++)
             arr[i]+=1;
    }


}
