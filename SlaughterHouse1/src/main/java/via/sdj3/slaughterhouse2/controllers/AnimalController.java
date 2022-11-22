package via.sdj3.slaughterhouse2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse2.model.Animal;
import via.sdj3.slaughterhouse2.service.AnimalServiceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AnimalController {
    private AnimalServiceImpl animalService;
    public AnimalController(AnimalServiceImpl animalService)
    {
        this.animalService = animalService;
    }

    @PostMapping("/animals")
    public ResponseEntity<Object> createAnimal(@RequestBody Animal animal)
    {
        try {
            Animal createdAnimal = animalService.create(animal);
            return new ResponseEntity<Object>(createdAnimal, HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animals")
    public ResponseEntity<Object> getAllAnimals()
    {
        try{
            Iterable<Animal> animals = animalService.findAllItr();
            return new ResponseEntity<Object>(animals, HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value="/animalsO/{origin}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllByOrigin(@PathVariable("origin") String origin)
    {
        try{
            Iterable<Animal> animals = animalService.findAllByOrigin(origin);
            return new ResponseEntity<Object>(animals, HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value="/animalsD/{date}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllByDate(@PathVariable("date") String date)
    {
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date1 = LocalDate.parse(date, formatter);
            Iterable<Animal> animals = animalService.findAllByRegDate(date1);
            return new ResponseEntity<Object>(animals, HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value="/animals/{regNo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAnimalByRegNo(@PathVariable("regNo") Long regNo){
        try {
            Optional<Animal> animal = animalService.findByRegNo(regNo);
            if (animal.isPresent()) {
                return new ResponseEntity<Object>(animal.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/animals/{regNo}")
    public ResponseEntity<Object> updateAnimal(@PathVariable("regNo") Long regNo, @RequestBody Animal animal){
        try {
            animal.setRegistrationNumber(regNo);
            Animal savedAnimal = animalService.update(animal);
            return new ResponseEntity<Object>(savedAnimal, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/animals/{regNo}")
    public ResponseEntity<HttpStatus> deleteAnimal(@PathVariable("regNo") Long regNo){
        try {
            animalService.deleteByRegNo(regNo);
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
        }
    }
}
