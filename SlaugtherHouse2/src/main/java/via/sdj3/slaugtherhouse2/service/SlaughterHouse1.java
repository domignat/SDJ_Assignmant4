package via.sdj3.slaugtherhouse2.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sdj3.slaugtherhouse2.logic.AnimalCutterLogic;
import via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc;
import via.sdj3.slaugtherhouse2.protobuf.AnimalResponse;
import via.sdj3.slaugtherhouse2.protobuf.SlaughterHouse1Grpc;

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
        //animalgrpc -> animal ... send to logic to cut
    }
}
