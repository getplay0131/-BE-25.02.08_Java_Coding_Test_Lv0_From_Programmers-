package Exam_241211_241219_학원관리시스템.Exam_241219_객체지향_학원관리프로그램.domain.main.main.main.main;

public class Course {
    //field area
    private String courseId; //강좌id
    private String courseName; //강좌명
    private int coursePrice; //수강료
    private int maxCourseStudent; //수강정원
    private int currentCourseStudent; //현재수강인원
    private String courseDay; // 강의 요일
    private String courseTime; // 강의 시간
    private static int courseIdCounter; // 강좌 아이디 자동 생성을 위한 카운터
//    =========

    //    constructor area
    public Course(String courseId, String courseName, int coursePrice, int maxCourseStudent, int currentCourseStudent
            , String courseDay, String courseTime) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.maxCourseStudent = maxCourseStudent;
//        this.currentCourseStudent = currentCourseStudent;
        this.courseDay = courseDay;
        this.courseTime = courseTime;
    }
//     =================

//    method area
//    이거 구현하려면 우선 수강생 필드를 어느정도 구현해야겠다.
//    getter/setter 메서드 사용하기

    //    getter 구역
    public String getCourseId() {
        return this.courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getCoursePrice() {
        return this.coursePrice;
    }

    public int getCurrentCourseStudent() {
        return this.currentCourseStudent;
    }
    public int getMaxCourseStudent() {
        return this.maxCourseStudent;
    }

    public String getCourseDay() {
        return this.courseDay;
    }

    public String getCourseTime() {
        return this.courseTime;
    }

    public int getCourseCount() {
        return courseIdCounter;
    }

//    =================================

    //    setter 구역
    public static String setCourseId() {
        String courseId = "Course" + courseIdCounter;
        courseIdCounter++;
        return courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public void setCurrentCouseStudent(int currentCourseStudent) {
        this.currentCourseStudent = currentCourseStudent;
    }

    public void setCourseDay(String courseDay) {
        this.courseDay = courseDay;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public void setCourseMaxStudent(int max) {
        this.maxCourseStudent = max;
    }

    public String setCourseValue(String courseName, int coursePrice, int maxCourseStudent, String CourseDay,
                                 String courseTime) {
        this.setCourseName(courseName);
        this.setCoursePrice(coursePrice);
        this.setCourseMaxStudent(maxCourseStudent);
        this.setCourseDay(CourseDay);
        this.setCourseTime(courseTime);
        return '"' + courseName + '"' + "(수강료 : " + coursePrice + "원, 정원 : " + maxCourseStudent + "명, " + CourseDay +
                " " + courseTime + ")";
    }

    //    수강생 추가 시 현재 수강인원 증가
//    등록된 수강생을 카운트해야 해당 메서드의 작업이 가능
//    또한 수강생을 추가한것을 감지해야 수강 인원 추가가 가능하다.
//    수강생 정보를 배열과 객체를 이용하여 저장해야한다.
    public void studentAdd() {
        if (currentStudentNumberCheck()) {
            currentCourseStudent++;
        }
    }


    //    수강생 제거시 현재 수강인원 감소
//    수강생을 제거하면, 카운트를 감소시키면 된다.
//    수강생을 제거하는 것은 수강생의 정보를 제거하는 것과 같다.
    public void studentSub() {
        if (currentCourseStudent <= 0) {
            System.out.println("현재 등록된 수강생이 없습니다.");
            return;
        }
        currentCourseStudent--;
    }

    //    수강 가능 여부 확인(정원 체크)
//    해당 강좌의 정원을 체크하여 최대값 이상이면 수강 어려운 메시지와 함께 메소드를 종료시킨다.
    public boolean currentStudentNumberCheck() {
        if (currentCourseStudent >= maxCourseStudent) {
            System.out.println("최대 정원에 도달하여 수강생 추가가 불가합니다.");
            return false;
        }
        System.out.println("현재 " + getCourseName() + "은(는) 수강이 가능합니다.");
        return true;
    }

    //    강좌 정보 출력
//    강좌의 이름과 가격과 최대 정원, 강좌 요일 및 시각을 안내한다.
    public void printCourseInfo() {
        System.out.println("강좌명 : " + getCourseName() + ", 강의 요일 : " + getCourseDay() + ", 강의시간 : " + getCourseTime() +
                ", 현재 수강 인원 : " + currentCourseStudent + ", 수강 정원 : " + maxCourseStudent + ", 수강료 : " + getCoursePrice() + " 원 입니다.");
    }


//    ==================


}