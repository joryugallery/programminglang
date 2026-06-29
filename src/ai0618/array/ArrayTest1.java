package ai0618.array;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        String[] subjects = {"프로그래밍언어실습", "데이터베이스", "인공지능개론"};

        Scanner s = new Scanner(System.in);

        int sum =0;



        for (int i = 0; i < scores.length; i++) {
            System.out.print("성적 입력 (정수값): ");
            scores[i] = s.nextInt();

        }

//        for (int i = 0; i < scores.length; i++) {
//            System.out.print(scores[i] + " ");
//            sum += scores[i];
//        }

        for (int score : scores){
            System.out.print(scores + " ");
            sum += score;
        }

        System.out.println("\n합계 : " + sum);
        System.out.println( "평균 : " + sum/scores.length);

        s.close();
    }
}
