package br.com.janadev.customer.secondary

import br.com.janadev.customer.domain.Customer
import br.com.janadev.customer.domain.CustomerDataAccessPort

class CustomerMysqlAdapter: CustomerDataAccessPort {

    override fun create(customer: Customer): Customer {
        return Customer(
            name = "",
            email = "",
            document = "",
            password = "",
            type = 1,
            addresses = listOf(""),
            phoneNumbers = setOf("")
        )
    }
}