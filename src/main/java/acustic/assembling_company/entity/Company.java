package acustic.assembling_company.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company")
@Entity
public class Company {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "company_id")
    @Id
    private Long id;

    @Column(columnDefinition = "TEXT", name = "name")
    private String name;
}
