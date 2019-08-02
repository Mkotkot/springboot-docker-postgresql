package me.kotkot.controllers;

import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {

	@ExceptionHandler(value = DataAccessResourceFailureException.class)
	public ResponseEntity<Object> hendleDatabaseDownExceptions(DataAccessResourceFailureException exception) {
		return new ResponseEntity("internal server error ", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
