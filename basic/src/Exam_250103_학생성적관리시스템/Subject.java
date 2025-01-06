package Exam_250103_학생성적관리시스템;

public class Subject {
//    - 구현할 내용:
//  - 과목코드, 과목명, 학점
    private static String [] subjectCodes = new String[5];
    private String math;
    private String english;
    private String language;
    private String science;
    private String social;
    private int subjectGrades;
    private static int codeNumber;

//    constructor
    public Subject(String math, String english , String language , String science , String social){
       this.math = "math";
       this.english = "english";
       this.language = "language";
       this.science = "science";
       this.social = "social";
    }

//    methods

//------------------getter

    public int getSubjectGrades() {
        return subjectGrades;
    }

    public String getEnglish() {
        return english;
    }

    public String getLanguage() {
        return language;
    }

    public String getMath() {
        return math;
    }

    public String getScience() {
        return science;
    }

    public String getSocial() {
        return social;
    }

    public static String[] getSubjectCodes() {
        return subjectCodes;
    }

    //-------------------------

//------------------setter

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public void setSubjectGrades(int subjectGrades) {
        if (subjectGrades <=3 && subjectGrades>=1) {
        this.subjectGrades = subjectGrades;
        }
    }
    //-------------------------


//  - 필수과목 여부
    //-------------------------
    public boolean requiredSubjects(String subjectName){
        if (subjectName.equals("math") || subjectName.equals("language") || subjectName.equals("english")) {
            return true;
        }
        return false;
    }
//    과목 코드 만들기
    //-------------------------
public static String subjectsCodes(String subjectName){
        if (subjectName == null || subjectName.isEmpty()) {
            return "작업 실패";
    }
        String subjectIDs = subjectName + codeNumber;
    codeNumber++;
    return subjectIDs;
}
    //-------------------------

//과목 코드 배열 관리
    //-------------------------
    public void addSubjectCodes(String subjectName){

        for (String subjectCode : subjectCodes) {
            if (subjectCode == null);
            subjectCode = subjectsCodes(subjectName);
        }

        for (int i = 0; i < subjectCodes.length; i++) {
            if (subjectCodes[i].equals(subjectCodes[i+1])) {
                return;
            }
        }
    }
    //-------------------------

//- 주의사항:
//  - 과목코드 중복 검사
//  - 학점은 1-3 사이만 가능
}
