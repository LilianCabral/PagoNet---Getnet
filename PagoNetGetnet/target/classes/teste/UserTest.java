import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CreateUserTest {
	

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @Test
    public void createUserTest() {
        UserRequest userRequest = new UserRequest("John Doe", "Software Engineer");

        Response response = 
            given()
                .contentType(ContentType.JSON)
                .body(userRequest)
            .when()
                .post("/users")
            .then()
                .statusCode(201)
                .body("name", equalTo(userRequest.getName()))
                .body("job", equalTo(userRequest.getJob()))
                .body("id", notNullValue())
                .body("createdAt", notNullValue())
                .extract()
                .response();

        UserResponse userResponse = response.as(UserResponse.class);

        // Validação dos campos da resposta
        assert userResponse.getName().equals(userRequest.getName());
        assert userResponse.getJob().equals(userRequest.getJob());
        assert userResponse.getId() != null;
        assert userResponse.getCreatedAt() != null;
        
        
    }
}
