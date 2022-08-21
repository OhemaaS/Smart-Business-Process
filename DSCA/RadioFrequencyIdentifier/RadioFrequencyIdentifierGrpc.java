package DSCA.RadioFrequencyIdentifier;

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
    comments = "Source: RadioFrequencyIdentifier.proto")
public final class RadioFrequencyIdentifierGrpc {

  private RadioFrequencyIdentifierGrpc() {}

  public static final String SERVICE_NAME = "Service3.RadioFrequencyIdentifier";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<DSCA.RadioFrequencyIdentifier.scannerRequest,
      DSCA.RadioFrequencyIdentifier.scannerResponse> getScannerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "scanner",
      requestType = DSCA.RadioFrequencyIdentifier.scannerRequest.class,
      responseType = DSCA.RadioFrequencyIdentifier.scannerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<DSCA.RadioFrequencyIdentifier.scannerRequest,
      DSCA.RadioFrequencyIdentifier.scannerResponse> getScannerMethod() {
    io.grpc.MethodDescriptor<DSCA.RadioFrequencyIdentifier.scannerRequest, DSCA.RadioFrequencyIdentifier.scannerResponse> getScannerMethod;
    if ((getScannerMethod = RadioFrequencyIdentifierGrpc.getScannerMethod) == null) {
      synchronized (RadioFrequencyIdentifierGrpc.class) {
        if ((getScannerMethod = RadioFrequencyIdentifierGrpc.getScannerMethod) == null) {
          RadioFrequencyIdentifierGrpc.getScannerMethod = getScannerMethod = 
              io.grpc.MethodDescriptor.<DSCA.RadioFrequencyIdentifier.scannerRequest, DSCA.RadioFrequencyIdentifier.scannerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service3.RadioFrequencyIdentifier", "scanner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.RadioFrequencyIdentifier.scannerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.RadioFrequencyIdentifier.scannerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioFrequencyIdentifierMethodDescriptorSupplier("scanner"))
                  .build();
          }
        }
     }
     return getScannerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DSCA.RadioFrequencyIdentifier.tagRequest,
      DSCA.RadioFrequencyIdentifier.tagResponse> getTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tag",
      requestType = DSCA.RadioFrequencyIdentifier.tagRequest.class,
      responseType = DSCA.RadioFrequencyIdentifier.tagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<DSCA.RadioFrequencyIdentifier.tagRequest,
      DSCA.RadioFrequencyIdentifier.tagResponse> getTagMethod() {
    io.grpc.MethodDescriptor<DSCA.RadioFrequencyIdentifier.tagRequest, DSCA.RadioFrequencyIdentifier.tagResponse> getTagMethod;
    if ((getTagMethod = RadioFrequencyIdentifierGrpc.getTagMethod) == null) {
      synchronized (RadioFrequencyIdentifierGrpc.class) {
        if ((getTagMethod = RadioFrequencyIdentifierGrpc.getTagMethod) == null) {
          RadioFrequencyIdentifierGrpc.getTagMethod = getTagMethod = 
              io.grpc.MethodDescriptor.<DSCA.RadioFrequencyIdentifier.tagRequest, DSCA.RadioFrequencyIdentifier.tagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service3.RadioFrequencyIdentifier", "tag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.RadioFrequencyIdentifier.tagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DSCA.RadioFrequencyIdentifier.tagResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioFrequencyIdentifierMethodDescriptorSupplier("tag"))
                  .build();
          }
        }
     }
     return getTagMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadioFrequencyIdentifierStub newStub(io.grpc.Channel channel) {
    return new RadioFrequencyIdentifierStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadioFrequencyIdentifierBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadioFrequencyIdentifierBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadioFrequencyIdentifierFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadioFrequencyIdentifierFutureStub(channel);
  }

  /**
   */
  public static abstract class RadioFrequencyIdentifierImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.scannerRequest> scanner(
        io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.scannerResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getScannerMethod(), responseObserver);
    }

    /**
     * <pre>
     * client streaming method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.tagRequest> tag(
        io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.tagResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTagMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScannerMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                DSCA.RadioFrequencyIdentifier.scannerRequest,
                DSCA.RadioFrequencyIdentifier.scannerResponse>(
                  this, METHODID_SCANNER)))
          .addMethod(
            getTagMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                DSCA.RadioFrequencyIdentifier.tagRequest,
                DSCA.RadioFrequencyIdentifier.tagResponse>(
                  this, METHODID_TAG)))
          .build();
    }
  }

  /**
   */
  public static final class RadioFrequencyIdentifierStub extends io.grpc.stub.AbstractStub<RadioFrequencyIdentifierStub> {
    private RadioFrequencyIdentifierStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioFrequencyIdentifierStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioFrequencyIdentifierStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioFrequencyIdentifierStub(channel, callOptions);
    }

    /**
     * <pre>
     * bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.scannerRequest> scanner(
        io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.scannerResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getScannerMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * client streaming method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.tagRequest> tag(
        io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.tagResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTagMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RadioFrequencyIdentifierBlockingStub extends io.grpc.stub.AbstractStub<RadioFrequencyIdentifierBlockingStub> {
    private RadioFrequencyIdentifierBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioFrequencyIdentifierBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioFrequencyIdentifierBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioFrequencyIdentifierBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RadioFrequencyIdentifierFutureStub extends io.grpc.stub.AbstractStub<RadioFrequencyIdentifierFutureStub> {
    private RadioFrequencyIdentifierFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioFrequencyIdentifierFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioFrequencyIdentifierFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioFrequencyIdentifierFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SCANNER = 0;
  private static final int METHODID_TAG = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadioFrequencyIdentifierImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadioFrequencyIdentifierImplBase serviceImpl, int methodId) {
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
        case METHODID_SCANNER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.scanner(
              (io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.scannerResponse>) responseObserver);
        case METHODID_TAG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.tag(
              (io.grpc.stub.StreamObserver<DSCA.RadioFrequencyIdentifier.tagResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RadioFrequencyIdentifierBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadioFrequencyIdentifierBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DSCA.RadioFrequencyIdentifier.RadioFrequencyIdentifierImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadioFrequencyIdentifier");
    }
  }

  private static final class RadioFrequencyIdentifierFileDescriptorSupplier
      extends RadioFrequencyIdentifierBaseDescriptorSupplier {
    RadioFrequencyIdentifierFileDescriptorSupplier() {}
  }

  private static final class RadioFrequencyIdentifierMethodDescriptorSupplier
      extends RadioFrequencyIdentifierBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadioFrequencyIdentifierMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadioFrequencyIdentifierGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadioFrequencyIdentifierFileDescriptorSupplier())
              .addMethod(getScannerMethod())
              .addMethod(getTagMethod())
              .build();
        }
      }
    }
    return result;
  }
}
