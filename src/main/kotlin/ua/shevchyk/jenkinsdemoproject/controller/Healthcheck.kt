package ua.shevchyk.jenkinsdemoproject.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Healthcheck {

    @GetMapping ("/health")
    fun health(): String {
        return "health"
    }

}