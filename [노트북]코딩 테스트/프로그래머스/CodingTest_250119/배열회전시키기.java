package CodingTest_250119;

public class 배열회전시키기 {
//    배열 순서 정렬 로직을 쓰면 될거 같고, 만약 방향이 왼쪽으면 0번 인덱스의 값을 제일 마지막으로, 오른쪽이면 마지막 값을 0번 인덱스로 설정하면 될거같다.

    public int[] solution(int[] numbers, String direction) {
//        매개 변수의 길이를 결과 배열에 크기로 지정
        int[] answer = new int[numbers.length];
//        타겟값을 보관할 변수를 선언
        int temp = 0;
        boolean isLeft = false;

//        배열 내 이동 값 판단을 위한 조건문을 이용한 값 저장
        if (direction != null) {
            if (direction.equals("left")) {
                temp = numbers[0];
                isLeft = true;
            } else if (direction.equals("right")) {
                temp = numbers[numbers.length - 1];
            }
        }

//        반복문 이용 배열 밀기
        for (int i = 0; i < numbers.length - 1; i++) {
            if (isLeft) {
                answer[i] = numbers[i + 1];
                answer[numbers.length - 1] = temp;
            } else {
                answer[i + 1] = numbers[i];
                answer[0] = temp;
            }
        }
        return answer;
    }
}