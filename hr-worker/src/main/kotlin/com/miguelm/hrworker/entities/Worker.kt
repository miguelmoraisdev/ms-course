package com.miguelm.hrworker.entities

import javax.persistence.*

@Entity
@Table(name = "tb_worker")
data class Worker(

    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column
    var name: String,

    @Column
    var dailyIncome: Double
)
