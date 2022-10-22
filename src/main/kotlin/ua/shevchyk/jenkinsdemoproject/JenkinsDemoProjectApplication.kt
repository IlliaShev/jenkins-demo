package ua.shevchyk.jenkinsdemoproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JenkinsDemoProjectApplication

fun main(args: Array<String>) {
    runApplication<JenkinsDemoProjectApplication>(*args)
}
