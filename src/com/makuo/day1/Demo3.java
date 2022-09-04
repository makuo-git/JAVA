package com.makuo.day1;

public class Demo3 {

    public static void main(String[] args) {
//        System.out.println("Demo3");
//        System.out.println("2");
//
//
//
//
//        String a[]={"aa","bb"};
//
//
//        String b=null;
//        System.out.println(b);






    char  a='A';

    char abc[]=new char[26];

    int i=0;

    while (i< abc.length){

        abc[i]=(char)(a+i);
        System.out.println((char) (a+i));
        i++;
    }


//        for (char j:abc) {
//            System.out.println(j);
//        }



    }
}
