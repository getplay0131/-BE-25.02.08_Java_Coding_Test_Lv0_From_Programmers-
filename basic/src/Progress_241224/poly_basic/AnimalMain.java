package Progress_241224.poly_basic;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog1 = new Dog();
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal1 : animals) {
        animal.choiceAnimal(animal1);
        }
//    animal.sound();

    }


}
