package Progress_250120;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원1", address);
        MemberV2 memberB = new MemberV2("회원2", address);

        printInfo(memberA, memberB);
        System.out.println("부산 => memberB.address");
        memberA.setAddress(new ImmutableAddress("대구"));
        memberB.setAddress(new ImmutableAddress("부산"));
        printInfo(memberA, memberB);

    }

    public static void printInfo(Object a, Object b) {
        if (a != null && b != null) {
            System.out.println("memberA = " + a + "address = " + System.identityHashCode(a));
            System.out.println("memberB = " + b + "address = " + System.identityHashCode(b));
        }
    }
}