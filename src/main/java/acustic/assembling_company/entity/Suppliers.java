package acustic.assembling_company.entity;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "suppliers")
@Entity
public class Suppliers {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "supplier_id")
    @Id
    private Long id;

    @Column(columnDefinition = "TEXT", name = "name")
    private String name;

    @Column(columnDefinition = "TEXT", name = "address")
    private String address;

    @Column(columnDefinition = "TEXT", name = "phone_number")
    private String phone_number;

    @Column(columnDefinition = "TEXT", name = "debt")
    private String debt;
}
