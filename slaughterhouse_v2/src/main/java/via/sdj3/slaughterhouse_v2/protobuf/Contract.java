// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contract.proto

package via.sdj3.slaughterhouse_v2.protobuf;

public final class Contract {
  private Contract() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProductGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProductId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016contract.proto\"7\n\013ProductGrpc\022\022\n\nprodu" +
      "ct_id\030\001 \001(\003\022\024\n\014product_type\030\002 \001(\t\"\037\n\tPro" +
      "ductId\022\022\n\nproduct_id\030\001 \001(\003\"\035\n\010AnimalId\022\021" +
      "\n\tanimal_id\030\001 \001(\0032v\n\016SlaughterHouse\0220\n\025g" +
      "etAnimalsFromProduct\022\n.ProductId\032\t.Anima" +
      "lId0\001\0222\n\025getProductsFromAnimal\022\t.AnimalI" +
      "d\032\014.ProductGrpc0\001B\'\n#via.sdj3.slaughterh" +
      "ouse_v2.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ProductGrpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProductGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProductGrpc_descriptor,
        new java.lang.String[] { "ProductId", "ProductType", });
    internal_static_ProductId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ProductId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProductId_descriptor,
        new java.lang.String[] { "ProductId", });
    internal_static_AnimalId_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AnimalId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalId_descriptor,
        new java.lang.String[] { "AnimalId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
