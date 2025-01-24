package Progress_250124.ex2;

public class StringGradeEx2_2 {
    public static void main(String[] args) {
    int price = 10000;

    DiscountService2 discountService = new DiscountService2();
    int basic = discountService.discount(ClassGrade.BASIC, price);
    int gold = discountService.discount(ClassGrade.GOLD, price);
    int diamond = discountService.discount(ClassGrade.DIAMOND, price);
//    ClassGrade newClassGrade = new ClassGrade();
//    int result = discountService.discount(newClassGrade,price);
//        System.out.println("newCLassGrade 등급의 할인 금액 = " + result);
    
    
//    ClassGrade [] grades = {ClassGrade.BASIC,ClassGrade.GOLD,ClassGrade.DIAMOND};
//    int [] gradeDiscount = {basic,gold,diamond};
//
//    discountService.printDiscountPrice(grades,gradeDiscount);


    }


}