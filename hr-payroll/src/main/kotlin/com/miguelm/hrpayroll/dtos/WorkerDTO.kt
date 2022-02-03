package com.miguelm.hrpayroll.dtos

import com.miguelm.hrpayroll.dtos.WorkerDTO

data class WorkerDTO(

    var id: Long,
    var name: String,
    var dailyIncome: Double
) {
   /* constructor(entity: Worker):
            this(id = entity.id, name = entity.name, dailyIncome = entity.dailyIncome) */
}
