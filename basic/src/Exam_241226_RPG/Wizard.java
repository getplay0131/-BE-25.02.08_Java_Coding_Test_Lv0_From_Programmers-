package Exam_241226_RPG;

public class Wizard extends Characteristic{
    private int power = 10;
    private int intelligence = 50;

    public Wizard(){
        super("마법사");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public final int getPower() {
        return power;
    }

    public final int getIntelligence() {
        return intelligence;
    }

    public final void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void statUpgrade(){
        this.power += 1;
        this.intelligence += 3;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("힘 : " + getPower() + ", 지능 :" + getIntelligence() + ", 현재 체력:" + getHealth() +", 최대 체력 : " + getMaxHealth() + ", 현재 레벨 : " + getLevel());
        System.out.println(getName() + " 가 공격하여 " + battle() + "의 데미지를 입혔습니다.");
        statUpgrade();
        System.out.println(" ============================= ");
    }

    public int battle(){
        int damage = 0;
        damage = (int) (getIntelligence() * 0.1);
        return damage;
    }
}