package Progress_250124.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();
    int basic = discountService.discount("BASIC", price);
    int gold = discountService.discount("GOLD", price);
    int diamond = discountService.discount("DIAMOND", price);

    String [] grades = {"BASIC","GOLD","DIAMOND"};
    int [] gradeDiscount = {basic,gold,diamond};

    discountService.printDiscountPrice(grades,gradeDiscount);


//    discountService.printDiscountPrice("BASIC",basic);
//    discountService.printDiscountPrice("GOLD",gold);
//    discountService.printDiscountPrice("DIAMOND",diamond);

    }


}