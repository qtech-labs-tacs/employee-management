package com.qtechlabs.employeemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsernameAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = -4359714406599989636L;

	public UsernameAlreadyExistsException(String message) {
        super(message);
    }
}
