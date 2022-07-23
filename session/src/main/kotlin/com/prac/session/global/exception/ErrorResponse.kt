package com.prac.session.global.exception

import com.fasterxml.jackson.annotation.JsonProperty

data class ErrorResponse(
    @JsonProperty(value = "error_code")
    val errorCode: Int,

    @JsonProperty(value = "error_message")
    val errorMessage: String,

    val detail: String = "",
)