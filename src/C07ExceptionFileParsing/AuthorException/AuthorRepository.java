package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {
    List<Author> authorList;
    AuthorRepository() {
        authorList = new ArrayList<>();
    }

    void register(Author author){
        this.authorList.add(author);
    }
}
