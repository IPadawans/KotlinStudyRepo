package br.com.girolneto.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController {
    @Get
    fun teste(): String {
        return "Hello"
    }
}