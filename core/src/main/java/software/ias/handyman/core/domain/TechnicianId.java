package software.ias.handyman.core.domain;

import io.vavr.control.Validation;
import software.ias.handyman.core.commons.utils.StringUtils;
import software.ias.handyman.core.commons.utils.Validate;
import software.ias.handyman.core.commons.validation.InputAttributeError;

import java.util.Objects;
import java.util.regex.Pattern;

public class TechnicianId {
    private final String value;

    private static final Pattern pattern = Pattern.compile("^\\d{8,20}$");
    private static final String NULL_MESSAGE = "TechnicianId can not be null";
    private static final String EMPTY_MESSAGE = "TechnicianId can not be empty";
    private static final String INVALID_PATTERN_MESSAGE = "Invalid technician id";

    private TechnicianId(String value) {
        Validate.notNull(value, NULL_MESSAGE);
        Validate.isTrue(StringUtils.isNotBlank(value), EMPTY_MESSAGE);
        Validate.isTrue(pattern.matcher(value).matches(), INVALID_PATTERN_MESSAGE);
        this.value = value;
    }

    public static Validation<InputAttributeError, TechnicianId> validate(String unsafeValue, String attributeName) {
        Objects.requireNonNull(attributeName);

        if (unsafeValue == null) {
            return Validation.invalid(new InputAttributeError(attributeName, NULL_MESSAGE));
        }

        if (StringUtils.isBlank(unsafeValue)) {
            return Validation.invalid(new InputAttributeError(attributeName, EMPTY_MESSAGE));
        }

        if (!pattern.matcher(unsafeValue).matches()) {
            return Validation.invalid(new InputAttributeError(attributeName, INVALID_PATTERN_MESSAGE));
        }

        return Validation.valid(new TechnicianId(unsafeValue));
    }


    @Override
    public String toString() {
        return value;
    }


}
