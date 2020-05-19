package com.plualSight.conferencedemo.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    public String appVersion;

    @GetMapping()
    @RequestMapping("/")
    public Map getVersion(){
        Map<String, String> stringMap = new HashMap<>();
         stringMap.put("app-version", appVersion);
         return stringMap;
    }
}
