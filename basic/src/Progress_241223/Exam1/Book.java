package Progress_241223.Exam1;

public class Book extends Item {
private String author;
private String isbn;


    public Book(String name, int price, String author, String isbn){
        super(name,price);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println(" - 저자 : " + author + ", isbn = " + isbn);
    }
}