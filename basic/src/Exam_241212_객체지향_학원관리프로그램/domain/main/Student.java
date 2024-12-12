package Exam_241212_객체지향_학원관리프로그램.domain.main;

import Exam_241212_객체지향_학원관리프로그램.domain.*;
import Exam_241212_객체지향_학원관리프로그램.domain.manager.Academy;

public class Student {
// field area
    private  String studentId;
    private String studentName;
    private int studentAge;
    private String  studentPhoneNumber;
    private String [] currentCourseList = new String[5];
    private int totalPrice;
    private Course course;
    private Academy academy;
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
//    getter 메서드 사용하기
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

//setter 메서드

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentAge(int studentAge){
    this.studentAge = studentAge;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber){
    this.studentPhoneNumber = studentPhoneNumber;
    }

// =================
    public int getTotalPrice(){
        for (int i = 0; i < this.course.getCourseCount(); i++) {
        totalPrice += this.course.getCoursePrice();
        }
        return this.totalPrice;
    }
//    ==============================



//    학생 정보 출력
//    학생의 이름을 입력 받고 해당 학생의 이름을 가진 정보를 출력한다.
public void printStudentInfo(){
    System.out.println("===== 학생 정보 =====");
    System.out.println("학생 ID : " + getStudentId());
    System.out.println("학생 이름 : " + getStudentName());
    System.out.println("학생 나이 : " + getStudentAge());
    System.out.println("학생 연락처 : " + getStudentPhoneNumber());
    System.out.println("=====================");
}

//    ==============
}