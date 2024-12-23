package Progress_241223.Exam1;

public class Movie extends Item {
private String director;
private String actor;

public Movie(String name, int price, String director, String actor){
    super(name,price);
    this.director = director;
    this.actor = actor;
}

public String getDirector(){
    return director;
}

public String getActor(){
    return actor;
}

public void printInfo(){
    super.printInfo();
    System.out.println("- 감독 : " + director + ", 배우 : " + actor);
}


}