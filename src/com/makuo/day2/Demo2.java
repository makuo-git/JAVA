package com.makuo.day2;

public class Demo2 {
    public  static  void  main(String[] args){

        // 下面两种写法都可以
//      int map[][]={
      int[][] map={
              {0,0,1},
              {1,1,1},
              {1,1,3},
      };

      MyArry a1=new MyArry();

        int[] arr2=a1.getSumAndSub(1,2);

        for (int i:arr2) {
            System.out.println(i);
        }



    }


}

class MyArry{


    // 下面两种写法都可以
    public void printArr(int map[][]){
//    public void printArr(int[][] map){
        for (int i = 0; i < map.length ; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public  int[] getSumAndSub(int n1,int n2){
                int[] Arr=new int[2];
                Arr[0]=n1;
                Arr[1]=n2;

                return Arr;
    }
}