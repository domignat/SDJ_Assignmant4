package via.sdj3.slaughterhouse2.repository;

import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhouse2.model.Animal;

import java.time.LocalDate;
import java.util.*;

@Repository
public class AnimalRepository0 {
    private static final Map<Long, Animal> animalMap = new HashMap<>();
    static {
        initDataSource();
    }

    private static void initDataSource() {
        Animal a1 = new Animal(1, "cow", "Marcy", 250, "SunnyFarm");
        Animal a2 = new Animal(2, "sheep", "Mary", 50, "McDonald's Farm");
        Animal a3 = new Animal(3, "pig", "Bob", 45, "SunnyFarm");

        animalMap.put(a1.getRegistrationNumber(), a1);
        animalMap.put(a2.getRegistrationNumber(), a2);
        animalMap.put(a3.getRegistrationNumber(), a3);
    }

    public Animal save(Animal animal)
    {
        animalMap.put(animal.getRegistrationNumber(), animal);
        return animal;
    }

    public Animal findByRegNo(long regNo) {return animalMap.get(regNo);}

    public Animal update(Animal animal)
    {
        animalMap.put(animal.getRegistrationNumber(), animal);
        return animal;
    }

    public void deleteByRegNo(long regNo) {animalMap.remove(regNo);}

    public List<Animal> findAll()
    {
        Collection<Animal> a = animalMap.values();
        List<Animal> animalList = new ArrayList<>();
        animalList.addAll(a);
        return animalList;
    }

    public List<Animal> findAllByOrigin(String origin)
    {
        Collection<Animal> a = animalMap.values();
        List<Animal> animalList = new ArrayList<>();
        for (Animal animal: a)
        {
            if(animal.getOrigin().equals(origin))
                animalList.add(animal);
        }
        return animalList;
    }

    public List<Animal> findAllByRegDate(LocalDate date)
    {
        Collection<Animal> a = animalMap.values();
        List<Animal> animalList = new ArrayList<>();
        for (Animal animal: a)
        {
            if(animal.getDate().equals(date))
                animalList.add(animal);
        }
        return animalList;
    }
}
