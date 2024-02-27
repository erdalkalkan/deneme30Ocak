package enums;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static stepDefinitions.Hooks.response;

public enum USERCREDENTIAL {

    USERGMAIL("urbanicfarm2@gmail.com","Urbanicfarm2/"),
    USERYOPMAIL("urbanicfarm2@yopmail.com", "Urbanicfarm2/"),
    USERSELLER("seller_urban@mailsac.com","VHt*zzt*wQNu6XS"),
    USERBUYER("buyer_urban@mailsac.com","VHt*zzt*wQNu6XS"),
    USERERDAL("erdal@yopmail.com","nPfXAzs656Jw6*w");




    private final String getUsername, getPassword;

    USERCREDENTIAL(String username, String password) {
        this.getUsername = username;
        this.getPassword = password;
    }

    public String getUsername() {
        return getUsername;
    }

    public String getPassword() {
        return getPassword;
    }

    public Response getResponse() {
        Map<String,String> mapBody = new HashMap<>();
        mapBody.put("email", this.getUsername);
        mapBody.put("password", this.getPassword);

        response = given()
                .contentType(ContentType.JSON)
                .body(mapBody)
                .when()
                .post("https://test.urbanicfarm.com/api/public/login");


        return response;
    }

    public String getPhpID() {
        return response.cookie("PHPSESSID");
    }
}
