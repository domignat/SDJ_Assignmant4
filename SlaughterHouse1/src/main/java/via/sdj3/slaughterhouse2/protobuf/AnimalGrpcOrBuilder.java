// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto2.proto

package via.sdj3.slaughterhouse2.protobuf;

public interface AnimalGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AnimalGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 registration_number = 1;</code>
   * @return The registrationNumber.
   */
  long getRegistrationNumber();

  /**
   * <code>string animal_name = 2;</code>
   * @return The animalName.
   */
  java.lang.String getAnimalName();
  /**
   * <code>string animal_name = 2;</code>
   * @return The bytes for animalName.
   */
  com.google.protobuf.ByteString
      getAnimalNameBytes();

  /**
   * <code>string animal_type = 3;</code>
   * @return The animalType.
   */
  java.lang.String getAnimalType();
  /**
   * <code>string animal_type = 3;</code>
   * @return The bytes for animalType.
   */
  com.google.protobuf.ByteString
      getAnimalTypeBytes();

  /**
   * <code>double weight = 4;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>string origin = 5;</code>
   * @return The origin.
   */
  java.lang.String getOrigin();
  /**
   * <code>string origin = 5;</code>
   * @return The bytes for origin.
   */
  com.google.protobuf.ByteString
      getOriginBytes();

  /**
   * <code>.LocalDateGrpc registration_date = 6;</code>
   * @return Whether the registrationDate field is set.
   */
  boolean hasRegistrationDate();
  /**
   * <code>.LocalDateGrpc registration_date = 6;</code>
   * @return The registrationDate.
   */
  via.sdj3.slaughterhouse2.protobuf.LocalDateGrpc getRegistrationDate();
  /**
   * <code>.LocalDateGrpc registration_date = 6;</code>
   */
  via.sdj3.slaughterhouse2.protobuf.LocalDateGrpcOrBuilder getRegistrationDateOrBuilder();
}
