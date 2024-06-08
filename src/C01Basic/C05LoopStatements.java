package C01Basic;

public class C05LoopStatements {
    public static void main(String[] args) {
//        // 2~10까지 출력하는 while문
//        int a = 2;
//        while(a < 11) {
//            System.out.println(a);
//            a++;
//        }

//        // 입력한 숫자의 구구단 단수 출력
//        // 3 X 1 = 3
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 1;
//        while(a<10) {
//            System.out.println(n + " X " + a + " = " + n * a);
//            a++;
//        }

//        // 반복되는 도어락키
//        Scanner sc = new Scanner(System.in);
//        int n = 0;
//        while(n < 5){
//            String input = sc.next();
//            if(input.equals("1234")) {
//                // 참일 경우의 실행문
//                System.out.println("문이 열립니다.");
//                break;
//            } else {
//                // 거짓일 경우의 실행문
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            n++;
//            if(n == 5) {
//                System.out.println("입력 횟수를 초과했습니다.");
//                break;
//            }
//        }


//        // result에 숫자를 반대로 뒤집은 숫자값을 넣어주세요
//        int num = 1234;
//        int result = 0;
////        while(true){
////            temp += (num % 10);
////            num -= temp;
////            temp *= 1000;
////            System.out.println(temp);
////            break;
////        }
//        // 강사님 풀이
//        while(true) {
//            int temp = num % 10;
//            result = result * 10 + temp;
//            num /= 10;
//            if (num==0) break;
//        }
//        System.out.println(result);


//        // do while문 : 무조건 한번은 실행되는 반복문
//        int a=100;
//        do {
//            a++;
//            System.out.println(a);
//        } while(a<10);


//        // 2~10까지 출력
//        for(int i=2; i<11; i++) {
//            System.out.println(i);
//        }

//        // 1~10에서 홀수만 출력하기
//        for(int i=0; i<10; i++) {
//            if (i%2==1) {
//                System.out.println(i);
//            }
//        }

//        // 1~20까지 짝수만 더하기
//        int sum = 0;
//        for (int i = 0; i < 20; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

//        // 최대 공약수 구하기
//        int a = 24; int b = 36;
//        int max = a > b ? a : b;
//        for (int i = 1; i <= max; i++) {
//            if (a % i == 0 && b % i==0){
//                System.out.println(i);
//            }
//        }

//        // 소수 구하기 : 1~24중에 1과 자기자신을 제외한 숫자로 나누어지지 않는 수
//        for (int i = 1; i <= 24; i++) {
//            int n = 0;
//            for(int j = 1; j <= i; j++){
//                if (i % j == 0) n++;
//            }
//            if (n == 2) System.out.println(i);
//        }

//        // 1~10에서 홀수만 출력하기
//        for(int i = 0; i < 10; i++) {
//            if (i % 2 == 1) {
//                continue;
//            }
//                System.out.println(i);
//        }

//        // Enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1, 3, 5, 7, 9};
//        // 일반 for문
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(arr[i]);
//        }
//        for(int i : arr){
//            System.out.println(i);
//        }

//        // arr 출력 방법
//        System.out.println(Arrays.toString(arr));

//        // 일반 for문을 통한 arr값 변경 후 출력
//        for(int i = 0; i<5; i++) {
//            arr[i] += 10;
//        }


//        // 향상된 for문을 통한 arr값 변경 후 출력
//        // 향상된 for문으로는 실제 arr값의 변경은 불가능
//            for (int i : arr) {
//                i += 10;
//            }


//        // 자바 변수의 유효 범위 : {}
//        int num = 10;
//        if (num > 1){
//            int abc = 20;
//            num = 20;
//        }
//        // abc = 30;  if문 중괄호 밖에서는 abc변수의 존재를 모름
//        System.out.println(num);
//        // System.out.println(abc);  // 오류

//        // 다중 for문
//        // 2단 부터 9단 출력
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i + "단입니다.");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " X " + j + " = " + i*j);
//            }
//        }

//        // 라벨문
//        loop1:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println("hi");
//                if(j==2){
//                    break loop1;
//                }
//            }
//        }

//        // 라벨문 활용
//        // 처음 나온 11의 위치 출력
//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
//        int target = 11;
//        loop1:
//        for(int i=0; i<4; i++){
//            for(int j=0; j<3; j++){
//                if (arr[i][j] == target) {
//                    System.out.println("("+ i + "," + j + ")에 11이 있습니다.");
//                    break loop1;
//                }
//            }
//        }

    }
}

