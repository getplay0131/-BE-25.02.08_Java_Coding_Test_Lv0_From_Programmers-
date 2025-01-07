package Exam_250103_학생성적관리시스템;

import Progress_241231.poly.ex.pay0.PayKinds;

public abstract class Student_imp1 {
    //    - 구현할 내용:
//  - 학번(자동생성), 이름, 학년, 학기 정보 저장
    private String studentIds; // 학번
    private String name; // 이름
    private int grade; // 학년
    private int semesterInfo; // 학기 정보
    private Score_imp1[] scoreArray; // 성적정보
    private String admissionDate; // 입학일자 정보
    private int arrayValueCount = 0;
    private static int createdYears; // 생성된 연도 저장 변수
    private static int currentNumber; // 학번 생성용 카운터
    private static int currentYears; // 현재 연도 변수


    //  - 성적 정보를 담을 배열 선언
    private int[] gradeInfos = new int[5];

    //    생성자
    public Student_imp1(String name, int grade, int semesterInfo, String admissionDate) {
        if ((name != null && !name.isEmpty()) && (grade > 0 && grade < 5) && (semesterInfo > 0 && semesterInfo < 5) && (admissionDate != null && !admissionDate.isEmpty())) {
            this.name = name;
            this.grade = grade;
            this.semesterInfo = semesterInfo;
            this.admissionDate = admissionDate;
            this.scoreArray = new Score_imp1[5];
            createStudentId(admissionDate);
        }
    }
//    method

//     --------------------------------getter-----------------------

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public static int getStudentNumber() {
        return currentNumber;
    }

    public int getSemesterInfo() {
        return semesterInfo;
    }

    public int[] getGradeInfos() {
        return gradeInfos;
    }

    public String getStudentIds() {
        return studentIds;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public Score_imp1[] getScores() {
        return scoreArray;
    }

    public static int getCreatedYears() {
        return createdYears;
    }

    public static int getCurrentYears() {
        return currentYears;
    }

    //     --------------------------------------------------------------

    //     --------------------------------setter-----------------------

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 3) {
        this.grade = grade;
        }
    }

    public void setGradeInfos(int[] gradeInfos) {
        for (int i = 0; i < gradeInfos.length; i++) {
            if (gradeInfos[i] != 0 && gradeInfos[i] >= 0) {
                this.gradeInfos[i] = gradeInfos[i];
                return;
            } else {
                System.out.println("성적 정보 추가가 불가하거나, 입력값이 유효하지 않습니다.");
                return;
            }
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
        this.name = name;
        }
    }

    public static void setStudentNumber(int currentNumber) {
        if (currentNumber >= 0) {
        Student_imp1.currentNumber = currentNumber;
        }
    }

    public void setSemesterInfo(int semesterInfo) {
        if (semesterInfo >= 1 && semesterInfo <= 4) {
        this.semesterInfo = semesterInfo;
        }
    }

    public void setStudentIds(String studentIds) {
        if (studentIds != null && !studentIds.isEmpty()) {
        this.studentIds = studentIds;
        }
    }

    public void setAdmissionDate(String admissionDate) {
        if (admissionDate != null && !admissionDate.isEmpty()) {
        this.admissionDate = admissionDate;
        }
    }

    public static void setCreatedYears(int createdYears) {
        if (createdYears >= 0) {
        Student_imp1.createdYears = createdYears;
        }
    }

    public void setScores(Score_imp1 scores) {
        if (arrayValueCount >= 4) {
            System.out.println("성적 배열에 최대 한도의 도달하여 추가가 불가합니다.");
            return;
        }
        for (int i = 0; i < scoreArray.length; i++) {
            if (scores != null && scoreArray[i] == null) {
           scoreArray[i] =scores;
           arrayValueCount++;
            }
        }
    }

    //     --------------------------------------------------------------
//    학번 생성
    public static String createStudentId(String admissionDate) {
// 1. 입학일자에서 연도 추출
        String years = extractYear(admissionDate);
        if (years != null) {
        int yearsToInt = Integer.parseInt(years);
        // 2. 추출한 연도가 createdYears와 다르면
        if (yearsToInt != createdYears) {
        //    - currentNumber = 1로 초기화
            currentNumber = 1;
        //    - createdYears를 새로운 연도로 업데이트
            createdYears = yearsToInt;
        } else {
        // 3. 아니면 currentNumber 증가
            currentNumber++;
        }
        // 4. 연도 + 일련번호(3자리) 조합하여 반환
            System.out.println("학생 ID : " + years + String.format("%03d",currentNumber));
        return years + String.format("%03d",currentNumber);

        }else {
            System.out.println("학번 생성에 실패하였습니다.");
            return null;
        }
    }

//    admissionDate에서 연도를 추출하는 메서드
//    "2023-03-02" -> "23"
    private static String extractYear(String admissionDate){
        if (admissionDate != null && !admissionDate.isEmpty()) {
        return admissionDate.substring(2,4);
        }
        System.out.println("입력값이 유효하지 않습니다.");
        return null;
    }


    //  - 기본 정보 출력 메서드
    public void printInfo() {
        System.out.println("학생 학번 : " + getStudentIds());
        System.out.println("학생 이름 : " + getName());
        System.out.println("학생 학년 : " + getGrade());
        System.out.println("학생 학기 정보 : " + getSemesterInfo());
        System.out.println("학생 입학 일자 : " + getAdmissionDate());
    }

    //  - 평균 계산 메서드(추상메서드)
    public abstract void calculateAverage(Score_imp1[] score);


//- 주의사항
//  - 학번은 static 변수로 자동 생성 구현
//  - 모든 필드는 private으로 선언
}
