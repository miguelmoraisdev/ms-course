package com.miguelm.hrworker.dtos

import com.miguelm.hrworker.entities.Worker

data class WorkerDTO(

    var id: Long,
    var name: String,
    var dailyIncome: Double
) {
    constructor(entity: Worker):
            this(id = entity.id, name = entity.name, dailyIncome = entity.dailyIncome)
}
