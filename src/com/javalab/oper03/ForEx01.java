package com.javalab.oper03;

public class ForEx01 {
    public static void main(String[] args) {
        //2단 출력
        /*for(int i=1; i<=9; i++){
            int result =2 * i;
            System.out.println("2 * "+i+" = "+result);
        }*/
        printGugudan(2);
        printGugudan(3);
    }

    //구구단 출력 함수 [모듈화]
    public  static void printGugudan(int dan){
        for(int i=1; i<=9; i++){
            int result =dan * i;
            System.out.println(dan+" * "+i+" = "+result);
        }
    }
}
