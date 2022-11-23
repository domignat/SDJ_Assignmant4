package via.sdj3.slaughterhouse_v2.domain;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_type")
    private String product_type;

    public Product(String product_type) {
        this.product_type = product_type;
    }
}
