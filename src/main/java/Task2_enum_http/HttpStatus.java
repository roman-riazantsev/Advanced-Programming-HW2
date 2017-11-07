package Task2_enum_http;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum HttpStatus {
    INFORMATIONAL(100, 199, "INFORMATIONAL_HTTP DESCRIPTION", new HttpInformationalHandler()),
    SUCCESS(200, 299, "SUCCESS_HTTP DESCRIPTION", new HttpSuccessHandler()),
    REDIRECTION(300, 399, "REDIRECTION_HTTP DESCRIPTION", new HttpRedirectionHandler()),
    CLIENT_ERROR(400, 499, "CLIENT_HTTP DESCRIPTION", new HttpClientHandler()),
    SERVER_ERROR(500, 599, "SUCCESS_HTTP DESCRIPTION", new HttpServerErrorHandler());

    private int min, max;
    private String httpDescription;
    private HttpHandler handler;

//    HttpStatus(int min, int max, String httpDescription, Class<? extends HttpHandler>) {
//        this.dbCode = dbCode;
//        this.russianDesc = russianDesc;
//    }



    public static HttpStatus getHttpStatus(int errorCode) {
        HttpStatus[] values = values();
        for (HttpStatus value : values) {
            if (errorCode >= value.min && errorCode <= value.max) {
                return value;
            }
        }
        throw new RuntimeException(errorCode + " not supported");
    }
}
