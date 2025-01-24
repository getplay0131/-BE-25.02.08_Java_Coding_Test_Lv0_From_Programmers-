package Progress_250124.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    private ClassGrade() {
    }

    @Override
    public String toString() {
        if (this == BASIC) {
            return "BASIC";
        } else if (this == GOLD) {
            return "GOLD";
        } else if (this == DIAMOND) {
            return "DIAMOND";
        }
        return "UNKNOWN";
    }
}