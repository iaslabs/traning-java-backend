package software.ias.handyman.infrastructure.service;

import software.ias.handyman.core.commons.error.TaskNotImplementedError;
import software.ias.handyman.core.domain.Technician;

import java.util.List;

/**
 * Technicians application services
 * <p>
 * This class contains all the methods that are
 * supported by our application regarding technicians
 * management.
 * <p>
 * First task: Spring Bean
 * Use the correct Spring Framework
 * annotation for this class, so spring can
 * discover it.
 *
 * @see <a href="https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#using.spring-beans-and-dependency-injection" />Spring boot beans docs</a>
 */
public class TechnicianServices {
    /*
     * Second tasks: Dependencies
     *
     * Which dependencies do you need for
     * this service to work?
     * Add the dependencies as final class
     * members and add the constructor to
     * initialize them.
     */
    // START Second Task.

    // END Second Task.

    /**
     * Third task: Calling the use cases.
     * <p>
     * Use these methods to call all the uses cases
     * from the core and handle the errors that may
     * arise.
     *
     * @see software.ias.handyman.core.usecases.CreateTechnicianUseCase
     * @see software.ias.handyman.core.usecases.GetTechnicianUseCase
     * @see software.ias.handyman.core.usecases.ListTechniciansUseCase
     * @see software.ias.handyman.core.usecases.UpdateTechnicianUseCase
     * @see software.ias.handyman.core.usecases.DeleteTechnicianUseCase
     */

    // START Third task
    public Technician createTechnician() {
        throw new TaskNotImplementedError("ApplicationServices:TechnicianServices", "third:createTechnician");
    }

    public Technician getTechnician() {
        throw new TaskNotImplementedError("ApplicationServices:TechnicianServices", "third:getTechnician");
    }

    public List<Technician> listAllTechnicians() {
        throw new TaskNotImplementedError("ApplicationServices:TechnicianServices", "third:listAllTechnicians");
    }

    public Technician updateTechnician() {
        throw new TaskNotImplementedError("ApplicationServices:TechnicianServices", "third:updateTechnician");
    }

    public boolean deleteTechnician() {
        throw new TaskNotImplementedError("ApplicationServices:TechnicianServices", "third:deleteTechnician");
    }


    // END Third task
}
