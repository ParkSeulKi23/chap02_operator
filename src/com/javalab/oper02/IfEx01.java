package com.javalab.oper02;

public class IfEx01 {
    public static void main(String[] args) {
        int a = 15;

        if(a>0){
            System.out.println("a는 양수입니다.");
        } else if (a<0) {
            System.out.println("a는 음수입니다.");
        } else {
            System.out.println("a는 0입니다.");
        }
    }
}
