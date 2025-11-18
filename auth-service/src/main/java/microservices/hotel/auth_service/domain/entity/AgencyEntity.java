package microservices.hotel.auth_service.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "agency")
@PrimaryKeyJoinColumn(name = "user_id")
public class AgencyEntity extends UserEntity {

    @Column
    private String name;

    @Column
    private String municipality;

    @Column(name = "agency_rnt")
    private Long agencyRnt;
}
