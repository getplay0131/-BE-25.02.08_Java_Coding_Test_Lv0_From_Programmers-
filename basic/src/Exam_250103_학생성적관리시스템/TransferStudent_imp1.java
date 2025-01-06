package Exam_250103_학생성적관리시스템;

public class TransferStudent_imp1 extends Student_imp1 {
    //    - 구현할 내용:
//  - 이전 학교 정보, 편입학기 정보 추가
    private String formerSchoolInfo; //이전 학교 정보
    // ❗ 학기는 int로 관리하는 게 더 적절할 수 있음
    private int transferSemester; //편입학기 정보

    //    constructor
    public TransferStudent_imp1(String name, int grade, int semesterInfo, String formerSchoolInfo,
                                int transferSemester, String admissionDate) {
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

    //    ------------------------------------

    @Override
    public void calculateAverage(Score_imp1 score) {
// ❗ 구현 필요:
        // - 편입 학기 이후의 성적만 계산
        if () {

        }

        // - 배열이 아닌 Score 객체 활용하도록 수정
    }


//  - 편입 후 성적만으로 평균 계산
//  - 장학금 대상 여부 확인 (평균 95점 이상)
//- 주의사항:
//  - 부모 클래스의 평균 계산 메서드 오버라이딩
//  - 편입 학기 이전 성적은 제외
}
