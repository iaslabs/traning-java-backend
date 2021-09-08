package software.ias.handyman.core.domain;

import io.vavr.collection.Seq;
import io.vavr.control.Validation;
import software.ias.handyman.core.commons.model.NonEmptyString;
import software.ias.handyman.core.commons.validation.InputAttributeError;

public class Technician {
    public final TechnicianId technicianId;
    public final NonEmptyString name;
    public final NonEmptyString lastName;

    public Technician(TechnicianId technicianId, NonEmptyString name, NonEmptyString lastName) {
        this.technicianId = technicianId;
        this.name = name;
        this.lastName = lastName;
    }


    public Validation<Seq<InputAttributeError>, Technician> validate(
            String technicianId,
            String name,
            String lastName
    ) {
        return Validation
                .combine(
                        TechnicianId.validate(technicianId, "technicianId"),
                        NonEmptyString.validate(name, "name"),
                        NonEmptyString.validate(lastName, "lastName")
                )
                .ap(Technician::new);
    }

    @Override
    public String toString() {
        return "Technician{" +
                "technicianId=" + technicianId +
                ", name=" + name +
                ", lastName=" + lastName +
                '}';
    }
}
