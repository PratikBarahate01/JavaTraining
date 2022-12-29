package com.ust.labour.labourPoint.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LabourExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
		ExceptionResponse response = new ExceptionResponse(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<Object>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(LabourNotFoundException.class)
	public final ResponseEntity<Object> handleLabourNotFoundException(Exception ex, WebRequest request)
			throws Exception {
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage("Not Found");
		response.setTimestamp(LocalDateTime.now());
		response.setDescription(ex.getMessage());
		return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		
		  Map<String, Object> responseBody = new LinkedHashMap<>();
	        responseBody.put("timestamp", LocalDateTime.now());
	        responseBody.put("status", status.value());
	         
	        List<String> errors = ex.getBindingResult().getFieldErrors()
	            .stream()
	            .map(x -> x.getDefaultMessage())
	            .collect(Collectors.toList());
	         
	        responseBody.put("errors", errors);
	         
	        return new ResponseEntity<>(responseBody, headers, status);
		
		
//		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage)
//				.collect(Collectors.toList());
//		return new ResponseEntity<>(getErrorsMap(errors), new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	private Map<String, List<String>> getErrorsMap(List<String> errors) {
		Map<String, List<String>> errorResponse = new HashMap<>();
		errorResponse.put("errors", errors);
		return errorResponse;
	}
}
