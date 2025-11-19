package microservices.hotel.payment_service.domain.entity;

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
@Table(name = "invoice")
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_id")
    private BillEntity bill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private InvoiceStatusEntity status;

    @Column(name = "invoide_number")
    private Long invoiceNumber;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "issues_date")
    private Date issuesDate;

    @Column(name = "subtotal_amount")
    private Long subtotalAmount;

    @Column(name = "tax_amount")
    private Long taxTotalAmount;

    @Column(name = "discount_amount")
    private Long discountAmount;

    @Column(name = "fina_total_amount")
    private Long finalTotalAmount;

    @Column(name = "balance_due")
    private Long balanceDue;
}
