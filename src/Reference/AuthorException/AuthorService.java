package Reference.AuthorException;


import java.util.*;

class AuthorService {
    private AuthorRepository authorRepository;
    AuthorService(){
        authorRepository = new AuthorRepository();
    }
    static List<Author> authors = new ArrayList<>();

    public void register(String name, String email, String password){
        Author author = new Author(name, email, password);
        authorRepository.register(author);

//        try {
//            if (password.length() < 5) {
//                // 비밀번호가 5자리 이하인 경우
//                throw new Exception("비밀번호를 5자리 이상 입력하시오.");
////            } else if () {
////                // 동일한 이메일이 있는 경우
//
//            } else {
//                System.out.println("성공적으로 회원가입되었습니다.");
//                Author author = new Author(name, email, password);
//                authors.add(author);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }

    public void login(String email, String password) throws IllegalArgumentException{
        // 해당하는 이메일이 있는지 : authorList 목록 조회
        // 그 이메일에 비밀번호가 맞는지
        List<Author> authorList = authorRepository.getAuthorList();
        boolean emailNotFound = false;
        boolean passwordNotFound = false;

        for(Author a : authorList) {
            if (a.getEmail().equals(email)){
            }
        }
        if (emailNotFound == false){
            throw new IllegalArgumentException("존재하지 않는 회원입니다.");
        }
        if (passwordNotFound==false){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다");
        }

    }

}

