package com.herle.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herle.application.model.HealthCheck;

/**
 * Health Check controller : This resource is unprotected, do not add any
 * functional services here.
 */
@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {

	@GetMapping
	public ResponseEntity<HealthCheck> healthCheck() {
		long startTime = System.currentTimeMillis();

		HealthCheck healthCheckDto = new HealthCheck();
		healthCheckDto.setStatus(0);
		healthCheckDto.setDetails("");
		healthCheckDto.setDuration(System.currentTimeMillis() - startTime);

		return new ResponseEntity<>(healthCheckDto, HttpStatus.OK);
	}

}