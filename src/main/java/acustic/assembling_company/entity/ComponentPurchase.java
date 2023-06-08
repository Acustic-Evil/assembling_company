package acustic.assembling_company.entity;
import lombok.*;
import jakarta.persistence.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "component_purchase")
@Entity
public class ComponentPurchase {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "purchase_id")
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "component_id", referencedColumnName = "component_id", foreignKey = @ForeignKey(name = "component_id"))
    private Components component_id;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "client_id", referencedColumnName = "client_id", foreignKey = @ForeignKey(name = "client_id"))
    private Clients client_id;

    @Column(name = "delivery_date")
    private Date delivery_date;

    @Column(name = "purchase_date")
    private Date purchase_date;

    @Column(name = "purchase_price")
    private Long purchase_price;

    @Column(name = "component_amount")
    private Integer component_amount;
}
