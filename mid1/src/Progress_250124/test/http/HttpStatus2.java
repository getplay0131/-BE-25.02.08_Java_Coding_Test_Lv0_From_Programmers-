//참고: HTTP 상태 코드는 200 ~ 299사이의 숫자를 성공으로 인정한다

package Progress_250124.test.http;

public enum HttpStatus2 {
OK(200,"OK", true),BAD_REQUEST(400,"Bad Request",false),NOT_FOUND(404,"Not Found",false),INTERNAL_SERVER_ERROR(500,"Internal " +
            "Servar " +
            "Error",false);

private final int code;
private final String message;
private final boolean isSuccess;


    HttpStatus2(int code, String message, boolean isSuccess) {
        this.code = code;
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    //    public void printInfo(HttpStatus http){
//        System.out.println("등급 :  = " + http.name() + ", code : " + http.getCode() + ", message : " + http.getMessage() );
//    }

    private void printMsg(HttpStatus2 httpStatus){
        System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage());
        System.out.println("isSuccess = " + httpStatus.isSuccess);
    }

    public static void compareCode(int codeStat){
        for (HttpStatus2 value : values()) {
            if (value.getCode() == codeStat) {
                value.printMsg(value);
                return;
            }
        }
    }
}