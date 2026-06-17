package com.shannu;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int []arr={10,20,20,30,10};
        int [] ans= sort(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int [] sort(int []arr){
        boolean swapped=false;
       for(int i=0;i< arr.length;i++){
           for(int j=1;j< arr.length-i;j++){
               if(arr[j]<arr[j-1]){
                   int temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
                   swapped=true;
               }
           }
           if(!swapped){
               break;
           }
       }
       return arr;
    }
}
