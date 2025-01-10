package CodingTest_250110;

//숫자를 알파벳으로 바꾸자
//a = 0 / b = 1 ....
//숫자를 입력받고 숫자 앞자리를 해당 문자열로 치환후 반환하면 되는데,.. 이거 하드코딩 될거같은데..노가다..
public class 외계행성의_나이 {
//
//    첫번째 방법
public String solution(int age) {
//    1단계 : 입력 받은 숫자 자리별 나누기
    int count = 0;
    int num1 = 0, num2 = 0, num3 = 0, num4 = 0;

    if (age != 0) {
        num1 = age % 10;
        count++;

        if (age >= 10) {
            num2 = (age / 10) % 10;
            count++;


            if (age >= 100) {
                num3 = (age / 100) % 10;
                count++;

                if (age >= 1000) {
                    num4 = (age / 1000) % 10;
                    count++;
                }
            }
        }
    }
    int[] numArray = new int[count];
    int idx = 0;

//    if (age != 0 && age % 10 != 0) {
//        numArray[count] = num1;
//        numArray[count] = num2;
//
//        if (age > 99) {
//            numArray[count] = num3;
//
//            if (age > 999) {
//                numArray[count] = num4;
//            }
//        }
//    }
    if (age >= 1000) {
        numArray[idx++] = num4;
    }

    if (age >= 100) {
        numArray[idx++] = num3;
    }

    if (age >= 10) {
        numArray[idx++] = num2;
    }

    if (age >= 1) {
        numArray[idx++] = num1;
    }

    String answer = "";
    for (int i = 0; i < numArray.length; i++) {
        if (numArray[i] == 0) {
            answer += "a";
        } else if (numArray[i] == 1) {
            answer += "b";
        } else if (numArray[i] == 2) {
            answer += "c";
        } else if (numArray[i] == 3) {
            answer += "d";
        } else if (numArray[i] == 4) {
            answer += "e";
        } else if (numArray[i] == 5) {
            answer += "f";
        } else if (numArray[i] == 6) {
            answer += "g";
        } else if (numArray[i] == 7) {
            answer += "h";
        } else if (numArray[i] == 8) {
            answer += "i";
        } else if (numArray[i] == 9) {
            answer += "j";
        }
    }
    return answer;
}

//두번째 방법
//public String solution(int age) {
//    String ageStr = String.valueOf(age);
//    String answer = "";
//    for (char c : ageStr.toCharArray()) {
//        if (c == '0') {
//            answer += '0' + '0';
//        }
//    }
//
//    return answer;
//}

//세번째 방법 = >나의 코드가 아닌 ai가 알려준 코드..
//public String solution(int age) {
//   String ageStr = String.valueOf(age);
//    String answer = "";
//    for (char c : ageStr.toCharArray()) {
//        answer += (char)(c - '0' + 'a');
//    }
//    return answer;
//}

}
