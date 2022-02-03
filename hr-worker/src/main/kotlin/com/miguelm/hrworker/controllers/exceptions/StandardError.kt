package com.miguelm.hrworker.controllers.exceptions

import java.time.Instant

data class StandardError(
    var timestamp: Instant,
    var status: Int,
    var error: String,
    var message: String,
    var path: String
)
