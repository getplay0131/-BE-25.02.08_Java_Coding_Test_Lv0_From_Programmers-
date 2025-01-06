package Exam_250103_학생성적관리시스템;

public class RegularStudent extends Student{
//    - 구현할 내용:
//  - 입학일자 추가
    private String admissionDate;
//  - 전체 학기 성적으로 평균 계산
//  - 장학금 대상 여부 확인 (평균 90점 이상)
//생성자
   public RegularStudent(String admissionDate, String name, int grade, String infos){
       super(name,grade,infos);
       this.admissionDate = admissionDate;
   }

//method

//    getter ------------------------------

    public String getAdmissionDate() {
        return admissionDate;
    }

//     ------------------------------------

    //    setter ------------------------------

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    //     ------------------------------------
    @Override
    public void calculateAverage(int[] gradeInfos) {
//        작성 필요
    }

//- 주의사항:
//  - 부모 클래스의 평균 계산 메서드 오버라이딩
//  - 입학일자 유효성 검사

}
