package DSCA.Internet;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Internet.proto")
public final class InternetGrpc {

  private InternetGrpc() {}

  public static final String SERVICE_NAME = "Service1.Internet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<DSCA.Internet.SensorRequest,
      DSCA.Internet.SensorResponse> getSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sensor",
      requestType = DSCA.Internet.SensorRequest.class,
      responseType = DSCA.Internet.SensorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DSCA.Internet.SensorRequest,
      DSCA.Internet.SensorResponse> getSensorMethod() {
    io.grpc.MethodDescriptor<DSCA.Internet.SensorRequest, DSCA.Internet.SensorResponse> getSensorMethod;
    if ((getSensorMethod = InternetGrpc.getSensorMethod) == null) {
      synchronized (InternetGrpc.class) {
        if ((getSensorMethod = InternetGrpc.getSensorMethod) == null) {
          InternetGrpc.getSensorMethod = getSensorMethod = 
              io.grpc.MethodDescriptor.<DSCA.Internet.SensorRequest, DSCA.Internet.SensorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1.Internet", "Sensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.Internet.SensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.Internet.SensorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InternetMethodDescriptorSupplier("Sensor"))
                  .build();
          }
        }
     }
     return getSensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DSCA.Internet.Message,
      DSCA.Internet.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = DSCA.Internet.Message.class,
      responseType = DSCA.Internet.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DSCA.Internet.Message,
      DSCA.Internet.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<DSCA.Internet.Message, DSCA.Internet.Empty> getEmptyMethod;
    if ((getEmptyMethod = InternetGrpc.getEmptyMethod) == null) {
      synchronized (InternetGrpc.class) {
        if ((getEmptyMethod = InternetGrpc.getEmptyMethod) == null) {
          InternetGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<DSCA.Internet.Message, DSCA.Internet.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service1.Internet", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.Internet.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.Internet.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InternetMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternetStub newStub(io.grpc.Channel channel) {
    return new InternetStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternetBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InternetBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternetFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InternetFutureStub(channel);
  }

  /**
   */
  public static abstract class InternetImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary streaming
     * </pre>
     */
    public void sensor(DSCA.Internet.SensorRequest request,
        io.grpc.stub.StreamObserver<DSCA.Internet.SensorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSensorMethod(), responseObserver);
    }

    /**
     */
    public void empty(DSCA.Internet.Message request,
        io.grpc.stub.StreamObserver<DSCA.Internet.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSensorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                DSCA.Internet.SensorRequest,
                DSCA.Internet.SensorResponse>(
                  this, METHODID_SENSOR)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                DSCA.Internet.Message,
                DSCA.Internet.Empty>(
                  this, METHODID_EMPTY)))
          .build();
    }
  }

  /**
   */
  public static final class InternetStub extends io.grpc.stub.AbstractStub<InternetStub> {
    private InternetStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InternetStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternetStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InternetStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary streaming
     * </pre>
     */
    public void sensor(DSCA.Internet.SensorRequest request,
        io.grpc.stub.StreamObserver<DSCA.Internet.SensorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSensorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void empty(DSCA.Internet.Message request,
        io.grpc.stub.StreamObserver<DSCA.Internet.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InternetBlockingStub extends io.grpc.stub.AbstractStub<InternetBlockingStub> {
    private InternetBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InternetBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternetBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InternetBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary streaming
     * </pre>
     */
    public DSCA.Internet.SensorResponse sensor(DSCA.Internet.SensorRequest request) {
      return blockingUnaryCall(
          getChannel(), getSensorMethod(), getCallOptions(), request);
    }

    /**
     */
    public DSCA.Internet.Empty empty(DSCA.Internet.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InternetFutureStub extends io.grpc.stub.AbstractStub<InternetFutureStub> {
    private InternetFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InternetFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternetFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InternetFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary streaming
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DSCA.Internet.SensorResponse> sensor(
        DSCA.Internet.SensorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSensorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DSCA.Internet.Empty> empty(
        DSCA.Internet.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SENSOR = 0;
  private static final int METHODID_EMPTY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InternetImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InternetImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SENSOR:
          serviceImpl.sensor((DSCA.Internet.SensorRequest) request,
              (io.grpc.stub.StreamObserver<DSCA.Internet.SensorResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((DSCA.Internet.Message) request,
              (io.grpc.stub.StreamObserver<DSCA.Internet.Empty>) responseObserver);
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

  private static abstract class InternetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InternetBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DSCA.Internet.InternetImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Internet");
    }
  }

  private static final class InternetFileDescriptorSupplier
      extends InternetBaseDescriptorSupplier {
    InternetFileDescriptorSupplier() {}
  }

  private static final class InternetMethodDescriptorSupplier
      extends InternetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InternetMethodDescriptorSupplier(String methodName) {
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
      synchronized (InternetGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternetFileDescriptorSupplier())
              .addMethod(getSensorMethod())
              .addMethod(getEmptyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
