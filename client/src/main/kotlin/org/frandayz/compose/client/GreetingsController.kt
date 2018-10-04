package org.frandayz.compose.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingsController {

    @Value("\${test.greeting}")
    private lateinit var greeting: String

    @GetMapping("/greeting")
    fun greeting() = greeting
}