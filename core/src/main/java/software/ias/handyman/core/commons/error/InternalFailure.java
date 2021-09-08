package software.ias.handyman.core.commons.error;

final public class InternalFailure extends InternalError {
    private final String systemName;
    private final Throwable throwable;

    public InternalFailure(String systemName, Throwable throwable) {
        this.systemName = systemName;
        this.throwable = throwable;
    }
}
