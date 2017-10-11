package com.frankmoley.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TaskAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(TaskAppApplication::class.java, *args)
}
