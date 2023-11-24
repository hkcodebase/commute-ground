package org.example;

import org.junit.jupiter.api.Test;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.http.HttpClient;

/**
 *
 */

public class HttpClientTest {

    @Test
    void testHttpClient(){
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .proxy(ProxySelector.of(new InetSocketAddress("www-proxy.com", 8080)))
                .authenticator(Authenticator.getDefault())
                .build();
        assert client != null;
    }

}