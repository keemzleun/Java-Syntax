package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        Scanner sc =  new Scanner(System.in);
        while(true) {
            System.out.println("서비스를 선택하세요. 1.회원가입 2.회원목록조회 3.회원상세조회 4.게시글작성 5.게시글목록조회 6.게시글상세조회");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    // 회원 가입
                    System.out.println("'1.회원가입'을 선택하셨습니다.");
                    System.out.println("이름을 입력해주세요.");
                    String name = sc.nextLine();
                    System.out.println("이메일을 입력해주세요.");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.nextLine();
                    Author author = new Author(name, email, password);
                    author.SignUp(name, email, password);
                    authorList.add(author);
                    System.out.println("회원가입이 완료되었습니다. \n");
                    break;
                case 2 :
                    // 회원 목록 조회
                    System.out.println("'2.회원목록 조회'를 선택하셨습니다.");
                    for (int i = 0; i < authorList.size(); i++) {
                        System.out.print("아이디: " + authorList.get(i).getId());
                        System.out.print(" / 이메일 :" + authorList.get(i).getEmail() + "\n");
                    }
                    break;
                case 3 :
                    // 회원 상세 조회
                    System.out.println("'3.회원상세조회'를 선택하셨습니다.");
                    System.out.println("회원 id를 입력해주세요.");
                    Long id = sc.nextLong();
                    Author myAuthor = null;
                    for (int i = 0; i < authorList.size(); i++) {
                        if (authorList.get(i).getId().equals(id)){
                            myAuthor = authorList.get(i);
                        }
                    }
                    System.out.println("id: " + myAuthor.getId() + " / 이름: "+myAuthor.getName() + " / 이메일: " + myAuthor.getEmail() + " / 비밀번호: " + myAuthor.getPassword());
                    break;
                case 4 :
                    // 게시글 작성
                    // id, title, contents, email(입력받되, Author객체)
                    System.out.println("'4.게시글 작성'을 선택하셨습니다.");
                    Author myAuthor2 = null;
                    System.out.println("작성자의 이메일을 입력하세요.");
                    String myEmail = sc.nextLine();
                    for (int i = 0; i < authorList.size(); i++) {
                        if (authorList.get(i).getEmail().equals(myEmail)){
                            System.out.println("제목을 입력하세요.");
                            String title = sc.nextLine();
                            System.out.println("내용을 입력하세요.");
                            String contents = sc.nextLine();
                            Post post = new Post(title, contents, myEmail);
                            post.createPost(title, contents, myEmail);
                            postList.add(post);
                        }
                    }
                    break;
                case 5 :
                    // 게시글 목록 조회
                    System.out.println("'5.게시글 목록 조회'를 선택하셨습니다.");
                    for (int i = 0; i < postList.size(); i++) {
                        System.out.print("아이디: " + postList.get(i).getId());
                        System.out.print(" / 제목 :" + postList.get(i).getTitle() + "\n");
                    }
                    break;
                case 6 :
                    // 게시글 상세 조회
                    System.out.println("'6.게시글 상세 조회'를 선택하셨습니다.");
                    System.out.println("게시글 id를 입력해주세요.");
                    Long id2 = sc.nextLong();
                    Post myPost = null;
                    for (int i = 0; i < postList.size(); i++) {
                        if (postList.get(i).getId().equals(id2)){
                            myPost = postList.get(i);
                        }
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
class Author {
    static Long static_id = 0L;
    private Long id;
    private String name;
    private String email;
    private String password;

    public Author(String name, String email, String password) {
        // 생성자
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void SignUp(String name, String email, String password) {
        // 회원 가입
        this.name = name;
        this.email = email;
        this.password = password;
        static_id += 1;
        this.id = static_id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
class Post {
    static Long static_id = 0L;
    private Long id;
    private String title;
    private String contents;
    private String email; // Author객체

    Post(String title, String contents, String email) {
        this.title = title;
        this.contents = contents;
        this.email = email;
    }

    public void createPost(String title, String contents,  String email){
        this.title = title;
        this.email = email;
        this.contents = contents;
        static_id += 1;
        this.id = static_id;
    }

    public void viewPost(long id){
        // 게시글 상세 조회 : id, title, contents, 저자(email or name or author_id)

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getEmail() {
        return email;
    }

}



