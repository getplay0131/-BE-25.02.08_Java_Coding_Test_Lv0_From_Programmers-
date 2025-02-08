package Exam_250208;

//체크포인트 : 자바의 버전별 지원 메소드, 마지막 숫자 및 값 처리 방법, 0처리 방법

public class 프로그래머스_숨어있는숫자의덧셈_2 {
    public int solution(String my_string) {
        int answer = 0;
//        1단계. 먼저 캐릭터 배열로 바꾸기
        StringBuilder builder = new StringBuilder();
        char[] charArray = my_string.toCharArray();
//        2단계. 캐릭터의 값이 숫자인지 확인한다
        for (int i = 0; i < charArray.length; i++) {
//        2.5단계. 해당 인덱스의 값이 숫자인지 확인
//        3단계. 숫자라면 스트링 빌더에 저장하고, 아니라면 저장된 값을 결과 값에 변환 후 더한다.
            if ((charArray[i]-'0') >=0 && (charArray[i]-'0') <= 9 ) {
                builder.append(charArray[i]-'0');
//            스트링빌더의 isEmpty 메서드는 자바 버전 15이상으로 프로그래머스는 미지원한다.
            } else if (builder.length() == 0) {
                continue;
            } else {
                answer += Integer.parseInt(builder.toString());
                builder.setLength(0);
            }
        }
        if (builder.length() > 0) {
            answer += Integer.parseInt(builder.toString());
        }
//        4단계. 디버깅용 결과값 출력해보기
        System.out.println("answer = " + answer);
        return answer;
    }

//    디버깅용 메인 클래스
    public static void main(String[] args) {
//    문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를
//    완성해주세요.
        String my_string = "1a2b3c4d123Z";
        int answer = 0;
//        1단계. 먼저 캐릭터 배열로 바꾸기
        StringBuilder builder = new StringBuilder();
        char[] charArray = my_string.toCharArray();
//        2단계. 캐릭터의 값이 숫자인지 확인한다
        for (int i = 0; i < charArray.length; i++) {
//        2.5단계. 해당 인덱스의 값이 숫자인지 확인
//        3단계. 숫자라면 스트링 빌더에 저장하고, 아니라면 저장된 값을 결과 값에 변환 후 더한다.
            if ((charArray[i]-'0') >=0 && (charArray[i]-'0') <= 9 ) {
            builder.append(charArray[i]-'0');
//            스트링빌더의 isEmpty 메서드는 자바 버전 15이상으로 프로그래머스는 미지원한다.
            } else if (builder.length() == 0) {
                continue;
            } else {
                answer += Integer.parseInt(builder.toString());
                builder.setLength(0);
            }
        }
        if (builder.length() > 0) {
            answer += Integer.parseInt(builder.toString());
        }
//        4단계. 디버깅용 결과값 출력해보기
        System.out.println("answer = " + answer);
    }
}