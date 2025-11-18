package microservices.hotel.user_service.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "worker")
@PrimaryKeyJoinColumn(name = "user_id")
public class WorkerEntity extends UserEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rnt_hotel",nullable = false)
    private HotelEntity hotel;

    @ManyToMany(fetch =  FetchType.LAZY)
    @JoinTable(
            name = "worker_use_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RoleEntity> roles;

}
