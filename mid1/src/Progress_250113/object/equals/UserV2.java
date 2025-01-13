package Progress_250113.object.equals;

import java.util.Objects;

public class UserV2 {
private String id;


    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
////        boolean check = false;
////        if (obj instanceof UserV2 user1) {
////            System.out.println("id = " + this.id);
////            System.out.println("inputId = " + user1.id);
////            check = this.id.equals(user1.id);
////        }
////            return check;
//
//        UserV2 user = (UserV2) obj;
//        System.out.println("id = " + this.id);
//        System.out.println("inputId = " + user.id);
//        return id.equals(user.id);
//    }


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

}