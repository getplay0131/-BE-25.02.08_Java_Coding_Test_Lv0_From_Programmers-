package Progress_241223.Exam1;

public class Album extends Item {
private String artist;

public Album(String name, int price, String artist){
    super(name,price);
    this.artist = artist;
}

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" - artist : " + artist);
    }
}