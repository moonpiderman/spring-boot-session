package com.prac.session.global.exception

enum class ErrorType(val code: Int) {
    INVALID_REQUEST(40000),

    FORBIDDEN(40100),

    CONFLICT(40900),

    DATA_NOT_FOUND(40400),
}