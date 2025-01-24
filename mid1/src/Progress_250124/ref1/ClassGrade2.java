package Progress_250124.ref1;

public class ClassGrade2 {
    public static final ClassGrade2 BASIC = new ClassGrade2(10);
    public static final ClassGrade2 GOLD = new ClassGrade2(20);
    public static final ClassGrade2 DIAMOND = new ClassGrade2(30);

    private final int discountPercent;

    private ClassGrade2(int discountPercent) {
    this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public String toString() {
        if (this == BASIC) {
            return "BASIC";
        } else if (this == GOLD) {
            return "GOLD";
        } else if (this == DIAMOND) {
            return "DIAMOND";
        }
        return "UNKNOWN";
    }
}