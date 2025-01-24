package Progress_250124.ref1;

import static Progress_250124.ref1.ClassGrade2.*;

public class ClassGradeRefMain1 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService4 discountService = new DiscountService4();
    int basic = discountService.discount(BASIC,price);
    int gold = discountService.discount(GOLD, price);
    int diamond = discountService.discount(DIAMOND, price);

    ClassGrade2[] grades = {BASIC,GOLD,DIAMOND};
    int [] gradeDiscount = {basic,gold,diamond};

    discountService.printDiscountPrice(grades,gradeDiscount);


    }


}