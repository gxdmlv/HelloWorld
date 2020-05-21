package com.gx.java;


import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {


    private int st;


    public static void main(String[] args) {
       new HelloWorld().method();

        System.out.println("1");
    }


    public void method() {

    int num ;
        for (int i = 0; i < 4; i++) {
            num = i;
            System.out.println("num = " + num);
        }
    }
}
