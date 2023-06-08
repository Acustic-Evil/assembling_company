package acustic.assembling_company.entity;
import lombok.*;
import jakarta.persistence.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "goods_purchase")
@Entity
public class GoodsPurchase {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGSERIAL", name = "purchase_id")
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "good_id", referencedColumnName = "good_id", foreignKey = @ForeignKey(name = "good_id"))
    private Goods good_id;

    @ManyToOne
    @JoinColumn(columnDefinition = "BIGSERIAL", name = "client_id", referencedColumnName = "client_id", foreignKey = @ForeignKey(name = "client_id"))
    private Clients client_id;

    @Column(name = "delivery_date")
    private Date delivery_date;

    @Column(name = "purchase_date")
    private Date purchase_date;

    @Column(name = "purchase_price")
    private Long purchase_price;

    @Column(name = "good_amount")
    private Integer good_amount;
}
