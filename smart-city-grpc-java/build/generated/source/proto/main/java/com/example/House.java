// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: house_message.proto

package com.example;

/**
 * Protobuf type {@code untitled.House}
 */
public final class House extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:untitled.House)
    HouseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use House.newBuilder() to construct.
  private House(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private House() {
    id_ = "";
    brand_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new House();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private House(
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

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            brand_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 81: {
            size_ = input.readDouble();
            sizeCase_ = 10;
            break;
          }
          case 89: {
            size_ = input.readDouble();
            sizeCase_ = 11;
            break;
          }
          case 98: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (updatedAt_ != null) {
              subBuilder = updatedAt_.toBuilder();
            }
            updatedAt_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updatedAt_);
              updatedAt_ = subBuilder.buildPartial();
            }

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
    return com.example.HouseMessage.internal_static_untitled_House_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.HouseMessage.internal_static_untitled_House_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.House.class, com.example.House.Builder.class);
  }

  private int sizeCase_ = 0;
  private java.lang.Object size_;
  public enum SizeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SIZE_SQFEET(10),
    STORIES(11),
    SIZE_NOT_SET(0);
    private final int value;
    private SizeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SizeCase valueOf(int value) {
      return forNumber(value);
    }

    public static SizeCase forNumber(int value) {
      switch (value) {
        case 10: return SIZE_SQFEET;
        case 11: return STORIES;
        case 0: return SIZE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SizeCase
  getSizeCase() {
    return SizeCase.forNumber(
        sizeCase_);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRAND_FIELD_NUMBER = 2;
  private volatile java.lang.Object brand_;
  /**
   * <code>string brand = 2;</code>
   * @return The brand.
   */
  @java.lang.Override
  public java.lang.String getBrand() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brand_ = s;
      return s;
    }
  }
  /**
   * <code>string brand = 2;</code>
   * @return The bytes for brand.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBrandBytes() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_SQFEET_FIELD_NUMBER = 10;
  /**
   * <code>double size_sqfeet = 10;</code>
   * @return Whether the sizeSqfeet field is set.
   */
  @java.lang.Override
  public boolean hasSizeSqfeet() {
    return sizeCase_ == 10;
  }
  /**
   * <code>double size_sqfeet = 10;</code>
   * @return The sizeSqfeet.
   */
  @java.lang.Override
  public double getSizeSqfeet() {
    if (sizeCase_ == 10) {
      return (java.lang.Double) size_;
    }
    return 0D;
  }

  public static final int STORIES_FIELD_NUMBER = 11;
  /**
   * <code>double stories = 11;</code>
   * @return Whether the stories field is set.
   */
  @java.lang.Override
  public boolean hasStories() {
    return sizeCase_ == 11;
  }
  /**
   * <code>double stories = 11;</code>
   * @return The stories.
   */
  @java.lang.Override
  public double getStories() {
    if (sizeCase_ == 11) {
      return (java.lang.Double) size_;
    }
    return 0D;
  }

  public static final int UPDATED_AT_FIELD_NUMBER = 12;
  private com.google.protobuf.Timestamp updatedAt_;
  /**
   * <code>.google.protobuf.Timestamp updated_at = 12;</code>
   * @return Whether the updatedAt field is set.
   */
  @java.lang.Override
  public boolean hasUpdatedAt() {
    return updatedAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp updated_at = 12;</code>
   * @return The updatedAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdatedAt() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp updated_at = 12;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
    return getUpdatedAt();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brand_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, brand_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (sizeCase_ == 10) {
      output.writeDouble(
          10, (double)((java.lang.Double) size_));
    }
    if (sizeCase_ == 11) {
      output.writeDouble(
          11, (double)((java.lang.Double) size_));
    }
    if (updatedAt_ != null) {
      output.writeMessage(12, getUpdatedAt());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brand_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, brand_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (sizeCase_ == 10) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            10, (double)((java.lang.Double) size_));
    }
    if (sizeCase_ == 11) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            11, (double)((java.lang.Double) size_));
    }
    if (updatedAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(12, getUpdatedAt());
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
    if (!(obj instanceof com.example.House)) {
      return super.equals(obj);
    }
    com.example.House other = (com.example.House) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getBrand()
        .equals(other.getBrand())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasUpdatedAt() != other.hasUpdatedAt()) return false;
    if (hasUpdatedAt()) {
      if (!getUpdatedAt()
          .equals(other.getUpdatedAt())) return false;
    }
    if (!getSizeCase().equals(other.getSizeCase())) return false;
    switch (sizeCase_) {
      case 10:
        if (java.lang.Double.doubleToLongBits(getSizeSqfeet())
            != java.lang.Double.doubleToLongBits(
                other.getSizeSqfeet())) return false;
        break;
      case 11:
        if (java.lang.Double.doubleToLongBits(getStories())
            != java.lang.Double.doubleToLongBits(
                other.getStories())) return false;
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + BRAND_FIELD_NUMBER;
    hash = (53 * hash) + getBrand().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasUpdatedAt()) {
      hash = (37 * hash) + UPDATED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedAt().hashCode();
    }
    switch (sizeCase_) {
      case 10:
        hash = (37 * hash) + SIZE_SQFEET_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getSizeSqfeet()));
        break;
      case 11:
        hash = (37 * hash) + STORIES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getStories()));
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.House parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.House parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.House parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.House parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.House parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.House parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.House parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.House parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.House parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.House parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.House parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.House parseFrom(
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
  public static Builder newBuilder(com.example.House prototype) {
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
   * Protobuf type {@code untitled.House}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:untitled.House)
      com.example.HouseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.HouseMessage.internal_static_untitled_House_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.HouseMessage.internal_static_untitled_House_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.House.class, com.example.House.Builder.class);
    }

    // Construct using com.example.House.newBuilder()
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
      id_ = "";

      brand_ = "";

      name_ = "";

      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }
      sizeCase_ = 0;
      size_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.HouseMessage.internal_static_untitled_House_descriptor;
    }

    @java.lang.Override
    public com.example.House getDefaultInstanceForType() {
      return com.example.House.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.House build() {
      com.example.House result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.House buildPartial() {
      com.example.House result = new com.example.House(this);
      result.id_ = id_;
      result.brand_ = brand_;
      result.name_ = name_;
      if (sizeCase_ == 10) {
        result.size_ = size_;
      }
      if (sizeCase_ == 11) {
        result.size_ = size_;
      }
      if (updatedAtBuilder_ == null) {
        result.updatedAt_ = updatedAt_;
      } else {
        result.updatedAt_ = updatedAtBuilder_.build();
      }
      result.sizeCase_ = sizeCase_;
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
      if (other instanceof com.example.House) {
        return mergeFrom((com.example.House)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.House other) {
      if (other == com.example.House.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getBrand().isEmpty()) {
        brand_ = other.brand_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasUpdatedAt()) {
        mergeUpdatedAt(other.getUpdatedAt());
      }
      switch (other.getSizeCase()) {
        case SIZE_SQFEET: {
          setSizeSqfeet(other.getSizeSqfeet());
          break;
        }
        case STORIES: {
          setStories(other.getStories());
          break;
        }
        case SIZE_NOT_SET: {
          break;
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
      com.example.House parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.House) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int sizeCase_ = 0;
    private java.lang.Object size_;
    public SizeCase
        getSizeCase() {
      return SizeCase.forNumber(
          sizeCase_);
    }

    public Builder clearSize() {
      sizeCase_ = 0;
      size_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object brand_ = "";
    /**
     * <code>string brand = 2;</code>
     * @return The brand.
     */
    public java.lang.String getBrand() {
      java.lang.Object ref = brand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brand_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string brand = 2;</code>
     * @return The bytes for brand.
     */
    public com.google.protobuf.ByteString
        getBrandBytes() {
      java.lang.Object ref = brand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string brand = 2;</code>
     * @param value The brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrand() {
      
      brand_ = getDefaultInstance().getBrand();
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 2;</code>
     * @param value The bytes for brand to set.
     * @return This builder for chaining.
     */
    public Builder setBrandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brand_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>double size_sqfeet = 10;</code>
     * @return Whether the sizeSqfeet field is set.
     */
    public boolean hasSizeSqfeet() {
      return sizeCase_ == 10;
    }
    /**
     * <code>double size_sqfeet = 10;</code>
     * @return The sizeSqfeet.
     */
    public double getSizeSqfeet() {
      if (sizeCase_ == 10) {
        return (java.lang.Double) size_;
      }
      return 0D;
    }
    /**
     * <code>double size_sqfeet = 10;</code>
     * @param value The sizeSqfeet to set.
     * @return This builder for chaining.
     */
    public Builder setSizeSqfeet(double value) {
      sizeCase_ = 10;
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double size_sqfeet = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearSizeSqfeet() {
      if (sizeCase_ == 10) {
        sizeCase_ = 0;
        size_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>double stories = 11;</code>
     * @return Whether the stories field is set.
     */
    public boolean hasStories() {
      return sizeCase_ == 11;
    }
    /**
     * <code>double stories = 11;</code>
     * @return The stories.
     */
    public double getStories() {
      if (sizeCase_ == 11) {
        return (java.lang.Double) size_;
      }
      return 0D;
    }
    /**
     * <code>double stories = 11;</code>
     * @param value The stories to set.
     * @return This builder for chaining.
     */
    public Builder setStories(double value) {
      sizeCase_ = 11;
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double stories = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearStories() {
      if (sizeCase_ == 11) {
        sizeCase_ = 0;
        size_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.Timestamp updatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updatedAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     * @return Whether the updatedAt field is set.
     */
    public boolean hasUpdatedAt() {
      return updatedAtBuilder_ != null || updatedAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     * @return The updatedAt.
     */
    public com.google.protobuf.Timestamp getUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      } else {
        return updatedAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     */
    public Builder setUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedAt_ = value;
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     */
    public Builder setUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = builderForValue.build();
        onChanged();
      } else {
        updatedAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     */
    public Builder mergeUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (updatedAt_ != null) {
          updatedAt_ =
            com.google.protobuf.Timestamp.newBuilder(updatedAt_).mergeFrom(value).buildPartial();
        } else {
          updatedAt_ = value;
        }
        onChanged();
      } else {
        updatedAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     */
    public Builder clearUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = null;
        onChanged();
      } else {
        updatedAt_ = null;
        updatedAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdatedAtBuilder() {
      
      onChanged();
      return getUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
      if (updatedAtBuilder_ != null) {
        return updatedAtBuilder_.getMessageOrBuilder();
      } else {
        return updatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 12;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdatedAtFieldBuilder() {
      if (updatedAtBuilder_ == null) {
        updatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdatedAt(),
                getParentForChildren(),
                isClean());
        updatedAt_ = null;
      }
      return updatedAtBuilder_;
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


    // @@protoc_insertion_point(builder_scope:untitled.House)
  }

  // @@protoc_insertion_point(class_scope:untitled.House)
  private static final com.example.House DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.House();
  }

  public static com.example.House getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<House>
      PARSER = new com.google.protobuf.AbstractParser<House>() {
    @java.lang.Override
    public House parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new House(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<House> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<House> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.House getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
