package via.sdj3.slaughterhouse_v2.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: contract.proto")
public final class SlaughterHouseGrpc {

  private SlaughterHouseGrpc() {}

  public static final String SERVICE_NAME = "SlaughterHouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.ProductId,
      via.sdj3.slaughterhouse_v2.protobuf.AnimalId> getGetAnimalsFromProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalsFromProduct",
      requestType = via.sdj3.slaughterhouse_v2.protobuf.ProductId.class,
      responseType = via.sdj3.slaughterhouse_v2.protobuf.AnimalId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.ProductId,
      via.sdj3.slaughterhouse_v2.protobuf.AnimalId> getGetAnimalsFromProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.ProductId, via.sdj3.slaughterhouse_v2.protobuf.AnimalId> getGetAnimalsFromProductMethod;
    if ((getGetAnimalsFromProductMethod = SlaughterHouseGrpc.getGetAnimalsFromProductMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetAnimalsFromProductMethod = SlaughterHouseGrpc.getGetAnimalsFromProductMethod) == null) {
          SlaughterHouseGrpc.getGetAnimalsFromProductMethod = getGetAnimalsFromProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse_v2.protobuf.ProductId, via.sdj3.slaughterhouse_v2.protobuf.AnimalId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalsFromProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse_v2.protobuf.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse_v2.protobuf.AnimalId.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("getAnimalsFromProduct"))
              .build();
        }
      }
    }
    return getGetAnimalsFromProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.AnimalId,
      via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc> getGetProductsFromAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductsFromAnimal",
      requestType = via.sdj3.slaughterhouse_v2.protobuf.AnimalId.class,
      responseType = via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.AnimalId,
      via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc> getGetProductsFromAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse_v2.protobuf.AnimalId, via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc> getGetProductsFromAnimalMethod;
    if ((getGetProductsFromAnimalMethod = SlaughterHouseGrpc.getGetProductsFromAnimalMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetProductsFromAnimalMethod = SlaughterHouseGrpc.getGetProductsFromAnimalMethod) == null) {
          SlaughterHouseGrpc.getGetProductsFromAnimalMethod = getGetProductsFromAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse_v2.protobuf.AnimalId, via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductsFromAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse_v2.protobuf.AnimalId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("getProductsFromAnimal"))
              .build();
        }
      }
    }
    return getGetProductsFromAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterHouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub>() {
        @java.lang.Override
        public SlaughterHouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseStub(channel, callOptions);
        }
      };
    return SlaughterHouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterHouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub>() {
        @java.lang.Override
        public SlaughterHouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterHouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterHouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub>() {
        @java.lang.Override
        public SlaughterHouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterHouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterHouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimalsFromProduct(via.sdj3.slaughterhouse_v2.protobuf.ProductId request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.AnimalId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsFromProductMethod(), responseObserver);
    }

    /**
     */
    public void getProductsFromAnimal(via.sdj3.slaughterhouse_v2.protobuf.AnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsFromAnimalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalsFromProductMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse_v2.protobuf.ProductId,
                via.sdj3.slaughterhouse_v2.protobuf.AnimalId>(
                  this, METHODID_GET_ANIMALS_FROM_PRODUCT)))
          .addMethod(
            getGetProductsFromAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse_v2.protobuf.AnimalId,
                via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc>(
                  this, METHODID_GET_PRODUCTS_FROM_ANIMAL)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterHouseStub extends io.grpc.stub.AbstractAsyncStub<SlaughterHouseStub> {
    private SlaughterHouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalsFromProduct(via.sdj3.slaughterhouse_v2.protobuf.ProductId request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.AnimalId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAnimalsFromProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsFromAnimal(via.sdj3.slaughterhouse_v2.protobuf.AnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductsFromAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterHouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterHouseBlockingStub> {
    private SlaughterHouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<via.sdj3.slaughterhouse_v2.protobuf.AnimalId> getAnimalsFromProduct(
        via.sdj3.slaughterhouse_v2.protobuf.ProductId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAnimalsFromProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc> getProductsFromAnimal(
        via.sdj3.slaughterhouse_v2.protobuf.AnimalId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductsFromAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterHouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterHouseFutureStub> {
    private SlaughterHouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_ANIMALS_FROM_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCTS_FROM_ANIMAL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterHouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterHouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMALS_FROM_PRODUCT:
          serviceImpl.getAnimalsFromProduct((via.sdj3.slaughterhouse_v2.protobuf.ProductId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.AnimalId>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_FROM_ANIMAL:
          serviceImpl.getProductsFromAnimal((via.sdj3.slaughterhouse_v2.protobuf.AnimalId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse_v2.protobuf.ProductGrpc>) responseObserver);
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

  private static abstract class SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterHouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.slaughterhouse_v2.protobuf.Contract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlaughterHouse");
    }
  }

  private static final class SlaughterHouseFileDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier {
    SlaughterHouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterHouseMethodDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterHouseMethodDescriptorSupplier(String methodName) {
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
      synchronized (SlaughterHouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterHouseFileDescriptorSupplier())
              .addMethod(getGetAnimalsFromProductMethod())
              .addMethod(getGetProductsFromAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
