package com.shannu;
import java.util.Scanner;
import java.util.Arrays;
public class LsearchInRange {
    static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] arr={25,35,46,78,95,45,35,622,65,25};
        int target=in.nextInt();
        int start=2;
        int end=8;
        int ans=search(arr,start,end,target);
        if(ans!=-1) {
            System.out.println("The number " + target + " is found at the index " + ans);
        }
        else{
            System.out.println("The number is " + target + " is not found");
        }
    }
    static int search(int []arr,int start,int end,int target){
        if (arr.length==0){
            return -1;
        }
        for (int i=start;i<=end;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}