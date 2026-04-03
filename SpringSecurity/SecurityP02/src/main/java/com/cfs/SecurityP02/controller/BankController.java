package com.cfs.SecurityP02.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {


    @GetMapping("/contactUs")
    public String contactUs()
    {
        return "Contact Us at :9632587412";
    }

    @GetMapping("/transfer")
    public String transfer()
    {
        return "money transfer successful2";
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "welcome admin";
    }

    @GetMapping("/about")
    public String about()
    {
        return "Suresh founder of Laxmi Chit Fund";
    }
}
