package br.com.janadev.customer.config

import br.com.janadev.customer.domain.CustomerDataAccessPort
import br.com.janadev.customer.domain.CustomerPort
import br.com.janadev.customer.domain.CustomerUseCase
import br.com.janadev.customer.secondary.CustomerMysqlAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCasesConfiguration {

    @Bean
    fun consumerUseCaseBean(): CustomerPort {
        return CustomerUseCase(consumerDataAcessPort())
    }

    @Bean
    fun consumerDataAcessPort(): CustomerDataAccessPort{
        return CustomerMysqlAdapter()
    }

}