package Progress_250124.ex2;

public class StringGradeEx2_1 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService2 discountService = new DiscountService2();
    int basic = discountService.discount(ClassGrade.BASIC, price);
    int gold = discountService.discount(ClassGrade.GOLD, price);
    int diamond = discountService.discount(ClassGrade.DIAMOND, price);

    ClassGrade [] grades = {ClassGrade.BASIC,ClassGrade.GOLD,ClassGrade.DIAMOND};
    int [] gradeDiscount = {basic,gold,diamond};

    discountService.printDiscountPrice(grades,gradeDiscount);


    }


}