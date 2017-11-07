package Task2_enum_http;

public class HttpServerErrorHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("--- error handle ---");
    }
}
