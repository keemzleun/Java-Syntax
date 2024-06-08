package C01Basic;

public class C06String {
    public static void main(String[] args) {
//        // 참조자료형 : 기본 자료형을 제외한 모든 자료형
//        // Wrapper Class : 기본형을 Wrapping한 클래스
//        // int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        // 오토 언박싱 : Integer -> int 형변환
//        int c = b;
//        // 오토 박싱 : int -> Integer
//        Integer d = a;

//        // String과 int의 형변환
//        int a = 10;
//        // int -> String
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//        // String -> int
//        int b = Integer.parseInt(st1);
//
//        // 참조자료형에 원시자료형을 담을 때는 Wrapper 클래스를 써야한다.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//        // String 변수 생성 방법
//        // 객체 생성
//        String st1 = new String("hello");
//        // 리터럴 방식 : 권장하는 방식
//        //문자열 pool을 통해 성능 향상
//        String st2 = "hello";
//        String st3 = new String("hello");
//        String st4 = "hello";
//        System.out.println(st1==st3);  // false. 주소값을 비교하기 때문.
//        System.out.println(st2==st4);  // true. String pool에서 비교하기 때문.
//        System.out.println(st3==st4);  // false.
//
//        System.out.println(st1.equals(st3)); // true. 각 메모리에 있는 값을 가져와서 비교하기 때문.
//
//        System.out.println("hello".equals("hellO"));  // false.
//        System.out.println("hello".equalsIgnoreCase("hellO"));  // true. 대소문자 무시하고 비교.

//        // 문자열 길이 : length()
//        String st1 = "hello java java";
//        System.out.println(st1.length());
//
//        // indexOf : 특정 문자열의 위치를 반환, 가장 먼저 나오는 문자열의 위치
//        int index1 = st1.indexOf("java");
//        System.out.println(index1);

//        // 마지막 문자열의 index 위치
//        System.out.println(st1.lastIndexOf("java"));

//        // contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(st1.contains("world"));

//        // charAt : 특정 index의 문자(char)값을 리턴
//        String st = "abcdefabcd";
//        char ch1 = st.charAt(1);
//        System.out.println(ch1);   // b

//        // 위의 문자열에 a의 개수가 몇개인지 count
//        String st = "abcdefabcd";
//        int count = 0;
//        for (int i = 0; i < st.length() ; i++) {
//            if (st.charAt(i)=='a'){
//                count++;
//            }
//        }

        // toCharArray() : String 문자열을 char 배열로 리턴
//        System.out.println(Arrays.toString(st.toCharArray()));

//        // toCharArray를 활용해서 a가 몇갠지 count, 향상된 for문 사용
//        String st = "abcdefabcd";
//        char[] c = st.toCharArray();
//        int count = 0;
//        for (char a :c) {
//            if (a == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);

//        // 문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += "world";
//        System.out.println(st1);  // hello world

//        // [프로그래머스] 특정 문자 제거하기
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//
//        for (int i = 0; i < my_string.length(); i++) {
//            if (my_string.charAt(i)!=letter.charAt(0)){
//                answer += my_string.charAt(i);
//            }
//        }

//        // substring(a, b) : a 이상 b 미만의 index를 잘라 리턴
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,11));
//        System.out.println(st1.substring(6,st1.length()));
//
//        // substring으로 특정 문자 제거하기
//        String my_string = "abdefsdd";
//        String letter = "f";
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (my_string.substring(i, i+1).equals(letter)){
//                answer += my_string.substring(i, i+1);
//            }
//        }
//        System.out.println(answer);

//        // 가운데 글자 가져오기
//        String s = "abcde";
//        String answer = "";
//        if (s.length % 2 == 0) {
//            answer = s.substring(s.length()/2-1, s.length()/2+1);
//        } else {
//            answer = s.substring(s.length()/2, s.length()/2+1);
//        }
//        System.out.println(answer);

//        // trim, strip : 문자열 양쪽 끝의 공백 제거. strip을 권장 !
//        String trimSt1 = "   hello world     ";
//        // String trimSt2 =  trimSt1.trim();
//        String trimSt2 =  trimSt1.strip();
//        System.out.println(trimSt1);
//        System.out.println(trimSt2);

//        // touppercase : 대문자로 변환. tolowercase : 소문자로 변환.
//        String s1 = "HellO";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);
//
//        // char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        System.out.println(st1);

//        // replace(a, b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

//        // replaceAll(a, b) : replace와 동일, 정규표현식을 쓸 수 있음
//        String st1 = "01abc123한글123";  //숫자, 알파벳, 한글 등이 섞여 있을 때
//        // for문 활용해서 알파벳(소문자) 제거 97~122
//        String answer = "";
//        for (int i = 0; i < st1.length(); i++) {
//            if (st1.charAt(i) < 97 || st1.charAt(i) > 122){
//                // if (!(st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z'))
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        // replaceAll과 정규표현식 활용
//        String st1 = "01abc123ABC한글123";
//        // [a-z]+ : 1개 이상의 소문자 알파벳 표현하는 정규표현식
//        // [A-Za-z]+ : 대소문자 포함
//        // [가-힣]+ : 한글
//        // [0-9]+ : 숫자
//        String answer = st1.replaceAll("[A-Za-z]+", "");
//        System.out.println(answer);

//        // String의 matches와 Pattern.matches()
//        String test = "helloA";
//        System.out.println(test.matches("[A-Za-z]+"));
//
//        boolean b1 = Pattern.matches("[0-9]+", "12345hello");
//        boolean b2 = Pattern.matches("[0-9]+", "12345");
//
//        System.out.println(b1);   // false
//        System.out.println(b2);   // true

//        // ^:정규표현식의 시작, $:정규표현식의 끝, *: 빈값포함
//        boolean b2 = Pattern.matches("^[A-Za-z]*$", "Hello world");
//
//        // [프로그래머스] 문자열 다루기
//        String s = "a234";
//        boolean answer = true;
//        if (s.matches("[0-9]+") && (s.length() == 4 || s.length() == 6)){
//            answer = true;
//        } else {answer = false;}

//        // 전화 번호 패턴 검증
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            String number = sc.next();
//            if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)){
//                System.out.println("통과");
//                break;
//            } else {
//                System.out.println("다시");
//            }
//        }

//        // 이메일 검증 : 소문자 알파벳과 숫자로 이루어진 id @ 소문자 알파벳.com
//        String email = "aaa@naver.com";
//        boolean b1 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
//        System.out.println(b1);

//        // split : 특정 문자를 기준으로 문자열을 자르는 것. 문자열 배열을 return.
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
//        System.out.println(Arrays.toString(a_arr));
//        // 불규칙한 공백이 포함될 때
//        // \s : 공백을 표현하는 정규표현식
//        String b = "a b  c d";
//        String[] b_arr = b.split("\\s+");
//        System.out.println(Arrays.toString(b_arr));

//        // isEmpty와 null(자료타입)
//        String st1 = null;
//        String st2 = "";
//        System.out.println(st1==st2);  // false. equal 관계가 아님
//        // 문제 발생 X
//        System.out.println(st2.split(""));
//        System.out.println(st2.isEmpty());
//        // 문제 발생 O : nullPointerException예외 발생.
//        System.out.println(st1.split(""));
//        System.out.println(st1.isEmpty());

//        // join : String[]을 하나의 String으로 만드는 메서드
//        String[] arr = {"Java", "Python", "C++"};
//        String st = String.join(" ", arr);
//        System.out.println(st);

//        // StringBuffer
//        StringBuffer sb1 = new StringBuffer("hello");
//        // append : 문자열 가장 뒤에 다른 문자열을 더하는 것
//        sb1.append(" java");
//        sb1.append(" world");
//        String answer = sb1.toString();
//        sb1.insert(5, " python");
//        sb1.delete(17, sb1.length());
//        System.out.println(sb1);
//
//        // StringBuilder
//        // 성능 ) String += < StringBuffer < StringBuilder
//        // StringBuilder는 스레드 safe하지 않음
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("hello");
//        sb2.append("\n");    // 줄바꿈
//        sb2.append("world");

//        // StringBuilder를 사용해서 "hhheeellllllooo"로 출력되도록
//        String my_string = "hello";
//        int n = 3;
//        String answer = "";
//
//        StringBuilder sb3 = new StringBuilder();
//        for (int i=0; i<my_string.length(); i++){
//            char temp = my_string.charAt(i);
//            for (int j = 0; j < 3; j++) {
//                sb3.append(temp);
//            }
//        }
//        System.out.println(sb3);

//        // [프로그래머스] 문자열 밀기
//        String A = "hello";
//        String B = "ohell";
//        int answer = 0;
//        // 내 풀이
//        int count = 0;
//        StringBuilder sb = new StringBuilder();
//        char[] A_arr = A.toCharArray();
//        sb.append(A);
//        if (A.equals(B)) {
//            return answer;
//        } else {
//            for (int i = 0; i < A.length(); i++) {
//                sb.delete(0,1);
//                sb.append(A_arr[i]);
//                if (sb.toString().equals(B)){
//                    count++;
//                }
//                if (count>=1) {
//                    answer = 1;
//                } else answer = -1;
//            }
//        // 강사님 풀이
//        StringBuilder sb = new StringBuilder();
//        int len = A.length();
//        while(!sb.equals(B)){
//            sb.insert(0, sb.substring(len-1, len);
//            sb.delete(len, len+1);
//            answer++;
//            if (answer > len){
//                answer = -1;
//                break;
//            }
//        }
    }
}

