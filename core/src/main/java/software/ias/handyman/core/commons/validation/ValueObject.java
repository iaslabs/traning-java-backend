package software.ias.handyman.core.commons.validation;

import io.vavr.control.Validation;

public interface ValueObject<INPUT, TYPE> {
    Validation<InputAttributeError, TYPE> validate(INPUT unsafeValue, String attributeName);

    TYPE generate(INPUT value);
}
