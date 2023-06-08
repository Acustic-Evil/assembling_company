package acustic.assembling_company.entity;

import lombok.*;
import jakarta.persistence.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "components")
@Entity
public class Components {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "component_id")
    @Id
    private Long id;

    @Column(columnDefinition = "TEXT", name = "name")
    private String name;

    @Column(name = "current_quantity")
    private Long current_quantity;

    @Column(name = "minimum_stock")
    private Long minimum_stock;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "company_id", referencedColumnName = "company_id", foreignKey = @ForeignKey(name = "company_id"))
    private Company company;
}
