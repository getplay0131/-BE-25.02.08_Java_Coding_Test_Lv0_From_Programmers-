package Exam_250103_학생성적관리시스템;

public class Score {
//    - 구현할 내용:
//  - 과목, 점수, 학기 정보
    private String [] subjects = Subject.getSubjectCodes();
    private int scores;
    private int semester;

//   constructor
    public Score(int scores, int semester){
        this.scores = scores;
        this.semester = semester;
    }

//method
//    -------------getter

    public int getScores() {
        return scores;
    }

    public int getSemester() {
        return semester;
    }

    //    -------------------

    //    -------------setter
    public void setScores(int scores) {
        if (scores <= 100 && scores >= 1) {
        this.scores = scores;
        }
    }

    public void setSemester(int semester) {
        if (semester <= 4 && semester >= 1) {
        this.semester = semester;
        } else {
            System.out.println("올바른 학기 정보 값을 입력해주세요.");
        }
    }

//    -------------------
//  - 점수에 따른 등급(A, B, C, D, F) 반환
    public String judgementScore (int scores){
        if(scores >= 90){
            return "A";
        } else if (scores >= 80) {
            return "B";
        } else if (scores >= 70) {
            return "C";
        } else if (scores >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
//- 주의사항:
//  - 점수는 0-100 사이만 가능
//  - 성적 입력 시 과목 정보 필수 확인
}
