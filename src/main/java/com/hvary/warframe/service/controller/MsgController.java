package com.hvary.warframe.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/a")
public class MsgController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
