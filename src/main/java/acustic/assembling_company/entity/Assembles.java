package acustic.assembling_company.entity;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "assembles")
@Entity
public class Assembles {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "assembly_id")
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "component_id", referencedColumnName = "component_id", foreignKey = @ForeignKey(name = "component_id"))
    private Components component_id;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "good_id", referencedColumnName = "good_id", foreignKey = @ForeignKey(name = "good_id"))
    private Goods good_id;

    @Column(name = "amount_of_details")
    private Integer amount_of_details;
}
