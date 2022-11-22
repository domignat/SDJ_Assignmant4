package via.sdj3.slaughterhouse2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhouse2.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
