package br.com.janadev.customer.domain

import br.com.janadev.customer.primary.dto.CustomerResponseDTO
import java.util.UUID

class Customer(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val email: String,
    val document: String,
    val password: String,
    val type: Int,
    val addresses: List<String>,
    val phoneNumbers: Set<String>
)

fun Customer.toDTO() = CustomerResponseDTO(
    id = id.toString(),
    name = name,
    email = email,
    document = document
)

