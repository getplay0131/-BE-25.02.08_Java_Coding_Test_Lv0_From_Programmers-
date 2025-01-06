package Exam_250103_학생성적관리시스템;

public class Score_imp1 {
    // ❗개선 필요: 현재 과목 배열로 관리
    // ✅ 다음과 같은 필드 구조로 변경 필요:
    // - Subject 객체 참조 (과목 정보)
    // - score (점수)
    // - semester (학기)
    private Subject_imp1 subjects;
    private int score;
    private int semester;


    // ❗ 현재 생성자의 문제점:
// - 점수와 학기 정보가 누락됨
// - Subject 객체에 대한 검증만 있고 다른 데이터 검증이 없음

    // ❗ 개선 필요:
    // - score 범위 검증 (0-100)
    // - semester 범위 검증 (1-4)
    // - this.subjects 할당 누락
    public Score_imp1(Subject_imp1 subjects, int score, int semester) {
        if ((subjects != null && !subjects.equals("")) && (score >= 0 && score <= 100) && (semester >= 1 && semester <= 4)) {
            this.score = score;      // scores 변수가 정의되지 않음
            this.semester = semester;  // semester 변수가 정의되지 않음
            this.subjects = subjects;
        } else {
            System.out.println("유효하지 않은 입력값입니다.");
        }
    }

    // ❗getter/setter 개선 필요
    // - Subject 관련 getter/setter 추가
    // - 점수 범위 검증 (0-100) 추가
    // - 학기 정보 검증 추가

//    getter ---------------------------

    public int getSemester() {
        return semester;
    }

    public int getScore() {
        return score;
    }

    public Subject_imp1 getSubjects() {
        return subjects;
    }

    //    ----------------------------------

    //    setter ---------------------------

    // ❗ 개선 필요:
    // - 점수 범위가 잘못됨 (현재 1-3, 실제로는 0-100이어야 함)
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("유효하지 않은 점수 범위입니다.");
        }
    }
    // ❗ 개선 필요:
    // - 학기 범위 검증 필요 (1-4)
    public void setSemester(int semester) {
        if (semester >= 1 && semester <= 4) {
        this.semester = semester;
        } else {
            System.out.println("유효하지 않은 학기 범위입니다.");
        }
    }

    public void setSubjects(Subject_imp1 subjects) {
        this.subjects = subjects;
    }

    //    ----------------------------------

    // ✅ 등급 계산 로직은 잘 구현됨
    public String judgementScore(int score) {
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                return "A";
            } else if (score >= 80) {
                return "B";
            } else if (score >= 70) {
                return "C";
            } else if (score >= 60) {
                return "D";
            } else {
                return "F";
            }
        } else {
            return "false";
        }
    }
}
