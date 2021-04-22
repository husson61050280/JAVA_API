package com.example.demo;

import com.example.demo.PeopleAPI.People;
import com.example.demo.ProvinceAPI.All;
import com.example.demo.ProvinceAPI.Result;
import com.example.demo.Service.RestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HelloController {

    private final RestService service;

    public HelloController(RestService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String GetPost() {
        return service.getPostsPlainJSON();
    }

    @RequestMapping("/home")
    public Post[] GetObjectPost() {
        return  service.getPostsAsObject();
    }

    @RequestMapping("/Covid")
    public Covid GetCovidAPI() {
        return  service.getDataCovidAPI();
    }

    @RequestMapping("/province")
    public All getProvincesObject() throws IOException, InterruptedException{
        return service.getProvincesObject();
    }

    @RequestMapping("/People")
    public People[] GetPeopleAPI() throws IOException, InterruptedException  {
        return service.getPeopleAsObject();
    }
}
