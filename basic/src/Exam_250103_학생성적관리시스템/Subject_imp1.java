//25.01.04
//setter 메서드들의 유효성 검사
//불필요한 setter 제거 검토
//메서드 이름의 일관성 (subjectScore와 subjectGrade 혼용)
package Exam_250103_학생성적관리시스템;
public class Subject_imp1 {
    // ✅ 필드 구조 개선 완료:
    // - 단일 과목 정보 표현
    // - 적절한 데이터 타입 사용
    private String subjectName;
    private String subjectCodes;
    private int subjectGrade;
    private boolean isRequiredSubject;
    private static int codeNumber;

    // ✅ 생성자 개선 완료:
    // - 데이터 유효성 검사 추가
    // - 과목코드 자동 생성
    public Subject_imp1(String subjectName, String subjectCodes , int subjectGrade , boolean isRequiredSubject){
        if (subjectName != null && !subjectName.isEmpty()) {
            if (subjectGrade >= 1 && subjectGrade <= 3) {
                this.subjectName = subjectName;
                this.subjectCodes = subjectsCodes();
                this.subjectGrade = subjectGrade;
                this.isRequiredSubject = isRequiredSubject;
            } else {
                System.out.println("유효한 범위가 아닙니다.");
            }
        } else {
            System.out.println("입력값이 올바르지 않습니다.");
        }
    }

    // ❗getter는 적절하나, setter 개선 필요:
    // - setSubjectScore에 유효성 검사 추가 필요
    // - setSubjectName에 null, 빈 문자열 체크 추가 필요
    // - setSubjectCodes는 제거 고려 (과목코드는 생성 후 변경 불필요)
//    --------------getter

    public String getSubjectCodes() {
        return subjectCodes;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectScore() {
        return subjectGrade;
    }

    public boolean getIsRequiredSubject() {
        return isRequiredSubject;
    }

    //    ----------------------------

    //    --------------setter


    public void setSubjectGrade(int subjectGrade) {
        if (subjectGrade <= 3 && subjectGrade >= 1) {
        this.subjectGrade = subjectGrade;
        }
    }

    public void setSubjectCodes(String subjectCodes) {
        this.subjectCodes = subjectCodes;
    }

    public void setRequiredSubject(boolean requiredSubject) {
        isRequiredSubject = requiredSubject;
    }

    public void setSubjectName(String subjectName) {
        if (subjectName != null && !subjectName.isEmpty()) {
        this.subjectName = subjectName;
        }
    }

    //    ----------------------------

    // ✅ 과목코드 생성 로직 개선 완료:
    // - private 메서드로 변경
    // - 과목명 첫글자 + 일련번호 형식 구현
    private String subjectsCodes(){
        String codeFormat = String.format("%03d",codeNumber);
        codeNumber++;
        String subjectIDs = subjectName.toUpperCase().charAt(0) + codeFormat;
        return subjectIDs;
    }


    // ❗ 메서드 재검토 필요
    // - 현재: 배열 기반 코드 관리
    // - 개선: Subject 인스턴스 단위로 코드 관리하는 방식 고려 > 삭제


    // ❗ 데이터 검증 추가 고려
    // - 과목명 유효성
    // - 학점 범위
    // - 코드 중복 여부
}


