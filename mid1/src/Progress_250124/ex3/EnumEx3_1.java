package Progress_250124.ex3;

import static Progress_250124.ex3.Grade.*;

public class EnumEx3_1 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService3 discountService = new DiscountService3();
    int basic = discountService.discount(BASIC, price);
    int gold = discountService.discount(GOLD, price);
    int diamond = discountService.discount(DIAMOND, price);
//    ClassGrade newClassGrade = new ClassGrade();
//    int result = discountService.discount(newClassGrade,price);
//        System.out.println("newCLassGrade 등급의 할인 금액 = " + result);


    Grade[] grades = {Grade.BASIC,Grade.GOLD,Grade.DIAMOND};
    int [] gradeDiscount = {basic,gold,diamond};

    discountService.printDiscountPrice(grades,gradeDiscount);


    }


}