package belajar.backend.kotlin.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinRestfulApiApplication

fun main(args: Array<String>) {
	runApplication<KotlinRestfulApiApplication>(*args)
}
