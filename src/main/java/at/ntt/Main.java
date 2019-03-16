package at.ntt;

import at.ntt.service.Authenticator;
import at.ntt.service.CSVUtils;
import at.ntt.service.ConnectionUtils;
import io.swagger.client.model.*;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private static final String SERVER_URL = "https://keycloak-occ-int.imobility.azure.altemista.cloud/auth";
    private static final String REALM = "occ-int";
    private static final String CLIENT_ID = "testextensions";
    private static final String CLIENT_SECRET = "e30a2457-68ae-40de-8dfc-3be56cfe0eb9";
    private static final String USERNAME = "testextension2";
    private static final String PASSWORD = "testextension2";


    public static void main(String args[]){

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String username = null;
        String password = null;
        try {
            System.out.print("User: ");
            username = br.readLine();
            System.out.print("Password: ");
            password = br.readLine();
        } catch (IOException e) {
            LOG.error("Could not read user input", e);
        }

        Authenticator auth = new Authenticator(SERVER_URL, REALM, CLIENT_ID, CLIENT_SECRET, username, password);
        ConnectionUtils connection = new ConnectionUtils(auth);
        ResteasyClient client = connection.getRestClient();

        try {
            /**start implementing here**/
            //connection.setTargetOfClient(client, "URL").get();
            //connection.setTargetOfClient(client, "URL").post(Entity.entity(entityToSend), MediaType.APPLICATION_JSON);



            
        } finally {

            client.close();
            auth.close();
        }

    }

    private static SearchParameterDTO getDummySearchDTO(){
        SearchParameterDTO searchParameterDTO = new SearchParameterDTO();
        searchParameterDTO.setFilterParameters(Collections.<String, Object>emptyMap());
        searchParameterDTO.setSortProperties(Collections.<SortPropertyDTO>emptyList());
        searchParameterDTO.setAggregations(Collections.<String, Object>emptyMap());
        searchParameterDTO.setLimit(100);
        return searchParameterDTO;
    }
}
