import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class stepdefinitions {
    private static final String BASE_URL = "http://localhost:8080";
    private Response response;

    @Given("I set GET api endpoint")
    public void i_set_get_api_endpoint() {
        // Set up your API endpoint here
    }

    @When("I send GET HTTP request")
    public void i_send_get_http_request() {
        response = given().when().get(BASE_URL);
    }

    @Then("I receive valid response")
    public void i_receive_valid_response() {
        response.then().statusCode(200);
    }
}