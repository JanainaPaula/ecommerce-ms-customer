package br.com.janadev.customer.primary.dto

import br.com.janadev.customer.domain.Customer

class NewCustomerDTO(
    val name: String,
    val email: String,
    val password: String,
    val type: Int,
    val address: String,
    val phone: String,
    val document: String
) {
    fun toModel() = Customer(
        name = name,
        email = email,
        addresses = listOf(address),
        phoneNumbers = setOf(phone),
        document = document,
        password = password,
        type = type
    )
}