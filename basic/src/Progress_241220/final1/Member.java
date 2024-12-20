package Progress_241220.final1;

public class Member {
private final String id ;
private String name;

public Member(String id, String name){
    this.id = id;
    this.name = name;
}

public void changeData(String id, String name){
//    this.id = id; //final이니까 재 할당 불가
    this.name = name;
}

public void print(){
    System.out.println("id : " + id + ", name : " + name);
}
}