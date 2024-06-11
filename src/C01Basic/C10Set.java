package C01Basic;

import java.util.*;
import java.util.jar.JarEntry;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);
//
//        // [프로그래머스] 폰켓몬
//        int[] nums = {3,1,2,3};
//        Set<Integer> set = new HashSet<>();
//        for (int i=0; i< nums.length; i++) {
//            set.add(nums[i]);
//        }
//        int answer = 0;
//        if(set.size()>nums.length/2){
//            answer = nums.length/2;
//        } else {
//            answer = set.size();
//        }
//
//        List<String> myList = new ArrayList<>();
//        myList.add("tennis");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("basketball");
//        myList.add("basketball");
//
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet);
//
//        String[] arr = {"AA", "BB", "CCC"};
//        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
//        set1.remove("CCC");
//        System.out.println(mySet);

        // [프로그래머스] 전화번호 목록
//       Arrays.sort(phone_book);
//       for (int i = 0; i < phone_book.length; i++) {
//           if (phone_book[i].startWith(phone_book[i-1])) return false;
//       }
//       return answer;
        // 다른 풀이
//        Set<String> mySet3 = new HashSet<>(Arrays.asList(phone_book));
//        boolean answer  = true;
//        for (String s : phone_book){
//            for(int i = 0; i < s.length(); i++){
//                if(mySet3.contains(s.substring(0, i))){
//                    answer = false;
//                    break;
//                }
//            }
//        }

        // 집합 관련 함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> set1 = new HashSet<>(Arrays.asList("java", "python", "js"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("java", "html", "css"));
//
//        // set1.retainAll(set2);  // set1 자체가 변경됨
//        // set1.addAll(set2);
//        // set1.remove(set2);
//        // System.out.println(set1);
//
//        // 관련 문제 : [프로그래머스] 뉴스 클러스터링 -> 짜치는 문제(?)


        // LinkedHashSet, TreeSet
//        Set<String> mySet = new TreeSet<>();
//        mySet.add("hello5");
//        mySet.add("hello5");
//        mySet.add("hello1");
//        mySet.add("hello4");
//        System.out.println(mySet);

        // 두 개 뽑아서 더하기
        int[] numbers = {2, 1, 3, 4, 1};
        int[] answer = {};
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }



    }
}
