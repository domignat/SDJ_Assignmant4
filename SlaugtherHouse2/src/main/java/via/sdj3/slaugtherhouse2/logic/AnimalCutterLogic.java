package via.sdj3.slaugtherhouse2.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaugtherhouse2.data.repository.IAnimalPartRep;
import via.sdj3.slaugtherhouse2.data.repository.IAnimalRep;
import via.sdj3.slaugtherhouse2.data.repository.IProductRep;
import via.sdj3.slaugtherhouse2.data.repository.ITrayRep;

@Service
public class AnimalCutterLogic {
    private IAnimalRep animalRep;
    private IAnimalPartRep animalPartRep;
    private IProductRep productRep;
    private ITrayRep trayRep;

    @Autowired
    public AnimalCutterLogic(IAnimalRep animalRep, IAnimalPartRep animalPartRep, IProductRep productRep, ITrayRep trayRep) {
        this.animalRep = animalRep;
        this.animalPartRep = animalPartRep;
        this.productRep = productRep;
        this.trayRep = trayRep;
    }
}
