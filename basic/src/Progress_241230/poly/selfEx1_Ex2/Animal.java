package Progress_241230.poly.selfEx1_Ex2;

public class Animal {

    public void sound(){
        System.out.println("동물 울음 소리");
    }

    public void animalSound(Animal animal){
        System.out.println("동물 울음 소리 출력 시작");
        animal.sound();
        System.out.println("동물 울음 소리 출력 종료");
        System.out.println(" ===================== ");
    }
}