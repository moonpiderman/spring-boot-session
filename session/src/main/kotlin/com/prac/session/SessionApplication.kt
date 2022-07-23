package com.prac.session

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@SpringBootApplication
@EnableRedisHttpSession
class SessionApplication

fun main(args: Array<String>) {
	runApplication<SessionApplication>(*args)
}
