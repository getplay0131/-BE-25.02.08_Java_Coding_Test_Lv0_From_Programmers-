//반복문
//포이치문은 배열의 값을 복사하며 순회하기 때문에, 원본배열의 값이 변경되지 않지만, 일반 포문은 변경 가능하다.

//강좌 및 수강생 삭제 메서드까지 구현하기

//배열 순회 시 찾고자 하는 객체를 발견하면 break로 빠져나오기
//찾은 객체는 따로 변수에 저장해두면 나중에 사용하기 편함
//

//중첩 반복문 처리

//1. 메서드 구조화
//- 단계별 구현의 중요성
//- 각 단계의 명확한 책임
//- early return을 통한 효율적인 코드 흐름
//
//2. 데이터 검증
//- 입력값 유효성 검사
//- 상태 변수(count 등) 활용
//- null 체크의 적절한 사용
//
//3. 배열 관리
//- 인덱스 관리의 중요성
//- 배열 재정렬
//- 빈 공간(null) 처리
//
//4. 상태 관리
//- boolean 플래그 활용
//- 상태 변수 업데이트 시점
//- 메시지 처리 시점
//
// 단일 책임 원칙
//하나의 메서드는 하나의 책임만 가져야 함
//각 로직을 분리하면 유지보수가 쉬워짐
//코드 재사용성이 높아짐

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

    //    ===== 강좌 추가 =====
    public boolean newCourse(String courseName, int coursePrice, int maxStudent, String courseDay, String courseTime) {
        // 1단계: 강좌 추가 가능 여부 확인
        // - courseCount와 배열 크기 비교
        // - 불가능하면 메시지 출력 후 return

//    나의 생각 : 강좌 추가한지를 제일 먼저 확인해야, 이후 작업이 가능하다. 만약 확인을 나중에 하거나 안하고 진행하면, 기껏 정성들여 코드 구상해논게 나중에 추가가 안되는 경우가 생기기 때문에, 코드
//    흐름을 위해서도 제일 먼저 체크해야한다.
        boolean isTaskCheck = false;
        if (courseCount >= courseList.length) {
            System.out.println("최대 강좌 개수에 도달하여, 강좌 추가가 불가합니다.");
            return isTaskCheck;
        }

        if (courseName == null || courseName == "") {
            System.out.println("강좌명이 유효하지 않습니다. 입력값을 확인해 주세요.");
            return isTaskCheck;
        }

        if (coursePrice <= 0) {
            System.out.println("강좌 수강료가 유효하지 않습니다. 입력값을 확인해 주세요.");
            return isTaskCheck;
        }

        if (maxStudent <= 0) {
            System.out.println("최대 정원의 입력값이 유효하지 않습니다. 입력값을 확인해 주세요.");
            return isTaskCheck;
        }

        if (courseDay == null || courseDay == "") {
            System.out.println("강좌일이 유효하지 않습니다. 입력값을 확인해 주세요.");
            return isTaskCheck;
        }

        if (courseTime == null || courseTime == "") {
            System.out.println("강좌 시간이 유효하지 않습니다. 입력값을 확인해 주세요.");
            return isTaskCheck;
        }
//    ----------------------------
        // 2단계: 강좌 ID 생성
        // - Course 클래스의 static 메서드 사용

//    static은 공유기능을 준다는 의미이므로, 클래스의 해당 메서드를 지정해 아이디를 생성한다.
        String courseId = Course.setCourseId();

//    ---------------------------------------
        // 3단계: 새 강좌 객체 생성
        // - Course 생성자 사용
        // - 필요한 정보 모두 전달

//    코스 생성자를 호출하여, 인자를 전달하며, 강좌를 생생하는 것이므로, 현재 수강생은 0명이다.
//    개선 사항 : setcourseValue 메서드를 활용하여, 값을 문자열로 반홤함으로 추가적인 값 설정 및 포매팅으로 완성도가 올라간다.
//    즉 생성자로 초기화 하고, 메서드로 값 설정을 하는 것이다.
//    메서드에 대한 인자 전달 수정 : 코스 아이디 => 코스네임
        Course course = new Course(courseId, courseName, coursePrice, maxStudent, 0, courseDay, courseTime);
        course.setCourseValue(courseName, coursePrice, maxStudent, courseDay, courseTime);
//    ----------------------------
        // 4단계: 강좌 목록에 추가
        // - courseList 배열의 적절한 위치에 저장
        // - courseCount 증가

//    for-each문을 사용할까 했지만, 인덱스 정보를 알아야 하고, 현재는 모든 인덱스의 값이 null이고, 인덱스 지정이 없으면, 전체 배열을 순회하므로, 코스 배열의 모든 값이 해당 강좌로
//    등록되므로 일반 포문을 사용하여 인덱스 지정 및 값을 지정한다. 또한 해당 배열의 값이 비었을 때 넣어야 하기 때문에 null인지 확인한다.

//    개선 필요 사항 : 반복문 불필요 => 코스카운트 변수가 이미 인덱스 역할을 하기 때문
//    null체크 불필요 : 코스카운트는 빈값을 가리키기 때문
//    추가 개선 : 이후 배열 활용성에 대해 중간에 빈 값이 발생할 수 있으므로, 널체크를 하되 작업완료시 브레이크를 걸어 반복문을 탈출한다.
        for (int i = 0; i < courseCount; i++) {
            if (courseList[courseCount] == null) {
                courseList[courseCount] = course;
                courseCount++;
                isTaskCheck = true;
                break;
            }
        }

        // 5단계: 결과 메시지 출력
        if (isTaskCheck) {
            System.out.println("강좌 등록이 성공적으로 완료되었습니다.");
        } else {
            System.out.println("강좌 등록이 실패하였습니다.");
        }
        return isTaskCheck;
    }

    //     ==========
    public boolean removeCourse(String courseId) {
        boolean taskCheck = false;
        if (removeFromArray(courseList, courseCount, courseId)) {
            courseCount--;
            taskCheck = true;
        }
        return taskCheck;
    }

    //     ========== 수강생 등록
    public boolean registerStudent(String studentName, int studentAge, String studentPhoneNumber) {
//        학생 정보 관리의 기본
//이후 모든 학생 관련 기능의 기초

        // 1단계: 기본 유효성 검사
        // - 수강생 목록 가득 찼는지 확인
        // - 입력값 기본 검증

//        해당 단계는 데이터 우선 검증 단계로, 여기서 진행 가능 여부를 판단하기 위해 검증한다.
//        개선 사항 : 검증에 부합하지 않을시 바로 리턴값 반환
        boolean taskCheck = false;
        if (studentCount >= studentsList.length) {
            System.out.println("최대 수강인원 도달로 추가 등록이 불가합니다.");
            return taskCheck;
        }

        if (studentName == null || (studentAge <= 0 || studentAge >= 100) || studentPhoneNumber == null) {
            System.out.println("입력값이 올바르지 않거나, 유효하지 않습니다. 재 입력해 주세요");
            return false;
        }

// ---------------------------------
        // 2단계: 학생 ID 생성
        // - Student 클래스의 static 메서드 활용
        String studentId = Student.setStudentId();

// ---------------------------------
        // 3단계: 학생 객체 생성
        // - Student 생성자 활용
        // - 필요한 정보 전달
        Student student = new Student(studentId, studentName, studentAge, studentPhoneNumber, 0);
// ---------------------------------
        // 4단계: 학생 목록에 추가
        // - 적절한 위치에 저장
        // - studentCount 증가

//        개선 사항 : 인덱스 기반 접근해야함 iter > for
        for (int i = 0; i < studentCount; i++) {
            if (studentsList[i] == null) {
                studentsList[i] = student;
                studentCount++;
                taskCheck = true;
                break;
            }
        }


        // 5단계: 결과 메시지 출력
        if (taskCheck) {
            System.out.println("수강생 등록이 완료 되었습니다.");
        } else {
            System.out.println("수강생 등록이 실패하였습니다. 다시 시도하여 주세요.");
        }
        return taskCheck;
    }

    //======================
    public boolean removeStudent(String studentId) {
        boolean taskCheck = false;
//        개선 : 로직 분리
//        학생 찾기

        for (Student student : studentsList) {
            if (student.getStudentId().equals(studentId)) {
//            해당 학생의 수강 중인 강좌들 처리
//                학생의 수강중인 강좌에서 널이 아닌것을 찾아 강좌 수강생을 감소시킨다.
                for (Course course : student.getCurrentCourseList()) {
                    if (course != null) {
//                        하단의 코드는 현재 강좌에서 빼는거고
                        course.studentSub();
                    }
                }
                if (removeFromArray(studentsList, studentCount, studentId)) {
//                    하단의 코드는 현재 학원의 수강생 목록에서 빼는거다.
                    studentCount--;
                    taskCheck = true;
                }
                break;
            }
        }
        return taskCheck;
    }

    // =================================
