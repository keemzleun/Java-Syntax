package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamAPI {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
//        // 전통적인 방식의 데이터 접근 방식 : 메모리 주소 접근
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        // 함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        // 자바에서 함수형 프로그래밍을 지원하기 위한 라이브러리가 streamAPI
//        // foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));


//        // 스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JAVA"};
//        // stream<클래스명> : 제네릭 타입으로 stream 객체가 생성
//        Stream<String> stream1 = Arrays.stream(stArr);
//
//        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        Stream<String> stream2 = stList.stream();
//
//        int[] intArr = {10, 20, 30, 40, 50};
//        // 기본형 자료는 별도의 stream 제공
//        IntStream stream3 = Arrays.stream(intArr);
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        Stream<Integer> stream4 = myList.stream();
//        // int가 아니라 Integer이기 때문에 Intstream은 사용 불가
//        // IntStream stream5 = myList.stream();



//        // stream 변환(중개 연산) : filter, map, sorted, distinct, limit
//        String[] stArr = {"HTML", "CSS", "JAVA"};
//        // filter : 특정 기준으로 대상을 filtering 하는 것. Stream<String> 반환
//        // 제네릭의 타입소거 문제 발생
//        // 제네릭의 타입소거 : 제네릭타입을 런타임시점에는 제거하는 것을 의미
//        // 그래서, 타입이 소거된 Stream객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야 함(타입캐스팅)
//        String[] newStArr = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(a->new String[a]); // a 변수에는 stream 요소의 개수가 들어옴
//        // 메소드 참조 방식(매개변수가 추론 가능할 때 생략하는 방식) : 클래스::메서드
//        String[] newStArr2 = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(String[]::new);
//
//        // Arrays.stream(stArr).forEach(System.out::println);  // 메서드 참조 방식
//        // Arrays.stream(stArr).forEach(a-> System.out.println(a)); // 화살표 함수 방식
//
//        int[] intArr = {10, 10, 30, 40, 50};
//        // intArr은 제네릭 타입 소거가 발생하지 않음. 제네릭이 아닌 intStream이기 때문
//        int[] newIntArr = Arrays.stream(intArr).filter(a->a<=30).toArray();
//
//        // distinct : 중복 제거
//        int[] newIntArr2 = Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newIntArr2));
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//
//        // map : 기존의 스트림을 조작하여 새로운 스트림 반환
//        int[] newMapArr = Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr));

//        // [문제] 홀수 찾기
//        int[] arr1 = {1,2,3,4,5,6};
//        int[] newIntArr = Arrays.stream(arr1).filter(a->a%2==1).toArray();
//        Arrays.stream(newIntArr).forEach(System.out::println);
//
//        // [문제] 홀수만 담은 배열의 값을 제곱한 새로운 배열 생성
//        int[] newIntArr2 = Arrays.stream(arr1).filter(a->a%2==1).map(a->a*a).toArray();
//        Arrays.stream(newIntArr2).forEach(System.out::println);
//
//        // [문제] 홀수만 담은 배열의 값을 제곱한 새로운 배열 오름차순 정렬 생성
//        int[] newIntArr3 = Arrays.stream(arr1).filter(a->a%2==1).map(a->a*a).sorted().toArray();
//        Arrays.stream(newIntArr3).forEach(System.out::println);
//
//        // mapToInt : intStream형태로 변환해주는 map
//        String[] stArr = {"HTML", "CSS", "JAVASCRIPT","JAVA"};
//        // 각 문자열의 길이를 담은 새로운 int 배열 생성
//        int[] intArr5 = Arrays.stream(stArr).mapToInt(a->a.length()).toArray();
//        int[] intArr6 = Arrays.stream(stArr).mapToInt(a->a.length()).limit(3).toArray();
//        Arrays.stream(intArr6).forEach(System.out::println);



//        // stream 소모 연산 : sum(합계), reduce(누적연산), forEach(출력) 등
//        int[] intArr = {10, 20, 30, 40};
//        Arrays.stream(intArr).forEach(a->System.out.println(a));
//        Arrays.stream(intArr).forEach(System.out::println);
//
//        int intArrSum = Arrays.stream(intArr).sum();
//
//        // Optional 객체 : 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체
//        int intArrMax = Arrays.stream(intArr).max().getAsInt();
//        int intArrMin = Arrays.stream(intArr).min().getAsInt();
//
//        int intArrCount = (int) Arrays.stream(intArr).count();
//
//        // reduce(초기값, 연산식);
//        int allMutiply = Arrays.stream(intArr).reduce(1, (a,b) -> a*b);
//        System.out.println(allMutiply);
//        int allAdd = Arrays.stream(intArr).reduce(0, (a,b) -> a+b);
//        System.out.println(allAdd);
//        String[] stArr = {"hello", "world", "java"};
//        String stAddAll = Arrays.stream(stArr).reduce("", (a,b)->a+b);
//        System.out.println(stAddAll);
//
//        // findFirst, findAny
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim", 20));
//        students.add(new Student("park", 23));
//        students.add(new Student("lee", 60));
//        students.add(new Student("jeong", 80));
//
//        // findFirst : 첫번째 요소 반환. Optional 객체임
//        // 나이가 30이 넘는 학생중에 첫번째 index값을 가지는 학생 객체 생성
//        Student s1 = students.stream().filter(a->a.getAge()>=30).findFirst().get();
//
//        // student 객체 실습
//        // 1) 모든 객체의 평균 나이
//        int s2 = (int)students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
//        System.out.println(s2);
//        // 2) 가장 나이 어린 사람 찾기
//        Student s3 = students.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
//        System.out.println(s3.getName());
//        // 3) 30대의 이름을 String 배열에 담기
//        String[] s4 = students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(String[]::new);
//        System.out.println(Arrays.toString(s4));


//        // Optional 객체 : 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        // ofNullable : null이 있을수도 있는 경우에 Optional객체를 생성하는 메서드
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String str1 = null;
//        if(str1!=null){
//            System.out.println(opt1.get().compareTo("hello"));
//        }else {
//            System.out.println("값이 없습니다.");
//        }

        // Optional 객체 생성 방법
        Optional<String> opt1 = Optional.empty();
        Optional<String> opt2 = Optional.of("hello");        // null이 못 들어감
        Optional<String> opt3 = Optional.ofNullable(null);   // null이 들어갈 수 있음

        // Optional객체 처리 방법 4가지
        // 방법 1. isPresent() 확인 후 get()
        if (opt3.isPresent()){
            System.out.println(opt3.get().length());
        }
        // 방법 2. orElse() : 값이 있으면 있는 값 return, 없으면 지정 값을 return
        System.out.println(opt3.orElse("").length());

        // 방법 3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행
        System.out.println(opt3.orElseGet(()->new String("")).length());

        // 방법 4. orElseThrow() : 가장 중요! 값이 있으면 있는 값 return, 있으면 지정된 예외 강제로 발생
        // 개발에서 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우도 존재
        System.out.println(opt3.orElseThrow(()->new NoSuchElementException("값이 없습니다.")).length());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("park", 23));
        students.add(new Student("lee", 20));
        students.add(new Student("jeong", 10));

        // 29살보다 나이 많은 학생 출력
        // 방법 1)
//        OptionalDouble answer = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average();
//        if(answer.isPresent()){
//            System.out.println(answer.getAsDouble());
//        } else {
//            System.out.println("값 없음");
//        }
//        System.out.println(answer);

        // 방법 2) 그냥 이거 쓰세욘
//        double answer2 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));

    }
}
