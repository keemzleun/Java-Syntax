package C03Inheritance;

// extends 키워드를 통해 상속관계를 표현
public class C031Inheritance extends Parents {
    int c = 30;
    public static void main(String[] args) {
        C031Inheritance c1 = new C031Inheritance();
        // 자식 클래스이더라도 private 변수는 상속 및 접근 불가
        System.out.println(c1.a);
        System.out.println(c1.c);
        // 메서드 상속
        c1.parentMethod();
    }

    // 부모 메서드 재정의 : Overriding !
    // 성능의 최적화를 위해 붙여주는 게 좋다고 알려져 있다
    @Override
    void parentMethod() {
        System.out.println("부모 클래스가 아니라 자식 클래스입니다.");
    }
    void childMethod() {
        System.out.println("자식 클래스입니다.");
    }

}
class Parents {
    int a = 10;
    private int b = 20;
    void parentMethod() {
        System.out.println("부모 클래스입니다.");
    }
}
