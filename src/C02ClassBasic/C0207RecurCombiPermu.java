package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0207RecurCombiPermu {
    public static void main(String[] args) {

//        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
////        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
////        [[1,2], [1,3] [1,4], ...]
//        List<List<Integer>> combinations = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i=0; i<myList.size()-1; i++){
//            temp.add(myList.get(i));
//            for(int j=i+1; j<myList.size(); j++){
//                temp.add(myList.get(j));
//                combinations.add(temp);
//                temp.remove(myList.size()-1);
//            }
//            temp.remove(myList.size()-1);
//        }

        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> answer = new ArrayList<>();
        combinations(answer, new ArrayList<>(), myList, 2, 0);
        permu(answer, new ArrayList<>(), myList, 2, new boolean[myList.size()]);
        System.out.println(answer);
    }
    static void combinations(List<List<Integer>> answer, List<Integer>temp , List<Integer>myList, int count, int start  ){
        if(temp.size()==count){
            // new ArrayList<>(temp)를 한 이유 :
            // temp값을 그대로 add 할 경우, temp메모리 값이 add 되므로,
            // 모든 answer리스트에 같은 temp리스트 add
//            answer.add(temp);
            answer.add(new ArrayList<>(temp));

            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combinations(answer, temp, myList, count, i+1 );
            temp.remove(temp.size()-1);
        }
    }
    static void permu(List<List<Integer>> answer, List<Integer>temp , List<Integer>myList, int count, boolean[] visited){
        if(temp.size()==count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if(visited[i] == false){
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, visited);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
}