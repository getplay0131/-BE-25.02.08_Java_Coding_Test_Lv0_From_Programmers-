package Progress_241230.poly.ex6;

public class Dog extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println("강아지가 짖습니다!");
    }

    @Override
    public void move(AbstractAnimal animal) {
        super.move(animal);
    }
}