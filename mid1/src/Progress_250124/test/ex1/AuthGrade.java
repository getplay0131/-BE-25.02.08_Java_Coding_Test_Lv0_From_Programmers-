package Progress_250124.test.ex1;

public enum AuthGrade {
GUEST("손님",1),LOGIN("로그인 회원",2),ADMIN("관리자",3);

private final int level;
private final String description;


    AuthGrade(String description, int level) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public void printInfo(AuthGrade grades){
        System.out.println("등급 :  = " + grades.name() + ", level : " + grades.getLevel() + ", description : " + grades.getDescription() );
    }

    public void printMsg(){
        System.out.println("당신의 등급은 " + this.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
    }

    public void compareGrade(AuthGrade grade){
        if (GUEST.equals(grade)) {
            printMsg();
            System.out.println("- 메인 화면");
        } else if (LOGIN.equals(grade)) {
            printMsg();
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if (ADMIN.equals(grade)) {
            printMsg();
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        } else {
            System.out.println("올바른 입력값이 아닙니다. 다시 시도해 주세요.");
        }
    }
}