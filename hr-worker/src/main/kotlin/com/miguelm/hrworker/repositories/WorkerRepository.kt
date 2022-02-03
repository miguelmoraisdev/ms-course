package com.miguelm.hrworker.repositories

import com.miguelm.hrworker.entities.Worker
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkerRepository: JpaRepository<Worker, Long> {
}