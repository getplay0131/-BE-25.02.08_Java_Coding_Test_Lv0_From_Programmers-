package Progress_250124.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService1 discountService = new DiscountService1();
    int basic = discountService.discount(StringGrade.BASIC, price);
    int gold = discountService.discount(StringGrade.GOLD, price);
    int diamond = discountService.discount(StringGrade.DIAMOND, price);

    String [] grades = {StringGrade.BASIC,StringGrade.GOLD,StringGrade.DIAMOND};
    int [] gradeDiscount = {basic,gold,diamond};

    discountService.printDiscountPrice(grades,gradeDiscount);


//    discountService.printDiscountPrice("BASIC",basic);
//    discountService.printDiscountPrice("GOLD",gold);
//    discountService.printDiscountPrice("DIAMOND",diamond);

    }


}