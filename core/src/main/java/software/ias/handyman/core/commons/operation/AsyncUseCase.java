package software.ias.handyman.core.commons.operation;

import software.ias.handyman.core.commons.utils.Either;

import java.util.concurrent.CompletableFuture;

public interface AsyncUseCase<I extends UseCaseInput, O extends UseCaseOutput> {
    CompletableFuture<Either<InternalError, O>> execute(I input, UseCaseContext context);
}
