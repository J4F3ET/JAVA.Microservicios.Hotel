package microservices.hotel.hotel_service.domain.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
public class RegistrationUseServiceId implements Serializable {
    private Long registrationId;
    private Short serviceId;
}
