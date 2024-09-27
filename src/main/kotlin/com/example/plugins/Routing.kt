package com.example.plugins

import com.example.rabbits.getAllRabbits
import com.example.rabbits.randomRabbit
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {

        randomRabbit()
        getAllRabbits()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
