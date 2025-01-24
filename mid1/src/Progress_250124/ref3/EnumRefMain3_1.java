package Progress_250124.ref3;

import static Progress_250124.ref3.GradeRef2.*;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService6 discountService = new DiscountService6();
    int basic = discountService.discount(BASIC,price);
    int gold = discountService.discount(GOLD, price);
    int diamond = discountService.discount(DIAMOND, price);

    GradeRef2[] grades = {BASIC,GOLD,DIAMOND};
    int [] gradeDiscount = {basic,gold,diamond};

    discountService.printDiscountPrice(grades,gradeDiscount);


    }


}