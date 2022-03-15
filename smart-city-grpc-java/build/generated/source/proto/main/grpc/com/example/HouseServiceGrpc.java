package com.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: house_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HouseServiceGrpc {

  private HouseServiceGrpc() {}

  public static final String SERVICE_NAME = "untitled.HouseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.CreateHouseRequest,
      com.example.CreateHouseResponse> getCreateHouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHouse",
      requestType = com.example.CreateHouseRequest.class,
      responseType = com.example.CreateHouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.CreateHouseRequest,
      com.example.CreateHouseResponse> getCreateHouseMethod() {
    io.grpc.MethodDescriptor<com.example.CreateHouseRequest, com.example.CreateHouseResponse> getCreateHouseMethod;
    if ((getCreateHouseMethod = HouseServiceGrpc.getCreateHouseMethod) == null) {
      synchronized (HouseServiceGrpc.class) {
        if ((getCreateHouseMethod = HouseServiceGrpc.getCreateHouseMethod) == null) {
          HouseServiceGrpc.getCreateHouseMethod = getCreateHouseMethod =
              io.grpc.MethodDescriptor.<com.example.CreateHouseRequest, com.example.CreateHouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.CreateHouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.CreateHouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HouseServiceMethodDescriptorSupplier("CreateHouse"))
              .build();
        }
      }
    }
    return getCreateHouseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HouseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HouseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HouseServiceStub>() {
        @java.lang.Override
        public HouseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HouseServiceStub(channel, callOptions);
        }
      };
    return HouseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HouseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HouseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HouseServiceBlockingStub>() {
        @java.lang.Override
        public HouseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HouseServiceBlockingStub(channel, callOptions);
        }
      };
    return HouseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HouseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HouseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HouseServiceFutureStub>() {
        @java.lang.Override
        public HouseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HouseServiceFutureStub(channel, callOptions);
        }
      };
    return HouseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HouseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createHouse(com.example.CreateHouseRequest request,
        io.grpc.stub.StreamObserver<com.example.CreateHouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHouseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHouseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.CreateHouseRequest,
                com.example.CreateHouseResponse>(
                  this, METHODID_CREATE_HOUSE)))
          .build();
    }
  }

  /**
   */
  public static final class HouseServiceStub extends io.grpc.stub.AbstractAsyncStub<HouseServiceStub> {
    private HouseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HouseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HouseServiceStub(channel, callOptions);
    }

    /**
     */
    public void createHouse(com.example.CreateHouseRequest request,
        io.grpc.stub.StreamObserver<com.example.CreateHouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHouseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HouseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HouseServiceBlockingStub> {
    private HouseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HouseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HouseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.CreateHouseResponse createHouse(com.example.CreateHouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHouseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HouseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HouseServiceFutureStub> {
    private HouseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HouseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HouseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.CreateHouseResponse> createHouse(
        com.example.CreateHouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHouseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOUSE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HouseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HouseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HOUSE:
          serviceImpl.createHouse((com.example.CreateHouseRequest) request,
              (io.grpc.stub.StreamObserver<com.example.CreateHouseResponse>) responseObserver);
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

  private static abstract class HouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HouseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.HouseServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HouseService");
    }
  }

  private static final class HouseServiceFileDescriptorSupplier
      extends HouseServiceBaseDescriptorSupplier {
    HouseServiceFileDescriptorSupplier() {}
  }

  private static final class HouseServiceMethodDescriptorSupplier
      extends HouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HouseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HouseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HouseServiceFileDescriptorSupplier())
              .addMethod(getCreateHouseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
