package software.ias.handyman.core.commons.operation;

import software.ias.handyman.core.commons.auth.UseCaseCredentials;

import java.util.UUID;

public class UseCaseContext {
    private final UseCaseCredentials credentials;
    private final UUID executionId;

    public UseCaseContext(UseCaseCredentials credentials, UUID executionId) {
        this.credentials = credentials;
        this.executionId = executionId;
    }

    public UseCaseCredentials getCredentials() {
        return credentials;
    }

    public UUID getExecutionId() {
        return executionId;
    }

    @Override
    public String toString() {
        return "UseCaseContext{" +
                "credentials=" + credentials +
                ", executionId=" + executionId +
                '}';
    }
}
