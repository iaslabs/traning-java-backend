package software.ias.handyman.core.commons.validation;


public class InputAttributeError {
    private final String attributeName;
    private final String errorMessage;

    public InputAttributeError(String attributeName, String errorMessage) {
        this.attributeName = attributeName;
        this.errorMessage = errorMessage;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
