package com.sparkie.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SparkieServerApplication

fun main(args: Array<String>) {
	runApplication<SparkieServerApplication>(*args)
}
