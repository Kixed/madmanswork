package at.ntt.service;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.TimeUnit;

public class ConnectionUtils {

    private Authenticator auth;

    public ConnectionUtils(Authenticator auth){
        this.auth = auth;
    }

    public ResteasyClient getRestClient() {
        ResteasyClient client = new ResteasyClientBuilder()
                .connectionPoolSize(1)
                .connectionCheckoutTimeout(30, TimeUnit.SECONDS)
                .establishConnectionTimeout(30, TimeUnit.SECONDS)
                .socketTimeout(30, TimeUnit.SECONDS)
                .build();
        return client;
    }

    public Invocation.Builder setTargetOfClient(final ResteasyClient client, final String targetUrl){
        final Invocation.Builder request = auth.setOAuthTokenForRequest(client.target(targetUrl).request());
        request.accept(MediaType.APPLICATION_JSON);
        return request;
    }
}
