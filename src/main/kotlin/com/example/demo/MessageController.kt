package com.example.demo

import org.springframework.web.bind.bind.annotation.GetMapping
import org.springframework.web.bind.bind.annotation.RestController

@RestController
class MessageController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, Spring Boot!"
    }
}