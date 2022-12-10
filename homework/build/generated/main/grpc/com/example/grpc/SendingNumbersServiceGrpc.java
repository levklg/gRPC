package com.example.grpc;

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
    value = "by gRPC proto compiler (version 1.30.2)",
    comments = "Source: SendingNumbersService.proto")
public final class SendingNumbersServiceGrpc {

  private SendingNumbersServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.SendingNumbersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.SNSRequest,
      com.example.grpc.Empty> getSendingNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendingNumber",
      requestType = com.example.grpc.SNSRequest.class,
      responseType = com.example.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.SNSRequest,
      com.example.grpc.Empty> getSendingNumberMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.SNSRequest, com.example.grpc.Empty> getSendingNumberMethod;
    if ((getSendingNumberMethod = SendingNumbersServiceGrpc.getSendingNumberMethod) == null) {
      synchronized (SendingNumbersServiceGrpc.class) {
        if ((getSendingNumberMethod = SendingNumbersServiceGrpc.getSendingNumberMethod) == null) {
          SendingNumbersServiceGrpc.getSendingNumberMethod = getSendingNumberMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.SNSRequest, com.example.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendingNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.SNSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SendingNumbersServiceMethodDescriptorSupplier("sendingNumber"))
              .build();
        }
      }
    }
    return getSendingNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.SNSResponse> getReceiveNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "receiveNumber",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.SNSResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.SNSResponse> getReceiveNumberMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.SNSResponse> getReceiveNumberMethod;
    if ((getReceiveNumberMethod = SendingNumbersServiceGrpc.getReceiveNumberMethod) == null) {
      synchronized (SendingNumbersServiceGrpc.class) {
        if ((getReceiveNumberMethod = SendingNumbersServiceGrpc.getReceiveNumberMethod) == null) {
          SendingNumbersServiceGrpc.getReceiveNumberMethod = getReceiveNumberMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.SNSResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "receiveNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.SNSResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SendingNumbersServiceMethodDescriptorSupplier("receiveNumber"))
              .build();
        }
      }
    }
    return getReceiveNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SendingNumbersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendingNumbersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendingNumbersServiceStub>() {
        @java.lang.Override
        public SendingNumbersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendingNumbersServiceStub(channel, callOptions);
        }
      };
    return SendingNumbersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SendingNumbersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendingNumbersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendingNumbersServiceBlockingStub>() {
        @java.lang.Override
        public SendingNumbersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendingNumbersServiceBlockingStub(channel, callOptions);
        }
      };
    return SendingNumbersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SendingNumbersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendingNumbersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendingNumbersServiceFutureStub>() {
        @java.lang.Override
        public SendingNumbersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendingNumbersServiceFutureStub(channel, callOptions);
        }
      };
    return SendingNumbersServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SendingNumbersServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendingNumber(com.example.grpc.SNSRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendingNumberMethod(), responseObserver);
    }

    /**
     */
    public void receiveNumber(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.SNSResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReceiveNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendingNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.SNSRequest,
                com.example.grpc.Empty>(
                  this, METHODID_SENDING_NUMBER)))
          .addMethod(
            getReceiveNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Empty,
                com.example.grpc.SNSResponse>(
                  this, METHODID_RECEIVE_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class SendingNumbersServiceStub extends io.grpc.stub.AbstractAsyncStub<SendingNumbersServiceStub> {
    private SendingNumbersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendingNumbersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendingNumbersServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendingNumber(com.example.grpc.SNSRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendingNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void receiveNumber(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.SNSResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReceiveNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SendingNumbersServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SendingNumbersServiceBlockingStub> {
    private SendingNumbersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendingNumbersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendingNumbersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.Empty sendingNumber(com.example.grpc.SNSRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendingNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.SNSResponse receiveNumber(com.example.grpc.Empty request) {
      return blockingUnaryCall(
          getChannel(), getReceiveNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SendingNumbersServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SendingNumbersServiceFutureStub> {
    private SendingNumbersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendingNumbersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendingNumbersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Empty> sendingNumber(
        com.example.grpc.SNSRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendingNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.SNSResponse> receiveNumber(
        com.example.grpc.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getReceiveNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SENDING_NUMBER = 0;
  private static final int METHODID_RECEIVE_NUMBER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendingNumbersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SendingNumbersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SENDING_NUMBER:
          serviceImpl.sendingNumber((com.example.grpc.SNSRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Empty>) responseObserver);
          break;
        case METHODID_RECEIVE_NUMBER:
          serviceImpl.receiveNumber((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.SNSResponse>) responseObserver);
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

  private static abstract class SendingNumbersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SendingNumbersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.SendingNumbersServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SendingNumbersService");
    }
  }

  private static final class SendingNumbersServiceFileDescriptorSupplier
      extends SendingNumbersServiceBaseDescriptorSupplier {
    SendingNumbersServiceFileDescriptorSupplier() {}
  }

  private static final class SendingNumbersServiceMethodDescriptorSupplier
      extends SendingNumbersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SendingNumbersServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SendingNumbersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SendingNumbersServiceFileDescriptorSupplier())
              .addMethod(getSendingNumberMethod())
              .addMethod(getReceiveNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
