package com.shannu;

public class Pattern9 {
    static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        int original=n;
        n=2*n-1;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                int value= original- Math.min(
                        Math.min(row,col),Math.min(n-1-row,n-1-col)
                );
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
