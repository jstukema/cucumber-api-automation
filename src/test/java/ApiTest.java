import MockServer.WireMockSetup;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;



public class ApiTest {
    private WireMockSetup wireMockSetup;

    @Before
    public void setup() {
        wireMockSetup = new WireMockSetup();
        wireMockSetup.setupWireMockServer();
    }

    @After
    public void tearDown() {
        wireMockSetup.stopWireMockServer();
    }

    @Test
    public void testApi() {
        // Your test code here
    }

}
