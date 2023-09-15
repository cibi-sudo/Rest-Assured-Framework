package endpoints;

import io.restassured.response.Response;
import payloads.User;

import static io.restassured.RestAssured.given;

public class UserEndPoints {
    public static Response createUser(User payload) {
        Response response = given().contentType("application/json").accept("application/json").body(payload).when().post(Routes.postUrl);
        return response;
    }
    public static Response getUser(String username){
        Response response = given().pathParam("username",username).when().get(Routes.getUrl);
        return response;
    }

    public static Response updateUser(User payload, String username){
        Response response = given().contentType("application/json").accept("application/json").body(payload).pathParam("username",username).when().put(Routes.putUrl);
        return response;
    }

    public static Response deleteUser(String username){
        Response response = given().pathParam("username",username).when().delete(Routes.deleteUrl);
        return response;
    }
}
