package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C0704JsonParsing2 {
    public static void main(String[] args) throws IOException {
        // test_data2의 데이터를 student형태로 출력
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data2.json");
        String jsonString = Files.readString(filePath);
        JsonNode jsonList = objectMapper.readTree(jsonString);
        List<Student> students = new ArrayList<>();
        for (JsonNode j : jsonList) {
            Student tempStudent = objectMapper.readValue(j.toString(), Student.class);
            students.add(tempStudent);
        }
        System.out.println(students);
    }
}

