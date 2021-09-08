package software.ias.handyman.core.commons.model;

import io.vavr.control.Validation;
import software.ias.handyman.core.commons.utils.StringUtils;
import software.ias.handyman.core.commons.utils.Validate;
import software.ias.handyman.core.commons.validation.InputAttributeError;

public class NonEmptyString {
    private final String value;

    private static final String NULL_MESSAGE = "NonEmptyString can not be null";
    private static final String EMPTY_MESSAGE = "NonEmptyString can not be empty";

    private NonEmptyString(String value) {
        // validation logic
        Validate.notNull(value, NULL_MESSAGE);
        Validate.isTrue(StringUtils.isNotBlank(value), EMPTY_MESSAGE);
        this.value = value;
    }

    // factory
    public static Validation<InputAttributeError, NonEmptyString> validate(
            String unsafeValue,
            String attributeName
    ) {
        if (unsafeValue == null) {
            return Validation.invalid(new InputAttributeError(attributeName, NULL_MESSAGE));
        }
        if (StringUtils.isBlank(unsafeValue)) {
            return Validation.invalid(new InputAttributeError(attributeName, EMPTY_MESSAGE));
        }
        return Validation.valid(new NonEmptyString(unsafeValue));
    }

    @Override
    public String toString() {
        return value;
    }
}
