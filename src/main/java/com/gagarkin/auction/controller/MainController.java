package com.gagarkin.auction.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "")
public class MainController {

    @GetMapping("/")
    @NotNull
    public String main(){
        return "hello";
    }

}
