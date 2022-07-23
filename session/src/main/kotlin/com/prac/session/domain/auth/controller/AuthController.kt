package com.prac.session.domain.auth.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpSession

@RestController
@RequestMapping("/api/v1/auth")
class AuthController {
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{name}/{message}")
    fun executeRedisTest(
        @PathVariable("name") name: String,
        @PathVariable("message") msg: String,
        session: HttpSession,
    ) {
        session.setAttribute(name, msg)
    }
}