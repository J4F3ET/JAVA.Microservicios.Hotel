package microservices.hotel.hotel_service.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "guest")
public class GuestEntity {
    @EmbeddedId
    private GuestId guestId;

    @MapsId(value = "reservationId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id")
    private ReservationEntity reservation;

    @MapsId(value = "registrationId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registration_id")
    private RegistrationEntity registration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_type_id")
    private  DocumentTypeEntity documentType;

    @Column
    private Date birthDate;

    @Column
    private Long identification;

    @Column
    private String name;

    @Column
    private String surname;

}
