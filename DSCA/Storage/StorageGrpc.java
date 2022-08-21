package DSCA.Storage;

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
    comments = "Source: Storage.proto")
public final class StorageGrpc {

  private StorageGrpc() {}

  public static final String SERVICE_NAME = "Service2.Storage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<DSCA.Storage.checkRequest,
      DSCA.Storage.checkResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "check",
      requestType = DSCA.Storage.checkRequest.class,
      responseType = DSCA.Storage.checkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<DSCA.Storage.checkRequest,
      DSCA.Storage.checkResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<DSCA.Storage.checkRequest, DSCA.Storage.checkResponse> getCheckMethod;
    if ((getCheckMethod = StorageGrpc.getCheckMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getCheckMethod = StorageGrpc.getCheckMethod) == null) {
          StorageGrpc.getCheckMethod = getCheckMethod = 
              io.grpc.MethodDescriptor.<DSCA.Storage.checkRequest, DSCA.Storage.checkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service2.Storage", "check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.Storage.checkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.Storage.checkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageMethodDescriptorSupplier("check"))
                  .build();
          }
        }
     }
     return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DSCA.Storage.directRequest,
      DSCA.Storage.directResponse> getDirectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "direct",
      requestType = DSCA.Storage.directRequest.class,
      responseType = DSCA.Storage.directResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<DSCA.Storage.directRequest,
      DSCA.Storage.directResponse> getDirectMethod() {
    io.grpc.MethodDescriptor<DSCA.Storage.directRequest, DSCA.Storage.directResponse> getDirectMethod;
    if ((getDirectMethod = StorageGrpc.getDirectMethod) == null) {
      synchronized (StorageGrpc.class) {
        if ((getDirectMethod = StorageGrpc.getDirectMethod) == null) {
          StorageGrpc.getDirectMethod = getDirectMethod = 
              io.grpc.MethodDescriptor.<DSCA.Storage.directRequest, DSCA.Storage.directResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service2.Storage", "direct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.Storage.directRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.Storage.directResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageMethodDescriptorSupplier("direct"))
                  .build();
          }
        }
     }
     return getDirectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageStub newStub(io.grpc.Channel channel) {
    return new StorageStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StorageBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StorageFutureStub(channel);
  }

  /**
   */
  public static abstract class StorageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DSCA.Storage.checkRequest> check(
        io.grpc.stub.StreamObserver<DSCA.Storage.checkResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * client streaming method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DSCA.Storage.directRequest> direct(
        io.grpc.stub.StreamObserver<DSCA.Storage.directResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getDirectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                DSCA.Storage.checkRequest,
                DSCA.Storage.checkResponse>(
                  this, METHODID_CHECK)))
          .addMethod(
            getDirectMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                DSCA.Storage.directRequest,
                DSCA.Storage.directResponse>(
                  this, METHODID_DIRECT)))
          .build();
    }
  }

  /**
   */
  public static final class StorageStub extends io.grpc.stub.AbstractStub<StorageStub> {
    private StorageStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageStub(channel, callOptions);
    }

    /**
     * <pre>
     * bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DSCA.Storage.checkRequest> check(
        io.grpc.stub.StreamObserver<DSCA.Storage.checkResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * client streaming method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DSCA.Storage.directRequest> direct(
        io.grpc.stub.StreamObserver<DSCA.Storage.directResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getDirectMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StorageBlockingStub extends io.grpc.stub.AbstractStub<StorageBlockingStub> {
    private StorageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class StorageFutureStub extends io.grpc.stub.AbstractStub<StorageFutureStub> {
    private StorageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHECK = 0;
  private static final int METHODID_DIRECT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.check(
              (io.grpc.stub.StreamObserver<DSCA.Storage.checkResponse>) responseObserver);
        case METHODID_DIRECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.direct(
              (io.grpc.stub.StreamObserver<DSCA.Storage.directResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DSCA.Storage.StorageImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Storage");
    }
  }

  private static final class StorageFileDescriptorSupplier
      extends StorageBaseDescriptorSupplier {
    StorageFileDescriptorSupplier() {}
  }

  private static final class StorageMethodDescriptorSupplier
      extends StorageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageFileDescriptorSupplier())
              .addMethod(getCheckMethod())
              .addMethod(getDirectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
