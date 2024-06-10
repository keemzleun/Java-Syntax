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
//        int max = arr[0];   // 길이가 확정되지 않았을 경우, Integer.MIN_VALUE로도 세팅 가능
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
//        int[] arr = {5,1,2,7,3,1,2};
//        // 오류 ! ) Arrays.sort(arr, Comparator.reverseOrder());
//        // 방법 1) 오름차순 정렬 후 배열 뒤집기
//        Arrays.sort(arr);    // 오름차순 정렬
//
//        // 방법 2) streamApi, lambda를 활용한 내림차순 활용
//        int[] answer = Arrays.stream(arr) // arr을 대상으로 Stream객체 생성
//                .boxed()  //int요소를 Integer로 형변환시키는 메서드
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(a->a)  //Integer를 다시 int로 형변환
//                .toArray();     // 배열로 변환


//        // [프로그래머스] K번째수
//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] new_array = new int[array.length];
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 3; i++) {
//            int a = commands[i][0];     // 2
//            int b = commands[i][1];     // 5
//            int c = commands[i][2];     // 3
//            for (int j = a; j <= b; j++) {
////                sb.append(array[j]);   // 에바참치. 여기서 막힘
////                Arrays.sort(sb.chars().toArray());
////                System.out.println(sb);
//            }
//            System.out.println(new_array[c]);
//        }
        // 강사님 풀이
        /*
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length};
        for (int i=0; i<command.length; i++){
            int start = command[i][0] - 1;
            int end = command[i][1];
            int value = command[i][2] - 1;
            int[] temp = new int[end - start + 1];  // **
            int count = 0;                          // **
            for (int j=start; j<end; j++){
                temp[count] = array[j];             // **
                count++;
            }
            Arrays.sort(temp);
            answer[i] = temp[value];
        */


        // 선택정렬 알고리즘
        // 내 풀이
//        int[] arr = {17, 20, 19, 25, 12};
//        int count = 0;
//        int min = arr[0];
//        int[] new_array = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//                new_array[i] = min;
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(new_array));
        // 강사님 풀이 1
//        int[] arr = {17, 20, 19, 25, 12};
//        for (int i = 0; i < arr.length-1; i++) {
//            int index = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[index] > arr[j]) {
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // 강사님 풀이 2
//        int[] arr = {17, 20, 19, 25, 12};
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        // 숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = i+1; j < intArr.length; j++) {
//                System.out.println(intArr[i] + intArr[j]);
//            }
//        }


        // 배열의 복사 : copyOf(배열, length), copyOfRange(배열, start, end)
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr = Arrays.copyOf(arr, 10);  // 다 복사하고 나머지는 0으로 채움
//        int[] newArr2 = Arrays.copyOfRange(arr, 1, 4);  // 1이상 4미만

        // 배열의 중복 제거
//        int[] temp = {10, 10, 5, 7, 40, 40, 10, 10};
//        int[] copy_temp = Arrays.copyOf(temp, temp.length);
//        int count = 0;
//        for (int i = 0; i < temp.length; i++) {
//            for (int j = i; j < temp.length; j++) {
//                if(temp[i] == temp[j]) {
//                    copy_temp[count] = temp[i];
//                }
//            }
//        }
        // 강사님 풀이
//        int[] temp = {10, 10, 5, 7, 40, 40, 10, 10};
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int num = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if (i==0 || temp[i] != temp[i-1]) {
//                new_temp[num] = temp[i];
//                num++;
//            }
//        }
//        System.out.println(Arrays.toString(new_temp));
//        int[] answer = Arrays.copyOfRange(new_temp, 0, num);
//        System.out.println(Arrays.toString(answer));

        // [프로그래머스] 두개뽑아서 더하기
        // 내 풀이 : 44.4점;;;
//        int[] numbers = {2, 1, 3, 4, 1};
//        Arrays.sort(numbers);
//        int[] answer = new int[30];
//
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                answer[count] = numbers[i] + numbers[j];
//                count++;
//            }
//        }
//        answer = Arrays.copyOfRange(answer, 0, count);
//        System.out.println(Arrays.toString(answer));
//
//        Arrays.sort(answer);
//        int[] temp = new int[answer.length];
//        int num = 0;
//        for (int i = 0; i < answer.length; i++) {
//            if (i==0 || answer[i] != answer[i-1]) {
//                temp[num] = answer[i];
//                num++;
//            }
//        }
//        int[] new_temp = Arrays.copyOfRange(temp, 0, num);
//        System.out.println(Arrays.toString(new_temp));

        // 강사님 풀이
//        int[] numbers = {2, 1, 3, 4, 1};
//        int[] temp = new int[numbers.length* numbers.length];
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                temp[count] = numbers[i] + numbers[j];
//                count++;
//            }
//        }
//        temp = Arrays.copyOf(temp, count);
//        Arrays.sort(temp);
//
//        int[] new_temp = new int[temp.length];
//        int num = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if (i==0 || temp[i] != temp[i-1]) {
//                new_temp[num] = temp[i];
//                num++;
//            }
//        }
//        int[] answer = Arrays.copyOf(new_temp, num);
//        System.out.println(Arrays.toString(answer));

        // 배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 8){
//                System.out.println("index:" + i);
//            }
//        }

//        // 이진 검색(Binary Search) = 이분탐색
//        // 복잡도 O(logn)
//        int[] arr = {1,3,6,8,9,11,15};
//        // 사전에 오름차순 정렬이 되어 있어야 이진검색 가능
//        System.out.println(Arrays.binarySearch(arr, 15));
//
//        // 배열간 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(arr1==arr2);     // false. 배열도 객체. 따라서 각 메모리 주소를 비교.
//        // Arrays.equals : 값과 순서까지  동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));  // true

//        // 2차원 배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        // 리터럴 방식으로 할당
//        int[][] arr2 = {{1,2,3},{4,5,6}};
//        // 2차원 배열의 출력
//        System.out.println(Arrays.deepToString(arr2));

//        // 2차원 가변배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//
//        // 가변배열 리터럴 방식
//        int[][] arr2 = {{10, 20}, {10, 20, 30}};

//        // [3][4] 사이즈 배열을 선언한 뒤
//        // 1~12까지 숫자값 각 배열에 할당 후 출력
//        // {1,2,3,4},{5,6,7,8},{9,10,11,12}
//        int num = 1;
//        int[][] arr = new int[3][4];    // arr.length시 3출력
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//        //[프로그래머스] 행렬의 덧셈
//        int[][] arr1 = {{1, 2},{2, 3}};
//        int[][] arr2 = {{3, 4},{5, 6}};
//        int[][] sum = new int[arr1.length][arr1[0].length];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                sum[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(sum));

//        // 가변 배열 실습 : 행의 길이(전체 배열의 길이) 5 => {{10}, {20,20}, {30,30,30}, ...}
//        int[][] arr = new int[5][];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j <= arr.length+1; j++) {
//                arr[i] = new int[i];
//                Arrays.fill(arr[i], i*10);
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
//        // 강사님 풀이
//        int[][] arr = new int[5][];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i+1];
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (i+1)*10;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));


    }
}

