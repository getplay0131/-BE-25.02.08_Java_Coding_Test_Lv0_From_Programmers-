package Progress_241223.Exam1;

public class Item {
private String name;
private int price;

public Item(String name, int price){
    this.name = name;
    this.price = price;
}

public int getPrice(){
    return price;
}

public void printInfo(){
    System.out.println("name : " + name + ", price = " + price);
}
}