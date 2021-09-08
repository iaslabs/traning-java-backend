package software.ias.handyman.core.gateways;

import software.ias.handyman.core.domain.Technician;
import software.ias.handyman.core.domain.TechnicianId;

import java.util.List;
import java.util.Optional;

public interface PlainTechniciansRepository {
    void storeTechnician(Technician technician);

    void updateTechnician(Technician technician);

    List<Technician> listTechnicians();

    Optional<Technician> getTechnicianById(TechnicianId technicianId);

    void deleteTechnician(TechnicianId technicianId);
}
