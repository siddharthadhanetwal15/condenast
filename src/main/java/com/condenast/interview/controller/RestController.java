package com.condenast.interview.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/v1")
public class RestController {
    @GetMapping("/message")
    public ResponseEntity<Object> printMessage(){
        String message = "Hello World";
        return new ResponseEntity<Object>(message, HttpStatus.OK);
    }
}
