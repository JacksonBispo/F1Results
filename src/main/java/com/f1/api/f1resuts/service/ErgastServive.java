package com.f1.api.f1resuts.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class ErgastServive {


    private final RestTemplate restTemplate;

    public String consumeApi(String year) {
        String url = "http://ergast.com/api/f1/"+year+"/last/results.json";
        return restTemplate.getForObject(url, String.class);
    }
}
