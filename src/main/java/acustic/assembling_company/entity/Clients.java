package acustic.assembling_company.entity;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clients")
@Entity
public class Clients {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "client_id")
    @Id
    private Long id;

    @Column(columnDefinition = "TEXT", name = "last_name")
    private String last_name;

    @Column(columnDefinition = "TEXT", name = "first_name")
    private String first_name;

    @Column(columnDefinition = "TEXT", name = "middle_name")
    private String middle_name;

    @Column(columnDefinition = "TEXT", name = "phone_number")
    private String phone_number;

    @Column(columnDefinition = "TEXT", name = "email")
    private String email;

}
