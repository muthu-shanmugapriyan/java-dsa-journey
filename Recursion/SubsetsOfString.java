package com.string;

import java.util.ArrayList;

public class SubsetsOfString {

    static void main(String[] args) {
        System.out.println( subset2("","abc",new ArrayList<>()));
    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }

    static ArrayList<String> subset2(String p, String up,ArrayList<String>list){
        if(up.isEmpty()){
           list.add(p);
           return list;
        }
        char ch=up.charAt(0);
        subset2(p+ch,up.substring(1),list);
        subset2(p,up.substring(1),list);
        return list;
    }
}
