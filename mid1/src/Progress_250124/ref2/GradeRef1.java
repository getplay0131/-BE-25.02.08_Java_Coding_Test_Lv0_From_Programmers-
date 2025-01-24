package Progress_250124.ref2;

public enum GradeRef1 {
    BASIC(10), GOLD(20), DIAMOND(30);

    private  final int discountPercent;

    GradeRef1(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}