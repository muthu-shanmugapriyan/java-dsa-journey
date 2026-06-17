package com.shannu;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int []arr={3,1,6,5,2,4};
        int [] ans=sort(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] sort(int []arr){
        for (int i=0; i <arr.length;i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            swap(arr,max,last);
        }
        return arr;

    }
    static int getMax(int []arr,int start,int end){
        int max=start;
        for (int i=start;i<end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return  max;

    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
