package via.sdj3.slaughterhouse_v2.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhouse_v2.domain.Tray;
import via.sdj3.slaughterhouse_v2.logic.ProductPackagingLogic;
import via.sdj3.slaughterhouse_v2.protobuf.SlaughterHouse3Grpc;
import via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc;
import via.sdj3.slaughterhouse_v2.protobuf.TrayResponse;

@GRpcService
public class SlaughterHouse2 extends SlaughterHouse3Grpc.SlaughterHouse3ImplBase {

    private ProductPackagingLogic logic;
    @Override
    public void sendTray(TrayGrpc request, StreamObserver<TrayResponse> responseObserver) {
            //get trays -->make packages
        Tray tray =new Tray(request.getTrayId(), request.getPartType(), request.getMaxWeight());
        logic.storeTray(tray);
    }
}
