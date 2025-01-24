package Progress_250124.ref3;

import Progress_250124.ref3.GradeRef2;

public enum GradeRef2 {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(35);

    private  final int discountPercent;

    GradeRef2(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100 ;
    }

    public void printDiscountPrice(GradeRef2 grade, int price) {
        System.out.println(grade + " 등급의 할인 금액 : " + discount(price) + "원");
    }

    public void printDiscountPrice(GradeRef2[] grade, int[] price) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i].toString() + " 등급의 할인 금액 : " + discount(price[i]) + "원");
        }
    }

    public void printDiscountPrice(GradeRef2[] grade, int price) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i].name() + " 등급의 할인 금액 : " + discount(price) + "원");
        }
    }
}