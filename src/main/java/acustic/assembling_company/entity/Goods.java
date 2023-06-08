package acustic.assembling_company.entity;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "goods")
@Entity
public class Goods {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "good_id")
    @Id
    private Long id;

    @Column(columnDefinition = "TEXT", name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(columnDefinition = "INTERVAL", name = "assembly_period")
    private String assembly_period;
}
