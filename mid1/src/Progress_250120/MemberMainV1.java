package Progress_250120;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원1", address);
        MemberV1 memberB = new MemberV1("회원2", address);

        printInfo(memberA, memberB);
        memberB.getAddress().setValue("부산");
        System.out.println("부산 => memberB.address");
        printInfo(memberA, memberB);

    }

    public static void printInfo(Object a, Object b) {
        if (a != null && b != null) {
            System.out.println("memberA = " + a);
            System.out.println("memberB = " + b);
        }
    }
}