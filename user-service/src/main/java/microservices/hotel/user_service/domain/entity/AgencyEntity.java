package microservices.hotel.user_service.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "agency")
public class AgencyEntity extends UserEntity{

    @Column
    private String name;

    @Column
    private String municipality;

    @Column(name = "agency_rnt")
    private Long agencyRnt;
}
