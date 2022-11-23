package via.sdj3.slaugtherhouse2.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import via.sdj3.slaugtherhouse2.domain.AnimalPart;

import java.util.List;

@Repository
public interface IAnimalPartRep extends JpaRepository<AnimalPart, Long>
{
    @Query(value = "SELECT * FROM animal_part a WHERE a.product_id = :product_id",nativeQuery = true)
    List<AnimalPart> getAnimalPartsFromProduct(Long product_id);

    @Query(value = "SELECT * FROM animal_part a WHERE a.animal_id = :animal_id",nativeQuery = true)
    List<AnimalPart> getAnimalPartsFromAnimal(Long animal_id);
}
