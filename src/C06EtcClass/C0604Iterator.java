package C06EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C0604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

//        // enhanced for문 : 원본변경불가
//        for(String s : myList){
//            System.out.println(s);
//        }

        // iterator는 참조하고 있는 원본데이터 삭제 가능
        Iterator<String> iters = myList.iterator();
        while (iters.hasNext()) {
            System.out.println(iters.next());
        }

        Iterator<String> iters2 = myList.iterator();
        while (iters2.hasNext()) {
            if(iters2.next().equals("banana")){
                iters2.remove();
            }
            System.out.println(myList);
        }
    }
}
