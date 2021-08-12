package com.thepoosh.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Contriller {

    @GetMapping
    public ResponseEntity<String> test() throws InterruptedException {
        Thread.sleep(10_000);
        return ResponseEntity.ok("yay");
    }
}
