package MockServer;


import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class WireMockSetup {
    private WireMockServer wireMockServer;

    public void setupWireMockServer() {
        wireMockServer = new WireMockServer(8080);
        wireMockServer.start();
        setupStub();
    }

    public void setupStub() {
        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/api/resource"))
                .willReturn(aResponse().withHeader("Content-Type", "text/plain")
                        .withStatus(200)
                        .withBody("You've reached a valid API endpoint!")));
    }

    public void stopWireMockServer() {
        wireMockServer.stop();
    }
}