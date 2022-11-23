package via.sdj3.slaughterhouse_v2.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.slaughterhouse_v2.protobuf.SlaughterHouse3Grpc;
import via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc;
import via.sdj3.slaughterhouse_v2.protobuf.TrayResponse;

@GRpcService
public class SlaughterHouse2 extends SlaughterHouse3Grpc.SlaughterHouse3ImplBase {


    @Override
    public void sendTray(TrayGrpc request, StreamObserver<TrayResponse> responseObserver) {
        super.sendTray(request, responseObserver);
    }
}
