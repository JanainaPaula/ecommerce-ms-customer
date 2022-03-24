package br.com.janadev.customer.domain

class CustomerUseCase(
    val customerDataAccessPort: CustomerDataAccessPort
): CustomerPort {

    override fun createCustomer(customer: Customer): Customer {
        return customerDataAccessPort.create(customer)
    }

}