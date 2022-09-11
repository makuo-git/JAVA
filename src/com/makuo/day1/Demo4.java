package com.makuo.day1;

<<<<<<< HEAD
public class Demo4 {
    public static void main(String[] args) {

        double[] hens = { 1, 3, 4, 6, 7 };

        for (double d : hens) {
            System.out.println((int) d);
        }

        int ss[] = new int[10];
        System.out.println(ss[0]);
        System.out.println(ss[1]);
=======
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo4 {

    public static void main(String[] args) {
        int l1[] = {4, -1, 9, 10, 23,18};
//
//        int max=l1[0];
//        int index = 0;
//
//        for (int i = 1; i < l1.length; i++) {
//            if (l1[i]> max){
//                max=l1[i];
//                index=i;
//            }
//
//        }
//
//        System.out.println("最大数字 =" +max +", index="+ index);
//
//



        for (int i = 0; i < l1.length-1; i++) {

            for (int j = 0; j <i; j++) {
                if (l1[j]>l1[j+1]){
                    int tem=l1[j+1];
                    l1[j+1]=l1[j];
                    l1[j]=tem;
                }
            }

        }

//        for (int i:l1) {
//            System.out.println(i);
//        }

//        String l3[]=new String[3];
//        l3[0]="金毛狮王";
//        l3[1]="紫衫龙王";
//        l3[2]="青翼蝠王";
//
//        System.out.println("金毛狮王".equals(l3[0]));


        int  l4[][]={
                {0,0,0,0,0,0},
                {0,0,1,0,0,0},
                {0,2,0,3,0,0},
                {0,0,0,0,0,0},
        };
//
//        for (int i = 0; i < l4.length; i++) {
//            for (int j = 0; j < l4[i].length; j++) {
//                System.out.print(l4[i][j]+" ");
//            }
//            System.out.println();
//        }



        int l5[][]=new int[3][];


//            l5[0]=new int[1];
//            l5[0][0]=5;
//            System.out.println(l5[0][0]);
//

        for (int i = 0; i < l5.length; i++) {
            l5[i]=new  int[i+1];
            for (int j = 0; j <= i ; j++) {
                l5[i][j]=j;
            }

        }

        for (int i = 0; i < l5.length; i++) {
            for (int j = 0; j < l5[i].length; j++) {
                System.out.print(l5[i][j]+" ");
            }
            System.out.println();
        }

>>>>>>> e4d206c6206ff2a85655b1b9ab7d31c8ba78cd80
    }
}
