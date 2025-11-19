package microservices.hotel.hotel_service.domain.entity;

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
@Table(name = "service")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Short id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_rnt")
    private HotelEntity hotel;

    @Column
    private Long cost;

    @Column
    private String name;
}
