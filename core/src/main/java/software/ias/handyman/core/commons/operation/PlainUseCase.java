package software.ias.handyman.core.commons.operation;

public interface PlainUseCase<I extends UseCaseInput, O extends UseCaseOutput> {
    O execute(I input);
}
