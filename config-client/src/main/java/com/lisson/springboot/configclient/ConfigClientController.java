package com.lisson.springboot.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConfigClientController {

    @Value("${word}")
    private String word;

    @RequestMapping("/hello")
    public String index()
    {
        System.out.println("232323");
        return this.word;

    }
}
