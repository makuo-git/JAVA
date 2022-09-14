package com.makuo.day2;

public class Recursion {
    public static void main(String[] args) {

        // re1(100);

//        System.out.print(re2(1, 5));

//        System.out.println(re4(9));

//           Recursion r1=new Recursion();
//           r1.re4(10);

        Person1 p2=new Person1("makuo");
//        System.out.println(p2.name);
        p2.t4();
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
            return re2(result, end - 1) * end;
        }

        return 1;

    }

//
//    public static boolean re3(String[] huiwein) {
//        if (huiwein.length == 1) {
//            return true;
//        } else if (huiwein[0] == huiwein[-1]) {
//            return re3(huiwein[0:-1]);
//        } else {
//            return false;
//        }
//
//    }

    public    int re4(int count){
        if (count>0){
            System.out.println(count);
            return (re4(count-1)+1)   * 2;
        }


        return  1;

    }


}


class Person1 {
    String name;
    public  Person1(String pname){
        this.name=pname;
    }
    public void   t2(){
        System.out.println("aa");
        t3();
    }
    public void  t3(){
        System.out.println("bb");
    }

    public  void  t4(){
        System.out.println(name+"  =t41");
        System.out.println(this.name+"  =t4");
    }
}