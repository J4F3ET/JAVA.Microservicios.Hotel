package microservices.hotel.user_service.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserPhoneId implements Serializable {
    @Column(name="user_id")
    Integer userId;
    Long phone;
}
