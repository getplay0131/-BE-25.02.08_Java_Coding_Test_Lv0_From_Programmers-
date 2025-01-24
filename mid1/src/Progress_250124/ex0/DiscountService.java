package Progress_250124.ex0;

public class DiscountService {

    public int discount(String grade, int price){
        int discountPrice = 0;

        if (grade.equals("BASIC")) {
            discountPrice = 10;
        } else if (grade.equals("GOLD")) {
            discountPrice = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPrice = 30;
        } else {
            System.out.println("입력하신 " + grade + "등급은 할인 적용이 없습니다.");
        }
        return price * discountPrice / 100;
    }
    
    public void printDiscountPrice(String grade, int price){
        System.out.println(grade + " 등급의 할인 금액 : " + price + "원");
    }

    public void printDiscountPrice(String [] grade, int [] price){
        for (int i = 0; i < grade.length; i++) {
        System.out.println(grade[i] + " 등급의 할인 금액 : " + price[i] + "원");
        }

    }
}