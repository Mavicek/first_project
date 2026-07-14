package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Říká Springu, že tato třída bude obsluhovat webové požadavky
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

    @GetMapping("/hello") // Mapuje webovou adresu /hello na tuto metodu
    public String hello() {
        return "Hello World z Spring Bootu!";
    }
}
