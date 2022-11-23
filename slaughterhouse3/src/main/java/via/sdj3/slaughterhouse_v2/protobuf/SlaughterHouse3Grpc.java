package via.sdj3.slaughterhouse_v2.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto2.proto")
public final class SlaughterHouse3Grpc {

  private SlaughterHouse3Grpc() {}

  public static final String SERVICE_NAME = "SlaughterHouse3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc,
      via.sdj3.slaughterhouse_v2.protobuf.TrayResponse> getSendTrayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendTray",
      requestType = via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc.class,
      responseType = via.sdj3.slaughterhouse_v2.protobuf.TrayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc,
      via.sdj3.slaughterhouse_v2.protobuf.TrayResponse> getSendTrayMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc, via.sdj3.slaughterhouse_v2.protobuf.TrayResponse> getSendTrayMethod;
    if ((getSendTrayMethod = SlaughterHouse3Grpc.getSendTrayMethod) == null) {
      synchronized (SlaughterHouse3Grpc.class) {
        if ((getSendTrayMethod = SlaughterHouse3Grpc.getSendTrayMethod) == null) {
          SlaughterHouse3Grpc.getSendTrayMethod = getSendTrayMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc, via.sdj3.slaughterhouse_v2.protobuf.TrayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendTray"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse_v2.protobuf.TrayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouse3MethodDescriptorSupplier("sendTray"))
              .build();
        }
      }
    }
    return getSendTrayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterHouse3Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse3Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse3Stub>() {
        @java.lang.Override
        public SlaughterHouse3Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouse3Stub(channel, callOptions);
        }
      };
    return SlaughterHouse3Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterHouse3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse3BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse3BlockingStub>() {
        @java.lang.Override
        public SlaughterHouse3BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouse3BlockingStub(channel, callOptions);
        }
      };
    return SlaughterHouse3BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterHouse3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse3FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse3FutureStub>() {
        @java.lang.Override
        public SlaughterHouse3FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouse3FutureStub(channel, callOptions);
        }
      };
    return SlaughterHouse3FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterHouse3ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc getAnimalsFromProduct(ProductId) returns(stream AnimalId);
     * rpc getProductsFromAnimal(AnimalId) returns(stream ProductGrpc);
     * </pre>
     */
    public void sendTray(via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.TrayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTrayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendTrayMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc,
                via.sdj3.slaughterhouse_v2.protobuf.TrayResponse>(
                  this, METHODID_SEND_TRAY)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterHouse3Stub extends io.grpc.stub.AbstractAsyncStub<SlaughterHouse3Stub> {
    private SlaughterHouse3Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouse3Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouse3Stub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc getAnimalsFromProduct(ProductId) returns(stream AnimalId);
     * rpc getProductsFromAnimal(AnimalId) returns(stream ProductGrpc);
     * </pre>
     */
    public void sendTray(via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.TrayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendTrayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterHouse3BlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterHouse3BlockingStub> {
    private SlaughterHouse3BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouse3BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouse3BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc getAnimalsFromProduct(ProductId) returns(stream AnimalId);
     * rpc getProductsFromAnimal(AnimalId) returns(stream ProductGrpc);
     * </pre>
     */
    public via.sdj3.slaughterhouse_v2.protobuf.TrayResponse sendTray(via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTrayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterHouse3FutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterHouse3FutureStub> {
    private SlaughterHouse3FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouse3FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouse3FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc getAnimalsFromProduct(ProductId) returns(stream AnimalId);
     * rpc getProductsFromAnimal(AnimalId) returns(stream ProductGrpc);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhouse_v2.protobuf.TrayResponse> sendTray(
        via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendTrayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_TRAY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterHouse3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterHouse3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_TRAY:
          serviceImpl.sendTray((via.sdj3.slaughterhouse_v2.protobuf.TrayGrpc) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.TrayResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SlaughterHouse3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterHouse3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.slaughterhouse_v2.protobuf.Proto2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlaughterHouse3");
    }
  }

  private static final class SlaughterHouse3FileDescriptorSupplier
      extends SlaughterHouse3BaseDescriptorSupplier {
    SlaughterHouse3FileDescriptorSupplier() {}
  }

  private static final class SlaughterHouse3MethodDescriptorSupplier
      extends SlaughterHouse3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterHouse3MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SlaughterHouse3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterHouse3FileDescriptorSupplier())
              .addMethod(getSendTrayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
