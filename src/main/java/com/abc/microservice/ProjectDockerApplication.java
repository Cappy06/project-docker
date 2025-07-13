package com.abc.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectDockerApplication.class, args);
    }
    @GetMapping("/")
    public String Hello() {
    	return "<h1> HELLO </h1>";
    }
    @GetMapping("/health")
    public String health() {
        return "<h1> HEALTH </h1>";
    }
    @GetMapping("/greetings")
    public String greetings() {
        return "<h1> Hello, there! </h1>";
    }
    
}
