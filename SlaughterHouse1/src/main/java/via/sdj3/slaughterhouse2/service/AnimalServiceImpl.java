package via.sdj3.slaughterhouse2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse2.grpcService.Client1;
import via.sdj3.slaughterhouse2.model.Animal;
import via.sdj3.slaughterhouse2.repository.AnimalRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService{

    private AnimalRepository animalRepository;
    private Client1 client;

    @Autowired
    public AnimalServiceImpl(AnimalRepository animalRepository, Client1 client)
    {
        this.animalRepository = animalRepository;
        this.client = client;
    }

    @Override
    public Animal create(Animal animal)
    {
        Animal animalDb = animalRepository.save(animal);
        client.createAnimal(animalDb);
        return animalDb;
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
    public Optional<Animal> findByRegNo(long regNo) {return animalRepository.findById(regNo);
    }

    @Override
    public List<Animal> findAllByOrigin(String origin) {
        return animalRepository.findAllByOrigin(origin);
    }

    @Override
    public List<Animal> findAllByRegDate(LocalDate date) {
        return animalRepository.findAllByDateEquals(Date.valueOf(date));
    }

    @Override
    public Animal update(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteByRegNo(long regNo) {
        animalRepository.deleteById(regNo);
    }
}
