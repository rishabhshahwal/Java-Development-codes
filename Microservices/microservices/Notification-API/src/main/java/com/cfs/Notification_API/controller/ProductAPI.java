package com.cfs.Notification_API.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface ProductAPI {

    @GetMapping("/place")
    public String invokeProductApi();
}

