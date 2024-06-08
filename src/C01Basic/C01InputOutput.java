package C01Basic;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
//        // 출력 : System.out(콘솔)
//        int a = 20;
//        //println : 출력 후 줄 바꿈
//        System.out.println(a);
//        String b = "hello world";
//        System.out.println(b);
//        // 문자열과 숫자를 합하면 문자가 된다.
//        System.out.println(a+b);
//        // 숫자 + 숫자
//        System.out.println(20+10);

        // 입력 : System.in(키보드 입력) + Scanner(입력을 위한 클래스)
        Scanner myScanner = new Scanner(System.in);
        System.out.println("아무거나 입력 ㄱㄱ");

        System.out.println("실수를 입력해주세요");
        double input_double = myScanner.nextDouble();
        System.out.println(input_double);

        System.out.println("true/false를 입력하세요");
        boolean input_boolean = myScanner.nextBoolean();
        System.out.println(input_boolean);

        // java 밖의 시스템이므로 입출력 시스템 메모리 해제해주는 것이 좋다
        myScanner.close();

    }
}
