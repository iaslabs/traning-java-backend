package software.ias.handyman.core.services;

import software.ias.handyman.core.commons.operation.UseCaseContext;
import software.ias.handyman.core.gateways.PlainTechniciansRepository;
import software.ias.handyman.core.model.CreateTechnicianRequest;
import software.ias.handyman.core.model.CreateTechnicianResponse;
import software.ias.handyman.core.usecases.CreateTechnicianUseCase;

public class CreateTechnicianService implements CreateTechnicianUseCase {
    private final PlainTechniciansRepository repository;

    public CreateTechnicianService(PlainTechniciansRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateTechnicianResponse execute(CreateTechnicianRequest input) {
        return null;
    }
}
