package br.com.janadev.customer.primary.validation

import javax.validation.Constraint

@Constraint(validatedBy = [NewCustomerValidation::class])
@Target(AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class ValidadeNewCustomer
