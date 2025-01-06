package Exam_241211_객체지향_학원관리프로그램.domain.main;

public class Student {
// field area
    private  String studentId;
    private String studentName;
    private int studentAge;
    private String  studentPhoneNumber;
    private String [] currentCourseList = new String[5];
    private int totalPrice;
    private Course course;
    private static int stddentIdCounter; // 수강생 아이디 자동 생성을 위한 카운터
//     =================
    
//    constructor area
    public Student(String studentId, String studentName, int studentAge, String studentPhoneNumber,
                   String[] currentCourseList, int totalPrice){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentPhoneNumber = studentPhoneNumber;
        this.currentCourseList = currentCourseList;
        this.totalPrice = totalPrice;
    }
//    ================
    
    
//    method area
//    getter/setter 메서드 사용하기
    public String getStudentId(){
        return this.studentId;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public int getStudentAge(){
        return this.studentAge;
    }

    public String getStudentPhoneNumber(){
        return this.studentPhoneNumber;
    }

    public String getCurrentCourseList(){
        String currentList = null;
        for (int i = 0; i < currentCourseList.length; i++) {
            if (currentCourseList[i] != null) {
                currentList = currentCourseList[i];
            }
        }
        return currentList;
    }

    public int getTotalPrice(){
        for (int i = 0; i < this.course.getCourseCount(); i++) {
        totalPrice += this.course.getCoursePrice();
        }
        return this.totalPrice;
    }
//    ==============================

//    강좌 등록 / 취소
//    강좌명과 강좌 정보를 배열에 추가하면 될거 같다.
//    코스 객체를 이용하여 정보를 추가하면 될거 같다.
//    입력 값에따라 수행 작업을 달리하며, 취소를 선택하면 해당 값에 대해 삭제 및 배열 내 재정렬하면 될거같다.

//    값 세팅 메서드, 츨력 메서드 있어야함 => 등록 안에서 다 하기엔 코드 양이 너무 많고, 해당 메서드가 너무 많은 기능과 책임을 담당하게 된다.
    public void CourseRegistration(){
//    System.out.println("== 강좌 등록 == ");
    this.course.setCourseName("JAVA 기초반");
    this.course.setCoursePrice(500000);
    this.course.setCourseMaxStudent(5);
    this.course.setCourseDay("월/수/금");
    this.course.setCourseTime("09:00~11:00");

}

//    수강 내역 조회
//    일단 해당 회원 정보를 매개변수로 입력 받고, 해당 정보와 일치하면 그 정보를 가진 데이터의 강좌 정보를 출력한다.

//    총 수강료 계산
//    이름을 입력 받고, 해당 이름이 있는 객체의 수강료를 계산한다.
    
//    학생 정보 출력
//    학생의 이름을 입력 받고 해당 학생의 이름을 가진 정보를 출력한다.
    
//    ==============
}