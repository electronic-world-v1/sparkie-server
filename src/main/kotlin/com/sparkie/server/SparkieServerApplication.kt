package com.sparkie.server

import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class SparkieServerApplication

fun main(args: Array<String>) {
	runApplication<SparkieServerApplication>(*args)
}
