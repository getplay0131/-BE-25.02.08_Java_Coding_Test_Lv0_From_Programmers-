package Progress_241230.poly.ex6;

public class AnimalMain {
    public static void main(String[] args) {
    Bird bird = new Bird();
    Chicken chicken = new Chicken();
    Dog dog = new Dog();
    animalSound(dog);
    animalSound(bird);
    animalSound(chicken);

    animalFly(bird);
    animalFly(chicken);

    }

    public  static  void animalSound(AbstractAnimal animal){
        System.out.println(" --------------------------- ");
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println(" =========================== ");
    }

    public  static  void animalFly(Fly fly){
        System.out.println(" --------------------------- ");
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
        System.out.println(" =========================== ");
    }
}