package com.makuo.day2;

public class Recursion {
    public static void main(String[] args) {

        // re1(100);

        System.out.print(re2(1, 5));
    }

    public static void re1(int end) {
        if (end > 1) {
            re1(end - 1);
        }

        System.out.println(end);

    }

    public static int re2(int result, int end) {

        if (end > 1) {
            System.out.println(end);
            re2(result, end - 1);
        }

        return end * end;

    }

}
