package com.miguelm.hrpayroll.services

import com.miguelm.hrpayroll.entities.Payment
import com.miguelm.hrpayroll.feignclients.WorkerFeignClient
import com.miguelm.hrpayroll.services.exceptions.FeignClientException
import feign.FeignException
import org.springframework.stereotype.Service

@Service
class PaymentService(
    private val client: WorkerFeignClient
) {

    fun getPayment(id: Long, days: Int): Payment {
        try{
            val workerDTO =  client.getWorker(id).body!!
            var payment = Payment(workerDTO.name, workerDTO.dailyIncome, days)
            return payment
        } catch (e: FeignException){
            throw FeignClientException("Worker $id not found" )
        }
    }

}