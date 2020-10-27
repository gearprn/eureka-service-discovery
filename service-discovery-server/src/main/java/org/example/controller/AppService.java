package org.example.controller;

import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonParser;

@RestController
public class AppService {

    @RequestMapping(value = "/serviceStatus", method = RequestMethod.GET)
    public String getServerStatus() {
        final String uri = "http://localhost:8761/eureka/apps";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        JsonObject resultJson = (JsonObject) JsonParser.parseString(result);
        return resultJson.toString();
    }
}
