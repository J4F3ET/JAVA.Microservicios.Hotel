package microservices.hotel.payment_service.domain.entity;

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
@Table(name = "room_type")
public class RoomTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_type_id")
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(name = "max_guest")
    private Byte maxGuest;

    @ManyToMany(mappedBy = "rooms",fetch = FetchType.LAZY)
    private Set<ReservationEntity> reservations;
}
