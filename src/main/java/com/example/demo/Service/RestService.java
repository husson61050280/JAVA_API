package com.example.demo.Service;

import com.example.demo.Covid;
import com.example.demo.PeopleAPI.People;
import com.example.demo.Post;
import com.example.demo.ProvinceAPI.All;
import com.example.demo.ProvinceAPI.Result;
import com.google.gson.Gson;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

@Service
public class RestService {

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
        String url = "https://opend.data.go.th/get-ckan/datastore_search?resource_id=df922923-e009-4dee-92fc-d963a86ce4b8&limit=5";
        HttpClient client = HttpClient.newHttpClient();
        java.net.http.HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept" , "application/json")
                .header("api-key" , "tn9wW4JVutkj4NekOQHB3dQIkVnyVYM9")
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return null;
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
