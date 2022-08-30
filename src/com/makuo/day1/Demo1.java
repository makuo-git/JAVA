
package com.makuo.day1;


public class Demo1 {
    public static void main(String[] args) {


//    char c='a';
//    int i=16;
//    float d=.314F;
//    double result=c+i+d;

//     byte b=16;
//     short s=14;
//     int t=s+b;

//        String c=""+123;
//
//        System.out.println("c:  "+c);
//
//
//        int cc=Integer.parseInt("123");
//        System.out.println(Integer.class.isInstance(cc));
//
//        char b= c.charAt(2);
//        System.out.println(b);


//        char c='c';
//        String cd =Character.toString(c);


//    int i =1;
//    i=i++;
//    System.out.println(i);
//
//        int e=1;
//        e=++e;
//        System.out.println(e);

//        Scanner scanner1= new Scanner(System.in);
//        System.out.print("请输入数字：");
//        int i=scanner1.nextInt();


//        switch (i){
//            case 1 : {
//                System.out.println('1');
//                break;
//            }
//            case  2:
//                System.out.println('2');
//                break;
//            default:
//                System.out.println("other");
//        }

//        int num=10;
//        do {
//            System.out.println(num);
//        } while (num >11);

//        int i = 1;
//
//        while (i < 6) {
//
//
////            System.out.print("i "+i);
//            int  j=1;
//            while (j<=i){
////                System.out.print("j: "+j);
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//
//        }


// 金字塔
        int i = 1;
        while (i < 7) {

            // 左侧空格
            int k = 7 - i;
            while (k > (0 + 1)) {

                System.out.print(" ");
                k--;
            }
//            System.out.println("");

//            System.out.print("i "+i);

            // 循环打印 1、2、3、4、5、6 *
            int j = 1;
            while (j <= i) {
//                System.out.print("j: "+j);
                System.out.print("*");
                j++;
            }

            // 右侧循环  0、1、2、3、4、5 的 *
            int s = i - 1;
            while (s > 0) {
                System.out.print("*");

                s--;
            }


            System.out.println();
            i++;


        }




        
    }

}