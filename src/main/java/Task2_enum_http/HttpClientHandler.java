package Task2_enum_http;

public class HttpClientHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("--- client handle ---");
    }
}
