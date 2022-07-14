package com.security.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"","/"})
    public String index(){
        //view resolver 설정 : templates(prefix), .mustache(suffix)
        return "index";
    }
}
