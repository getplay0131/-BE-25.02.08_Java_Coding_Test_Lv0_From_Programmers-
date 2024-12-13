//객체 찾기
//
//
//배열 순회 시 찾고자 하는 객체를 발견하면 break로 빠져나오기
//찾은 객체는 따로 변수에 저장해두면 나중에 사용하기 편함
//
//
//중첩 반복문 처리
//
//
//가장 바깥쪽 반복문에서 찾고자 하는 주체(학생)를 찾고
//그 다음 반복문에서 세부 내용(수강 목록 등) 처리하기

package Exam_241213_객체지향_학원관리프로그램.domain.manager.manager;

import Exam_241212_객체지향_학원관리프로그램.domain.main.Course;
import Exam_241212_객체지향_학원관리프로그램.domain.main.Student;

public class Academy_reStart {

    //    field area
    private Course[] courseList = new Course[5]; // 강좌목록
    private Student[] studentsList = new Student[5]; // 수강생목록
    private int totalPrice; // 총 가격
    private int courseCount; // 강좌의 개수
    private int studentCount; // 수강생의 인원수
//    =============


//     ==========
}