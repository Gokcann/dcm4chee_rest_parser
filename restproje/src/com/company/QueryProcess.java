package com.company;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.company.*;

public class QueryProcess {

    private  static HttpURLConnection connection;

    public StringBuffer QueryProcessMethod() {

        // ********THIS IS FIRST METHOD*******
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            URL url = new URL("http://192.168.12.113:8080/dcm4chee-arc/aets/DCM4CHEE/rs/mwlitems");
            //http://192.168.12.44:8080/dcm4chee-arc/aets/DCM4CHEE/rs/mwlitems
            connection = (HttpURLConnection) url.openConnection();
            //request
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            //System.out.println(status);

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while (( line = reader.readLine()) != null ) {
                    responseContent.append(line);
                }
                reader.close();
            }else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while (( line = reader.readLine()) != null ) {
                    responseContent.append(line);
                }
                reader.close();
            }
            //System.out.println(responseContent.toString());
            //parse(responseContent.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            connection.disconnect();
        }
        //return string buffer type response
        return responseContent;


        /*
        //can be used in other situations

        // *********THIS IS SECOND METHOD********
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://192.168.12.44:8080/dcm4chee-arc/aets/DCM4CHEE/rs/mwlitems")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

         */

    }
}
