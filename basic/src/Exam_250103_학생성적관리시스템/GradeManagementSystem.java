package Exam_250103_학생성적관리시스템;

public class GradeManagementSystem {
    // ❗ 필드 구성
    // - 최대 학생 수: 배열 크기 제한을 위한 상수
    private static final int MAX_STUDENTS = 10;
    // - 학생 배열: 전체 학생 관리를 위해 필요
    private Student_imp1[] studentsArray = new Student_imp1[MAX_STUDENTS];
    // - 현재 등록된 학생 수: 배열 관리를 위한 카운터
    private int currentStudentCounter;

    /* 1. 학생 관리 기능 */

    // 1-1. 학생 등록
//    Student 객체를 받아서 다시 새로운 객체를 생성하는 구조가 불필요
//타입 구분을 위한 다른 방법 고려 (예: boolean isTransfer)
    public void registerStudent(String name, int grade, int semesterInfo, String admissionDate
            , int semester, String formerSchoolInfo, int transferSemester) {
        boolean taskCheck = false;
        boolean isRegular = false;
        boolean isTransfer = false;
        if (currentStudentCounter >= 9) {
            System.out.println("최대 학생수에 도달하여 학생 등록이 불가합니다.");
            return;
        }

        // ✓ 구현 단계:
        // 1. 입력받은 학생 정보 유효성 검증
        if ((formerSchoolInfo == null || formerSchoolInfo.isEmpty()) && transferSemester == 0) {
            isRegular = true;
        } else {
            isTransfer = true;
        }

        // 2. 배열에 여유 공간 있는지 확인
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                // 3. 학생 타입(일반/편입) 구분하여 객체 생성
                if (isRegular) {
                    RegularStudent_imp1 rStudents = new RegularStudent_imp1(name, grade, semesterInfo, admissionDate, semester);
                    studentsArray[i] = rStudents;
                    // 4. 배열에 추가하고 카운터 증가
                    currentStudentCounter++;
                    System.out.println("일반 학생 등록이 성공하였습니다.");
                    taskCheck = true;
                    break;
                } else if (isTransfer) {
                    TransferStudent_imp1 tStudents = new TransferStudent_imp1(name, grade, semesterInfo, admissionDate,
                            formerSchoolInfo, transferSemester);
                    studentsArray[i] = tStudents;
                    currentStudentCounter++;
                    System.out.println("편입 학생 등록 성공하였습니다.");
                    taskCheck = true;
                    break;
                }
            }
        }
        if (!taskCheck) {
            System.out.println("학생 등록이 실패하였습니다.");
        }
    }

    // 1-2. 학생 삭제
    public void removeStudent(String studentId) {
        // ✓ 구현 단계:
        boolean taskCheck = false;
        if (!validateStudent(studentId) || currentStudentCounter <= 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        // 1. 학번으로 학생 찾기
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] != null && studentsArray[i].getStudentIds().equals(studentId)) {
                // 2. 해당 학생 배열에서 제거
                studentsArray[i] = null;
                // 3. 뒤의 요소들을 앞으로 이동
                compactArray(i, studentsArray);
                // 4. 카운터 감소
                currentStudentCounter--;
                taskCheck = true;
            }
        }
        if (!taskCheck) {
            System.out.println("학생 삭제에 실패하였습니다.");
        } else {
            System.out.println("학생 삭제에 성공하였습니다.");
        }
    }

    /* 2. 성적 관리 기능 */

    // 2-1. 성적 입력
    public void addScore(String studentId, Subject_imp1 subjects, int score, int semester) {
        // 과목과 점수 유효성 검증
        boolean taskCheck = false;
        validateStudent(studentId, subjects, score, semester);

        // ✓ 구현 단계:
        // 1. 학생 찾기
        Student_imp1 targetStudent = null;
        targetStudent = findStudent(studentId);

        if (targetStudent == null) {
            nullCheck(targetStudent);
            return;
        }

        Score_imp1[] scoreSearch = targetStudent.getScores();
        boolean isDuplicate = false;

        for (Score_imp1 search : scoreSearch) {
            if (search != null && (search.getSubjects().equals(subjects) && search.getSemester() == semester)) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            System.out.println("이미 동일한 정보가 저장되어 있습니다.");
            return;
        }

        // 2. Score 객체 생성
        Score_imp1 studentsScore = new Score_imp1(subjects, score, semester);
        // 3. 학생의 성적 배열에 추가
        targetStudent.setScores(studentsScore);
        taskCheck = true;

        if (!taskCheck) {
            System.out.println("성적 입력에 실패하였습니다.");
        } else {
            System.out.println("성적 입력에 성공하였습니다.");
        }
    }

    // 2-2. 성적 수정
    public void updateScore(String studentId, Subject_imp1 subjects, int semester, int newScore) {
        boolean taskCheck = false;
        // 새로운 점수 유효성 검증
        validateStudent(studentId, subjects, newScore, semester);


        // ✓ 구현 단계:
        // 1. 학생과 과목 찾기
        Student_imp1 targetStudent = null;
        targetStudent = findStudent(studentId);

        if (targetStudent == null) {
            nullCheck(targetStudent);
            return;
        }

        // 성적 정보 업데이트
        Score_imp1[] newScores = targetStudent.getScores();
        Score_imp1 targetScore = null;
        for (Score_imp1 score : newScores) {
            if (score != null && score.getSubjects().equals(subjects) && score.getSemester() == semester) {
                score.setScore(newScore);
                targetScore = score;
                taskCheck = true;
                break;
            }
        }

        if (targetScore == null) {
            nullCheck(targetScore);
            return;
        }

        System.out.println("성적 수정에 성공하였습니다.");
    }



    /* 3. 성적 조회 기능 */

    // 3-1. 학생 검색
    public Student_imp1 findStudent(String studentId) {
        // ✓ 구현 단계:
        if (!validateStudent(studentId)) {
            return null;
        }
        // 1. 배열 순회하며 학번 비교
        // 2. 일치하는 학생 반환
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] != null && studentsArray[i].getStudentIds().equals(studentId)) {
                return studentsArray[i];
            }
        }
        // 3. 없으면 null 반환
        System.out.println("일치하는 학생이 없습니다.");
        return null;
    }

    // 3-2. 성적표 출력
    public void printGradeReport(String studentId) {
        // ✓ 구현 단계:
        // 1. 학생 찾기
        Student_imp1 targetStudent = null;
        targetStudent = findStudent(studentId);

        if (targetStudent == null) {
            nullCheck(targetStudent);
            return;
        }

        // 2. 기본 정보 출력 (학번, 이름 등)
        targetStudent.printInfo();

        // 3. 과목별 성적 출력
//        score 배열을 매개변수로 받을 필요가 있을까요?
//학생 객체에서 이미 성적 정보를 가지고 있음
        System.out.println("=== 성적 정보 ===");
        for (Score_imp1 targetStudentScore : targetStudent.getScores()) {
            if (targetStudentScore != null) {
                System.out.println("-------------------");
                System.out.println("과목 : " + targetStudentScore.getSubjects());
                System.out.println("학기 : " + targetStudentScore.getSemester());
                System.out.println("점수 : " + targetStudentScore.getScore());
                System.out.println("등급 : " + targetStudentScore.judgementScore(targetStudentScore.getScore()));
            }
        }
        System.out.println("===================");

        // 4. 평균과 장학금 여부 출력
        if (targetStudent instanceof RegularStudent_imp1 regularStudent) {
            regularStudent.calculateAverage(targetStudent.getScores());
        } else if (targetStudent instanceof TransferStudent_imp1 transferStudent) {
            transferStudent.calculateAverage(targetStudent.getScores());
        }
    }

    /* 4. 통계 기능 */

    // 4-1. 학년별 통계
    public void printGradeStatistics() {
        // ✓ 구현 단계:
        // 1. 학년별로 학생 그룹화
        int grade1Counter = 0, grade2Counter = 0, grade3Counter = 0, grade4Counter = 0;
        for (Student_imp1 student : studentsArray) {
            grade1Counter = gradeStatisticsStep1(student.getGrade(),grade1Counter, student);
            grade2Counter = gradeStatisticsStep1(student.getGrade(),grade2Counter, student);
            grade3Counter = gradeStatisticsStep1(student.getGrade(),grade3Counter, student);
            grade4Counter = gradeStatisticsStep1(student.getGrade(),grade4Counter, student);
        }
        Student_imp1[] grade1 = new Student_imp1[grade1Counter];
        Student_imp1[] grade2 = new Student_imp1[grade2Counter];
        Student_imp1[] grade3 = new Student_imp1[grade3Counter];
        Student_imp1[] grade4 = new Student_imp1[grade4Counter];

        int idx1 = 0, idx2 = 0, idx3 = 0, idx4 = 0;
        for (Student_imp1 student : studentsArray) {
            if (student != null) {
                switch (student.getGrade()) {
                    case 1 -> grade1[idx1++] = student;
                    case 2 -> grade2[idx2++] = student;
                    case 3 -> grade3[idx3++] = student;
                    case 4 -> grade4[idx4++] = student;
                    default -> System.out.println("잘못된 학년 정보입니다." + student.getGrade());
                }
            }
        }

//            for (int i = 0; i < studentsArray.length; i++) {
//                if (studentsArray[i] != null) {
//                    if (studentsArray[i].getGrade() == 1) {
//                        grade1Counter++;
//                        grade1[i] = studentsArray[i];
//                    } else if (studentsArray[i].getGrade() == 2) {
//                        grade2Counter++;
//                        grade2[i] = studentsArray[i];
//                    } else if (studentsArray[i].getGrade() == 3) {
//                        grade3Counter++;
//                        grade3[i] = studentsArray[i];
//                    } else if (studentsArray[i].getGrade() == 4) {
//                        grade4Counter++;
//                        grade4[i] = studentsArray[i];
//                    } else {
//                        System.out.println("잘못된 학년 정보입니다." + studentsArray[i].getGrade());
//                    }
//                }
//            }

        // 2. 각 학년의 평균 계산
        int grade1Ave = calculateGradeAverage(grade1);
        int grade2Ave = calculateGradeAverage(grade2);
        int grade3Ave = calculateGradeAverage(grade3);
        int grade4Ave = calculateGradeAverage(grade4);

        // 3. 결과 출력
        System.out.println("=== 학년별 평균 성적 ===");
        System.out.println("1학년 평균 점수 : " + grade1Ave + "점");
        System.out.println("2학년 평균 점수 : " + grade2Ave + "점");
        System.out.println("3학년 평균 점수 : " + grade3Ave + "점");
        System.out.println("4학년 평균 점수 : " + grade4Ave + "점");
    }


    // 4-2. 장학금 대상자 조회
    public void printScholarshipStudents() {
        // ✓ 구현 단계:
//        학생별 배열의 값을 위해 1차 탐색 후 카운터 값 설정
        int regularsCounter = 0;
        int transfersCounter = 0;
        for (Student_imp1 student : studentsArray) {
            if (student != null) {
                if (student instanceof RegularStudent_imp1 regularStudent) {
                    if (regularStudent.getAveScore() >= 90) {
                        regularsCounter++;
                    }
                } else if (student instanceof TransferStudent_imp1 transferStudent) {
                    if (transferStudent.getAveScore() >= 95) {
                        transfersCounter++;
                    }
                }
            }
        }

//        타입별 학생을 저장할 배열 선언
        Student_imp1[] regulars = new RegularStudent_imp1[regularsCounter];
        Student_imp1[] transfers = new TransferStudent_imp1[transfersCounter];

        // 1. 전체 학생 순회
        int idx1 = 0, idx2 = 0;
        for (Student_imp1 student : studentsArray) {
            if (student != null) {
                // 2. 학생 타입별로 기준 적용
                if (student instanceof RegularStudent_imp1 regularStudent) {
                    if (regularStudent.getAveScore() >= 90) {
                        System.out.println(regularStudent.getName() + "님은 장학금 대상자 입니다.");
                        regulars[idx1++] = student;
                    } else {
                        System.out.println(regularStudent.getName() + "님은 장학금 대상자가 아닙니다.");
                    }
                } else if (student instanceof TransferStudent_imp1 transferStudent) {
                    if (transferStudent.getAveScore() >= 95) {
                        System.out.println(transferStudent.getName() + "님은 장학금 대상자 입니다.");
                        transfers[idx2++] = student;
                    } else {
                        System.out.println(transferStudent.getName() + "님은 장학금 대상자가 아닙니다.");
                    }
                }
            }
        }

        // 3. 대상자 목록 출력
        System.out.println("===== 장학금 대상자 목록 (일반) =====");
        for (Student_imp1 regular : regulars) {
            if (regular != null) {
                System.out.println("이름 : " + regular.getName() + "님");
            }
        }
        System.out.println("----------------");

        System.out.println("===== 장학금 대상자 목록 (편입생) =====");
        for (Student_imp1 transfer : transfers) {
            if (transfer != null) {
                System.out.println("이름 : " + transfer.getName() + "님");
            }
            System.out.println("----------------");
        }
    }

    /* 유틸리티 메서드 */

    private void nullCheck(Object object) {
        if (object == null) {
            if (object instanceof Student_imp1) {
                System.out.println("해당 학번을 가진 학생 검색에 실패하였습니다.");
            } else if (object instanceof Score_imp1) {
                System.out.println("해당 성적 검색에 실패하였습니다.");
            }
        }
    }

    private void compactArray(int index, Object[] arrays) {
        // 삭제된 자리 처리하여 배열 정리
        for (int j = index; j < arrays.length - 1; j++) {
            arrays[j] = arrays[j + 1];
        }
        arrays[arrays.length - 1] = null;
    }

    // 데이터 검증
    private boolean validateStudent(String studentId) {
        // 학생 정보 유효성 검사
        if (studentId == null || studentId.isEmpty()) {
            System.out.println("입력 값이 유효하지 않습니다.");
            return false;
        }
        return true;
    }

    private boolean validateStudent(String studentId, Subject_imp1 subjects, int score, int semester) {
        // 학생 정보 유효성 검사
        if ((!validateStudent(studentId) || currentStudentCounter <= 0) || subjects == null || (score < 0 || score > 100) || (semester <= 0 || semester > 4)) {
            System.out.println("입력값이 유효하지 않습니다.");
            return false;
        }
        return true;
    }

    private int gradeStatisticsStep1(int grade, int counter, Object object) {
        int grade1Counter = 0, grade2Counter = 0, grade3Counter = 0, grade4Counter = 0;
        if (object != null) {
//            switch (grade) {
//                case 1 -> grade1Counter++;
//                case 2 -> grade2Counter++;
//                case 3 -> grade3Counter++;
//                case 4 -> grade4Counter++;
//                default -> System.out.println("잘못된 학년 정보입니다." + grade);
//            }
            switch (grade){
                case 1,2,3,4 -> {
                    counter++;
                    return counter;
                }
                default -> {
                    System.out.println("잘못된 학년 정보입니다." + grade);
                    return counter;
                }
            }
        }
        return counter;
    }

    private int calculateGradeAverage(Student_imp1[] gradeStudents) {
        int sum = 0, count = 0;
        for (Student_imp1 student : gradeStudents) {
            if (student instanceof RegularStudent_imp1) {
                sum += ((RegularStudent_imp1) student).getAveScore();
                count++;
            } else if (student instanceof TransferStudent_imp1) {
                sum += ((TransferStudent_imp1) student).getAveScore();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}
