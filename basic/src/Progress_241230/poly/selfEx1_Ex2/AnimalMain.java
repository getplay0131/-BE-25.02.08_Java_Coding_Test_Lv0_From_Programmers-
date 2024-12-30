package Progress_241230.poly.selfEx1_Ex2;

public class AnimalMain {
    public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal cow = new Cow();

animalSound(dog);
animalSound(cat);
animalSound(cow);

    }

    private static void animalSound(Animal animal) {
        System.out.println("동물 울음 소리 출력 시작");
        animal.sound();
        System.out.println("동물 울음 소리 출력 종료");
        System.out.println(" ===================== ");
    }


}
