package com.javalab.oper03;

public class ForEx02 {
    public static void main(String[] args) {
        //중첩 for문을 이용하여 구구단 출력
        for(int i=1; i<=9; i++){    //n단의 n*1~9를 만드는 for문(열)
            for(int j=2; j<=9;j++){     //2*1~9*1까지 한줄을 만드는 for문(행)
                int result=j*i;
                System.out.print(j + " * " + i + " = " + result + "\t");
            }
            System.out.println();
        }
        //for문에서 continue를 이용한 예제
        for(int i=1; i<=10; i++){
            if(i%2==0){ //i를 2로 나눈 나머지가 0 인가요?(짝수인가요?)
                continue;   //아래 코드를 실행하지 않고 다음 반복으로 넘어감
            }
            System.out.println("i: "+i);
        }

        //for 문에서 break를 이용한 예제
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
            if(sum >= 30){  //sum이 30이상인가요?
                break;  //맞으면 반복문을 종료시킴
            }
            System.out.println("i : "+i+", sum : "+sum);
        }

        //1~50까지의 수 중 짝수와 홀수의 합을 각각 구하시오.
        //나
        int j=0;
        int h=0;
        for(int i=1; i<=50; i++){
            if(i%2==0){
                j += i;
                System.out.println("짝 "+i+", "+j);
            }else{
                h += i;
                System.out.println("홀 "+i+", "+h);
            }
        }
        System.out.println("짝수 합 : "+j);
        System.out.println("홀수 합 : "+h);

        //선생님
        int oddSum = 0; //짝수와 홀수를 누적시킬 변수 두개(짝수변수 1, 홀수변수 2)
        int evenSum = 0;
        for(int i=1; i<=50; i++){   //i를 1씩 증가시키면서 i가 50이 될때 까지 반복 할것입니다.
            if(i%2==0){   //짝수합     만약 i를 2로 나누어서 나머지가 0이라면 짝수로 간주하고
                evenSum += i;   //sum에 i를 더합니다.
                System.out.println("짝수 : "+i+", 짝수의 합 : "+evenSum);
            }else{      //홀수합
                oddSum += i;
                System.out.println("홀수 : "+i+", 홀수의 합 : "+oddSum);
            }
        }
        System.out.println("짝수의 합 : "+evenSum);
        System.out.println("홀수의 합 : "+oddSum);
    }
}
