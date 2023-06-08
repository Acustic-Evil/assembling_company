package acustic.assembling_company.entity;
import lombok.*;
import jakarta.persistence.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "supply")
@Entity
public class Supply {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "supply_id")
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "supplier_id", referencedColumnName = "supplier_id", foreignKey = @ForeignKey(name = "supplier_id"))
    private Suppliers supplier_id;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "component_id", referencedColumnName = "component_id", foreignKey = @ForeignKey(name = "component_id"))
    private Components component_id;

    @Column(name = "delivery_date")
    private Date delivery_date;

    @Column(name = "wholesale_price")
    private Long wholesale_price;

    @Column(name = "scope_of_supply")
    private Long scope_of_supply;
}
