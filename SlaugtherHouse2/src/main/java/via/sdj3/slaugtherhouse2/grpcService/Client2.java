package via.sdj3.slaugtherhouse2.grpcService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;
import via.sdj3.slaugtherhouse2.domain.Tray;
import via.sdj3.slaugtherhouse2.protobuf.SlaughterHouse3Grpc;
import via.sdj3.slaugtherhouse2.protobuf.TrayGrpc;
import via.sdj3.slaugtherhouse2.protobuf.TrayResponse;
import via.sdj3.slaugtherhouse2.protobuf.TraysGrpc;

import java.util.ArrayList;
import java.util.List;

@Component
public class Client2 {

    public void sendTray(Tray tray)
    {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8843).usePlaintext().build();
        SlaughterHouse3Grpc.SlaughterHouse3BlockingStub stub = SlaughterHouse3Grpc.newBlockingStub(managedChannel);

        TrayGrpc trayGrpc = TrayGrpc.newBuilder()
                .setTrayId(tray.getId())
                .setPartType(tray.getPartType())
                .setMaxWeight(tray.getMaxWeight())
                .build();

        TrayResponse trayResponse = stub.sendTray(trayGrpc);
        managedChannel.shutdown();
    }

    public void sendTrays(List<Tray> trays)
    {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8843).usePlaintext().build();
        SlaughterHouse3Grpc.SlaughterHouse3BlockingStub stub = SlaughterHouse3Grpc.newBlockingStub(managedChannel);

        TraysGrpc trays1 = TraysGrpc.newBuilder()
                .addAllTray(trays)
                .build();

        for (int i=0;i<trays.size();i++)
        {
            TrayGrpc trayGrpc = TrayGrpc.newBuilder()
                    .setTrayId(trays.get(i).getId())
                    .setPartType(trays.get(i).getPartType())
                    .setMaxWeight(trays.get(i).getMaxWeight())
                    .build();
        }


        TrayResponse trayResponse = stub.sendTrays(trays1);
        managedChannel.shutdown();
    }
}
