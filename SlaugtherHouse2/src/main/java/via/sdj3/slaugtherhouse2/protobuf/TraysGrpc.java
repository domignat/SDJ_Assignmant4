// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto3.proto

package via.sdj3.slaugtherhouse2.protobuf;

/**
 * Protobuf type {@code TraysGrpc}
 */
public final class TraysGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TraysGrpc)
    TraysGrpcOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TraysGrpc.newBuilder() to construct.
  private TraysGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TraysGrpc() {
    tray_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TraysGrpc();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TraysGrpc(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tray_ = new java.util.ArrayList<via.sdj3.slaugtherhouse2.protobuf.TrayGrpc>();
              mutable_bitField0_ |= 0x00000001;
            }
            tray_.add(
                input.readMessage(via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        tray_ = java.util.Collections.unmodifiableList(tray_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sdj3.slaugtherhouse2.protobuf.Proto3.internal_static_TraysGrpc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.slaugtherhouse2.protobuf.Proto3.internal_static_TraysGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.slaugtherhouse2.protobuf.TraysGrpc.class, via.sdj3.slaugtherhouse2.protobuf.TraysGrpc.Builder.class);
  }

  public static final int TRAY_FIELD_NUMBER = 1;
  private java.util.List<via.sdj3.slaugtherhouse2.protobuf.TrayGrpc> tray_;
  /**
   * <code>repeated .TrayGrpc tray = 1;</code>
   */
  @java.lang.Override
  public java.util.List<via.sdj3.slaugtherhouse2.protobuf.TrayGrpc> getTrayList() {
    return tray_;
  }
  /**
   * <code>repeated .TrayGrpc tray = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends via.sdj3.slaugtherhouse2.protobuf.TrayGrpcOrBuilder> 
      getTrayOrBuilderList() {
    return tray_;
  }
  /**
   * <code>repeated .TrayGrpc tray = 1;</code>
   */
  @java.lang.Override
  public int getTrayCount() {
    return tray_.size();
  }
  /**
   * <code>repeated .TrayGrpc tray = 1;</code>
   */
  @java.lang.Override
  public via.sdj3.slaugtherhouse2.protobuf.TrayGrpc getTray(int index) {
    return tray_.get(index);
  }
  /**
   * <code>repeated .TrayGrpc tray = 1;</code>
   */
  @java.lang.Override
  public via.sdj3.slaugtherhouse2.protobuf.TrayGrpcOrBuilder getTrayOrBuilder(
      int index) {
    return tray_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < tray_.size(); i++) {
      output.writeMessage(1, tray_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tray_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tray_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sdj3.slaugtherhouse2.protobuf.TraysGrpc)) {
      return super.equals(obj);
    }
    via.sdj3.slaugtherhouse2.protobuf.TraysGrpc other = (via.sdj3.slaugtherhouse2.protobuf.TraysGrpc) obj;

    if (!getTrayList()
        .equals(other.getTrayList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTrayCount() > 0) {
      hash = (37 * hash) + TRAY_FIELD_NUMBER;
      hash = (53 * hash) + getTrayList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sdj3.slaugtherhouse2.protobuf.TraysGrpc prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TraysGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TraysGrpc)
      via.sdj3.slaugtherhouse2.protobuf.TraysGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.slaugtherhouse2.protobuf.Proto3.internal_static_TraysGrpc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.slaugtherhouse2.protobuf.Proto3.internal_static_TraysGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.slaugtherhouse2.protobuf.TraysGrpc.class, via.sdj3.slaugtherhouse2.protobuf.TraysGrpc.Builder.class);
    }

    // Construct using via.sdj3.slaugtherhouse2.protobuf.TraysGrpc.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTrayFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (trayBuilder_ == null) {
        tray_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        trayBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.slaugtherhouse2.protobuf.Proto3.internal_static_TraysGrpc_descriptor;
    }

    @java.lang.Override
    public via.sdj3.slaugtherhouse2.protobuf.TraysGrpc getDefaultInstanceForType() {
      return via.sdj3.slaugtherhouse2.protobuf.TraysGrpc.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.slaugtherhouse2.protobuf.TraysGrpc build() {
      via.sdj3.slaugtherhouse2.protobuf.TraysGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.slaugtherhouse2.protobuf.TraysGrpc buildPartial() {
      via.sdj3.slaugtherhouse2.protobuf.TraysGrpc result = new via.sdj3.slaugtherhouse2.protobuf.TraysGrpc(this);
      int from_bitField0_ = bitField0_;
      if (trayBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tray_ = java.util.Collections.unmodifiableList(tray_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tray_ = tray_;
      } else {
        result.tray_ = trayBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sdj3.slaugtherhouse2.protobuf.TraysGrpc) {
        return mergeFrom((via.sdj3.slaugtherhouse2.protobuf.TraysGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.slaugtherhouse2.protobuf.TraysGrpc other) {
      if (other == via.sdj3.slaugtherhouse2.protobuf.TraysGrpc.getDefaultInstance()) return this;
      if (trayBuilder_ == null) {
        if (!other.tray_.isEmpty()) {
          if (tray_.isEmpty()) {
            tray_ = other.tray_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTrayIsMutable();
            tray_.addAll(other.tray_);
          }
          onChanged();
        }
      } else {
        if (!other.tray_.isEmpty()) {
          if (trayBuilder_.isEmpty()) {
            trayBuilder_.dispose();
            trayBuilder_ = null;
            tray_ = other.tray_;
            bitField0_ = (bitField0_ & ~0x00000001);
            trayBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTrayFieldBuilder() : null;
          } else {
            trayBuilder_.addAllMessages(other.tray_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sdj3.slaugtherhouse2.protobuf.TraysGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.slaugtherhouse2.protobuf.TraysGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<via.sdj3.slaugtherhouse2.protobuf.TrayGrpc> tray_ =
      java.util.Collections.emptyList();
    private void ensureTrayIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tray_ = new java.util.ArrayList<via.sdj3.slaugtherhouse2.protobuf.TrayGrpc>(tray_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        via.sdj3.slaugtherhouse2.protobuf.TrayGrpc, via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder, via.sdj3.slaugtherhouse2.protobuf.TrayGrpcOrBuilder> trayBuilder_;

    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public java.util.List<via.sdj3.slaugtherhouse2.protobuf.TrayGrpc> getTrayList() {
      if (trayBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tray_);
      } else {
        return trayBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public int getTrayCount() {
      if (trayBuilder_ == null) {
        return tray_.size();
      } else {
        return trayBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public via.sdj3.slaugtherhouse2.protobuf.TrayGrpc getTray(int index) {
      if (trayBuilder_ == null) {
        return tray_.get(index);
      } else {
        return trayBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder setTray(
        int index, via.sdj3.slaugtherhouse2.protobuf.TrayGrpc value) {
      if (trayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrayIsMutable();
        tray_.set(index, value);
        onChanged();
      } else {
        trayBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder setTray(
        int index, via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder builderForValue) {
      if (trayBuilder_ == null) {
        ensureTrayIsMutable();
        tray_.set(index, builderForValue.build());
        onChanged();
      } else {
        trayBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder addTray(via.sdj3.slaugtherhouse2.protobuf.TrayGrpc value) {
      if (trayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrayIsMutable();
        tray_.add(value);
        onChanged();
      } else {
        trayBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder addTray(
        int index, via.sdj3.slaugtherhouse2.protobuf.TrayGrpc value) {
      if (trayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrayIsMutable();
        tray_.add(index, value);
        onChanged();
      } else {
        trayBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder addTray(
        via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder builderForValue) {
      if (trayBuilder_ == null) {
        ensureTrayIsMutable();
        tray_.add(builderForValue.build());
        onChanged();
      } else {
        trayBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder addTray(
        int index, via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder builderForValue) {
      if (trayBuilder_ == null) {
        ensureTrayIsMutable();
        tray_.add(index, builderForValue.build());
        onChanged();
      } else {
        trayBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder addAllTray(
        java.lang.Iterable<? extends via.sdj3.slaugtherhouse2.protobuf.TrayGrpc> values) {
      if (trayBuilder_ == null) {
        ensureTrayIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tray_);
        onChanged();
      } else {
        trayBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder clearTray() {
      if (trayBuilder_ == null) {
        tray_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        trayBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public Builder removeTray(int index) {
      if (trayBuilder_ == null) {
        ensureTrayIsMutable();
        tray_.remove(index);
        onChanged();
      } else {
        trayBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder getTrayBuilder(
        int index) {
      return getTrayFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public via.sdj3.slaugtherhouse2.protobuf.TrayGrpcOrBuilder getTrayOrBuilder(
        int index) {
      if (trayBuilder_ == null) {
        return tray_.get(index);  } else {
        return trayBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public java.util.List<? extends via.sdj3.slaugtherhouse2.protobuf.TrayGrpcOrBuilder> 
         getTrayOrBuilderList() {
      if (trayBuilder_ != null) {
        return trayBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tray_);
      }
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder addTrayBuilder() {
      return getTrayFieldBuilder().addBuilder(
          via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder addTrayBuilder(
        int index) {
      return getTrayFieldBuilder().addBuilder(
          index, via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .TrayGrpc tray = 1;</code>
     */
    public java.util.List<via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder> 
         getTrayBuilderList() {
      return getTrayFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        via.sdj3.slaugtherhouse2.protobuf.TrayGrpc, via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder, via.sdj3.slaugtherhouse2.protobuf.TrayGrpcOrBuilder> 
        getTrayFieldBuilder() {
      if (trayBuilder_ == null) {
        trayBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            via.sdj3.slaugtherhouse2.protobuf.TrayGrpc, via.sdj3.slaugtherhouse2.protobuf.TrayGrpc.Builder, via.sdj3.slaugtherhouse2.protobuf.TrayGrpcOrBuilder>(
                tray_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tray_ = null;
      }
      return trayBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TraysGrpc)
  }

  // @@protoc_insertion_point(class_scope:TraysGrpc)
  private static final via.sdj3.slaugtherhouse2.protobuf.TraysGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.slaugtherhouse2.protobuf.TraysGrpc();
  }

  public static via.sdj3.slaugtherhouse2.protobuf.TraysGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TraysGrpc>
      PARSER = new com.google.protobuf.AbstractParser<TraysGrpc>() {
    @java.lang.Override
    public TraysGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TraysGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TraysGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TraysGrpc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.slaugtherhouse2.protobuf.TraysGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
