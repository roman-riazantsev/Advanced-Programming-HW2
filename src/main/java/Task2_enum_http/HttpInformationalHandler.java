package Task2_enum_http;

public class HttpInformationalHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("--- informational handle ---");
    }
}
