package Progress_250122;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] numArray = new int[6];
    private int count = 0;

    public int[] generate() {
        for (int i = 0; i < numArray.length; ) {
            int num = random.nextInt(45) + 1;
            if (checkNum(num)) {
                numArray[i] = num;
                count++;
                i++;
            }
        }
        return numArray;
    }

    public boolean checkNum(int num) {
        for (int i = 0; i < count; i++) {
            if (numArray[i] == num) {
                return false;
            }
        }
        return true;
    }
}