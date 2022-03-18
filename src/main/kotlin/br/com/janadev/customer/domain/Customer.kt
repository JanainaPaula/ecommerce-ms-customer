package br.com.janadev.customer.domain

class Customer(
    val id: Int,
    val name: String,
    val email: String,
    val document: String,
    val password: String,
    val type: Int,
    val addresses: List<String>,
    val phoneNumbers: Set<String>
)