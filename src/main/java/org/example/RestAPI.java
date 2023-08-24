package org.example;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

public class RestAPI {


    public void makePost() throws Exception {

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://restful-booker.herokuapp.com/auth"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(
                        "{\n" +
                                "    \"username\" : \"admin\",\n" +
                                "    \"password\" : \"password123\"\n" +
                                "}")
                )
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String>httpResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());



    }


}
