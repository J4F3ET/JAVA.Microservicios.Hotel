package microservices.hotel.hotel_service.domain.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotel_phone")
public class HotelPhoneEntity {

    @EmbeddedId
    private HotelPhoneId id;

    @JoinColumn(name = "hotel_rnt", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private HotelEntity hotel;

}
