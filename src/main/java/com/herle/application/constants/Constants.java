package com.herle.application.constants;

import java.sql.JDBCType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.herle.application.model.Column;

public class Constants {
	private Constants() {
	}

	// Regex. constants
	public static final String REGEX_ORG_ID = "^[A-Za-z0-9]{6,6}$";
	public static final String REGEX_RESOURCE_ID = "^[A-Fa-f0-9]{24,24}$";
	public static final String REGEX_CONNECTOR_ID = REGEX_RESOURCE_ID;
	public static final String REGEX_FORWARDING_RULE_ID = REGEX_RESOURCE_ID;
	public static final String REGEX_LOGICAL_INTERFACE_ID = REGEX_RESOURCE_ID + "|^\\*$";
	public static final String REGEX_NAME = "^[A-Za-z0-9\\-\\_\\.]{1,128}$";
	public static final String REGEX_ENABLED = "^(true|false)$";
	public static final String REGEX_FORWARDING_RULE_TYPE = "^(event|state)$";
	public static final String REGEX_SERVICE_ID = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$";
	public static final String REGEX_TYPE_ID = "^[A-Za-z0-9\\-\\_\\.]{1,36}$|^\\*$";
	public static final String REGEX_EVENT_ID = "^[^#/+\\\\]+$|^\\*$";
	public static final String REGEX_OBJECT_TYPE = "^(device|thing|\\*)$";
	public static final String REGEX_INSTANCE_ID = "^[A-Za-z0-9\\-\\_\\.]{1,36}$|^\\*$";


	// Set of valid JDBC type names
	public static final Set<String> JDBC_ALL_TYPE_NAMES = Collections.unmodifiableSet(
			Arrays.stream(JDBCType.values()).map(type -> type.getName().toUpperCase()).collect(Collectors.toSet()));
	public static final Set<String> JDBC_SUPPORTED_TYPE_NAMES = Collections
			.unmodifiableSet(Stream.of(JDBCType.FLOAT.getName().toUpperCase(), JDBCType.BLOB.getName().toUpperCase(),
					JDBCType.BINARY.getName().toUpperCase(), JDBCType.DECIMAL.getName().toUpperCase(),
					JDBCType.CHAR.getName().toUpperCase(), JDBCType.NCHAR.getName().toUpperCase(),
					JDBCType.NVARCHAR.getName().toUpperCase(), JDBCType.TIMESTAMP.getName().toUpperCase(),
					JDBCType.DOUBLE.getName().toUpperCase(), JDBCType.INTEGER.getName().toUpperCase(),
					JDBCType.NCLOB.getName().toUpperCase(), JDBCType.NUMERIC.getName().toUpperCase(),
					JDBCType.CLOB.getName().toUpperCase(), JDBCType.BIGINT.getName().toUpperCase(),
					JDBCType.TIME.getName().toUpperCase(), JDBCType.TIME_WITH_TIMEZONE.getName().toUpperCase(),
					JDBCType.BIT.getName().toUpperCase(), JDBCType.BOOLEAN.getName().toUpperCase(),
					JDBCType.DATE.getName().toUpperCase(), JDBCType.SMALLINT.getName().toUpperCase(),
					JDBCType.REAL.getName().toUpperCase(), JDBCType.VARCHAR.getName().toUpperCase(),
					JDBCType.TIMESTAMP_WITH_TIMEZONE.getName().toUpperCase(),
					JDBCType.VARBINARY.getName().toUpperCase()).collect(Collectors.toSet()));
	public static final String JDBC_SUPPORTED_TYPE_NAMES_PATTERN = "FLOAT|" + "BLOB|" + "BINARY|" + "DECIMAL|" + "CHAR|"
			+ "NCHAR|" + "NVARCHAR|" + "TIMESTAMP|" + "DOUBLE|" + "INTEGER|" + "NCLOB|" + "NUMERIC|" + "CLOB|"
			+ "BIGINT|" + "TIME|" + "TIME_WITH_TIMEZONE|" + "BIT|" + "BOOLEAN|" + "DATE|" + "SMALLINT|" + "REAL|"
			+ "VARCHAR|" + "TIMESTAMP_WITH_TIMEZONE|" + "VARBINARY";
	public static final String REGEX_COLUMN_NAME = "^[a-zA-Z_][a-zA-Z0-9\\_]{0" + "," + (Column.MAX_NAME_LENGTH - 1)
			+ "}$";
	public static final Set<String> JDBC_TYPES_LENGTH_REQUIRED = Collections.unmodifiableSet(
			Stream.of(JDBCType.VARBINARY.getName().toUpperCase(), JDBCType.NVARCHAR.getName().toUpperCase())
					.collect(Collectors.toSet()));
	public static final Set<String> JDBC_TYPES_LENGTH_SUPPORTED = Collections
			.unmodifiableSet(Stream.of(JDBCType.CHAR.getName().toUpperCase(), JDBCType.NCHAR.getName().toUpperCase(),
					JDBCType.VARCHAR.getName().toUpperCase(), JDBCType.NVARCHAR.getName().toUpperCase(),
					JDBCType.BINARY.getName().toUpperCase(), JDBCType.VARBINARY.getName().toUpperCase(),
					JDBCType.BLOB.getName().toUpperCase(), JDBCType.CLOB.getName().toUpperCase(),
					JDBCType.NCLOB.getName().toUpperCase()).collect(Collectors.toSet()));
	public static final Set<String> JDBC_TYPES_PRECISION_SUPPORTED = Collections.unmodifiableSet(
			Stream.of(JDBCType.DECIMAL.getName().toUpperCase(), JDBCType.NUMERIC.getName().toUpperCase(),
					JDBCType.FLOAT.getName().toUpperCase(), JDBCType.TIME.getName().toUpperCase(),
					JDBCType.TIME_WITH_TIMEZONE.getName().toUpperCase(), JDBCType.TIMESTAMP.getName().toUpperCase(),
					JDBCType.TIMESTAMP_WITH_TIMEZONE.getName().toUpperCase()).collect(Collectors.toSet()));
	public static final Set<String> JDBC_TYPES_SCALE_SUPPORTED = Collections.unmodifiableSet(
			Stream.of(JDBCType.DECIMAL.getName().toUpperCase(), JDBCType.NUMERIC.getName().toUpperCase())
					.collect(Collectors.toSet()));
	public static final Set<String> JDBC_TYPES_NO_PARAMS = Collections.unmodifiableSet(
			Stream.of(JDBCType.INTEGER.getName().toUpperCase(), JDBCType.SMALLINT.getName().toUpperCase(),
					JDBCType.BIGINT.getName().toUpperCase(), JDBCType.DOUBLE.getName().toUpperCase(),
					JDBCType.REAL.getName().toUpperCase(), JDBCType.BOOLEAN.getName().toUpperCase(),
					JDBCType.DATE.getName().toUpperCase()).collect(Collectors.toSet()));

	// Misc.
	public static final String EMPTY_STRING = "";
}
