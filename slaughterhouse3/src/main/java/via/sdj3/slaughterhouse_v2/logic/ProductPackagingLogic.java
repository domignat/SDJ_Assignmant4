package via.sdj3.slaughterhouse_v2.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse_v2.data.repository.IAnimalPartRep;
import via.sdj3.slaughterhouse_v2.data.repository.IAnimalRep;
import via.sdj3.slaughterhouse_v2.data.repository.IProductRep;
import via.sdj3.slaughterhouse_v2.data.repository.ITrayRep;
import via.sdj3.slaughterhouse_v2.domain.AnimalPart;
import via.sdj3.slaughterhouse_v2.domain.Product;
import via.sdj3.slaughterhouse_v2.domain.Tray;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductPackagingLogic {
    private IAnimalRep animalRep;
    private IAnimalPartRep animalPartRep;
    private IProductRep productRep;
    private ITrayRep trayRep;

    @Autowired
    public ProductPackagingLogic(IAnimalRep animalRep, IAnimalPartRep animalPartRep, IProductRep productRep, ITrayRep trayRep) {
        this.animalRep = animalRep;
        this.animalPartRep = animalPartRep;
        this.productRep = productRep;
        this.trayRep = trayRep;
    }

    public void makePackage(String type, List<Tray> trays)
    {
        Product product = new Product();
        if(type.equals("parts"))
        {
            String partType = trays.get(0).getPartType();
            product.setProduct_type(partType);
            productRep.save(product);
            trayRep.delete(trays.get(0));
            for (int i=1;i<trays.size();i++)
            {
                if(partType.equals(trays.get(i).getPartType()))
                    trayRep.delete(trays.get(i));
            }
        }
        else if(type.equals("animal"))
        {
            String part_name = trays.get(0).getPartType();
            String name = "" + part_name.charAt(0) + part_name.charAt(1);

            switch (name)
            {
                case "co":
                    name = "cow";
                    break;
                case "ch":
                    name = "chicken";
                    break;
                case "sh":
                    name = "sheep";
                    break;
                case "tu":
                    name = "turkey";
                    break;
                case "fi":
                    name = "fish";
                    break;
                default:break;
            }
            product.setProduct_type(name);
            productRep.save(product);
            trayRep.delete(trays.get(0));
            for (int i=1;i<trays.size();i++)
            {
                if(trays.get(i).getPartType().startsWith(name))
                    trayRep.delete(trays.get(i));
            }
        }
    }
}
