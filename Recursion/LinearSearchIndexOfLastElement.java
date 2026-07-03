package com.arrays;

public class LinearSearchIndexOfLastElement {
    static void main(String[] args) {
        int [] arr = {1,2,3,45,45,6};
        int ans = search(arr, 45,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[]arr, int target ,int index){
        if(index==-1){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }
        else{
            return search(arr,target,index-1);
        }
    }
}
