package Exam_241226_RPG;

public class Warrior extends Characteristic {
    private int power = 50;
    private int intelligence = 10;

    public Warrior() {
        super("전사");
    }

    @Override
    public final String getName() {
        return super.getName();
    }

    public final int getIntelligence() {
        return intelligence;
    }

    public final int getPower() {
        return power;
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void statUpgrade(){
        this.power += 3;
        this.intelligence += 1;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("힘 : " + getPower() + ", 지능 :" + getIntelligence() + ", 현재 체력 : " + getHealth() +", 최대 체력 " +
                ": " + getMaxHealth() + ", 현재 레벨 : " + getLevel());
        System.out.println(getName() + " 가 공격하여 " + battle() + "의 데미지를 입혔습니다.");
        statUpgrade();
        System.out.println(" ============================= ");
    }

    public int battle(){
        int damage = 0;
        damage = (int) (getPower() * 0.1);
        return damage;
    }
}