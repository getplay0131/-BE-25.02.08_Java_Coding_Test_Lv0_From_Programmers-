package CodingTest_250110;

//주사위의 개수
//직육면체 모양의 상자에 정육면체 모양의 상자를 최대한 많이 채우기
//주사위 모서리의 길이 : n
//박스를 배열로 표시하며 0번 인덱스 가로, 1번 인덱스 세로, 2번 인덱스 높이
//tkdwkdp 들어갈 수 있는 최대 주사위의 개수를 리턴하기

public class 주사위의_개수 {
//    public int solution(int[] box, int n) {
//        int answer = 0;
//    int idx0 = 0;
//    int idx1 = 0;
//    int idx2 = 0;
//
//        for (int i = 0; i < box.length; i++) {
//            idx0 = box[0] / n;
//            idx1 = box[1] / n;
//            idx2 = box[2] / n;
//            answer = idx0 * idx1 * idx2;
//        }
//        return answer;
//    }

//    public int solution(int[] box, int n) {
//        int answer = 0;
//        return answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
//    }

        public int solution(int[] box, int n) {
        int answer = 1;

        for (int i = 0; i < box.length; i++) {
            answer *= box[i] / n;
        }
        return answer;
    }


}