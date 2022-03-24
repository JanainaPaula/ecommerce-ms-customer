package br.com.janadev.customer.domain

interface CustomerPort {
    fun createCustomer(customer: Customer): Customer
}