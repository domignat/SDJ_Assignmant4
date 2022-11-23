package via.sdj3.slaugtherhouse2.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: proto1.proto")
public final class SlaughterHouse1Grpc {

  private SlaughterHouse1Grpc() {}

  public static final String SERVICE_NAME = "SlaughterHouse1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc,
      via.sdj3.slaugtherhouse2.protobuf.AnimalResponse> getCreateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimal",
      requestType = via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc.class,
      responseType = via.sdj3.slaugtherhouse2.protobuf.AnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc,
      via.sdj3.slaugtherhouse2.protobuf.AnimalResponse> getCreateAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc, via.sdj3.slaugtherhouse2.protobuf.AnimalResponse> getCreateAnimalMethod;
    if ((getCreateAnimalMethod = SlaughterHouse1Grpc.getCreateAnimalMethod) == null) {
      synchronized (SlaughterHouse1Grpc.class) {
        if ((getCreateAnimalMethod = SlaughterHouse1Grpc.getCreateAnimalMethod) == null) {
          SlaughterHouse1Grpc.getCreateAnimalMethod = getCreateAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc, via.sdj3.slaugtherhouse2.protobuf.AnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaugtherhouse2.protobuf.AnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouse1MethodDescriptorSupplier("createAnimal"))
              .build();
        }
      }
    }
    return getCreateAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterHouse1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse1Stub>() {
        @java.lang.Override
        public SlaughterHouse1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouse1Stub(channel, callOptions);
        }
      };
    return SlaughterHouse1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterHouse1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse1BlockingStub>() {
        @java.lang.Override
        public SlaughterHouse1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouse1BlockingStub(channel, callOptions);
        }
      };
    return SlaughterHouse1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterHouse1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouse1FutureStub>() {
        @java.lang.Override
        public SlaughterHouse1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouse1FutureStub(channel, callOptions);
        }
      };
    return SlaughterHouse1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterHouse1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc getAnimalsFromProduct(ProductId) returns(stream AnimalId);
     * rpc getProductsFromAnimal(AnimalId) returns(stream ProductGrpc);
     * </pre>
     */
    public void createAnimal(via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc request,
        io.grpc.stub.StreamObserver<via.sdj3.slaugtherhouse2.protobuf.AnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc,
                via.sdj3.slaugtherhouse2.protobuf.AnimalResponse>(
                  this, METHODID_CREATE_ANIMAL)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterHouse1Stub extends io.grpc.stub.AbstractAsyncStub<SlaughterHouse1Stub> {
    private SlaughterHouse1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouse1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouse1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc getAnimalsFromProduct(ProductId) returns(stream AnimalId);
     * rpc getProductsFromAnimal(AnimalId) returns(stream ProductGrpc);
     * </pre>
     */
    public void createAnimal(via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc request,
        io.grpc.stub.StreamObserver<via.sdj3.slaugtherhouse2.protobuf.AnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterHouse1BlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterHouse1BlockingStub> {
    private SlaughterHouse1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouse1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouse1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc getAnimalsFromProduct(ProductId) returns(stream AnimalId);
     * rpc getProductsFromAnimal(AnimalId) returns(stream ProductGrpc);
     * </pre>
     */
    public via.sdj3.slaugtherhouse2.protobuf.AnimalResponse createAnimal(via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterHouse1FutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterHouse1FutureStub> {
    private SlaughterHouse1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouse1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouse1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc getAnimalsFromProduct(ProductId) returns(stream AnimalId);
     * rpc getProductsFromAnimal(AnimalId) returns(stream ProductGrpc);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaugtherhouse2.protobuf.AnimalResponse> createAnimal(
        via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterHouse1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterHouse1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ANIMAL:
          serviceImpl.createAnimal((via.sdj3.slaugtherhouse2.protobuf.AnimalGrpc) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaugtherhouse2.protobuf.AnimalResponse>) responseObserver);
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

  private static abstract class SlaughterHouse1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterHouse1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.slaugtherhouse2.protobuf.Proto1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlaughterHouse1");
    }
  }

  private static final class SlaughterHouse1FileDescriptorSupplier
      extends SlaughterHouse1BaseDescriptorSupplier {
    SlaughterHouse1FileDescriptorSupplier() {}
  }

  private static final class SlaughterHouse1MethodDescriptorSupplier
      extends SlaughterHouse1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterHouse1MethodDescriptorSupplier(String methodName) {
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
      synchronized (SlaughterHouse1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterHouse1FileDescriptorSupplier())
              .addMethod(getCreateAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
