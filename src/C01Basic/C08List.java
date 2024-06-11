package C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
//        // List 선언 방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
//        // 가장 일반적인 List 선언 방법
//        // 왼쪽엔 인터페이스, 오른쪽엔 구현체
//        // 인터페이스에는 기능 구현X. 실제 기능은 오른쪽(ArrayList)에 구현돼 있음
//        List<String> myList3 = new ArrayList<>();
//
//        // 초깃값 생성 방법1 : 하니씩 add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("c++");
//
//        // 초깃값 생성 방법2 : 리스트를 주입
//        // Arrays.asList는 배열을 리스트로 변환하는 메서드
//        String[] myArr = {"java", "python", "c++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(myArr));
//        List<String> myList6 = new ArrayList<>(List.of(myArr));
//
//        int[] intArr = {10, 20, 30};
//        List<Integer> myList5 = new ArrayList<>();
//        for(int i : intArr) {
//            myList5.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        System.out.println(myList);
//
//        // add(index, 값) : 중간에 값 삽입. 성능 저하 이슈!!!
//        myList.add(0, 30);
//        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
//
//        // 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList);
//
//        // get : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
//        // for문 돌려서 전체 list 출력
//        // size() : 리스트의 길이(개수) 반환
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
//        // remove : 요소 삭제
//        // 1) index를 통해 삭제
//        myList.remove(0);
//        // 2) value를 통한 삭제
//        myList.remove(Integer.valueOf(10));

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        // set(index, value) : 인덱스 위치의 자리에 value값 setting(변경)
//        myList.set(myList.size()-1, 10);
//        System.out.println(myList);
//
//        // indexOf : 특정 값이 몇번째 index에 위치한지 return
//        // 가장 먼저 나오는 값의 index return
//        System.out.println(myList.indexOf(10));
//
//        // clear() : 전체 삭제
//
//        // isEmpty : 값이 비었는지 안 비었는지
//
//        // contains : 특정 값이 있는지 없는지 확인
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        System.out.println(list.contains(10));  // true
//        System.out.println(list.contains(20));  // false

//        // 이중 리스트(리스트 안에 리스트)
//        List<Integer> temp1 = new ArrayList<>();
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(temp1);              // 굳이 리스트명이 필요할까?
//        myList.add(new ArrayList<>());  // 그냥 이렇게 쓰는게...

//        List<List<Integer>> myList = new ArrayList<>();
//        // [[ ], [ ]]
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(10);
//        myList.get(0).add(20);
//        myList.get(1).add(1);
//        myList.get(1).add(2);
//
//        // 리스트 안에 배열 : 배열 사이즈 2, 3, 4개짜리 배열 3개 들어가는 것으로 add
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[]{1,2});
//        myList2.add(new int[]{10,20,30});
//        myList2.add(new int[]{100,200,300,400});

//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//        // 리스트 정렬 : Collections.sort(), 리스트 객체.sort()
//        // 1) Collections.sort()
//        Collections.sort(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        // 2) 리스트 객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

        // [프로그래머스] n의 배수 고르기
        int n=3;
        int[] numList = {4,5,6,7,8,9,10,11,12};
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % n == 0) {
                A.add(numList[i]);
            }
        }
        int[] answer = new int[A.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = A.get(i);
        }
        System.out.println(Arrays.toString(answer));

//        // [프로그래머스] 두 개 뽑아서 더하기
//        // contains 활용해서 중복 체크
//        // 강사님 풀이
//        List<Integer> myList = new ArrayList<>();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (!myList.contains(numbers[i] + numbers[j])){
//                    myList.add(numbers[i] + numbers[j]));
//                }
//            }
//        }
//        Collections.sort(myList);
//        int[] answer = new int[myList.size()];
//        for (int i = 0; i < myList.size(); i++) {
//            answer[i] = myList.get(i);
//        }
//        return answer;

//        // 배열과 List 간의 변환
//        // 1. String 배열을 List<String>으로 변환
//            String[] stArr = {"java", "python", "c++"};
//            // 1-1. Arrays.asList
//            List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//            // 1-2. for문을 통해 담기
//            // 1-3. streamApi (참고만)
//            List<String> stList2 = Arrays.stream(stArr).collect(Collectors.toList());
//
//        // 2.List<String>을 String 배열로 변환
//            // 2-1. for문을 통해 담기  <- 이걸 쓰세요.
//            // 2-2. toArray
//            String[] stArr2 = stList.toArray(new String[stList.size()]);
//
//        // 3. int 배열을 List<Integer>로 변환
//            // 3-1. for문을 통해 담기
//            // 3-2. streamApi 사용
//            int[] intArr = {10, 20, 30, 40};
//            List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());














    }
}
