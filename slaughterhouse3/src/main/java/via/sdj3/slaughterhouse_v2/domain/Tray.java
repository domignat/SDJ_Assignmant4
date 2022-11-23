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
public class Tray {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "part_type")
    private String partType;

    @Column(name = "max_weight")
    private double maxWeight;
}
