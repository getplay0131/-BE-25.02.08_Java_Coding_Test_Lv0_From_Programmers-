package Exam_250103_학생성적관리시스템;

public abstract class Student {
//    - 구현할 내용:
//  - 학번(자동생성), 이름, 학년, 학기 정보 저장
    private static String studentIds;
    private static int studentNumber;
    private String name;
    private int grade;
    private String semesterInfo;

//  - 성적 정보를 담을 배열 선언
    private int[] gradeInfos = new int[5];

//    생성자
    public  Student( String name, int grade, String semesterInfo){
        this.name = name;
        this.grade = grade;
        this.semesterInfo = semesterInfo;
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
        return studentNumber;
    }

    public String getSemesterInfo() {
        return semesterInfo;
    }

    public int[] getGradeInfos() {
        return gradeInfos;
    }

    public String getStudentIds() {
        return studentIds;
    }

    //     --------------------------------------------------------------

    //     --------------------------------setter-----------------------

    public void setGrade(int grade) {
        this.grade = grade;
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
        this.name = name;
    }

    public static void setStudentNumber(int studentNumber) {
        Student.studentNumber = studentNumber;
    }

    public void setSemesterInfo(String semesterInfo) {
        this.semesterInfo = semesterInfo;
    }

    public void setStudentIds(String studentIds) {
        this.studentIds = studentIds;
    }

    //     --------------------------------------------------------------
//    학번 생성
    public static String createStudentNumber(){
        String studentNumbers = "Student" + getStudentNumber();
        studentNumber++;
        studentIds = studentNumbers;
        return studentNumbers;
    }

//  - 기본 정보 출력 메서드
    public void printInfo(){
        System.out.println("학생 학번 : " + getStudentIds());
        System.out.println("학생 이름 : " + getName());
        System.out.println("학생 학년 : " + getGrade());
        System.out.println("학생 학기 정보 : " + getSemesterInfo());
    }

//  - 평균 계산 메서드(추상메서드)
    public abstract void calculateAverage(int [] gradeInfos);

//- 주의사항:
//  - 학번은 static 변수로 자동 생성 구현
//  - 모든 필드는 private으로 선언
}
