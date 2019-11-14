package com.github.hvits3rk.graphqlplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraphqlPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<GraphqlPlaygroundApplication>(*args)
}
