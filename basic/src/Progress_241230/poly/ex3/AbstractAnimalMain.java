package Progress_241230.poly.ex3;

public class AbstractAnimalMain {
    public static void main(String[] args) {
AbstractAnimal [] animals = {new Dog(), new Cat(), new Cow(), new Duck()};
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            animal.move();
        }

    }

    private  static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 울음 소리 출력 시작");
        animal.sound();
        System.out.println("동물 울음 소리 출력 종료");
        System.out.println(" ===================== ");
    }
}