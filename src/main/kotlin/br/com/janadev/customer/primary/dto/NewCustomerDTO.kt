package br.com.janadev.customer.primary.dto

import br.com.janadev.customer.domain.Customer
import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.br.CPF
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

class NewCustomerDTO(
    @field:NotEmpty(message = "Mandatory filling")
    @field:Length(min = 3, max = 120, message = "The length should be between 5 and 120 characters.")
    val name: String,

    @field:NotEmpty(message = "Mandatory filling")
    @field:Email(message = "Invalid email")
    val email: String,

    @field:NotEmpty(message = "Mandatory filling")
    val password: String,

    @field:NotNull(message = "Mandatory filling")
    val type: Int,

    @field:NotEmpty(message = "Mandatory filling")
    val address: String,

    @field:NotEmpty(message = "Mandatory filling")
    val phone: String,

    @field:CPF(message = "Invalid CPF")
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