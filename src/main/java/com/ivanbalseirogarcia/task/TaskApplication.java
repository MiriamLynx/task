package com.ivanbalseirogarcia.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
        getData();
    }

    //Method that parses the json information from the website to a MyClass result object
    private static void getData() {
        //Give the URL that it will get the data from
        final String uri = "http://api.plos.org/search?q=title:DNA";
        RestTemplate restTemplate = new RestTemplate();
        JSONParser result = restTemplate.getForObject(uri, JSONParser.class);
        //Show all the data on screen
        System.out.println(result);
    }
}
