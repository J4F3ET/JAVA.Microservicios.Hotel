package microservices.hotel.hotel_service.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class HotelPhoneId implements Serializable {
    @Column(name = "hotel_rnt")
    private Long hotelRnt;
    private Long phone;
}
