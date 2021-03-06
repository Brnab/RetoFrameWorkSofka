package co.com.client.webproject.test.helpers;

public class Dictionary {
    public static final String STATE_BY_DEFAULT_FLORIDA = "Florida";
    public static final String SUBJECT = "Customer service";
    public static final String MENSAJE_ENVIADO_EXITOSO = "Your message has been successfully sent to our team.";
    public static final String MENSAJE_EXITOSO_BANKWIRE = "You have chosen to pay by bank wire. Here is a short summary of your order:";
    public static final String MENSAJE_EXITOSO_CHEQUE = "You have chosen to pay by check. Here is a short summary of your order:";
    public static final String EMPTY_STRING = "";
    public static final String SPACE_STRING = " ";

    public static final String SPANISH_CODE_LANGUAGE = "es";
    public static final String COUNTRY_CODE = "CO";

    public static final String EMAIL_DOMAIN = "@sofmail.com";

    public static final String FILE_EVIDENCE_PROPERTY = "files.evidence";
    public static final String APP_URL_PROPERTY = "app.url";

    private static final String PROPERTIES_FILE_BASE_PATH = "src/main/resources/properties/";

    public static final String CONFIGURATION_PROPERTIES_FILE = System.getProperty("user.dir") +
            "/" +
            PROPERTIES_FILE_BASE_PATH + "configuration.properties";

    public static final String MAIL_PROPERTIES_FILE = System.getProperty("user.dir") +
            "/" +
            PROPERTIES_FILE_BASE_PATH +"mail.properties";
}
