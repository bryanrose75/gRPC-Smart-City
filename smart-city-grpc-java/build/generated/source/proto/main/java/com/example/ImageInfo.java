// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: house_service.proto

package com.example;

/**
 * Protobuf type {@code untitled.ImageInfo}
 */
public final class ImageInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:untitled.ImageInfo)
    ImageInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageInfo.newBuilder() to construct.
  private ImageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageInfo() {
    houseId_ = "";
    imageType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            houseId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            imageType_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.HouseServiceOuterClass.internal_static_untitled_ImageInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.HouseServiceOuterClass.internal_static_untitled_ImageInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.ImageInfo.class, com.example.ImageInfo.Builder.class);
  }

  public static final int HOUSE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object houseId_;
  /**
   * <code>string house_id = 1;</code>
   * @return The houseId.
   */
  @java.lang.Override
  public java.lang.String getHouseId() {
    java.lang.Object ref = houseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      houseId_ = s;
      return s;
    }
  }
  /**
   * <code>string house_id = 1;</code>
   * @return The bytes for houseId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHouseIdBytes() {
    java.lang.Object ref = houseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      houseId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object imageType_;
  /**
   * <pre>
   *jpeg or png
   * </pre>
   *
   * <code>string image_type = 2;</code>
   * @return The imageType.
   */
  @java.lang.Override
  public java.lang.String getImageType() {
    java.lang.Object ref = imageType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *jpeg or png
   * </pre>
   *
   * <code>string image_type = 2;</code>
   * @return The bytes for imageType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageTypeBytes() {
    java.lang.Object ref = imageType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(houseId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, houseId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, imageType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(houseId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, houseId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, imageType_);
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
    if (!(obj instanceof com.example.ImageInfo)) {
      return super.equals(obj);
    }
    com.example.ImageInfo other = (com.example.ImageInfo) obj;

    if (!getHouseId()
        .equals(other.getHouseId())) return false;
    if (!getImageType()
        .equals(other.getImageType())) return false;
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
    hash = (37 * hash) + HOUSE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHouseId().hashCode();
    hash = (37 * hash) + IMAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getImageType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.ImageInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.ImageInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.ImageInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.ImageInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.ImageInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.ImageInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.ImageInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.ImageInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.ImageInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.ImageInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.ImageInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.ImageInfo parseFrom(
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
  public static Builder newBuilder(com.example.ImageInfo prototype) {
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
   * Protobuf type {@code untitled.ImageInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:untitled.ImageInfo)
      com.example.ImageInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.HouseServiceOuterClass.internal_static_untitled_ImageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.HouseServiceOuterClass.internal_static_untitled_ImageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.ImageInfo.class, com.example.ImageInfo.Builder.class);
    }

    // Construct using com.example.ImageInfo.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      houseId_ = "";

      imageType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.HouseServiceOuterClass.internal_static_untitled_ImageInfo_descriptor;
    }

    @java.lang.Override
    public com.example.ImageInfo getDefaultInstanceForType() {
      return com.example.ImageInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.ImageInfo build() {
      com.example.ImageInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.ImageInfo buildPartial() {
      com.example.ImageInfo result = new com.example.ImageInfo(this);
      result.houseId_ = houseId_;
      result.imageType_ = imageType_;
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
      if (other instanceof com.example.ImageInfo) {
        return mergeFrom((com.example.ImageInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.ImageInfo other) {
      if (other == com.example.ImageInfo.getDefaultInstance()) return this;
      if (!other.getHouseId().isEmpty()) {
        houseId_ = other.houseId_;
        onChanged();
      }
      if (!other.getImageType().isEmpty()) {
        imageType_ = other.imageType_;
        onChanged();
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
      com.example.ImageInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.ImageInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object houseId_ = "";
    /**
     * <code>string house_id = 1;</code>
     * @return The houseId.
     */
    public java.lang.String getHouseId() {
      java.lang.Object ref = houseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        houseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string house_id = 1;</code>
     * @return The bytes for houseId.
     */
    public com.google.protobuf.ByteString
        getHouseIdBytes() {
      java.lang.Object ref = houseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        houseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string house_id = 1;</code>
     * @param value The houseId to set.
     * @return This builder for chaining.
     */
    public Builder setHouseId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      houseId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string house_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHouseId() {
      
      houseId_ = getDefaultInstance().getHouseId();
      onChanged();
      return this;
    }
    /**
     * <code>string house_id = 1;</code>
     * @param value The bytes for houseId to set.
     * @return This builder for chaining.
     */
    public Builder setHouseIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      houseId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object imageType_ = "";
    /**
     * <pre>
     *jpeg or png
     * </pre>
     *
     * <code>string image_type = 2;</code>
     * @return The imageType.
     */
    public java.lang.String getImageType() {
      java.lang.Object ref = imageType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *jpeg or png
     * </pre>
     *
     * <code>string image_type = 2;</code>
     * @return The bytes for imageType.
     */
    public com.google.protobuf.ByteString
        getImageTypeBytes() {
      java.lang.Object ref = imageType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *jpeg or png
     * </pre>
     *
     * <code>string image_type = 2;</code>
     * @param value The imageType to set.
     * @return This builder for chaining.
     */
    public Builder setImageType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *jpeg or png
     * </pre>
     *
     * <code>string image_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageType() {
      
      imageType_ = getDefaultInstance().getImageType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *jpeg or png
     * </pre>
     *
     * <code>string image_type = 2;</code>
     * @param value The bytes for imageType to set.
     * @return This builder for chaining.
     */
    public Builder setImageTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageType_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:untitled.ImageInfo)
  }

  // @@protoc_insertion_point(class_scope:untitled.ImageInfo)
  private static final com.example.ImageInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.ImageInfo();
  }

  public static com.example.ImageInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageInfo>
      PARSER = new com.google.protobuf.AbstractParser<ImageInfo>() {
    @java.lang.Override
    public ImageInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImageInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.ImageInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

