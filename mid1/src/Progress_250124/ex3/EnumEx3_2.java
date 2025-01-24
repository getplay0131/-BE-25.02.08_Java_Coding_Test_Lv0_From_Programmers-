package Progress_250124.ex3;

public class EnumEx3_2 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService3 discountService = new DiscountService3();
    int basic = discountService.discount(Grade.BASIC, price);
    int gold = discountService.discount(Grade.GOLD, price);
    int diamond = discountService.discount(Grade.DIAMOND, price);
//        Grade myGrade = new Grade(); //enum 생성 불가         double result = discountService.discount(myGrade, price);         System.out.println("result price: " + result);


    Grade [] grades = {Grade.BASIC,Grade.GOLD,Grade.DIAMOND};
    int [] gradeDiscount = {basic,gold,diamond};

    discountService.printDiscountPrice(grades,gradeDiscount);


    }


}