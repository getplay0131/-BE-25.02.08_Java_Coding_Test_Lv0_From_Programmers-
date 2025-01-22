package Progress_250122;

public class LottoGeneratorMain {
    public static void main(String[] args) {
    LottoGenerator generator = new LottoGenerator();
    int [] lottoArr = generator.generate();
            System.out.print("로또 번호 : ");
        for (int i : lottoArr) {
            System.out.print(i + " ");
        }
    }
}