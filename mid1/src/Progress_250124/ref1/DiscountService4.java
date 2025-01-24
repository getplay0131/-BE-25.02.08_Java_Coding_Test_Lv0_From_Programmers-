package Progress_250124.ref1;

public class DiscountService4 {

    public int discount(ClassGrade2 grade, int price) {

        return price * grade.getDiscountPercent() / 100 ;
    }

    public void printDiscountPrice(ClassGrade2 grade, int price) {
        discount(grade, price);
        System.out.println(grade + " 등급의 할인 금액 : " + price + "원");
    }

    public void printDiscountPrice(ClassGrade2[] grade, int[] price) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i].toString() + " 등급의 할인 금액 : " + price[i] + "원");
        }

    }
}