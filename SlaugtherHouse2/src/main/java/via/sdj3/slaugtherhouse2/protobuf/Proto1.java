// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto1.proto

package via.sdj3.slaugtherhouse2.protobuf;

public final class Proto1 {
  private Proto1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LocalDateGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LocalDateGrpc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014proto1.proto\"\020\n\016AnimalResponse\"\236\001\n\nAni" +
      "malGrpc\022\033\n\023registration_number\030\001 \001(\003\022\023\n\013" +
      "animal_name\030\002 \001(\t\022\023\n\013animal_type\030\003 \001(\t\022\016" +
      "\n\006weight\030\004 \001(\001\022\016\n\006origin\030\005 \001(\t\022)\n\021regist" +
      "ration_date\030\006 \001(\0132\016.LocalDateGrpc\"9\n\rLoc" +
      "alDateGrpc\022\013\n\003day\030\001 \001(\005\022\r\n\005month\030\002 \001(\005\022\014" +
      "\n\004year\030\003 \001(\0052?\n\017SlaughterHouse1\022,\n\014creat" +
      "eAnimal\022\013.AnimalGrpc\032\017.AnimalResponseB%\n" +
      "!via.sdj3.slaugtherhouse2.protobufP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalResponse_descriptor,
        new java.lang.String[] { });
    internal_static_AnimalGrpc_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AnimalGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalGrpc_descriptor,
        new java.lang.String[] { "RegistrationNumber", "AnimalName", "AnimalType", "Weight", "Origin", "RegistrationDate", });
    internal_static_LocalDateGrpc_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LocalDateGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LocalDateGrpc_descriptor,
        new java.lang.String[] { "Day", "Month", "Year", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}