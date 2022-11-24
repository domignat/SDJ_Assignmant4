package via.sdj3.slaughterhouse_v2.data.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import via.sdj3.slaughterhouse_v2.data.repository.IAnimalPartRep;
import via.sdj3.slaughterhouse_v2.data.repository.IAnimalRep;
import via.sdj3.slaughterhouse_v2.data.repository.IProductRep;
import via.sdj3.slaughterhouse_v2.data.repository.ITrayRep;
import via.sdj3.slaughterhouse_v2.domain.Animal;
import via.sdj3.slaughterhouse_v2.domain.AnimalPart;
import via.sdj3.slaughterhouse_v2.domain.Product;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class seedDB implements CommandLineRunner {

    IProductRep productRepository;
    IAnimalRep animalRepository;
    IAnimalPartRep animalPartRepository;
    ITrayRep trayRepository;

    @Autowired
    protected seedDB(IProductRep productRepository, IAnimalRep animalRepository, IAnimalPartRep animalPartRepository, ITrayRep trayRep)
    {
        this.productRepository= productRepository;
        this.animalRepository = animalRepository;
        this.animalPartRepository = animalPartRepository;
        this.trayRepository = trayRep;
    }

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
        trayRepository.deleteAll();

    }
}
