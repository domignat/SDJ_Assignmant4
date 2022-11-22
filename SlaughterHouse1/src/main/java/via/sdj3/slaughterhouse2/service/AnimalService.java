package via.sdj3.slaughterhouse2.service;

import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse2.model.Animal;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface AnimalService {
    Animal create(Animal animal);
    List<Animal> findAll();
    Iterable<Animal> findAllItr();
    Optional<Animal> findByRegNo(long regNo);
    List<Animal> findAllByOrigin(String origin);
    List<Animal> findAllByRegDate(LocalDate date);
    Animal update(Animal animal);
    void deleteByRegNo(long regNo);
}
