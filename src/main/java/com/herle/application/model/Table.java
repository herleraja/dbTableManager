package com.herle.application.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;

import com.herle.application.constants.Constants;

public class Table {
	@NotNull(message = "{ASDSCMANAGER0003E}")
	@Pattern(regexp = Constants.REGEX_NAME, message = "{ASDSCMANAGER0004E}")
	private String name;
	private String schema;

	@NotEmpty(message = "{ASDSCMANAGER0005E}")
	@Valid
	private List<Column> columns = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

}
