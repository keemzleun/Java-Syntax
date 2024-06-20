package C07ExceptionFileParsing.AuthorException;

import java.util.*;

class AuthorService {
    AuthorRepository authorRepository;
    AuthorService(){
        authorRepository = new AuthorRepository();
    }
    static List<Author> authors = new ArrayList<>();

    public static void register(Scanner sc){
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("이메일: ");
        String email = sc.nextLine();
        System.out.print("비밀번호: ");
        String password = sc.nextLine();
        try {
            if (password.length() < 5) {
                // 비밀번호가 5자리 이하인 경우
                throw new Exception("비밀번호를 5자리 이상 입력하시오.");
//            } else if () {
//                // 동일한 이메일이 있는 경우

            } else {
                System.out.println("성공적으로 회원가입되었습니다.");
                Author author = new Author(name, email, password);
                authors.add(author);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(Scanner sc){
        try {
            System.out.print("이메일: ");
            String email = sc.nextLine();
            System.out.print("비밀번호: ");
            String password = sc.nextLine();

            Author a = null;
            for (Author author : authors) {
                if (Objects.equals(author.getEmail(), email)) {
                    a = author;
                    break;
                }
                else {
                    System.out.println("존재하지 않는 회원입니다.");
                }
            }

            if (a != null) {
                if (!a.getPassword().equals(password)) {
                    System.out.println("비밀번호를 잘못 입력하셨습니다.");
                } else {
                    System.out.println("성공적으로 로그인되었습니다.");
                }
            } else {
                System.out.println("존재하지 않는 회원입니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("유효하지 않은 아이디 형식입니다. 숫자를 입력해주세요.");
        } catch (NullPointerException e) {
            System.out.println("회원 정보를 찾을 수 없습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
        }
    }

}

