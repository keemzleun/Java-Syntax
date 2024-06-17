package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
        if (checkPrime(11)) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
        checkPrimePrint(12);

    }
    public static boolean checkPrime(int a){
        // 소수면 true
        for (int i = 2; i*i <= a; i++) {
            if (a % i == 0) {
                // 메서드는 return을 만나면 종료됨
                // void 리턴 타입에서도 메서드 강제 종료를 위해 return 사용
                return false;
            }
        }
        return true;
    }

    public static void checkPrimePrint(int a){
        // 소수면 true
        for (int i = 2; i*i <= a; i++) {
            if (a % i == 0) {
                // 메서드는 return을 만나면 종료됨
                // void 리턴 타입에서도 메서드 강제 종료를 위해 return 사용
                System.out.println("소수가 아닙니다");
                return;
            }
        }
        System.out.println("소수입니다");
    }
}
