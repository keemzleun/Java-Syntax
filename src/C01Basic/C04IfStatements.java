package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {

//        // 도어락키 if문
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if(input == 1234) {
//            // 참일 경우의 실행문
//            System.out.println("문이 열립니다.");
//        } else {
//            // 거짓일 경우의 실행문
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        // 알파벳이 소문자인지 대문자인지 판별하는 프로그램
//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);
//        // 소문자 글자 입력시 "소문자입니다"
//        if (122 >= c && c >= 97) {
//            System.out.println("소문자입니다.");
//        } else if (90 >= c && c >= 65) {
//            System.out.println("대문자입니다.");
//        } else {
//            System.out.println("알파벳이 아닙니다.");
//        }

        // 택시 요금 : 10000, 버스 요금 : 3000, 킥보드 : 2000
        // 사용자에게 얼마가 있는지 무어보고 구간별로 교통수단 추천
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m >= 10000) {
            System.out.println("택시를 추천합니다.");
        } else if (m >= 3000) {
            System.out.println("버스를 추천합니다.");
        } else if (m >= 2000) {
            System.out.println("킥보드를 추천합니다.");
        }
    }
}

