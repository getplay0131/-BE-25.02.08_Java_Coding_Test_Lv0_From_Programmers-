package Progress_241223.Exam2;

public class Album extends Item {
private String artist;

Album(String name, int price, String artist){
    super(name,price);
    this.artist = artist;
}

public String getArtist(){
    return artist;
}

    @Override
    public void print() {
        super.print();
        System.out.println("- artist : " + getArtist());
    }
}