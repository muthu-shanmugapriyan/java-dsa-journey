package com.shannu;

public class BinarySearch {
    static void main(String[] args) {
        int []arr={1,35,68,97,102,106,123,199};
        int target=36;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int []arr,int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
