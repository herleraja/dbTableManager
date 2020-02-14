package com.herle.application.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herle.application.model.Table;
import com.herle.application.service.DBManagementService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author amritharajherle
 *
 */
@RestController
@Validated
@RequestMapping("/api/dbmanager/v1/")
@Api(value = "API to manage database managment ", tags = { "Database Management" })
public class DBTableManagmentController {

	private static final Logger logger = LogManager.getLogger(DBTableManagmentController.class);

	@Autowired
	DBManagementService dbManagementService;

	@Autowired
	ReloadableResourceBundleMessageSource messageSource;

	@ApiOperation(value = "create new table in database")
	@PostMapping("create")
	public ResponseEntity<Table> createDBTable(@RequestBody @Valid Table createTable, Locale locale) {

		String message = messageSource.getMessage("ASDSCMANAGER0007E", new Object[] { "createDBTable" }, locale);
		logger.info(message);

		Table response = dbManagementService.createDBTable(createTable);

		if (null == response) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok().body(response);

	}

}
