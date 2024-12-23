package Progress_241223.Exam2;

import Progress_241223.Exam2.Item;

public class Book extends Item {
private String author;
private String isbn;

Book(String name, int price, String author, String isbn){
    super(name,price); // 부모 클래스에 값 전달
    this.author = author;
    this.isbn = isbn;
}

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자 : " + getAuthor() + ", isbn : " + getIsbn());
    }
}