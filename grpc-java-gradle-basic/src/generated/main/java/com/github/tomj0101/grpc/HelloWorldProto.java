// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_world.proto

package com.github.tomj0101.grpc;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloRequest_BagOfTricksEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloRequest_BagOfTricksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021hello_world.proto\022\nhelloworld\"\330\001\n\014Hell" +
      "oRequest\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\017\n\007h" +
      "obbies\030\003 \003(\t\022>\n\013bagOfTricks\030\004 \003(\0132).hell" +
      "oworld.HelloRequest.BagOfTricksEntry\022(\n\t" +
      "sentiment\030\005 \001(\0162\025.helloworld.Sentiment\0322" +
      "\n\020BagOfTricksEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value" +
      "\030\002 \001(\t:\0028\001\" \n\rHelloResponse\022\017\n\007message\030\001" +
      " \001(\t*-\n\tSentiment\022\t\n\005HAPPY\020\000\022\n\n\006SLEEPY\020\001" +
      "\022\t\n\005ANGRY\020\0022L\n\007Greeter\022A\n\010SayHello\022\030.hel" +
      "loworld.HelloRequest\032\031.helloworld.HelloR" +
      "esponse\"\000B-\n\030com.github.tomj0101.grpcB\017H" +
      "elloWorldProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_helloworld_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloRequest_descriptor,
        new java.lang.String[] { "Name", "Age", "Hobbies", "BagOfTricks", "Sentiment", });
    internal_static_helloworld_HelloRequest_BagOfTricksEntry_descriptor =
      internal_static_helloworld_HelloRequest_descriptor.getNestedTypes().get(0);
    internal_static_helloworld_HelloRequest_BagOfTricksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloRequest_BagOfTricksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_helloworld_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}