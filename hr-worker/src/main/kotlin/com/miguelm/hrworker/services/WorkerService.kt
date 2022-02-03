package com.miguelm.hrworker.services

import com.miguelm.hrworker.dtos.WorkerDTO
import com.miguelm.hrworker.repositories.WorkerRepository
import com.miguelm.hrworker.services.exceptions.ResourceNotFoundException
import org.springframework.stereotype.Service
import java.util.stream.Collectors



@Service
class WorkerService(
    private val repository: WorkerRepository
) {

    fun findAll(): List<WorkerDTO> {
        val workers = repository.findAll()
        return workers.stream().map { x -> WorkerDTO(x) }.collect(Collectors.toList())
    }

    fun findWorker(id: Long): WorkerDTO {
        val worker = repository.findById(id)
        val entity = worker.orElseThrow { ResourceNotFoundException("worker $id not found") }
        return WorkerDTO(entity)
    }
}