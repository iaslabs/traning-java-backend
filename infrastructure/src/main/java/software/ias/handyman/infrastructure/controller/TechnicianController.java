package software.ias.handyman.infrastructure.controller;


import org.springframework.web.bind.annotation.*;
import software.ias.handyman.core.domain.Technician;

import java.util.List;

/**
 * Clase donde se definen los puntos de entrada a las operaciones que va a realizar la API.
 *
 */
@RestController
@RequestMapping("/technician")
public class TechnicianController {

    /*
     * El contextPath por el que responde este controller es /Technician
     * Crear la operación para la creación de un tecnico. Create()
     * Realizar la inyección de dependencias del servicio que contiene la lógica.
     */

    /**
     *
     * Método que debe realizar la consulta de todos los técnicos que contiene el sistema.
     */
    @GetMapping
    private List<Technician> getAll (){
        return null;
    }

    /**
     *
     * Método que debe realizar la actualización de un técnico por id.
     */
    @PutMapping("/{id}")
    private Technician update (){
        return null;
    }

    /**
     *
     * Método que debe realizar la consulta de un técnico por id.
     */
    @GetMapping("/{id}")
    private Technician get(){
        return null;
    }

    /**
     *
     * Método que debe realizar el borrado físico de un técnico por id.
     */
    @DeleteMapping
    private Boolean delete(){
        return null;
    }

}
