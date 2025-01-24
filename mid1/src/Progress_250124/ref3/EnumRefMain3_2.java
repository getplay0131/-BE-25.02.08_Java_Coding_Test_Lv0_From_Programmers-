package Progress_250124.ref3;

import static Progress_250124.ref3.GradeRef2.*;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
    int price = 10000;

    GradeRef2[] grades = {BASIC,GOLD,DIAMOND};

        for (GradeRef2 grade : grades) {
            grade.printDiscountPrice(grade,price);
        }

    }


}