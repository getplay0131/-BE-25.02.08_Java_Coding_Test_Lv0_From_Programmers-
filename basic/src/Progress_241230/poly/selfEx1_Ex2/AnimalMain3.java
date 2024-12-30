package Progress_241230.poly.selfEx1_Ex2;

public class AnimalMain3 {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Cow(),new Duck()};
        for (Animal animal : animals) {
            animal.animalSound(animal);
        }

    }

    private static void animalSound(Animal animal) {
        System.out.println("동물 울음 소리 출력 시작");
        animal.sound();
        System.out.println("동물 울음 소리 출력 종료");
        System.out.println(" ===================== ");
    }


}
