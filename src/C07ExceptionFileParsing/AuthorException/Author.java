package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Author {
    static List<Author> authors = new ArrayList<>();
    private int id;
    private String name;
    private String email;
    private String password;
    static int staticId = 0;

    public Author(String name, String email, String password) {
        this.id = ++staticId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
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
