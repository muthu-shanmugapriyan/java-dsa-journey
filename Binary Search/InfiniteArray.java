package com.shannu;

public class InfiniteArray {
    static void main(String[] args) {
        int[]arr={1,35,36,40,45,58,68,72,81,83,86,87,90,100,102,109,110};
        int target=102;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int []arr,int target){
        int start = 0;
        int end= 1;
        int ans=-1;
        while(target>arr[end]){
            int newS =end+1;
            end=end+ (end-start+1)*2;
            start=newS;
        }
        ans=Bsearch(arr,target,start,end);

        return ans;
    }
    static int Bsearch(int []arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
