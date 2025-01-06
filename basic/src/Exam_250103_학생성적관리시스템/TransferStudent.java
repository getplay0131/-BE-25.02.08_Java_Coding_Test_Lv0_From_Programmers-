package Exam_250103_학생성적관리시스템;

public class TransferStudent extends Student {
    //    - 구현할 내용:
//  - 이전 학교 정보, 편입학기 정보 추가
    private String formerSchoolInfo;
    private String transferSemester;

    //    constructor
    public TransferStudent(String name, int grade, String semesterInfo, String formerSchoolInfo, String transferSemester) {
        super(name, grade, semesterInfo);
        this.formerSchoolInfo = formerSchoolInfo;
        this.transferSemester = transferSemester;
    }


//    method
//    getter --------------------------

    public String getFormerSchoolInfo() {
        return formerSchoolInfo;
    }

    public String getTransferSemester() {
        return transferSemester;
    }

    //    ------------------------------------

    //    setter --------------------------

    public void setFormerSchoolInfo(String formerSchoolInfo) {
        this.formerSchoolInfo = formerSchoolInfo;
    }

    public void setTransferSemester(String transferSemester) {
        this.transferSemester = transferSemester;
    }

    //    ------------------------------------

    @Override
    public void calculateAverage(int[] gradeInfos) {
// ❗ 구현 필요:
        // - 편입 학기 이후의 성적만 계산
        // - 배열이 아닌 Score 객체 활용하도록 수정
    }


//  - 편입 후 성적만으로 평균 계산
//  - 장학금 대상 여부 확인 (평균 95점 이상)
//- 주의사항:
//  - 부모 클래스의 평균 계산 메서드 오버라이딩
//  - 편입 학기 이전 성적은 제외
}
