package C04Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements cat1 = new CatImplements();
        cat1.makeSound();
        DogImplements dog1 = new DogImplements();
        dog1.makeSound();

        AnimalInterface1 cat2 = new CatImplements();
        cat1.makeSound();
        AnimalInterface1 dog2 = new DogImplements();
        dog1.makeSound();
        // 다형성 : 하나의 객체가 여러개의 참조변수를 가질 수 있음을 의미

        CatMultiImplements cat3 = new CatMultiImplements();
        cat3.makeSound();
        System.out.println(cat3.play("순대","우동이"));

        DogMultiImplements dog3 = new DogMultiImplements();
        dog3.makeSound();
        System.out.println(dog3.play("순대","우동이"));


//        AnimalInterface2 cat4 = new CatMultiImplements();
//        cat4.makeSound();     // 오류
//        System.out.println(cat4.play("순대","우동이"));
//
//        AnimalInterface2 dog4 = new DogMultiImplements();
//        dog4.makeSound();     // 오류
//        System.out.println(dog4.play("순대","우동이"));


        // 기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나,
        // 익명 내부 클래스 방식으로 생성 가능
        AnimalInterface1 ai1 = new AnimalInterface1() {
            @Override
            public void makeSound() {
                System.out.println("hello");
            }
        };
        ai1.makeSound();

    }
}
