package com.shannu;

public class FindInMountainArray {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr1= {5,1,2,3,4};
        int target=3;
        int ans=findnum(arr1,target);
        System.out.println(ans);
    }
    static int findnum(int []arr,int target){
        int start =0;
        int end=arr.length-1;
        int ans=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        int peak=end;
        System.out.println(peak);
        ans=binarySearch(arr,target,true,0,peak);
        if(ans==-1) {
            ans=binarySearch(arr,target,false,peak+1,arr.length-1);
        }
        return ans;
    }
    static int binarySearch(int []arr,int target,boolean isAsc,int start,int end){

        while (start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target>arr[mid]){
                start=mid+1;
                }
             else{
                end=mid-1;
                }
            }
            if(!isAsc){
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

}