//    현재 수강중인 강좌 조회
    public void currentCourseFind(String studentId) {
        boolean isTaskCheck = false;
        // 1단계: 기본 유효성 검사
        // - 학생 목록이 비어있는지 확인

//  나의 풀이 : 제일 간단한 카운트를 이용해 검사한다.
        if (studentCount <= 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        // - studentId가 유효한지 확인

//  나의 풀이 : 입력값이 문자열이므로 널이 아닌지 확인한다.
        if (studentId == null) {
            System.out.println("입력하신 아이디가 없거나, 유효하지 않습니다.");
            return;
        }

//    -----------------------
        // 2단계: 학생 찾기

        // - studentId로 해당 학생 객체 찾기
//    스튜던트 아이디값을 만들어서 값 저장하여 활용하기.
        boolean hasAnyCourse = false;
        Student targetStudent = null;
        for (Student student : studentsList) {
            if (student.getStudentId().equals(studentId)) {
                // 3단계: 수강 내역 확인
                // - 학생의 수강 중인 강좌 목록 확인
                targetStudent = student;
                hasAnyCourse = true;
            }
        }
        if (targetStudent == null) {
            // - 수강 중인 강좌가 없는 경우 처리
            System.out.println("일치하는 학생이 없습니다.");
        } else {
            //    -----------------------
            // 4단계: 수강 내역 출력
            // - 각 강좌의 정보 출력
            for (Course course : targetStudent.getCurrentCourseList()) {
                if (course != null) {
                    course.printCourseInfo();
                    isTaskCheck = true;
                }
            }
            // - 총 수강료 정보 출력
            System.out.println("총 수강료 " + targetStudent.calculateTotalPrice() + " 원 입니다.");
        }


        // - 없으면 메시지 출력 후 종료
        if (isTaskCheck && hasAnyCourse) {
            System.out.println("수강중인 강좌 정보 출력이 완료되었습니다.");
        } else {
            System.out.println("수강중인 강좌 정보 및 학생 검색에 실패하였습니다.");
            return;
        }
//    -----------------------
    }

//    24.12.17
    //    수강 신청
    public boolean applicationForClasses(String studentId, String courseId) {
//수강 가능 여부 확인 (개수, 중복, 정원)
//학생의 수강 목록에 강좌 추가
//강좌의 수강인원 증가
//수강료 계산
//결과 반환
        boolean isTaskCheck = false;
        int targetCourseMax = 0;
        int targetCourseCurrent = 0;
        // 1단계: 기본 유효성 검사
        // - 입력값 검증
        if (studentId == null || courseId == null) {
            System.out.println("입력값이 유효하지 않습니다.");
            return false;
            // - 학생/강좌 목록 존재 여부 확인
        } else if (courseCount <= 0) {
            System.out.println("강좌가 없어 등록이 불가합니다.");
            return false;
        }

//        학생과 강좌 존재 확인 (현재 구현됨)
        // 2단계: 학생과 강좌 찾기
        // - studentId로 학생 찾기
        boolean isStudentCheck = false;
        Student targetStudent = null;
        for (Student student : studentsList) {
            if (student.getStudentId().equals(studentId)) {
                targetStudent = student;
                isStudentCheck = true;
                break;
            }
        }
//대상 강좌 찾기 (Academy의 courseList에서)
        // - courseId로 강좌 찾기
        boolean isCourseCheck = false;
        Course targetCourse = null;
        for (Course course : courseList) {
            if (course.getCourseId().equals(courseId)) {
                targetCourse = course;
                targetCourseMax = course.getMaxCourseStudent();
                targetCourseCurrent = course.getCurrentCourseStudent();
                isCourseCheck = true;
                break;
            }
        }
        // - 둘 중 하나라도 없으면 종료
        if (!isCourseCheck || !isStudentCheck) {
            return false;
        }

        // 3단계: 수강 가능 여부 확인
        // - 강좌 정원 확인
//            하단의 이프는 해당 값들의 비교 담당
        if (targetCourseCurrent >= targetCourseMax) {
            return false;
        }

        // - 중복 수강 확인
        for (Course course : targetStudent.getCurrentCourseList()) {
            if (course != null && course.getCourseId().equals(courseId)) {
                System.out.println("이미 해당 강좌를 수강중입니다.");
                return false;
            }
        }

        // - 학생의 수강 가능 강좌 수 확인
        int currentCourseCount = 0;
        for (Course course : targetStudent.getCurrentCourseList()) {
            if (course != null) {
                currentCourseCount++;
            }
        }

        if (currentCourseCount >= targetCourseMax) {
            System.out.println("수강 가능한 강좌 수를 초과하였습니다.");
            return false;
        }
        System.out.println("현재 수강 가능 강좌 수는 " + (targetCourseMax - currentCourseCount) + " 강좌 입니다.");

        // 4단계: 수강 신청 처리
        // - 학생의 수강 목록에 강좌 추가
//        불필요한 체크와 적절한 값 전달
        if (targetCourse != null) {
//                    스튜던트 클래스에 강좌 추가하는 메서드 필요
            targetStudent.addCourse(targetCourse);
            currentCourseCount++;
            isTaskCheck = true;
        }

        // - 강좌의 수강인원 증가
        // 해당 강좌의 수강인원 증가
        targetCourse.studentAdd();
        // - 학생의 수강료 업데이트
        System.out.println("현재 총 수강료 : " + targetStudent.getTotalPrice());
        // 5단계: 결과 반환
        if (isTaskCheck) {
            System.out.println("수강 신청이 완료되었습니다.");
        } else {
            System.out.println("수강 신청이 실패했습니다.");
        }
        return isTaskCheck;
    }

    //     =============================== 수강 취소 24.12.17
    public boolean cancelCourse(String studentId, String courseId) {
        boolean isTaskCheck = false;
        // 1. 유효성 검사
        // - 입력값 검증
        boolean isCourseFind = false;
        boolean isStudentFind = false;
        if (studentId == null || courseId == null) {
            System.out.println("입력값이 없거나 유효하지 않습니다.");
            return false;
        }
        // - 학생과 강좌 존재 여부 확인
        Course targetCourse = null;
        Student targetStudent = null;
        for (Course course : courseList) {
            if (course.getCourseId().equals(courseId)) {
                targetCourse = course;
                isCourseFind = true;
                break;
            }
        }

        for (Student student : studentsList) {
            if (student.getStudentId().equals(studentId)) {
                targetStudent = student;
                isStudentFind = true;
                break;
            }
        }

        if (!isStudentFind || !isCourseFind) {
            System.out.println("입력값이 유효하지 않습니다.");
            return false;
        }

        // 2. 학생과 강좌 찾기
        // - studentId로 학생 찾기 > targetStudent
        // - courseId로 강좌 찾기 > targetCourse

        // 3. 수강 여부 확인
        // - 해당 학생이 그 강좌를 수강중인지 확인
        boolean isCurrentTargetCourse = false;
        Course currentCourse = null;
        for (Course course : targetStudent.getCurrentCourseList()) {
//            이 부분을 해당 검증한 값을 이미 담고있는 타겟코스 변수를 활용하여 비교하면 안되는건지? > "이 학생이 이 강좌를 수강하고 있는가?"를 판단해야 하기에 아이디 값을 비교해야함
            if (course != null && course.getCourseId().equals(courseId)) {
                currentCourse = course;
                isCurrentTargetCourse = true;
                break;
            }
        }

        if (!isCurrentTargetCourse) {
            System.out.println("해당 학생이 해당 강좌를 미수강중입니다.");
            return false;
        }

        // 4. 수강 취소 처리
        // - 학생의 수강 목록에서 제거
        // - 수강료 차감
        targetStudent.removeCourse(targetCourse);
        // - 강좌의 수강인원 감소
        targetCourse.studentSub();
        isTaskCheck = true;

        // 5. 결과 반환
        if (isTaskCheck) {
            System.out.println("수강 취소가 완료되었습니다.");
            return true;
        } else {
            System.out.println("수강 취소가 실패하였습니다.");
        }
        return false;
    }

    //     ===============================
    public boolean removeFromArray(Object[] array, int count, String objectId) {

        //       아이디를 받아서 해당 아이디와 일치하는걸 찾아 해당 배열의 값을 널로 바꾸면 되기에, 아이디만 매개변수로 필요
        boolean isTaskCheck = false;
        // 1단계: 기본 유효성 검사
        // - 강좌 목록이 비어있는지 확인
        // - 비어있다면 메시지 출력 후 종료
//        배열을 체크할 필요 없이 카운트가 0이라면 강좌가 없다는 의미이다.
        if (count <= 0) {
            System.out.println("등록된 강좌 또는 수강생이 없습니다.");
            return isTaskCheck;
        }

//    ------------------------------------
        // 2단계: 삭제할 강좌 찾기
        // - Id와 일치하는 강좌 찾기
        // - 없다면 메시지 출력 후 종료

        for (int i = 0; i < count; i++) {
            if ((array[i] instanceof Course && ((Course) array[i]).getCourseId().equals(objectId)) || (array[i] instanceof Student && ((Student) array[i]).getStudentId().equals(objectId))) {
                // 3단계: 삭제
                // - 해당 위치의 강좌 또는 수강생을 null로 변경
                // - count 감소

//            개선 사항 : 실제 배열을 널로 만들어야 함
//    ------------------------------------
                array[i] = null;
//                매개변수를 직접 조작하므로, 호출 메서드에서 카운트 조작
//                count--;
                // 4단계: 배열 재정리 (선택)
                // - null이 생긴 자리를 뒤의 요소들로 채우기
                // - 맨 뒤 요소는 null로 설정
                for (int j = i; j < count - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[count] = null;
                isTaskCheck = true;
            }
//           마지막에 상태 추적 변수 값으로 한번만 결과 출력
//            else {
//                System.out.println("입력값과 일치하는 값이 없습니다.");
//                return isTaskCheck;
//            }
        }

//    ------------------------------------

        // 5단계: 결과 메시지 출력
        if (isTaskCheck) {
            System.out.println("강좌 삭제가 성공하였습니다.");
        } else {
            System.out.println("강좌 삭제가 실패하였습니다.");
        }
        return isTaskCheck;
    }
}