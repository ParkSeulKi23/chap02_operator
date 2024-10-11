package com.javalab.oper01;

public class CompairAndLogical {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        //동등비교
        System.out.println("a==b : "+(a==b));   //같다? false

        //부등비교
        System.out.println("a!=b : "+(a!=b));   //같지 않다? true

        //크다
        System.out.println("a>b : "+(a>b));   //true
        System.out.println("a>=b : "+(a>=b));   //true

        //논리곱(&&) : 양쪽 모두 참일 때만 참
        System.out.println((a>b)&&(a!=b));   //true
        //논리합(||) : 둘중 하나만 참이어도 참
        System.out.println((a>b)||(a==b));   //true
        //논리부정(!) : 참이면 거짓, 거짓이면 참
        System.out.println(!(a>b));   //false a=15 b=5로 a가 큰게 맞지만 논리부정으로 false 출력

        //할당연산자
        int c=10;
        c += a; //c=c+a
        System.out.println("c= "+c);    //25

        //삼항연산자  (조건) ? 참 : 거짓;
        int d = (a>b) ? a : b;  //a가 b보다 크면 a,아니면 b
        System.out.println("d= "+d);
    }
}
