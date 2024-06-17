
// 루트(최상단) 패키지는 src
package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;

// *을 통해 패키지 내에 모든 클래스 import 가능
// import java.util.*;

// *을 통해 패키지 내에 패키지까지 포함해서 모든 내용 import는 불가능
// import java.*; // 불가능


public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
        // 부모 클래스 객체 생성
        C0304ProtectedClass c1 = new C0304ProtectedClass();
        // default 접근 불가
            // System.out.println(c1.st2);
        // protected 접근 불가
            // System.out.println(c1.st3);

        // 부모 클래스를 상속 받은 자식 클래스 객체 생성
        ProtectedMain p1 = new ProtectedMain();
        // default 접근 불가
            // System.out.println(p1.st2);
        // 상속한 객체에서 protected 접근 가능
            System.out.println(p1.st3);
    }
}
