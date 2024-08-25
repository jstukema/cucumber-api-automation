import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class Stepdefinitions {
    private static final String BASE_URL = "http://localhost:8080";
    private Response response;
    private RequestSpecification request;

    @Given("user set GET request to the api endpoint")
    public void userSetGETRequestToTheApiEndpoint() {
        request = given().baseUri(BASE_URL);
    }

    @When("user sends GET request with HTTP method")
    public void userSendsGETRequestWithHTTPMethod() {
        response = request.when().get("/api/v1/employees");
    }

    @Then("I receive valid response")
    public void i_receive_valid_response() {
        response.then().statusCode(200);
    }

}