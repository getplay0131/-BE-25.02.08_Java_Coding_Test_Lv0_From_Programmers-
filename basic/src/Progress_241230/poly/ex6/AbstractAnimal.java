package Progress_241230.poly.ex6;

public abstract class AbstractAnimal {
public abstract void sound();
public  void move(AbstractAnimal animal){
    System.out.println(animal + "이(가) 저 멀리로 이동합니다!");
}
}