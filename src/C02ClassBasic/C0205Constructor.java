package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        // 내부클래스 Calendar
        // 객체 변수 : year(String), month(String), day(String)
        // 메서드 : getter, setter
        Calendar c1 = new Calendar("2024","6", "12");
        System.out.println(c1.getYear()+"년 "+c1.getMonth()+"월 "+c1.getDay()+"일입니다.");
    }
}
class Calendar {
    String year;
    String month;
    String day;

    // 생성자 : 클래스명과 동일, 초기화하고 싶은 변수명 나열
    // 별도의 생성자를 만들 경우, 초기 생성자를 따로 선언 필요
    Calendar(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    // 같은 클래스 내의 다른 생성자 호출시 this() 사용
    Calendar(String year, String month){
        this(year, month, null);
    }
    Calendar(){

    }
    public String getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public String getDay() {
        return day;
    }
}
