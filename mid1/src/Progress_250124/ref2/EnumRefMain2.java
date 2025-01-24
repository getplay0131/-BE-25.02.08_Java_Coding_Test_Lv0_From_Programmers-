package Progress_250124.ref2;

import static Progress_250124.ref2.GradeRef1.*;

public class EnumRefMain2 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService5 discountService = new DiscountService5();
    int basic = discountService.discount(BASIC,price);
    int gold = discountService.discount(GOLD, price);
    int diamond = discountService.discount(DIAMOND, price);

    GradeRef1[] grades = {BASIC,GOLD,DIAMOND};
    int [] gradeDiscount = {basic,gold,diamond};

    discountService.printDiscountPrice(grades,gradeDiscount);


    }


}