package via.sdj3.slaughterhouse2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhouse2.model.Animal;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

     List<Animal> findAllByOrigin(String origin);
    // List<Animal> findAllByDateEquals(Date date);
}
