package com.javalab.oper01;

public class Arithmetic {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //덧셈
        int c=a+b;
        System.out.println("1. a + b = "+c);

        //뺄셈
        int d=a-b;
        System.out.println("2. a - b = "+d);

        //곱셈
        int e=a*b;
        System.out.println("3. a * b = "+e);

        //나눗셈
        int f=a/b;
        double dblf=(double) a / b;
        System.out.println("4. a / b = "+f);
        System.out.println("\t a / b = "+dblf);

        //나머지
        int g=a%b;
        System.out.println("5. a % b = "+g);    //10, 10은 앞에 숫자

        //증가 연산자
        int h=5;
        System.out.println("6. h = " + h++); //증가 연산자가 뒤에 있기 때문에 h=5를 출력하고 난 후에 h+1
        System.out.println("\t h = " + h);

        //감소 연산자
        int i=7;
        System.out.println("7. i = " + --i);    //감소 연산자가 앞에 있기 때문에 출력전에 1을 빼고 출력 i=6
        System.out.println("\t i = " + i);
    }
}
