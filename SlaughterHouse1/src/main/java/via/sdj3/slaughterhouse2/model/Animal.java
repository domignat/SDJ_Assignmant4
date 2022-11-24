package via.sdj3.slaughterhouse2.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long registrationNumber;

    @NotBlank(message = "Animal name cannot be null")
    @Column(name = "animal_name")
    private String animal_name;

    @NotBlank(message = "Animal type cannot be null")
    @Column(name = "animal_type")
    private String animal_type;

    @Min(value = 0,message = "Animal cannot weight less than 0")
    @Max(value = 2000,message = "Animal cannot weight more than 2000")
    @NotNull
    @Column(name = "weight", nullable = false)
    private double weight;

    @Column(name = "origin")
    private String origin;

    @Column(name = "registration_date", nullable = false)
    private LocalDate registration_date;

}
