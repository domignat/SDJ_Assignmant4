package via.sdj3.slaughterhouse_v2.data.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import via.sdj3.slaughterhouse_v2.data.repository.IAnimalPartRep;
import via.sdj3.slaughterhouse_v2.data.repository.IAnimalRep;
import via.sdj3.slaughterhouse_v2.data.repository.IProductRep;
import via.sdj3.slaughterhouse_v2.domain.Animal;
import via.sdj3.slaughterhouse_v2.domain.AnimalPart;
import via.sdj3.slaughterhouse_v2.domain.Product;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class seedDB implements CommandLineRunner {
    @Autowired
    IProductRep productRepository;
    @Autowired
    IAnimalRep animalRepository;
    @Autowired
    IAnimalPartRep animalPartRepository;

    @Override
    public void run(String... args) throws Exception {
        loadProductData();
    }

    private void loadProductData() {

        LocalDate now = LocalDate.now();
        ArrayList<AnimalPart> animalParts = new ArrayList<>();

        animalPartRepository.deleteAll();
        productRepository.deleteAll();
        animalRepository.deleteAll();

        Product product1 = new Product("All Parts");
        Product product2 = new Product("Whole Animal");
        Product productDB = productRepository.save(product1);
        productRepository.save(product2);


        Animal animal1 = new Animal("Animal1","cow", 500, "SunnyFarm", now);
        Animal animal2 = new Animal("Animal2","sheep", 40, "SunnyFarm",now);
        Animal animal3 = new Animal("Animal3","chicken", 3, "Elly's Farm",now);

        Animal animalDB1 = animalRepository.save(animal1);
        Animal animalDB2 = animalRepository.save(animal2);
        Animal animalDB3 = animalRepository.save(animal3);

        AnimalPart animalPart1 = new AnimalPart(  200, "AnimalPart1",  productDB, animalDB1);
        AnimalPart animalPart2  = new AnimalPart(  3,"AnimalPart2",  productDB, animalDB2);
        AnimalPart animalPart3 = new AnimalPart(  1, "AnimalPart3",  productDB, animalDB3);

        animalPartRepository.save(animalPart1);
        animalPartRepository.save(animalPart2);
        animalPartRepository.save(animalPart3);
    }
}
