package C05AnonymousLambda;

public class C0502AnonymousClass {
    public static void main(String[] args) {
        // AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고
        // 익명의 클래스가 만들어짐과 동시에 익명객체 생성
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound2() {

            }
        };

        // 익명 객체에 구현 메서드가 1개 밖에 없을 때에 람다표현식(화살표 함수)로 표현가능
        // () 부분에 매개변수를 지정하여 구현체에서 활용
        // 변수의 개수가 많을 때에는 개수와 순서를 맞춰서 지정
        Animal a2 = (a)-> System.out.println("동물소리를 냅니다" + a);
//        Animal a2 = new Animal() {
//            @Override
//            public void makeSound() {
//                System.out.println("동물 소리를 냅니다.");
//            }
//        };

        // Animal2로 익명객체를 만들어서 input1+input2+input3를 더해서 return 하는 메서드 정의
        // 위에서 return 문자열 출력
         Animal2 animal2 = (a,b,c) -> a + b + c;
         System.out.println(animal2.makeSound("heelo", "wild", 3));
//        Animal2 animal2 = new Animal2() {
//            @Override
//            public String makeSound(String a, String b, int c) {
//                return a+b+c;
//            }
//        };
        // 실행문이 한줄일 때에는 {}와 return 생략 가능
        // 2줄 이상일 때에는 {}를 사용해서 return 처리
        Animal2 animal3 = (a,b,c) -> {
            if (c>10) {
                return a+b;
            } else {
                return a;
            }
        };
        System.out.println(animal3.makeSound("hhh", "hava", 9));
    }
}
interface Animal {
    void makeSound(int a);
}
interface Animal2 {
    String makeSound(String a, String b, int c);
}
abstract class AbstractAnimal {
    void makeSound1(){

    }
    abstract void makeSound2();

}
