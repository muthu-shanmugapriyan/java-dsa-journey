package com.shannu;

public class Pattern5 {
    static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int row =1;row<2*n;row++){
            int NoOfCol=0;
            if(row>n){
                NoOfCol=n-(row-n);
            }
            else{
                NoOfCol=row;
            }
            for(int col=1;col<=NoOfCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
