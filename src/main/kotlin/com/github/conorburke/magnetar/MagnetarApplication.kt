package com.github.conorburke.magnetar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MagnetarApplication

fun main(args: Array<String>) {
	runApplication<MagnetarApplication>(*args)
}
