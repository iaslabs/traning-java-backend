package software.ias.handyman.infrastructure.controller;

import org.springframework.web.bind.annotation.*;
import software.ias.handyman.core.domain.Technician;

import java.util.List;

/**
 * First task: Use this file to implement the technician
 * controller, do not forget to add the
 * corresponding Spring framework annotation to mark
 * this class as a controller.
 *
 * Second task: Implement the createTechnician EndPoint.
 * Third task: The contextPath for this controller should be /technician
 *
 */
@RestController
@RequestMapping("/technician")
public class TechnicianController {

    //Start Third task

    @GetMapping
    private List<Technician> getAllTechnicians (){
        return null;
    }

    @PutMapping("/{id}")
    private Technician updateTechnician (){
        return null;
    }

    @GetMapping("/{id}")
    private Technician getTechnician(){
        return null;
    }

    @DeleteMapping
    private Boolean deleteTechnician(){
        return null;
    }

    //END Third task
}
