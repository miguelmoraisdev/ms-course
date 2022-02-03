package com.miguelm.hrpayroll.controllers.exceptions

import com.miguelm.hrpayroll.controllers.exceptions.StandardError
import com.miguelm.hrpayroll.services.exceptions.FeignClientException
import com.miguelm.hrpayroll.services.exceptions.ResourceNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.time.Instant
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException::class)
    fun entityNotFound(e: ResourceNotFoundException, request: HttpServletRequest):
            ResponseEntity<StandardError>{
        val status = HttpStatus.NOT_FOUND
        var err: StandardError = StandardError(Instant.now(), status.value(),
            "Resorce Not Found", e.message!!, request.requestURI)
        return ResponseEntity.status(status).body(err)
    }

    @ExceptionHandler(FeignClientException::class)
    fun entityNotFound(e: FeignClientException, request: HttpServletRequest):
            ResponseEntity<StandardError>{
        val status = HttpStatus.NOT_FOUND
        var err: StandardError = StandardError(Instant.now(), status.value(),
            "Resorce Not Found", e.message!!, request.requestURI)
        return ResponseEntity.status(status).body(err)
    }
}