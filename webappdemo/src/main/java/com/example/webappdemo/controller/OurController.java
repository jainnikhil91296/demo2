package com.example.webappdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OurController {

    @RequestMapping("/")
  //  @ResponseBody
    public String listItems(){
     return "home";
    }
}
