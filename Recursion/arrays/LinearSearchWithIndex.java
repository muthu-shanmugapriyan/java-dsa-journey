package com.arrays;

public class LinearSearchWithIndex {
    static void main(String[] args) {
        int [] arr = {1,2,3,45,6,5};
        int ans = search(arr, 1,0);
        System.out.println(ans);
    }
    static int search(int[]arr, int target ,int index){
        if(index==arr.length){
           return -1;
        }
        if(target==arr[index]){
            return index;
        }
        else{
            return search(arr,target,index+1);
        }
    }
}
