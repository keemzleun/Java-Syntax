package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek());   // 10 출력. 꺼내서 보고 다시 넣기
//        System.out.println(myQue);          // 10, 20, 30
//        System.out.println(myQue.poll());   // 10 출력. 꺼내서 보고 다시 안넣기
//        System.out.println(myQue);          // 20, 30


        // LinkedList와 ArrayList 비교
        // LinkedList의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i=0; i<10000; i++){
//            list1.add(0, 10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedList의 중간 삽입: " + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i=0; i<10000; i++){
//            list2.add(0, 10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArraayList의 중간 삽입: " + (endTime2-startTime2));
//
//        // get 비교
//        long startTime3 = System.currentTimeMillis();
//        for(int i=0; i<10000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedList의 중간 삽입: " + (endTime3-startTime3));
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i=0; i<10000; i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArraayList의 중간 삽입: " + (endTime4-startTime4));
//
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }

        // ArrayBlockingQueue : 길이제한큐 ->
        Queue<String> queue = new ArrayBlockingQueue<>(3);
        // add 사용하면 길이제한 초과시 예외 발생
//        queue.add("10");
//        queue.add("20");
//        queue.add("30");
//        queue.add("40");
//        System.out.println(queue);  // 에러
//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40");
//        System.out.println(queue);

        // 우선순위큐 : 데이터를 꺼낼때 정렬된 데이터 pop
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

//        // [프로그래머스] 더 맵게
        int[] scov = {1, 2, 3, 9, 10, 12};
        int K = 7;
        Queue<Integer> que = new PriorityQueue<>();
        while (que.size() > 1) {
            System.out.println(que.poll());
            System.out.println(que.poll());
        }

        // Stack
//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//        // pop : 스택에서 요소를 제거 후 해당 요소를 반환
//        System.out.println(st1.pop());  // 10
//        System.out.println(st1.peek()); // 20
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());

//        Stack<Integer> st2 = new Stack<>();
//        for (int i=0; i<5; i++){
//            st2.push(i);
//        }
//        while(!st2.isEmpty()){
//            System.out.println(st2.pop());
//        }

        // [프로그래머스] 이름 머더라
//        int[] arr = {4,4,4,3,3};
//        int[] answer = {};
//        Stack<Integer> st = new Stack<>();
//        for(int i : arr){
//            if (st.isEmpty()) st.push(i);
//            else if (st.peek() != i) st.push(i);
//        }
//        answer = new int[st.size()];
//        for (int i = answer.length-1; i>=0; i--){
//            answer[i] = st.pop();
//        }
//        System.out.println(Arrays.toString(answer));

        // [프로그래머스] 올바른 괄호
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                stack.push('(');
//            } else if (s.charAt(i) == ')') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                stack.pop();
//            }
//        }
//        return stack.isEmpty();


        // Deque
//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.addLast(1);  // 맨 뒤에 add
//        d1.addLast(2);  // 맨 뒤에 add
//        System.out.println(d1);
//        d1.addFirst(3);
//        System.out.println(d1.pollFirst());     // = .poll()
//        System.out.println(d1.pollLast());      // = .pop()
//
//        // [프로그래머스] 다리를 지나는 트럭
    }
}



