package via.sdj3.slaugtherhouse2.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaugtherhouse2.data.repository.IAnimalPartRep;
import via.sdj3.slaugtherhouse2.data.repository.IAnimalRep;
import via.sdj3.slaugtherhouse2.data.repository.IProductRep;
import via.sdj3.slaugtherhouse2.data.repository.ITrayRep;
import via.sdj3.slaugtherhouse2.domain.Animal;
import via.sdj3.slaugtherhouse2.domain.AnimalPart;
import via.sdj3.slaugtherhouse2.domain.Tray;
import via.sdj3.slaugtherhouse2.grpcService.Client2;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalCutterLogic {
    private IAnimalRep animalRep;
    private IAnimalPartRep animalPartRep;
    private IProductRep productRep;
    private ITrayRep trayRep;

    private Client2 client2;

    @Autowired
    public AnimalCutterLogic(IAnimalRep animalRep, IAnimalPartRep animalPartRep, IProductRep productRep, ITrayRep trayRep, Client2 client2) {
        this.animalRep = animalRep;
        this.animalPartRep = animalPartRep;
        this.productRep = productRep;
        this.trayRep = trayRep;
        this.client2 = client2;
    }

    public Animal saveAnimal(Animal animal)
    {
        return animalRep.save(animal);
    }
    public void cut(Animal animal)
    {
        List<AnimalPart> animalParts = new ArrayList<>();
        switch (animal.getAnimal_type())
        {
            case "cow":
                AnimalPart cowNeck = new AnimalPart(0.10*animal.getWeight(), "cowNeck", animal);
                AnimalPart chuck = new AnimalPart(0.15*animal.getWeight(), "cowChuck", animal);
                AnimalPart rib = new AnimalPart(0.10*animal.getWeight(), "cowRib", animal);
                AnimalPart shortLoin = new AnimalPart(0.10*animal.getWeight(), "cowLoin", animal);
                AnimalPart flank = new AnimalPart(0.15*animal.getWeight(), "cowFlank", animal);
                AnimalPart round = new AnimalPart(0.10*animal.getWeight(), "cowRound", animal);
                AnimalPart rump = new AnimalPart(0.10*animal.getWeight(), "cowRump", animal);
                AnimalPart shank = new AnimalPart(0.10*animal.getWeight(), "cowShank", animal);
                animalParts.add(cowNeck);
                animalParts.add(chuck);
                animalParts.add(rib);
                animalParts.add(shortLoin);
                animalParts.add(flank);
                animalParts.add(round);
                animalParts.add(rump);
                animalParts.add(shank);
                break;
            case "chicken":
                AnimalPart  wing1 = new AnimalPart(0.10*animal.getWeight(), "chickenWing", animal);
                AnimalPart  wing2 = new AnimalPart(0.10*animal.getWeight(), "chickenWing", animal);
                AnimalPart leg1 = new AnimalPart(0.15*animal.getWeight(), "chickenLeg", animal);
                AnimalPart leg2 = new AnimalPart(0.15*animal.getWeight(), "chickenLeg", animal);
                AnimalPart breast = new AnimalPart(0.30*animal.getWeight(), "chickenBreast", animal);
                AnimalPart neck = new AnimalPart(0.10*animal.getWeight(), "chickenNeck", animal);
                AnimalPart back = new AnimalPart(0.10*animal.getWeight(), "chickenBack", animal);
                animalParts.add(wing1);
                animalParts.add(wing2);
                animalParts.add(leg1);
                animalParts.add(leg2);
                animalParts.add(breast);
                animalParts.add(neck);
                animalParts.add(back);
                break;
            case "sheep":
                AnimalPart sheepNeck = new AnimalPart(0.10*animal.getWeight(), "sheepNeck", animal);
                AnimalPart sheepRib = new AnimalPart(0.10*animal.getWeight(), "sheepRib", animal);
                AnimalPart sheepBreast = new AnimalPart(0.20*animal.getWeight(), "sheepBreast", animal);
                AnimalPart sheepLeg1 = new AnimalPart(0.15*animal.getWeight(), "sheepLeg", animal);
                AnimalPart sheepLeg2 = new AnimalPart(0.15*animal.getWeight(), "sheepLeg", animal);
                AnimalPart sheepFlank = new AnimalPart(0.10*animal.getWeight(), "sheepFlank", animal);
                AnimalPart sheepShank = new AnimalPart(0.10*animal.getWeight(), "sheepShank", animal);
                animalParts.add(sheepNeck);
                animalParts.add(sheepRib);
                animalParts.add(sheepBreast);
                animalParts.add(sheepLeg1);
                animalParts.add(sheepLeg2);
                animalParts.add(sheepFlank);
                animalParts.add(sheepShank);
                break;
            case "pig":
                AnimalPart head = new AnimalPart(0.20*animal.getWeight(), "pigHead", animal);
                AnimalPart belly = new AnimalPart(0.10*animal.getWeight(), "pigBelly", animal);
                AnimalPart loin = new AnimalPart(0.30*animal.getWeight(), "pigLoin", animal);
                AnimalPart pigLeg1 = new AnimalPart(0.20*animal.getWeight(), "pigLeg", animal);
                AnimalPart pigLeg2 = new AnimalPart(0.20*animal.getWeight(), "pigLeg", animal);
                animalParts.add(head);
                animalParts.add(belly);
                animalParts.add(loin);
                animalParts.add(pigLeg1);
                animalParts.add(pigLeg2);
                break;
            case "turkey":
                AnimalPart turkeyBreast = new AnimalPart(0.30*animal.getWeight(), "turkeyBreast", animal);
                AnimalPart turkeyWing1 = new AnimalPart(0.10*animal.getWeight(), "turkeyWing", animal);
                AnimalPart turkeyWing2 = new AnimalPart(0.10*animal.getWeight(), "turkeyWing", animal);
                AnimalPart turkeyNeck = new AnimalPart(0.20*animal.getWeight(), "turkeyNeck", animal);
                AnimalPart turkeyLeg1 = new AnimalPart(0.15*animal.getWeight(), "turkeyLeg", animal);
                AnimalPart turkeyLeg2 = new AnimalPart(0.15*animal.getWeight(), "turkeyLeg", animal);
                animalParts.add(turkeyBreast);
                animalParts.add(turkeyWing1);
                animalParts.add(turkeyWing2);
                animalParts.add(turkeyNeck);
                animalParts.add(turkeyLeg1);
                animalParts.add(turkeyLeg2);
                break;
            case "fish":
                AnimalPart fish = new AnimalPart(animal.getWeight(), "fish", animal);
                animalParts.add(fish);
                break;
            default: break;
        }
        List<AnimalPart> newAnimalParts = animalPartRep.saveAll(animalParts);
        putIntoTrays(newAnimalParts);
    }

    public void putIntoTrays(List<AnimalPart> animalParts)
    {
        List<Tray> trays = new ArrayList<Tray>();
        for (int i=0;i<animalParts.size();i++)
        {
            Tray tray1 = new Tray(animalParts.get(i).getPart_name(), animalParts.get(i).getWeight());
            animalParts.get(i).setTray(tray1);
            trays.add(tray1);
            //client2.sendTray(tray1);
        }
        List<Tray> newTrays = trayRep.saveAll(trays);
        client2.sendTrays(newTrays);
    }
}
