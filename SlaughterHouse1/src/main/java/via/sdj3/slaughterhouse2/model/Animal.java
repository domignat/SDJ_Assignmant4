package via.sdj3.slaughterhouse2.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Table(name = "animals")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long registrationNumber;
    @Column(name = "animalType")
    private String animalType;
    @Column(name = "name")
    private String name;
    @Column(name = "weight")
    private double weight;
    @Column(name = "origin")
    private String origin;
    @Column(name = "regDate")
    private LocalDate date;

    public Animal(long regNo, String animalType, String name, double weight, String origin) {
        this.registrationNumber = regNo;
        this.animalType = animalType;
        this.name = name;
        this.weight = weight;
        this.origin = origin;
        this.date = LocalDate.now();
    }

    public Animal() {this.date = LocalDate.now();}

    public long getRegistrationNumber()
    {
        return registrationNumber;
    }

    public String getAnimalType()
    {
        return animalType;
    }

    public String getName()
    {
        return name;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getOrigin()
    {
        return origin;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Animal: " + registrationNumber + ", " + animalType + ", " + name + ", " + weight + ", " + origin + ", Date: " + date;
    }
}
