package io.purgil.activityservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["io.purgil.activityservice", "io.purgil.sharedlib"])
class ActivityServiceApplication

fun main(args: Array<String>) {
    runApplication<ActivityServiceApplication>(*args)
}
