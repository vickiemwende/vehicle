package com.example.vehicle_breakdownapp

data class ModalUser (
    val username: String = "",
    val email: String = "",
    val password: String = "",
) {constructor() : this("", "", "")}