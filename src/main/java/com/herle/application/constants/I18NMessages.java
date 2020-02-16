package com.herle.application.constants;

/**
 * @author amritharajherle
 * 
 *         The following class is used to get i18n messages from
 *         messages.properties or messages_{countrycode}.properties file.
 *         Example: messages_de.properties file is for messages in German
 *         language.
 * 
 *         By default all the messages in English you can find in
 *         messages.properties file and its the default message place.
 * 
 *         Case 1: For javax validation example:
 * 
 *         {@code
 * 
 * 		@NotNull(message = "{" + I18NMessages.ASDSCMANAGER0003E + "}")
 * 
 *         }
 * 
 *         will be converted into
 * 
 *         {@code
 * 
 * 		@NotNull(message = "{ASDSCMANAGER0003E}")
 *
 *         }
 * 
 *         Case 2: Normal message retrieval.
 * 
 *         {@code
 * 
 * 		@Autowired ReloadableResourceBundleMessageSource messageSource;
 * 
 *         String message =
 *         messageSource.getMessage(I18NMessages.ASDSCMANAGER0007E, new Object[]
 *         { "createNewEntityType" }, locale);
 * 
 *         }
 *
 */
public class I18NMessages {

	// The column name must be present and cannot be null.
	public static final String ASDSCMANAGER0001E = "ASDSCMANAGER0001E";

	// The column type must be present and cannot be null.
	public static final String ASDSCMANAGER0002E = "ASDSCMANAGER0002E";

	// The table name must be present and cannot be null.
	public static final String ASDSCMANAGER0003E = "ASDSCMANAGER0003E";

	// The table name specified is not valid. It must start with a letter or an
	// underscore =_). Subsequent characters can be letters, digits or underscores.
	public static final String ASDSCMANAGER0004E = "ASDSCMANAGER0004E";

	// The table columns can not be empty. It must have at least one column.
	public static final String ASDSCMANAGER0005E = "ASDSCMANAGER0005E";

	//
	public static final String ASDSCMANAGER0006E = "ASDSCMANAGER0006E";

	// The method {0} is not implemented.
	public static final String ASDSCMANAGER0007E = "ASDSCMANAGER0007E";

	// The column name specified is not valid. It must be between 1 and 128
	// characters in length. It must start with a letter or an underscore (_).
	// Subsequent characters can be letters, digits or underscores.
	public static final String ASDSCMANAGER0008E = "ASDSCMANAGER0008E";

	// The column name cannot be empty and cannot be longer than {max} characters.
	public static final String ASDSCMANAGER0009E = "ASDSCMANAGER0009E";

	// The value of the length field (${validatedValue}") is not valid. It must be
	// between 1 and 2,147,483,647.
	public static final String ASDSCMANAGER0010E = "ASDSCMANAGER0010E";

	private I18NMessages() {
		throw new IllegalStateException("I18NMessages is a Utility class. So can not instanciate.");
	}

}
