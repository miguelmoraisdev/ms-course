package com.miguelm.hrpayroll.controllers

import com.miguelm.hrpayroll.entities.Payment
import com.miguelm.hrpayroll.services.PaymentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payment")
class PaymentController(
    private val service: PaymentService
) {

    @GetMapping("/{id}/{days}")
    fun findPayment(@PathVariable("id") id: Long, @PathVariable("days") days: Int): ResponseEntity<Payment> {
        return ResponseEntity.ok(service.getPayment(id, days))
    }
}