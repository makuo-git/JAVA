package com.makuo.day2;

public class Demo1 {

    public static void main(String[] args) {

        Person p1=new Person("makuo",18);
        Person p2=new Person("d",10);
        p2=p1;
        p2=null;


        p1.hello();
        int rs=p1.hello("male");
        System.out.println(rs);


    }

}



class    Person {
    public String name;
    public int age;
    public String gendel = "male";

    public Person(String name,int age){
        this.name=name;
        this.age=age;

    }


    public  void hello() {

        System.out.println("姓名： "+this.name+ "\n年龄: "+this.age);
    }

    public  int hello(String gendel){
        System.out.println("姓名： "+this.name+ "\n年龄: "+this.age+"\t性别： "+gendel);

        return 1;
    }

}