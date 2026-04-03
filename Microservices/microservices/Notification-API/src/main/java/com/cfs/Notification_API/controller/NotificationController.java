package com.cfs.Notification_API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableDiscoveryClient
public class NotificationController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/notification")
    public String notification()
    {
        return "Email Sent to user:";
    }

    @GetMapping("/notification/product")
    public String getProduct()
    {
          String s1="Hello from notification API";
          String s2=restTemplate.getForObject("http://localhost:9091/place",String.class);
          return s1+" "+s2;
    }
}
