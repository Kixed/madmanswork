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

    private static final String SERVER_URL = "";
    private static final String REALM = "";
    private static final String CLIENT_ID = "";
    private static final String CLIENT_SECRET = "";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";


    public static void main(String args[]){

        Authenticator auth = new Authenticator(SERVER_URL, REALM, CLIENT_ID, CLIENT_SECRET, USERNAME, PASSWORD);
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
