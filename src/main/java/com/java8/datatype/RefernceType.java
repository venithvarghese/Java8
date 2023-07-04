package com.java8.datatype;

import java.util.Arrays;

public class RefernceType {

    public static void main(String[] args) {
        int [] i = {1,2,3};
        System.out.println("Before :: " + Arrays.toString(i));
        change(i);
        System.out.println("After  :: " + Arrays.toString(i));
    }

    public static void change(int [] a) {
        a[0]++;
        a[1]++;
        a[2]++;
    }
}
