package C07ExceptionFileParsing.AuthorException;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class AuthorController {
    public static void main(String[] args) {
        while(true) {
            AuthorService authorService = new AuthorService();
            Scanner sc = new Scanner(System.in);
            System.out.println("서비스 선택 1.회원 가입 2.로그인");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 1) {
                authorService.register(sc);
            } else if (number == 2) {
                authorService.login(sc);
            } else {
                System.out.println("올바르지 않은 번호입니다.");
            }
        }
    }




}
