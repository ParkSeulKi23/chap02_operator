package com.javalab.oper03;

import java.util.Scanner;

public class HW_1011_gesangi {
    public static void main(String[] args) {
        gesangi();
    }
    public  static void gesangi(){
        Scanner num1 = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요.");
        int strNum1=Integer.parseInt(num1.nextLine());

        Scanner operation = new Scanner(System.in);
        System.out.println("연산기호를 입력해주세요.");
        String strOperation=operation.nextLine();

        Scanner num2 = new Scanner(System.in);
        System.out.println("두번째 숫자를 입력해주세요.");
        int strNum2=Integer.parseInt(num2.nextLine());

        double gesan=0;
        if(strOperation.equals("+")){
            gesan = strNum1+strNum2;
            System.out.println(strNum1 + " + " + strNum2 + " = " + gesan);
        } else if (strOperation.equals("-")) {
            gesan = strNum1-strNum2;
            System.out.println(strNum1 + " - " + strNum2 + " = " + gesan);
        } else if (strOperation.equals("/")) {
            if(strNum1 == 0){
                System.out.println("0으로 나눌 수 없습니다.");
            } else if (strNum2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            }else {
                gesan = (double) strNum1 / strNum2;
                System.out.printf("%d / %d = %.2f", strNum1, strNum2, gesan);
            }
        } else if (strOperation.equals("*")) {
            gesan = strNum1*strNum2;
            System.out.println(strNum1 + " * " + strNum2 + " = " + gesan);
        }else {
            System.out.println("연산기호를 잘못입력하였습니다.");
        }
    }
}
