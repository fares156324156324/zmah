package com.example.backend_jenkins_app.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class JenkinsTestController {
    @RequestMapping("/")
 public String index()
 {
    return "Testin jenkins pipeline";
 }

    
}
