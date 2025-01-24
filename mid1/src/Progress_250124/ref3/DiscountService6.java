package Progress_250124.ref3;

import Progress_250124.ref3.GradeRef2;

public class DiscountService6 {

    public int discount(GradeRef2 grade, int price) {

        return grade.discount(price);
    }

    public void printDiscountPrice(GradeRef2 grade, int price) {
        grade.discount(price);
        System.out.println(grade + " 등급의 할인 금액 : " + price + "원");
    }

    public void printDiscountPrice(GradeRef2[] grade, int[] price) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i].toString() + " 등급의 할인 금액 : " + price[i] + "원");
        }

    }
}