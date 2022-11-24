package via.sdj3.slaugtherhouse2.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

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

    @Autowired
    public Tray(String partType, double maxWeight)
    {
        this.partType = partType;
        this.maxWeight = maxWeight;
    }
}
