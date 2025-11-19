package microservices.hotel.payment_service.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "currency_code")
public class CurrencyCodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_id")
    private Byte id;

    @Getter(AccessLevel.NONE)
    @Column
    private Short code;

    @Column
    private String country;

    public String getCode(){
        return "+"+code;
    }
}
