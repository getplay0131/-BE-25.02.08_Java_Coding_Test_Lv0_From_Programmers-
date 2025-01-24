package Progress_250124.ex2;

public class DiscountService2 {

    public int discount(ClassGrade grade, int price) {
        int discountPrice = 0;

        if (grade.equals(ClassGrade.BASIC)) {
            discountPrice = 10;
        } else if (grade.equals(ClassGrade.GOLD)) {
            discountPrice = 20;
        } else if (grade.equals(ClassGrade.DIAMOND)) {
            discountPrice = 30;
        } else {
            System.out.println("입력하신 " + grade.toString() + "등급은 할인 적용이 없습니다.");
        }
        return price * discountPrice / 100;
    }

    public void printDiscountPrice(ClassGrade grade, int price) {
        discount(grade, price);
        System.out.println(grade + " 등급의 할인 금액 : " + price + "원");
    }

    public void printDiscountPrice(ClassGrade[] grade, int[] price) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i].toString() + " 등급의 할인 금액 : " + price[i] + "원");
        }

    }
}