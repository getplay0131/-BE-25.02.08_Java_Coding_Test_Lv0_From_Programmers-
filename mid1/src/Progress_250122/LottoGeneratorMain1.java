package Progress_250122;

public class LottoGeneratorMain1 {
    public static void main(String[] args) {
    LottoGenerator1 generator = new LottoGenerator1();
    int [] lottoArr = generator.generate();
            System.out.print("로또 번호 : ");
        for (int i : lottoArr) {
            System.out.print(i + " ");
        }
    }
}