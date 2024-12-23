package Progress_241223.Exam1;

public class ShopMain {
    public static void main(String[] args) {
    Book book = new Book("JAVA", 10000, "han","12345");
    Album album = new Album("앨범1", 15000, "seo");
    Movie movie = new Movie("영화1", 10000,"감독1","배우1");

    book.printInfo();
    album.printInfo();
    movie.printInfo();

    int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합 : " + sum);
    }
}