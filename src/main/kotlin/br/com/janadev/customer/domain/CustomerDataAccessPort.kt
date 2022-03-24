package br.com.janadev.customer.domain

interface CustomerDataAccessPort {
    fun create(customer: Customer): Customer
}