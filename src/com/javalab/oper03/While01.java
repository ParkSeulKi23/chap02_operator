package com.javalab.oper03;

public class While01 {
    public static void main(String[] args) {
        //2단 출력
        int i=1;    //while문 밖에서 변수선언 해줘야함
        while (i<= 9){  //i가 9보다 작거나 같을 때까지 반복합니다.
            int result = 2 * i;
            System.out.println("2 * "+i+" = "+ result);
            i++;
        }

        //do~while문
        int j=1;
        do {  //조건없이 먼저 실행(무조건 처음 한번은 실행해야 함)
            int result = 3 * j;
            System.out.println("3 * "+j+" = "+ result);
            j++;
        }while (j <= 9);    //처음 1번을 실행하고 조건에 충족하는지 확인함
        //while은 조건이 안맞으면 아예 실행이 안될 수 있지만 do while은 무조건 한번은 실해해야함
    }
}
