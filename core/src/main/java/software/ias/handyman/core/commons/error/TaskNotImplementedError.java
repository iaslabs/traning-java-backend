package software.ias.handyman.core.commons.error;

public class TaskNotImplementedError extends RuntimeException {
    public TaskNotImplementedError(String module, String taskName) {
        super(String.format("Seems like you have not implemented the task %s in module %s", taskName, module));
    }
}
