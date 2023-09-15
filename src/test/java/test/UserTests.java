package test;

import com.github.javafaker.Faker;
import dataproviders.DataProviders;
import endpoints.UserEndPoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payloads.User;
import utility.ConfigFailedCase;

public class UserTests {
    User payload;
    Faker faker;
    @Test(priority = 1,dataProvider = "data",dataProviderClass = DataProviders.class)
    public void testCreateUser(String username,String firstname,String lastname,String email,String password,String phone){
        payload = new User();
        faker = new Faker();
        payload.setId(faker.idNumber().hashCode());
        payload.setUsername(username);
        payload.setFirstname(firstname);
        payload.setLastname(lastname);
        payload.setEmail(email);
        payload.setPassword(password);
        payload.setPhone(phone);
        Response response = UserEndPoints.createUser(payload);
        Assert.assertEquals(response.getStatusCode(), 200);
    }


    @Test(priority = 2,dataProvider = "username",dataProviderClass = DataProviders.class)
    public void testGetUser(String username) {
        Response response = UserEndPoints.getUser(username);
        response.then().log().body();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test(priority = 3,dataProvider = "username",dataProviderClass = DataProviders.class)
    public void testDeleteUser(String username) {
        Response response = UserEndPoints.deleteUser(username);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
