package com.shannu;

public class floorOfNum {
    static void main(String[] args) {
        int []arr={1,3,4,5,8,12,16,24,38,39,50,79,83,89};
        int[] arr1={100,90,80,70,60,50,40,30,20,10,1};
        int target=0;
        int ans=search(arr1,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[arr.length-1]){
                    return -1;
                }
                if (target<arr[start]){
                    return -1;
                }
                if(target<arr[mid]){
                    end=mid-1;
                }
                if(target>arr[mid]){
                    start=mid+1;
                }
            }
            if(!isAsc){
                if(target<arr[mid]){
                    start=mid+1;
                }
                if(target>arr[mid]){
                    end=mid-1;
                }
                if(target<arr[arr.length-1]){
                    return -1;
                }
                if (target>arr[start]){
                    return -1;
                }
            }
        }
        if(isAsc){
            return arr[end];
        }
        else{
            return arr[start];
        }
    }
}
