// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: filter_message.proto

package com.example;

public final class FilterMessage {
  private FilterMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_untitled_Filter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_untitled_Filter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024filter_message.proto\022\010untitled\"!\n\006Filt" +
      "er\022\027\n\017max_energy_used\030\001 \001(\001B\023\n\013com.examp" +
      "leP\001Z\002pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_untitled_Filter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_untitled_Filter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_untitled_Filter_descriptor,
        new java.lang.String[] { "MaxEnergyUsed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
