package br.com.janadev.customer.primary

import br.com.janadev.customer.domain.CustomerPort
import br.com.janadev.customer.domain.toDTO
import br.com.janadev.customer.primary.dto.CustomerResponseDTO
import br.com.janadev.customer.primary.dto.NewCustomerDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping("/api/customer")
class CustomerControler(
    val customerPort: CustomerPort
) {

    @PostMapping
    fun createCustomer(@Valid @RequestBody customer: NewCustomerDTO): ResponseEntity<CustomerResponseDTO> {
        val customerCreated = customerPort.createCustomer(customer.toModel()).toDTO()
        val uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}").buildAndExpand(customerCreated.id).toUri()
        return ResponseEntity.created(uri).build()
    }
}