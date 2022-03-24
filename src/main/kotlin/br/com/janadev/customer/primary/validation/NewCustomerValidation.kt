package br.com.janadev.customer.primary.validation

import br.com.janadev.customer.primary.dto.NewCustomerDTO
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class NewCustomerValidation: ConstraintValidator<ValidadeNewCustomer, NewCustomerDTO>
{
    override fun isValid(value: NewCustomerDTO?, context: ConstraintValidatorContext?): Boolean {

//        value.let {
//            if (it != null) {
//                if(it.phone.length < 12 || it.phone.length > 13){
//
//                }
//            }
//        }
        return true
    }
}