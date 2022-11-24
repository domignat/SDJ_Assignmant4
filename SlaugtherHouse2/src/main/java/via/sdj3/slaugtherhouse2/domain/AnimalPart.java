package via.sdj3.slaugtherhouse2.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnimalPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Min(value = 0,message = "Animal part cannot weight less than 0")
    @Max(value = 200,message = "Animal part cannot weight more than 200")
    @Column(name = "weight", nullable = false)
    private double weight;

    @NotBlank
    @Column(name = "part_name", nullable = false)
    private String part_name;

    @ManyToOne(fetch = FetchType.EAGER)
    @ToString.Exclude
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER)
    @ToString.Exclude
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;

    @ManyToOne(fetch = FetchType.EAGER)
    @ToString.Exclude
    @JoinColumn(name = "tray_id")
    private Tray tray;

    @Autowired
    public AnimalPart(double weight, String part_name, Animal animal)
    {
        this.weight = weight;
        this.part_name = part_name;
        this.animal = animal;
        this.product = new Product();
        this.tray = new Tray();
    }
}
