package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball","농구");
//        myMap.put("soccer","축구");
//        myMap.put("baseball","야구");
////        System.out.println(myMap);
////        System.out.println(myMap.get("soccer"));
//        myMap.put("baseball", "크리켓");
//
//        // baseball을 map에서 검색하는 복잡도 O(1) : 바로 찾아가기 때문 ! 따봉 map아 고마워~
//        System.out.println("baseball");
//        myMap.remove("baseball");
//
//        // putIfAbsent : 비어있으면 put
//        myMap.putIfAbsent("basketball","배구");
//
//        // getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.get("baseball"));  // null
//        System.out.println(myMap.getOrDefault("baseball", "비어있음")); // 비어있음

//        // [문제] Map에 String 배열 값 넣기
//        // 농구:2 배구:2 야구:1
//        Map<String, Integer> sports = new HashMap<>();
//        String[] S= {"농구", "농구", "배구", "야구", "배구"};
//        // 내 풀이
//        for (int i = 0; i < S.length; i++) {
//            int count = 1;
//            for (int j = i+1; j < S.length; j++) {
//                if (S[i] == S[j]) count++;
//            }
//            sports.putIfAbsent(S[i], count);
//        }
//        System.out.println(sports);
//        // 강사님 풀이
//        for(String a : S){
////            if(sports.containsKey(a)){
////                sports.put(a, sports.get(a)+1);
////            } else {
////                sports.put(a,1);
////            }
//            // 위 if-else문 한 줄로 축약
//            sports.put(a, sports.getOrDefault(a, 0)+1);
//        }
//        System.out.println(sports);


        // keySet() : key 목록을  반환
        // values() : value 목록을 반환

//        // enhanced for문을 통해 key값 하나씩 출력
//        for(String a : myMap.keySet()) {
//            System.out.println(a);
//            System.out.println(myMap.get(a));
//        }
//        for(String a : myMap.values()) {
//            System.out.println(a);
//        }
//
//        // iterator를 통해 key값 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
//        // next() 메서드는 데이터를 하나씩 소모시키면서 return
//        System.out.println(myIter.next());
//        // hasNext() : iterator안에 값이 있는지 없는지 boolean return
//        while(myIter.hasNext()){
//            System.out.println(myIter.next());
//        }

        // [프로그래머스] 완주하지 못한 선수
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        // 강사님 풀이 - 리스트 사용
//            List<String> part = new ArrayList<>(Arrays.asList(participant));
//            List<String> comp = new ArrayList<>(Arrays.asList(completion));
//            for(String c : comp){
//                part.remove(c);     // remove 무지 느림. 아마 시간초과일 듯
//            }
//            System.out.println(part);
        // 다른 풀이 - Map 사용
//            Map<String, Integer> part = new HashMap<>();
//            for(String p : participant) {
//                part.put(p, part.getOrDefault(p,0)+1);
//            }
//            for (String c : completion) {
//                if (part.containsKey(c)){
//                    if(part.get(c)==1) {
//                        part.remove(c);
//                    } else {
//                        part.put(c, part.get(c)-1);
//                    }
//                }
//            }
//            String answer = "";
//            for (String a : part.keySet()){
//                answer = a;
//            }
//            System.out.println(answer);

        // [프로그래머스] 의상
        // clothes[의상의 이름][의상의 종류]
        // 경우의 수 : 각 의상 종류 당 개수 *
//        String[][] clothes = 프로그래머스에서 줌
//        Map<String, String> clo = new HashMap<>();
//        Map<String, Integer> num = new HashMap<>();
//        int count = 1;
//        for (int i = 0; i < clothes.length; i++) {
//            clo.put(clothes[i][0], clothes[i][1]);
//            for (int j = i+1; j < clothes.length; j++) {
//                if (clothes[i][1].equals(clothes[j][1])) {
//                    num.put(clothes[i].toString(), count);
//                }
//            }
//        }
//        for (int j = 0; j < count; j++) {
//            count *= count;
//        }

//        // LinkedHashMap : 데이터 삽입 순서 유지
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 1);
//        linkedMap.put("hello3", 1);
//        linkedMap.put("hello2", 1);
//        linkedMap.put("hello1", 1);
//        System.out.println(linkedMap); // {hello5=1, hello4=1, hello3=1, hello2=1, hello1=1}
//
//        // TreeMap : key를 통해 데이터를 정렬(최적화)
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 1);
//        treeMap.put("hello3", 1);
//        treeMap.put("hello2", 1);
//        treeMap.put("hello1", 1);
//        System.out.println(treeMap); // {hello1=1, hello2=1, hello3=1, hello4=1, hello5=1}
//
//        [프로그래머스] 문자열 내 마음대로 정렬하기
//        String[] strings = {"sun", "bed", "car"};
//        int n = 1;
//        String[] answer = new String[strings.length];
//        Map<String, String> tree = new TreeMap<>();
//        int count = 0;
//        // 내 풀이
//        for (int i = 0; i < strings.length; i++) {
//            tree.put(String.valueOf(strings[i].charAt(n)), strings[i]);
//        }
//        for(String a : tree.values()) {
//            answer[count] = a;
//            count++;
//        }
//        System.out.println(Arrays.toString(answer));
//        // 강사님 풀이
//        for (String a : strings){
//            tree.put(a.charAt(n)+a, a);
//        }
//        for (String a : tree.values()){
//            answer[count] = a;
//            count++;
//        }

    }
}
