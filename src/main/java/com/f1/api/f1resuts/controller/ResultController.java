package com.f1.api.f1resuts.controller;

import com.f1.api.f1resuts.service.ErgastServive;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ResultController {

    @Autowired
    private ErgastServive ergastService;

    @GetMapping("/result/{year}")
        public String getRaceResults(@PathVariable String year) {
        return ergastService.consumeApi(year);
    }

}
