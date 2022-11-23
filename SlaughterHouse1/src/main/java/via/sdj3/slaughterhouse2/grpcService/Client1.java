package via.sdj3.slaughterhouse2.grpcService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import via.sdj3.slaughterhouse2.model.Animal;
import via.sdj3.slaughterhouse2.protobuf.AnimalGrpc;
import via.sdj3.slaughterhouse2.protobuf.AnimalResponse;
import via.sdj3.slaughterhouse2.protobuf.LocalDateGrpc;
import via.sdj3.slaughterhouse2.protobuf.SlaughterHouse1Grpc;

@Component
public class Client1 {

    public void createAnimal(Animal animal)
    {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8842).usePlaintext().build();
        SlaughterHouse1Grpc.SlaughterHouse1BlockingStub stub = SlaughterHouse1Grpc.newBlockingStub(managedChannel);

        LocalDateGrpc localDateGrpc = LocalDateGrpc.newBuilder()
                .setDay(animal.getRegistration_date().getDayOfMonth())
                .setMonth(animal.getRegistration_date().getMonthValue())
                .setYear(animal.getRegistration_date().getYear())
                .build();

        AnimalGrpc animalGrpc = AnimalGrpc.newBuilder()
                .setRegistrationNumber(animal.getRegistrationNumber())
                .setAnimalName(animal.getAnimal_name())
                .setAnimalType(animal.getAnimal_type())
                .setOrigin(animal.getOrigin())
                .setWeight(animal.getWeight())
                .setRegistrationDate(localDateGrpc)
                .build();

        AnimalResponse animalResponse = stub.createAnimal(animalGrpc);
        managedChannel.shutdown();
    }

}
