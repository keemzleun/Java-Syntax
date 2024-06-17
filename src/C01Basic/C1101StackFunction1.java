package C01Basic;

// Stack을 활용한 함수 호출 원리
public class C1101StackFunction1 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        function1();
        System.out.println("main함수 끝");
    }
    static void function1(){
        System.out.println("func1 시작");
        function2();
        System.out.println("func1 끝");
    }
    static void function2(){
        System.out.println("func2 시작");
        System.out.println("func2 끝");
    }
}
