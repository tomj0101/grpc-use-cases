package com.github.tomj0101.grpc;

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
 * <pre>
 * The MarketSummary service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: market.proto")
public final class MarketSummaryGrpc {

  private MarketSummaryGrpc() {}

  public static final String SERVICE_NAME = "market.MarketSummary";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetResultTodayMarketMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest,
      com.github.tomj0101.grpc.MarketSummaryResponse> METHOD_GET_RESULT_TODAY_MARKET = getGetResultTodayMarketMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest,
      com.github.tomj0101.grpc.MarketSummaryResponse> getGetResultTodayMarketMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest,
      com.github.tomj0101.grpc.MarketSummaryResponse> getGetResultTodayMarketMethod() {
    return getGetResultTodayMarketMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest,
      com.github.tomj0101.grpc.MarketSummaryResponse> getGetResultTodayMarketMethodHelper() {
    io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest, com.github.tomj0101.grpc.MarketSummaryResponse> getGetResultTodayMarketMethod;
    if ((getGetResultTodayMarketMethod = MarketSummaryGrpc.getGetResultTodayMarketMethod) == null) {
      synchronized (MarketSummaryGrpc.class) {
        if ((getGetResultTodayMarketMethod = MarketSummaryGrpc.getGetResultTodayMarketMethod) == null) {
          MarketSummaryGrpc.getGetResultTodayMarketMethod = getGetResultTodayMarketMethod = 
              io.grpc.MethodDescriptor.<com.github.tomj0101.grpc.MarketSummaryRequest, com.github.tomj0101.grpc.MarketSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "market.MarketSummary", "GetResultTodayMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.tomj0101.grpc.MarketSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.tomj0101.grpc.MarketSummaryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketSummaryMethodDescriptorSupplier("GetResultTodayMarket"))
                  .build();
          }
        }
     }
     return getGetResultTodayMarketMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetWeekTodayMarketMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest,
      com.github.tomj0101.grpc.MarketSummaryResponse> METHOD_GET_WEEK_TODAY_MARKET = getGetWeekTodayMarketMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest,
      com.github.tomj0101.grpc.MarketSummaryResponse> getGetWeekTodayMarketMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest,
      com.github.tomj0101.grpc.MarketSummaryResponse> getGetWeekTodayMarketMethod() {
    return getGetWeekTodayMarketMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest,
      com.github.tomj0101.grpc.MarketSummaryResponse> getGetWeekTodayMarketMethodHelper() {
    io.grpc.MethodDescriptor<com.github.tomj0101.grpc.MarketSummaryRequest, com.github.tomj0101.grpc.MarketSummaryResponse> getGetWeekTodayMarketMethod;
    if ((getGetWeekTodayMarketMethod = MarketSummaryGrpc.getGetWeekTodayMarketMethod) == null) {
      synchronized (MarketSummaryGrpc.class) {
        if ((getGetWeekTodayMarketMethod = MarketSummaryGrpc.getGetWeekTodayMarketMethod) == null) {
          MarketSummaryGrpc.getGetWeekTodayMarketMethod = getGetWeekTodayMarketMethod = 
              io.grpc.MethodDescriptor.<com.github.tomj0101.grpc.MarketSummaryRequest, com.github.tomj0101.grpc.MarketSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "market.MarketSummary", "GetWeekTodayMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.tomj0101.grpc.MarketSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.tomj0101.grpc.MarketSummaryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketSummaryMethodDescriptorSupplier("GetWeekTodayMarket"))
                  .build();
          }
        }
     }
     return getGetWeekTodayMarketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MarketSummaryStub newStub(io.grpc.Channel channel) {
    return new MarketSummaryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MarketSummaryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MarketSummaryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MarketSummaryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MarketSummaryFutureStub(channel);
  }

  /**
   * <pre>
   * The MarketSummary service definition.
   * </pre>
   */
  public static abstract class MarketSummaryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a MarketSummary
     * </pre>
     */
    public void getResultTodayMarket(com.github.tomj0101.grpc.MarketSummaryRequest request,
        io.grpc.stub.StreamObserver<com.github.tomj0101.grpc.MarketSummaryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetResultTodayMarketMethodHelper(), responseObserver);
    }

    /**
     */
    public void getWeekTodayMarket(com.github.tomj0101.grpc.MarketSummaryRequest request,
        io.grpc.stub.StreamObserver<com.github.tomj0101.grpc.MarketSummaryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWeekTodayMarketMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetResultTodayMarketMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.tomj0101.grpc.MarketSummaryRequest,
                com.github.tomj0101.grpc.MarketSummaryResponse>(
                  this, METHODID_GET_RESULT_TODAY_MARKET)))
          .addMethod(
            getGetWeekTodayMarketMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.tomj0101.grpc.MarketSummaryRequest,
                com.github.tomj0101.grpc.MarketSummaryResponse>(
                  this, METHODID_GET_WEEK_TODAY_MARKET)))
          .build();
    }
  }

  /**
   * <pre>
   * The MarketSummary service definition.
   * </pre>
   */
  public static final class MarketSummaryStub extends io.grpc.stub.AbstractStub<MarketSummaryStub> {
    private MarketSummaryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarketSummaryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketSummaryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarketSummaryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a MarketSummary
     * </pre>
     */
    public void getResultTodayMarket(com.github.tomj0101.grpc.MarketSummaryRequest request,
        io.grpc.stub.StreamObserver<com.github.tomj0101.grpc.MarketSummaryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetResultTodayMarketMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWeekTodayMarket(com.github.tomj0101.grpc.MarketSummaryRequest request,
        io.grpc.stub.StreamObserver<com.github.tomj0101.grpc.MarketSummaryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWeekTodayMarketMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MarketSummary service definition.
   * </pre>
   */
  public static final class MarketSummaryBlockingStub extends io.grpc.stub.AbstractStub<MarketSummaryBlockingStub> {
    private MarketSummaryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarketSummaryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketSummaryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarketSummaryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a MarketSummary
     * </pre>
     */
    public com.github.tomj0101.grpc.MarketSummaryResponse getResultTodayMarket(com.github.tomj0101.grpc.MarketSummaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetResultTodayMarketMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.tomj0101.grpc.MarketSummaryResponse getWeekTodayMarket(com.github.tomj0101.grpc.MarketSummaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWeekTodayMarketMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MarketSummary service definition.
   * </pre>
   */
  public static final class MarketSummaryFutureStub extends io.grpc.stub.AbstractStub<MarketSummaryFutureStub> {
    private MarketSummaryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarketSummaryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketSummaryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarketSummaryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a MarketSummary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.tomj0101.grpc.MarketSummaryResponse> getResultTodayMarket(
        com.github.tomj0101.grpc.MarketSummaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetResultTodayMarketMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.tomj0101.grpc.MarketSummaryResponse> getWeekTodayMarket(
        com.github.tomj0101.grpc.MarketSummaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWeekTodayMarketMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESULT_TODAY_MARKET = 0;
  private static final int METHODID_GET_WEEK_TODAY_MARKET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MarketSummaryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MarketSummaryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESULT_TODAY_MARKET:
          serviceImpl.getResultTodayMarket((com.github.tomj0101.grpc.MarketSummaryRequest) request,
              (io.grpc.stub.StreamObserver<com.github.tomj0101.grpc.MarketSummaryResponse>) responseObserver);
          break;
        case METHODID_GET_WEEK_TODAY_MARKET:
          serviceImpl.getWeekTodayMarket((com.github.tomj0101.grpc.MarketSummaryRequest) request,
              (io.grpc.stub.StreamObserver<com.github.tomj0101.grpc.MarketSummaryResponse>) responseObserver);
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

  private static abstract class MarketSummaryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MarketSummaryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.tomj0101.grpc.MarketProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MarketSummary");
    }
  }

  private static final class MarketSummaryFileDescriptorSupplier
      extends MarketSummaryBaseDescriptorSupplier {
    MarketSummaryFileDescriptorSupplier() {}
  }

  private static final class MarketSummaryMethodDescriptorSupplier
      extends MarketSummaryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MarketSummaryMethodDescriptorSupplier(String methodName) {
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
      synchronized (MarketSummaryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MarketSummaryFileDescriptorSupplier())
              .addMethod(getGetResultTodayMarketMethodHelper())
              .addMethod(getGetWeekTodayMarketMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
