package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        // 배열 표현식1: 리터럴 방식
//        int[] intArr1 = {1, 2, 3, 4, 5};
//
//        // 배열 표현식2 : 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]);  // 0으로 초기화 되어 있음
//
//        // 배열 표현식 3
//        int[] intArr3 = new int[]{1, 2, 3, 4};
//
//        // 배열 표현식 4 : 불가 -> 배열의 길이는 사전에 지정되어야 함
//        int[] intArr4 = new int[];

//        String[] strArr1 = new String[5];
//        strArr1[0] = "hello";
//        strArr1[1] = "Java";
//        // NullPointerException 발생
//        System.out.println(strArr1[2].length());
//
//        String[] strArr2 = new String[5];
//        // 배열의 값 한꺼번에 세팅
//        Arrays.fill(strArr2, "hi");

//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        for (int i = 0; i < intArr2.length; i++) {
//            System.out.println(intArr2[i]);
//        }
//        for(int i : intArr2) {
//            System.out.println(i);
//        }

//        // 85, 65, 90인 int 배열을 선언하고, 총합, 평균 구하기
//        int[] intArr = {85, 65, 90};
//        int sum = 0;
//        for (int i=0; i<intArr.length; i++){
//            sum += intArr[i];
//        }
//        System.out.println("총합:" + sum + "\n평균:" + sum/intArr.length);

//        // 최대값, 최소값 구하기
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0];   // Integer.MIN_VALUE로도 세팅 가능
//        int min = arr[0];   // Integer.MAX_VALUE로도 세팅 가능
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println("최댓값:" + max + "," + "최댓값:" + min);
//
//        // 0번째부터 마지막까지 순차적으로 배열의 순서 바꾸기
//        int[] arr = {10, 20, 30, 40, 50};
//        int temp = 0;
//        for (int i=0; i<arr.length-1; i++){
//            temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        // 배열 뒤집기
//        // 새로운 배열에 arr 뒤집은 값 세팅
//        int[] arr = {1,2,3,4,5,6,7};
//        int[] new_arr = new int[arr.length];
//        for (int i=arr.length-1; i>=0; i--){
//            new_arr[arr.length-1-i]=arr[i];
//        }
//        System.out.println(Arrays.toString(new_arr));

//        // 숫자 뒤집기
//        // 문자 배열로 만들고 문자열로 합해서 문자열로 출력
//        // 내 풀이
//        int num = 123456;
//        String str = Integer.toString(num);
//        char[] c = str.toCharArray();
//        char[] answer = new char[c.length];
//        for (int i = c.length-1; i >= 0; i--) {
//            answer[c.length-1-i] = c[i];
//        }
//        System.out.println(Arrays.toString(answer));
//        // 다른 풀이
//        int num = 123456;
//        String str = Integer.toString(num);
//        StringBuilder sb = new StringBuilder();
//        int count = str.length()-1;
//        for (int i = 0; i < str.length(); i++) {
//            sb.append(str.charAt(count-i));
//        }
//        System.out.println(sb);
//        // 다른 풀이
//        String str = Integer.toString(num);
//        StringBuilder sb = new StringBuilder(str);
//        String answer = sb.reverse().toString();
//        int result = Integer.parseInt(answer);

//        // 정렬
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr);    // 오름차순 정렬이 기본
//        System.out.println(Arrays.toString(arr));
//
//        // 문자 정렬
//        // 아스키코드 기준으로 => 대문자가 소문자보다 아스키코드 숫자가 낮다
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        // 문자열의 index 순서로 비교
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//
//        // 내림차순
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());

        // 기본형 타입은 Comparator로 처리 불가
        int[] arr = {5,1,2,7,3,1,2};
        // 오류 ! ) Arrays.sort(arr, Comparator.reverseOrder());
        // 방법 1) 오름차순 정렬 후 배열 뒤집기
        Arrays.sort(arr);    // 오름차순 정렬

        // 방법 2) streamApi, lambda를 활용한 내림차순 활용
        int[] answer = Arrays.stream(arr) // arr을 대상으로 Stream객체 생성
                .boxed()  //int요소를 Integer로 형변환시키는 메서드
                .sorted(Comparator.reverseOrder())
                .mapToInt(a->a)  //Integer를 다시 int로 형변환
                .toArray();     // 배열로 변환



    }
}

