package Exam_241226_RPG;

public class GameMain {
    public static void main(String[] args) {
        Characteristic char1 = new Warrior();
        System.out.println(char1.getName() + "가 생성되었습니다.");
        char1.setHealth(80);
        char1.attack();
        char1.levelUp();


        Characteristic char2 = new Wizard();
        System.out.println(char2.getName() + "가 생성되었습니다.");
        char2.setHealth(50);
        char2.attack();
        char2.levelUp();

        System.out.println("전사에서 마법사로 전직합니다.");
        Characteristic charArray[] = {char1, char2};
        if (char2 instanceof Wizard wizard) {
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] instanceof Warrior warrior) {
                    System.out.println("전직이 성공하였습니다.");
                    warrior.setHealth(charArray[1].getHealth());
                    warrior.setIntelligence(wizard.getIntelligence());
                    warrior.setPower(wizard.getPower());
                    warrior.getLevel();
                    wizard.attack();
                    break;
                } else {
                    System.out.println("이미 전직하였습니다.");
                }
            }
        }
    }
}