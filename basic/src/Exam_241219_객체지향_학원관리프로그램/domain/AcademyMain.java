package Exam_241219_객체지향_학원관리프로그램.domain;

import Exam_241219_객체지향_학원관리프로그램.domain.main.*;
import Exam_241219_객체지향_학원관리프로그램.domain.manager.Academy_reStart;

public class AcademyMain {
    public static void main(String[] args) {
       Academy_reStart academyReStart = new Academy_reStart();

//        강좌 등록
        academyReStart.newCourse("JAVA 기초반", 500000, 5, "월/수/금", "09:00-11:00");
        academyReStart.newCourse("Spring 심화반", 700000, 4, "화/목", "14:00-17:00");
//    학생1 "이자바" 등록 및 수강신청

    academyReStart.registerStudent("이자바",25,"010-1111-2222");
    academyReStart.applicationForClasses("Student0","Course0");

//    학생2 "김스프링" 등록 및 수강신청
        academyReStart.registerStudent("김스프링", 28, "010-3333-4444");
        academyReStart.applicationForClasses("Student1","Course0");
        academyReStart.applicationForClasses("Student1","Course1");

//        자바 기초반 수강생 조회
        academyReStart.findCourseEnrollment("Course0");

//        김스프링의 수강 내역 조회
        academyReStart.currentCourseFind("Student1");
    }


}