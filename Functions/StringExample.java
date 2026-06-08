package com.shannu;

import java.util.Scanner;

public class StringExample {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Your Name ? :");
        String name=in.next();
        String message=myGreet(name);
        System.out.println(message);    }

    static String myGreet(String name) {
        String greet="Hello "+ name;
        return greet;
    }

    static String greet(){
        String greeting ="How are you?";
        return greeting;

    }
}

