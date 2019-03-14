package com.ivanbalseirogarcia.task;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.io.FileWriter;
import java.io.Writer;

@SpringBootApplication
public class TaskApplication {


    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
        getData();

    }

    //Method that parses the json information from the website to a JSONParser result object
    private static void getData() {
        //Give the URL that it will get the data from
        final String uri = "http://api.plos.org/search?q=title:DNA";
        RestTemplate restTemplate = new RestTemplate();
        JSONParser result = restTemplate.getForObject(uri, JSONParser.class);

        try {
            writeCsv(result.getResponse().getDocs());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Show all the data on screen
        System.out.println(result);
    }

    private static void writeCsv(List<Doc> docs) throws Exception {
        Writer writer = new FileWriter("data.csv");
        StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .build();
        sbc.write(docs);
        writer.close();
    }
}
