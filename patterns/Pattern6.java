package com.shannu;

public class Pattern6 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1;row<2*n;row++){

            int NoOfCol=0;
            int NoOfSpaces=0;
            if(row>n){
                NoOfCol=n-(row-n);
                NoOfSpaces=row-n;
            }
            else{
                NoOfCol=row;
                NoOfSpaces=n-row;
            }
            for (int s=1;s<=NoOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=NoOfCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
