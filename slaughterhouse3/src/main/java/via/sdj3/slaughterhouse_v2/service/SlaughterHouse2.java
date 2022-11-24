package via.sdj3.slaughterhouse_v2.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sdj3.slaughterhouse_v2.domain.Tray;
import via.sdj3.slaughterhouse_v2.logic.ProductPackagingLogic;
import via.sdj3.slaughterhouse_v2.protobuf.SlaughterHouse3Grpc;
import via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc;
import via.sdj3.slaughterhouse_v2.protobuf.TrayResponse;
import via.sdj3.slaughterhouse_v2.protobuf.TraysGrpc;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class SlaughterHouse2 extends SlaughterHouse3Grpc.SlaughterHouse3ImplBase {

    private ProductPackagingLogic logic;

    @Autowired
    public SlaughterHouse2(ProductPackagingLogic logic)
    {
        this.logic = logic;
    }

    @Override
    public void sendTrays(TraysGrpc request, StreamObserver<TrayResponse> responseObserver) {
        List<Tray> trays = new ArrayList<Tray>();
        for (int i=0;i<request.getTrayCount();i++)
        {
            trays.add(new Tray(request.getTray(i).getTrayId(), request.getTray(i).getPartType(), request.getTray(i).getMaxWeight()));
        }
        logic.makePackage("parts", trays);
        responseObserver.onNext(TrayResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}
