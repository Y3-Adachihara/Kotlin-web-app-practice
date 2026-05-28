package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MessageController {

    @GetMapping("/messages")
    fun index(): String {
        return "index"
    }
}