package com.abhishek.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {




    @GetMapping("/getName")
    public String getNames() {
        return "Sagnik";
    }

    @GetMapping("/shopName")
    public String getShopName(){
        return "Rabindra";
    }

}
