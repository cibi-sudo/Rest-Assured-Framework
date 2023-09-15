package endpoints;

public class Routes {
    static String baseUrl = "https://petstore.swagger.io/v2";
    public static String postUrl = baseUrl+"/user";
    public static String getUrl = postUrl+"/{username}";
    public static String putUrl = getUrl;
    public static String deleteUrl = getUrl;

}
