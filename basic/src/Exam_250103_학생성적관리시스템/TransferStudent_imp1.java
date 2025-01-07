package Exam_250103_학생성적관리시스템;

public class TransferStudent_imp1 extends Student_imp1 {
    //    - 구현할 내용:
//  - 이전 학교 정보, 편입학기 정보 추가
    private String formerSchoolInfo; //이전 학교 정보
    // ❗ 학기는 int로 관리하는 게 더 적절할 수 있음
    private int transferSemester; //편입학기 정보
    private int aveScore = 0;

    //    constructor
    public TransferStudent_imp1(String name, int grade, int semesterInfo, String admissionDate,
                                String formerSchoolInfo, int transferSemester) {
        // ❗ 개선 필요:
        // - 데이터 유효성 검증 추가
        // - 부모 클래스의 변경된 생성자에 맞춰 수정
        // - admissionDate 정보 추가
        super(name, grade, semesterInfo, admissionDate);
        if ((formerSchoolInfo != null && !formerSchoolInfo.isEmpty()) && transferSemester > 0 && (transferSemester < 5)) {
            this.formerSchoolInfo = formerSchoolInfo;
            this.transferSemester = transferSemester;
        }
    }


//    method
//    getter --------------------------

    public String getFormerSchoolInfo() {
        return formerSchoolInfo;
    }

    public int getTransferSemester() {
        return transferSemester;
    }

    public int getAveScore() {
        return aveScore;
    }

    //    ------------------------------------

    //    setter --------------------------

    public void setFormerSchoolInfo(String formerSchoolInfo) {
        if (formerSchoolInfo != null && !formerSchoolInfo.isEmpty()) {
            this.formerSchoolInfo = formerSchoolInfo;
        }
    }

    public void setTransferSemester(int transferSemester) {
        if (transferSemester < 0) {
            return;
        }
        this.transferSemester = transferSemester;
    }

    public void setAveScore(int aveScore) {
        this.aveScore = aveScore;
    }

    //    ------------------------------------

    @Override
    public void calculateAverage(Score_imp1[] score) {
// 1. 필요한 변수 선언
        // - 전체 점수 합계를 저장할 변수
        // - 계산된 과목 수를 카운트할 변수
        int sum = 0;
        int countSubject = 0;

        // 2. scores 배열 순회하면서
        // - null 체크
        // - 편입학기 이후의 성적인지 확인
        // - 조건을 만족하면 합계에 점수 추가, 카운트 증가
        for (Score_imp1 scores : score) {
            if (scores != null && scores.getSemester() >= this.transferSemester) {
                sum += scores.getScore();
                countSubject++;
            }
        }

        // 3. 평균 계산 및 결과 출력
        // - 카운트가 0보다 큰지 확인 (계산 가능한 성적이 있는지)
        // - 있다면 평균 계산 (totalScore / count)
        // - 평균값 출력
            int subjectAverage = 0 ;
        if (countSubject > 0) {
            subjectAverage = sum / countSubject;
            setAveScore(subjectAverage);
            System.out.println("평균 점수 : " + subjectAverage + "점");
        } else {
            System.out.println("수강한 강좌가 없습니다.");
            return;
        }

        // 4. 장학금 대상 여부 확인 및 출력
        // - 평균이 95점 이상인지 확인
        // - 해당되면 메시지 출력
        if (subjectAverage >= 95) {
            System.out.println("장학금 대상 학생입니다.");
        } else {
            System.out.println("장학금 대상 학생이 아닙니다.");
        }
    }

//  - 편입 후 성적만으로 평균 계산
//  - 장학금 대상 여부 확인 (평균 95점 이상)
//- 주의사항:
//  - 부모 클래스의 평균 계산 메서드 오버라이딩
//  - 편입 학기 이전 성적은 제외
}
