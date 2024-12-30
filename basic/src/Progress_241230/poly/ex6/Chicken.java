package Progress_241230.poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void fly() {
        System.out.println("치킨이..아니 닭이 저 멀리 날아옵니다. 기름 냄새를 풍기며..");
    }

    @Override
    public void sound() {
        System.out.println("촤르르르륵... 배달이요! 바삭!");
    }
}