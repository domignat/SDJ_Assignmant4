package via.sdj3.slaughterhouse2.service;

import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse2.model.Animal;
import via.sdj3.slaughterhouse2.repository.AnimalRepository0;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService{

    AnimalRepository0 animalRepository;

    public AnimalServiceImpl()
    {
        this.animalRepository = new AnimalRepository0();
    }

    @Override
    public Animal create(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @Override
    public Iterable<Animal> findAllItr() {
        return animalRepository.findAll();
    }

    @Override
    public Optional<Animal> findByRegNo(long regNo) {
        return Optional.ofNullable(animalRepository.findByRegNo(regNo));
    }

    @Override
    public List<Animal> findAllByOrigin(String origin) {
        return animalRepository.findAllByOrigin(origin);
    }

    @Override
    public List<Animal> findAllByRegDate(LocalDate date) {
        return animalRepository.findAllByRegDate(date);
    }

    @Override
    public Animal update(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteByRegNo(long regNo) {
        animalRepository.deleteByRegNo(regNo);
    }
}
