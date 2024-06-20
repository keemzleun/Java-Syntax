package Reference.AuthorException;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {
    private List<Author> authorList;
    AuthorRepository() {
        authorList = new ArrayList<>();
    }

    void register(Author author){
        this.authorList.add(author);
    }

    // service에서 List를 직접 접근하지 못하기 때문에 조회하는 로직을 레포에서 만들어야 함
    List<Author> getAuthorList(){
        return this.authorList;
    }
}