package com.demo.awscodedeploydemo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController
{
    @GetMapping("api/health")
    public ResponseEntity<?> healthcheck()
    {
        return ResponseEntity.ok("It works very Fine.");
    }
}
