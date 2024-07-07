package com.icode.ng;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class SpringValidation implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, null, null);
	}
}
