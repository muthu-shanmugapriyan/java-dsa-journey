package com.shannu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class setMissMatch {
    static void main(String[] args) {
        int []arr={1,2};
        int []ans=duplicate(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] duplicate(int[]arr){
        sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return new int[]{arr[i],i+1};

            }
        }
        return new int[]{-1,-1};
    }
    static void sort(int []arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
