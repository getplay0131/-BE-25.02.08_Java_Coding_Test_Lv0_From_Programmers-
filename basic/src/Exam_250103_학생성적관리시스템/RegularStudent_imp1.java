package Exam_250103_학생성적관리시스템;


public class RegularStudent_imp1 extends Student_imp1{
//    field
    private int semester; //학기정보
    private int aveScore;
//    constructor
public RegularStudent_imp1(String name, int grade, int semesterInfo, String admissionDate, int semester) {
    super(name,grade, semesterInfo,admissionDate);
    if (semester <= 4 && semester >= 1) {
    this.semester = semester;
    }
}

//method

//    getter
    public int getSemester() {
        return semester;
    }

    public int getAveScore() {
        return aveScore;
    }

//    setter
    public void setSemester(int semester) {
        if (semester <= 4 && semester >= 1) {
            this.semester = semester;
        }
    }

    public void setAveScore(int aveScore) {
        this.aveScore = aveScore;
    }

    @Override
    public void calculateAverage(Score_imp1[] score) {
        int sum = 0;
        int countSubject = 0;

//        Score_imp1 targetScore = null;
        for (Score_imp1 scores : score) {
            if (scores != null && (getSemester() >0 && getSemester() <= 4)) {
//                targetScore = scores;
                sum += scores.getScore();
                countSubject++;
            } else {
                System.out.println("학기 정보가 유효 값이 아닙니다.");
                return;
            }
        }

        int subjectAverage = 0;
        if (countSubject > 0) {
            subjectAverage = sum / countSubject;
            setAveScore(subjectAverage);
            System.out.println("평균 점수 : " + subjectAverage + "점");
        } else {
            System.out.println("수강한 강좌가 없습니다.");
            return;
        }

        if (subjectAverage >= 90) {
            System.out.println("장학금 대상 학생입니다.");
        } else {
            System.out.println("장학금 대상 학생이 아닙니다.");
        }
        
//        간단성과 명확성을 위해 상위의 방식 사용 권장
//        if (targetScore != null && targetScore.judgementScore(subjectAverage).equals("A")) {
//            System.out.println("장학금 대상 학생입니다.");
//        } else {
//            System.out.println("장학금 대상 학생이 아닙니다.");
//        }
    }




}
