package C01Basic;

public class C03Operator {
    public static void main(String[] args) {
//        // 산술연산자 : 사칙연산
//        int n1 = 8, n2 = 3;
//        // * : 곱셈, /: 나눗셈, %: 나머지
//        // +, -, *, /, %의 결과값 출력
//
//        // 대입 연산자
//        int n1 = 7, n2 = 7, n3 = 7;
//
//        // 전위/후위 증감자
//        int b = 5;
//        int c = b++;  // 실행문이 끝나고 b가 증가
//        int d = ++b;  // 실행문이 끝나기 전에 b가 증가
//        System.out.println(c); // 5
//        System.out.println(d); // 7
//
//
//        // 비교 연산자 : ==, !=, >, >= 등
//        char ch1 = 'a';
//        char ch2 = 'b';
//        System.out.println(ch1 == ch2);  // false
//        System.out.println(ch1 != ch2);  // ture
//
//        // 논리 연산자 : &&, ||, !
//        int num1 = 10;
//        int num2 = 20;
//        boolean result1;
//        result1 = num1 > 5 && num1 <20;
//        System.out.println(result1);
//        boolean result2 = num2 < 10 || num2 < 30;
//        System.out.println(result2);
//
        // 비트 연산자 : &, |, ^, ~
        int n1 = 5;  //101
        int n2 = 4;  //100
        int n3 = n1&n2;
        System.out.println(n3); // 4
        int n4 = n1|n2;
        System.out.println(n4); // 5
        int n5=n1^n2;
        System.out.println(n5); // 1

        // 시프트 연산 : <<(왼쪽 이동), >>(오른쪽 이동)
        // 왼쪽으로 한칸 이동한다는 것은 2를 곱한다는 의미
        // 00000101(5) => 00001010(10)


    }
}

