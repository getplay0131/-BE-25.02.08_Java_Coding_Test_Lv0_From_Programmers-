package Exam_241212_객체지향_학원관리프로그램.domain.manager;

import Exam_241212_객체지향_학원관리프로그램.domain.main.Course;
import Exam_241212_객체지향_학원관리프로그램.domain.main.Student;

public class Academy {

//    field area
    private Course [] courseList = new Course[5]; // 강좌목록
    private Student[] studentsList = new Student[5]; // 수강생목록
    private int totalPrice; // 총 가격
    private int courseCount; // 강좌의 개수
    private int studentCount; // 수강생의 인원수
//    =============

//    method area
//    새 강좌 개설 / 폐강
//    강좌 등록과 유사한 코드로 구성하면 될거 같고, 강좌 정보를 입력하면 된다.
//    폐강도 유사하게 배열에서 해당 값을 null로 지정하고 배열 내 순서를 재 정렬한다.
public void newCourse(String courseName, int courseprice, int maxStudent, String courseDay,
                         String courseTime){
    if (courseCount >= courseList.length) {
        System.out.println("더 이상 강좌를 추가할 수 없습니다.");
        return;
    }
    String courseId = Course.setCourseId();
    Course newCourse = new Course(courseId,courseName,courseprice,maxStudent,0,courseDay,courseTime);

    newCourse.setCourseValue(courseName,courseprice,maxStudent,courseDay,courseTime);
    courseList[courseCount] = newCourse;
    courseCount++;

    System.out.println("새로운 강좌가 등록되었습니다.");
}

public void removeCourse (String courseId) {
    if (courseCount <= 0) {
        System.out.println("등록된 강좌가 없습니다.");
        return;
    }
    if (courseList[courseCount].equals(courseId)) {
        for (int i = 0; i < courseCount; i++) {
            for (int j = i; j < courseCount-1; j++) {
                courseList[j] = courseList[j+1];
            }
        }
        System.out.println("강좌 삭제가 완료되었습니다.");
        courseCount--;
    }
}


//    수강 내역 조회
//    일단 해당 회원 정보를 매개변수로 입력 받고, 해당 정보와 일치하면 그 정보를 가진 데이터의 강좌 정보를 출력한다.

//    총 수강료 계산
//    이름을 입력 받고, 해당 이름이 있는 객체의 수강료를 계산한다.


//    수강생 등록 / 삭제
//    수강생 클래스로 연결하여 정보를 입력받고 수강생 배열에 데이터를 저장한다.
//    삭제도 마찬가지로 배열 내 순서를 재정렬 해야하고, 해당 값을 null로 지정한다.

//    수강신청 처리
//    이 메소드의 값을 반환하여 수강생 등록에 활용하면 될거 같다.
//    스캐너로 값을 입력 받거나 매개변수에 값을 주면 될거 같다.
//    이 메서드 내에서 강좌 객체의 값을 업데이트 하면 될거 같다.
//    강좌 존재 여부, 수강 정원, 학생 존재여부, 동일 강좌 중복 신청 에 대해 검증해야한다.

//    수강 취소 처리
//    이 메소드의 값을 반환하여 수강생 삭제에 이용하면 될거 같다.
//    스캐너로 값을 입력 받거나 매개변수에 값을 주면 될거 같다.
//    이 메서드 내에서 강좌 객체의 값을 업데이트 하면 될거 같다.

//    특정 강좌의 수강생 목록 조회
//    강좌를 입력받고 강좌명과 일치하는 강좌 내에 수강을 신청한 수강생들을 출력하면 된다.
//    없다면 메시지를 통해 등록한 수강생이 없다고 안내하면 될거 같다.

//    특정 학생의 수강내역 조회
//  학생 정보를 입력받고 학생이름이 있는 강좌를 출력한다.
//    없을시 안내 메시지를 출력하고 메서드를 종료한다.

//    매출 현황 조회
//    토탈 프라이스의 가격을 출력한다.

//     ==========
}