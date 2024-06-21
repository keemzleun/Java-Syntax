package Reference.AuthorException;


import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        // while문 안에 authorServie를 둬서 매번 호출하면 안됨!!
        AuthorService authorService = new AuthorService();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("서비스 선택 1.회원 가입 2.로그인");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 1) {
                System.out.println("이름");
                String name = sc.nextLine();
                System.out.println("이메일");
                String email = sc.nextLine();
                System.out.println("패스워드");
                String password = sc.nextLine();
                authorService.register(name, email, password);
            } else if (number == 2) {
                System.out.println("이메일");
                String email = sc.nextLine();
                System.out.println("비밀번호");
                String password = sc.nextLine();
                try {
                    authorService.login(email, password);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            } else {
                System.out.println("올바르지 않은 번호입니다.");
            }
        }
    }
}
