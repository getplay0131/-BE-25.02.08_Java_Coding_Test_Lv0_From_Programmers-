package Progress_250124.ex3;

public class DiscountService3 {

    public int discount(Grade grade, int price) {
        int discountPrice = 0;

        if (grade == Grade.BASIC) {
            discountPrice = 10;
        } else if (grade == Grade.GOLD) {
            discountPrice = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("입력하신 " + grade.toString() + "등급은 할인 적용이 없습니다.");
        }
        return price * discountPrice / 100;
    }

    public void printDiscountPrice(Grade grade, int price) {
        discount(grade, price);
        System.out.println(grade + " 등급의 할인 금액 : " + price + "원");
    }

    public void printDiscountPrice(Grade[] grade, int[] price) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i].toString() + " 등급의 할인 금액 : " + price[i] + "원");
        }

    }
}