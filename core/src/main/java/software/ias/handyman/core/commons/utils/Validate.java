package software.ias.handyman.core.commons.utils;

import java.util.function.Predicate;

public class Validate {

    private Validate() {
    }

    public static void isTrue(final boolean expression, final String message, final Object... values) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(message, values));
        }
    }

    public static <T> T notNull(final T object, final String message, final Object... values) {
        if (object == null) {
            throw new NullPointerException(String.format(message, values));
        }
        return object;
    }

    public static <T> T paramNotNull(final T object, final String paramName) {
        if (object == null) {
            throw new NullPointerException(String.format("%s must not be null.", paramName));
        }
        return object;
    }

    public static <T extends CharSequence> T paramNotBlank(final T chars, final String paramName) {
        if (chars == null) {
            throw new NullPointerException(String.format("%s must not be null.", paramName));
        }
        if (StringUtils.isBlank(chars)) {
            throw new IllegalArgumentException(String.format("%s must not be blank or empty.", paramName));
        }
        return chars;
    }


    public static <T> T validState(final T object, final Predicate<T> test, final String message, final Object... values) {
        if (!test.test(object)) {
            throw new IllegalStateException(String.format(message, values));
        }
        return object;
    }

    public static <T extends Comparable<U>, U> T exclusiveBetween(
            final U start,
            final U end,
            final T value,
            final String message,
            final Object... values
    ) {
        if (value.compareTo(start) <= 0 || value.compareTo(end) >= 0) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return value;
    }


}
