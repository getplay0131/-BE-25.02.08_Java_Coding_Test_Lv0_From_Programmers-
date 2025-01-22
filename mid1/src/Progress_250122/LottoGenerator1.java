package Progress_250122;

import java.util.Random;

public class LottoGenerator1 {
//    로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
//    로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
//각 숫자는 중복되면 안된다.
//실행할 때 마다 결과가 달라야 한다
    private final int ARRAYLENGTH = 6;
    private int count = 0 ;
    private int [] numArray = new int[ARRAYLENGTH];
    private final Random random = new Random();

    public int [] generate(){
        while (count < 6){
            int num = random.nextInt(45)+1;
            if ( !numCheck(num)) {
                numArray[count++] = num;
            }
        }
        return numArray;
    }

    public boolean numCheck(int nums){
        for (int i = 0; i < count; i++) {
            if (numArray[i] == nums) {
                return true;
            }
        }
        return false;
    }


}

