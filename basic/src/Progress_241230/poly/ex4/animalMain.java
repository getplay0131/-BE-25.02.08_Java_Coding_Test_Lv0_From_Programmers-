package Progress_241230.poly.ex4;

public class animalMain {
    public static void main(String[] args) {
    AbstractAnimal [] animals = {new Dog(),new Cat(), new Cow(), new Duck()};

        for (AbstractAnimal animal : animals) {
            animal.sound();
            animal.move();
        }
    }
}