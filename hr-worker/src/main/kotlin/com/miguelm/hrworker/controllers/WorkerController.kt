package com.miguelm.hrworker.controllers

import com.miguelm.hrworker.dtos.WorkerDTO
import com.miguelm.hrworker.services.WorkerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/workers")
class WorkerController(
    private val service: WorkerService
) {

    @GetMapping
    fun getAllWorkers(): ResponseEntity<List<WorkerDTO>> {
        val list = service.findAll()
        return ResponseEntity.ok(list)
    }

    @GetMapping("/{id}")
    fun getWorker(@PathVariable("id") id: Long): ResponseEntity<WorkerDTO> {
        val worker = service.findWorker(id)
        return ResponseEntity.ok(worker)
    }

}