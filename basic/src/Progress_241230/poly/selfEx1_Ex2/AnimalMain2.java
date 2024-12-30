package Progress_241230.poly.selfEx1_Ex2;

public class AnimalMain2 {
    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        Animal cow = new Cow();
//        Duck duck = new Duck();
//        dog.animalSound(dog);
//        cat.animalSound(cat);
//        cow.animalSound(cow);
//        duck.animalSound(duck);


        Animal [] animals = {new Dog(), new Cat(), new Cow(), new Duck()};
//        for (int i = 0; i < animals.length; i++) {
//            animalSound(animals[i]);
//        }

        for (Animal animal : animals) {
            animal.animalSound(animal);
        }

    }


}
