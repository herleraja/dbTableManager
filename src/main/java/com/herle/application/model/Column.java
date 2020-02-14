package com.herle.application.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.herle.application.constants.Constants;

public class Column {

	// Bean validation constants
	public static final int MIN_NAME_LENGTH = 1;
	public static final int MAX_NAME_LENGTH = 128;

	public static final int MIN_TYPE_LENGTH = 1;
	public static final int MAX_TYPE_LENGTH = 128;

	public static final int MIN_LENGTH = 1;
	public static final int MAX_LENGTH = Integer.MAX_VALUE;

	@NotNull(message = "{ASDSCMANAGER0001E}")
	@Size(min = MIN_NAME_LENGTH, max = MAX_NAME_LENGTH, message = "{ASDSCMANAGER0009E}")
	@Pattern(regexp = Constants.REGEX_COLUMN_NAME, message = "{ASDSCMANAGER0008E}")
	private String name;

	@NotNull(message = "{ASDSCMANAGER0002E}")
	@Pattern(regexp = Constants.JDBC_SUPPORTED_TYPE_NAMES_PATTERN, flags = Pattern.Flag.CASE_INSENSITIVE, message = "{CUDVS0205E}")
	private String type;

	private Boolean nullable;

	@Min(value = MIN_LENGTH, message = "{ASDSCMANAGER0010E}")
	@Max(value = MAX_LENGTH, message = "{ASDSCMANAGER0010E}")
	private Integer length;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getNullable() {
		return nullable;
	}

	public void setNullable(Boolean nullable) {
		this.nullable = nullable;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

}
