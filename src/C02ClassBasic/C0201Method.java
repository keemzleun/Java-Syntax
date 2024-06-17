package C02ClassBasic;

public class C0201Method {
    public static void main(String[] args) {
        int total1 = 0;
        for (int i = 0; i < 10; i++) {
            total1 += i;
        }
        System.out.println(total1);

        // 코드의 중복이 발생하므로, 반복을 피하기 위해 위 기능을 분리
        sumAcc(100, 200);

        // 클래스명.메서드 : 기본방식 ex)C0201Method.sumAcc(100, 200);
        // 같은 클래스내에서의 클래스메서드 호출은 클래스명 생략 가능
        sumAcc(100, 200);

    }

    // int라는 리턴타입을 가짐
    // input(매개변수)값을 int 두개로 정의
    // 메서드 구성요소 : 매개변수, 리턴타입, 접근제어자(public), 클래스 메서드 여부(static)
    public static void sumAcc(int start, int end){
        int total = 0;
        for (int i = start; i < end; i++) {
            total += i;
        }
        // return total;
        System.out.println(total);
    }
}
