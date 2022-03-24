package br.com.janadev.customer.domain

import java.util.UUID

class Customer(
    val id: UUID,
    val name: String,
    val email: String,
    val document: String,
    val password: String,
    val type: Int,
    val addresses: List<String>,
    val phoneNumbers: Set<String>
)