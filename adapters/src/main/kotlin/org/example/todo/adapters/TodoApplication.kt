package org.example.todo.adapters

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class TodoApplication

fun main(vararg args: String) {
    runApplication<TodoApplication>(*args)
}

