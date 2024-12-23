package Progress_241223.Exam2;

public class Movie extends Item{
    private String director;
    private String actor;

    Movie(String name, int price, String director, String actor){
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    public String getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독 : " + getDirector() + ", 배우 : " + getActor());
    }
}