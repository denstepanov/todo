package org.example.todo.adapters.web.api.v1.controllers

import org.example.todo.adapters.web.api.v1.dto.HelloResponse
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/todo"], produces = [MediaType.APPLICATION_JSON_VALUE])
class TodoController {
    @GetMapping(value = ["/hello"])
    fun getHello(): HelloResponse {
        return HelloResponse("Hello World")
    }
}