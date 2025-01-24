package Progress_250124.test.ex1;

import Progress_250124.ref3.GradeRef2;

import static Progress_250124.test.ex1.AuthGrade.*;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        printArrays(grades);

    }

    public static void printArrays(AuthGrade[] grades) {
        for (AuthGrade grade : grades) {
            grade.printInfo(grade);
        }
    }
}