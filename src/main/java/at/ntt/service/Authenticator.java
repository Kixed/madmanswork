package at.ntt.service;

import org.apache.http.HttpHeaders;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.AccessTokenResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.Invocation;
import java.util.concurrent.TimeUnit;

public class Authenticator {

    private static final Logger LOG = LoggerFactory.getLogger(Authenticator.class);

    private ResteasyClient client;
    private Keycloak keycloak;

    public Authenticator(final String serverUrl, final String realm, final String clientId, final String clientSecret, final String username, final String password){
        client = new ResteasyClientBuilder()
                .connectionPoolSize(1)
                .connectionCheckoutTimeout(10, TimeUnit.SECONDS)
                .establishConnectionTimeout(10, TimeUnit.SECONDS)
                .socketTimeout(10, TimeUnit.SECONDS)
                .build();


        keycloak = KeycloakBuilder
                .builder()
                .serverUrl(serverUrl)
                .realm(realm)
                //.grantType(OAuth2Constants.PASSWORD)
                .clientId(clientId)
                .clientSecret(clientSecret)
                .username(username)
                .password(password)
                .resteasyClient(client).build();
        ;
        /*keycloak = KeycloakBuilder
                .builder()
                .serverUrl("https://keycloak-occ-int.imobility.azure.altemista.cloud/auth")
                .realm("occ-int")
                //.grantType(OAuth2Constants.PASSWORD)
                .clientId("testextensions")
                .clientSecret("e30a2457-68ae-40de-8dfc-3be56cfe0eb9")
                .username("testextensions")
                .password("testextensions")
                .resteasyClient(client).build();*/
        /*keycloak = KeycloakBuilder
                .builder()
                .serverUrl("https://keycloak-occ-int.imobility.azure.altemista.cloud/auth")
                .realm("occ-int")
                //.grantType(OAuth2Constants.PASSWORD)
                .clientId("occ-cp-client")
                .clientSecret("7525e56b-33f8-4874-8bee-66f6e8e60c51")
                .username("occ-ui")
                .password("password")
                .resteasyClient(client).build();*/
    }

    public Invocation.Builder setOAuthTokenForRequest(Invocation.Builder request){
        try {
            final AccessTokenResponse accessToken = keycloak.tokenManager().getAccessToken();
            request.header(HttpHeaders.AUTHORIZATION, "Beare " + accessToken.getToken());
            return request;
        }catch (NotAuthorizedException e){
            close();
            LOG.error("missing attribute or wrong credentials");
            throw e;
        }catch (Exception e){
            close();
            throw e;
        }
    }

    public void close(){
        keycloak.close();
        client.close();
    }


}
