package C02ClassBasic;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
        // for문으로 1~10까지 누적합계
//        int a = 0;
//        for (int i = 1; i <= 10; i++) {
//            a += i;
//        }
//        System.out.println(a);
//        System.out.println(addAcc(10));

        // 피보나치 수열
//        int count = 0;
//        int a = 1;
//        int b = 1;
//        for (int i = 2; i < 100; i++) {
//            int temp = a;
//            a = b;
//            b = temp + a;
//        }
//        System.out.println(b);

        System.out.println(fibonacci(5));

    }
    static int fibonacci(int a){
        if (a<=2){
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }

    static int addAcc(int n){
        if(n == 1){
            return 1;
        }
        return n+addAcc(n-1);
    }

}
