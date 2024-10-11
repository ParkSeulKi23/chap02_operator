package com.javalab.oper02;

public class IfEx02 {
    public static void main(String[] args) {
        /*
        * 랜덤 함수 : 
        * -Math.random() : 0.0 이상 1.0 미만의 실수를 반환
        * -(Math.random()*6) : 0.0dltkd 6.0미만의 실수를 반환
        * (int)(Math.random()*6) : 0 이상 5이하의 정수를 반환
        * (int)(Math.random()*6)+1 : 1이상 6이하의 정수를 반환 (주사위에서 0이 나오면 안되기 때문)
        */
        int dv = (int)(Math.random()*6)+1;
        System.out.println("주사위의 값: "+dv);

        System.out.println("if문으로 출력합니다.");

        if (dv==1){
            System.out.println("일이 나왔습니다.");
        } else if (dv==2) {
            System.out.println("이가 나왔습니다.");
        } else if (dv==3) {
            System.out.println("삼이 나왔습니다.");
        } else if (dv==4) {
            System.out.println("사가 나왔습니다.");
        } else if (dv==5) {
            System.out.println("오가 나왔습니다.");
        } else{
            System.out.println("육이 나왔습니다.");
        }

        System.out.println("switch문으로 출력합니다.");

        //switch문으로 변경
        switch (dv){
            case 1:
                System.out.println("일이 나왔습니다.");
                break;  //조건 충족시 switch문 종료
            case 2:
                System.out.println("이가 나왔습니다.");
                break;
            case 3:
                System.out.println("삼이 나왔습니다.");
                break;
            case 4:
                System.out.println("사가 나왔습니다.");
                break;
            case 5:
                System.out.println("오가 나왔습니다.");
                break;
            default:    //else 역할
                System.out.println("육이 나왔습니다.");
        }
    }
    
}
