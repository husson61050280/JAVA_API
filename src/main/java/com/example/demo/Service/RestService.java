package com.example.demo.Service;

import com.example.demo.Covid;
import com.example.demo.PeopleAPI.People;
import com.example.demo.Post;
import com.example.demo.ProvinceAPI.All;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class RestService {

    private static Logger logger = LogManager.getLogger(RestService.class);

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    public String getPostsPlainJSON() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return this.restTemplate.getForObject(url, String.class);
    }

    public Post[] getPostsAsObject() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return this.restTemplate.getForObject(url, Post[].class);
    }

    public Covid getDataCovidAPI() {
        String url = "https://covid19.th-stat.com/api/open/today";
        return this.restTemplate.getForObject(url, Covid.class);
    }

    public All getProvincesObject() throws IOException, InterruptedException {
        String url = "https://opendata.data.go.th/api/3/action/datastore_search?resource_id=df922923-e009-4dee-92fc-d963a86ce4b8&limit=5";

        HttpClient client = HttpClient.newHttpClient();
        client.followRedirects();

        java.net.http.HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("api-key" , "tn9wW4JVutkj4NekOQHB3dQIkVnyVYM9")
                .header("Accept" , "application/json")
                .header("Content-Type" , "application/json;charset=utf-8")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        logger.info("HTTP Status Code: {}", response.statusCode());
        logger.info("Response body: {}", response.body());

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        All all = objectMapper.readValue(response.body(), All.class);

        return all;
    }

    //People พลังงาน API
    public People[] getPeopleAsObject()  throws IOException, InterruptedException {
        String url = "https://api.nriis.go.th/service/service/OpenData/v1/DataSet/Researcher_Energy";
        HttpClient client = HttpClient.newHttpClient();
        java.net.http.HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept" , "application/json")
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return this.restTemplate.getForObject(url, People[].class);
    }
}
