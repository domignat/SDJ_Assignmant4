package via.sdj3.slaughterhouse_v2.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhouse_v2.data.repository.IAnimalPartRep;
import via.sdj3.slaughterhouse_v2.data.repository.IAnimalRep;
import via.sdj3.slaughterhouse_v2.data.repository.IProductRep;
import via.sdj3.slaughterhouse_v2.domain.Animal;
import via.sdj3.slaughterhouse_v2.domain.AnimalPart;
import via.sdj3.slaughterhouse_v2.domain.Product;
import via.sdj3.slaughterhouse_v2.protobuf.AnimalId;
import via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc;
import via.sdj3.slaughterhouse_v2.protobuf.ProductId;
import via.sdj3.slaughterhouse_v2.protobuf.SlaughterHouseGrpc;

import java.util.List;
import java.util.Optional;

@GRpcService

public class SlaughterHouseImpl extends SlaughterHouseGrpc.SlaughterHouseImplBase{
    private final IProductRep productRepository;
    private final IAnimalRep animalRepository;
    private final IAnimalPartRep animalPartRepository;

    public SlaughterHouseImpl(IProductRep productRepository, IAnimalRep animalRepository, IAnimalPartRep animalPartRepository) {
        this.productRepository = productRepository;
        this.animalRepository = animalRepository;
        this.animalPartRepository = animalPartRepository;
    }

    @Override
    public void getAnimalsFromProduct(ProductId id, StreamObserver<AnimalId> responseObserver) {
        System.out.println("Received Request ====> " + id.toString());

        Optional<Product> product = productRepository.findById((id.getProductId()));
        if (product.isEmpty())
        {
            responseObserver.onError(new Throwable("Product does not exist"));
        }
        else
        {
            List<AnimalPart> animalParts = animalPartRepository.getAnimalPartsFromProduct(product.get().getId());
            for (AnimalPart animalPart : animalParts) {
                AnimalId animalId = AnimalId.newBuilder().setAnimalId(animalPart.getAnimal().getId()).build();
                responseObserver.onNext(animalId);
            }
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getProductsFromAnimal(AnimalId id,
                                      StreamObserver<ProductGrpc> responseObserver) {
        System.out.println("Received Request ====> " + id.toString());
        Optional<Animal> animal = animalRepository.findById(id.getAnimalId());
        if(animal.isEmpty())
        {
            responseObserver.onError(new Throwable("animal does not exist"));
        }
        else
        {
            List<AnimalPart> animalParts = animalPartRepository.getAnimalPartsFromAnimal(animal.get().getId());
            for(AnimalPart animalPart: animalParts)
            {
                ProductGrpc productDto = ProductGrpc.newBuilder()
                        .setProductId(animalPart.getProduct().getId())
                        .setProductType(animalPart.getProduct().getProduct_type()).build();
                responseObserver.onNext(productDto);
            }
        }
        responseObserver.onCompleted();
    }
}
