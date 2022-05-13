package com.sparkie.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.boot.runApplication

@EnableConfigServer
@SpringBootApplication
class SparkieServerApplication

fun main(args: Array<String>) {
	runApplication<SparkieServerApplication>(*args)
}
