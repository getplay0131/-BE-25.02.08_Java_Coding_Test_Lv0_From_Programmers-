package CodingTest_250110;

//문자열이 주어지고 정수 2개를 받는다.
//해당 하는 문자의 인덱스 위치를 바꾼 문자열을 리턴하자!

public class 인덱스_바꾸기 {

    public String solution(String my_string, int num1, int num2) {
        String answer = "";
//        첫번째 시도
//        answer = my_string.replace((char)num1,(char) num2);
//        두번째 시도
//        for (int i = num1; i < my_string.length(); i++) {
//            for (int j = num2; j < my_string.length(); j++) {
//                answer =
//            }
//        }
//        ai에게 힌트 부탁해 세번째 시도
        char originalNum1 = my_string.charAt(num1);
        char originalNum2 = my_string.charAt(num2);
        answer =
                my_string.substring(0,num1) + originalNum2 + my_string.substring(num1 + 1, num2) +  originalNum1 + my_string.substring(num2+1,my_string.length());
        return answer;

    }

//두번째 방법 : 문자 배열로 변환후 작업 후 다시 스트링으로 변환 (직접적)
//새로운 객체를 메모리에 할당
//public String solution(String my_string, int num1, int num2) {
//    String answer = "";
//    char [] charArray = my_string.toCharArray();
//    char temp = charArray[num1];
//    charArray[num1] = charArray[num2];
//    charArray[num2] = temp;
//    return answer = new String(charArray);
//}

    //세번째 방법 : 문자 배열로 변환후 작업 후 다시 스트링으로 다른 메소드 이용 변환 (안정적)
// 정적 메서드, null 체크 수행, null 안전성 보장
//    public String solution(String my_string, int num1, int num2) {
//        String answer = "";
//        char [] charArray = my_string.toCharArray();
//        char temp = charArray[num1];
//        charArray[num1] = charArray[num2];
//        charArray[num2] = temp;
//        return answer = String.valueOf(charArray);
//    }

}