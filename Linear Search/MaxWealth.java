package com.shannu;
import java.util.Scanner;

public class MaxWealth {
    static void main(String[] args) {
        int [][] arr={
                {1,5},
                {2,3,4}
        };
        int ans=maximumWealth(arr);
        System.out.println(ans);
//        To provide answer with both max wealth and wealthiest person
//        int [] result= maxVal(arr);
//        System.out.println("The maximum wealth: "+result[0]);
//        System.out.println("The wealthiest person: "+ result[1]);
    }
    static int maximumWealth(int[][] accounts) {
        int ans= Integer.MIN_VALUE;
        int maxRow;
        for (int row=0;row< accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                int num=accounts[row][col];
                sum+=num;
            }
            if (sum>ans){
                ans=sum;
//                to get the max row of the max value
            maxRow=row;
            }
        }
        return ans;
    }
    static int [] maxVal(int [][]accounts){
        int ans=Integer.MIN_VALUE;
        int maxRow=-1;
        for (int row=0;row< accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                int num=accounts[row][col];
                sum+=num;
            }
            if (sum>ans){
                ans=sum;
//                to get the max row of the max value
                maxRow=row;
            }
        }
        return new int[]{ans,maxRow};
    }
}
