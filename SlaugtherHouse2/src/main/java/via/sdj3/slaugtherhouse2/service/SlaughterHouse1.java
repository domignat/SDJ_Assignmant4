package via.sdj3.slaugtherhouse2.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sdj3.slaugtherhouse2.domain.Animal;
import via.sdj3.slaugtherhouse2.logic.AnimalCutterLogic;
import via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc;
import via.sdj3.slaugtherhouse2.protobuf.AnimalResponse;
import via.sdj3.slaugtherhouse2.protobuf.SlaughterHouse1Grpc;

import java.sql.Date;
import java.time.LocalDate;

@GRpcService
public class SlaughterHouse1 extends SlaughterHouse1Grpc.SlaughterHouse1ImplBase {

    private AnimalCutterLogic logic;

    @Autowired
    public SlaughterHouse1(AnimalCutterLogic logic)
    {
        this.logic = logic;
    }

    @Override
    public void createAnimal(AnimalGrpc request, StreamObserver<AnimalResponse> responseObserver)
    {
        LocalDate date = LocalDate.of(request.getRegistrationDate().getYear(), request.getRegistrationDate().getMonth(), request.getRegistrationDate().getDay());
        Animal animal = new Animal(request.getRegistrationNumber(), request.getAnimalName(), request.getAnimalType(), request.getWeight(), request.getOrigin(), date);
        Animal newAnimal = logic.saveAnimal(animal);
        logic.cut(newAnimal);
        responseObserver.onNext(AnimalResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}
