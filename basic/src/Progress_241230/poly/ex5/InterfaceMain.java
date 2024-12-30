package Progress_241230.poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
    InterfaceAnimal animal [] = {new Cat(), new Dog(), new Cow()};
        for (InterfaceAnimal interfaceAnimal : animal) {
            interfaceAnimal.sound();
            interfaceAnimal.move();
        }
    }


}