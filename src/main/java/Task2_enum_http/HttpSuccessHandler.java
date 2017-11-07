package Task2_enum_http;

public class HttpSuccessHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("--- success handle ---");
    }
}
