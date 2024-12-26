package Exam_241226_RPG;

public class Characteristic {
    //    name 필드가 final이 아닙니다. >> 개선 완료
    private final String name;
//    캐릭터의 공통 속성인 health가 구현되어 있지 않습니다.
    protected int health;
    protected int level;
    private static final int MAX_HEALTH = 100;

    public Characteristic(String name) {
        this.name = name;
    }

    public Characteristic(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public static int getMaxHealth() {
        return MAX_HEALTH;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp(){
        this.level++;
        this.health = Math.min(health+5,MAX_HEALTH);
        System.out.println(getName() + "의 레벨이 " + getLevel() + "로 상승하며 체력이 " + getHealth() + "로 증가하였습니다.");
    }

    public void attack() {
        System.out.println(" ============================= ");
        System.out.println("게임을 시작합니다.");
        System.out.println(getName() + "가 검으로 적을 공격합니다!");
        System.out.println("현재 스탯");
    }
}