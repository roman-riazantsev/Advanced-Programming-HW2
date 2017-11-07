package Task2_enum_http;

public class HttpErrorCodeTest {
    public static void main(String[] args) {
        System.out.println(HttpStatus.getHttpStatus(124).getHttpDescription());
        System.out.println(HttpStatus.getHttpStatus(252).getHttpDescription());
        System.out.println(HttpStatus.getHttpStatus(345).getHttpDescription());
        System.out.println(HttpStatus.getHttpStatus(453).getHttpDescription());
        HttpStatus.getHttpStatus(101).getHandler().handle();
        System.out.println(HttpStatus.getHttpStatus(503).getHttpDescription());
        System.out.println(HttpStatus.CLIENT_ERROR);
        System.out.println(HttpStatus.SERVER_ERROR);
        System.out.println(HttpStatus.REDIRECTION);
        System.out.println(HttpStatus.SUCCESS);
        System.out.println(HttpStatus.INFORMATIONAL);


        System.out.println(HttpStatus.getHttpStatus(666).getHttpDescription());
    }
}
