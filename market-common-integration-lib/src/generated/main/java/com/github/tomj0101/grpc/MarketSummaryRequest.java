// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: market.proto

package com.github.tomj0101.grpc;

/**
 * <pre>
 * The request message containing the user's name.
 * </pre>
 *
 * Protobuf type {@code market.MarketSummaryRequest}
 */
public  final class MarketSummaryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:market.MarketSummaryRequest)
    MarketSummaryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MarketSummaryRequest.newBuilder() to construct.
  private MarketSummaryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MarketSummaryRequest() {
    symbol_ = "";
    rate_ = 0;
    rate2_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MarketSummaryRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            symbol_ = s;
            break;
          }
          case 16: {

            rate_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              rate2_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            rate2_.add(s);
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              countryRate_ = com.google.protobuf.MapField.newMapField(
                  CountryRateDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000008;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            countryRate__ = input.readMessage(
                CountryRateDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            countryRate_.getMutableMap().put(
                countryRate__.getKey(), countryRate__.getValue());
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        rate2_ = rate2_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.tomj0101.grpc.MarketProto.internal_static_market_MarketSummaryRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetCountryRate();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.tomj0101.grpc.MarketProto.internal_static_market_MarketSummaryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.tomj0101.grpc.MarketSummaryRequest.class, com.github.tomj0101.grpc.MarketSummaryRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SYMBOL_FIELD_NUMBER = 1;
  private volatile java.lang.Object symbol_;
  /**
   * <code>string symbol = 1;</code>
   */
  public java.lang.String getSymbol() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      symbol_ = s;
      return s;
    }
  }
  /**
   * <code>string symbol = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      symbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RATE_FIELD_NUMBER = 2;
  private int rate_;
  /**
   * <code>int32 rate = 2;</code>
   */
  public int getRate() {
    return rate_;
  }

  public static final int RATE2_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList rate2_;
  /**
   * <code>repeated string rate2 = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getRate2List() {
    return rate2_;
  }
  /**
   * <code>repeated string rate2 = 3;</code>
   */
  public int getRate2Count() {
    return rate2_.size();
  }
  /**
   * <code>repeated string rate2 = 3;</code>
   */
  public java.lang.String getRate2(int index) {
    return rate2_.get(index);
  }
  /**
   * <code>repeated string rate2 = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRate2Bytes(int index) {
    return rate2_.getByteString(index);
  }

  public static final int COUNTRYRATE_FIELD_NUMBER = 4;
  private static final class CountryRateDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.github.tomj0101.grpc.MarketProto.internal_static_market_MarketSummaryRequest_CountryRateEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> countryRate_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetCountryRate() {
    if (countryRate_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CountryRateDefaultEntryHolder.defaultEntry);
    }
    return countryRate_;
  }

  public int getCountryRateCount() {
    return internalGetCountryRate().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */

  public boolean containsCountryRate(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetCountryRate().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCountryRateMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getCountryRate() {
    return getCountryRateMap();
  }
  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getCountryRateMap() {
    return internalGetCountryRate().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */

  public java.lang.String getCountryRateOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCountryRate().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */

  public java.lang.String getCountryRateOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCountryRate().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <code>.market.Status status = 5;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.market.Status status = 5;</code>
   */
  public com.github.tomj0101.grpc.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.github.tomj0101.grpc.Status result = com.github.tomj0101.grpc.Status.valueOf(status_);
    return result == null ? com.github.tomj0101.grpc.Status.UNRECOGNIZED : result;
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
    if (!getSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, symbol_);
    }
    if (rate_ != 0) {
      output.writeInt32(2, rate_);
    }
    for (int i = 0; i < rate2_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rate2_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetCountryRate(),
        CountryRateDefaultEntryHolder.defaultEntry,
        4);
    if (status_ != com.github.tomj0101.grpc.Status.OPEN.getNumber()) {
      output.writeEnum(5, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, symbol_);
    }
    if (rate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, rate_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < rate2_.size(); i++) {
        dataSize += computeStringSizeNoTag(rate2_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRate2List().size();
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetCountryRate().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      countryRate__ = CountryRateDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, countryRate__);
    }
    if (status_ != com.github.tomj0101.grpc.Status.OPEN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, status_);
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
    if (!(obj instanceof com.github.tomj0101.grpc.MarketSummaryRequest)) {
      return super.equals(obj);
    }
    com.github.tomj0101.grpc.MarketSummaryRequest other = (com.github.tomj0101.grpc.MarketSummaryRequest) obj;

    boolean result = true;
    result = result && getSymbol()
        .equals(other.getSymbol());
    result = result && (getRate()
        == other.getRate());
    result = result && getRate2List()
        .equals(other.getRate2List());
    result = result && internalGetCountryRate().equals(
        other.internalGetCountryRate());
    result = result && status_ == other.status_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol().hashCode();
    hash = (37 * hash) + RATE_FIELD_NUMBER;
    hash = (53 * hash) + getRate();
    if (getRate2Count() > 0) {
      hash = (37 * hash) + RATE2_FIELD_NUMBER;
      hash = (53 * hash) + getRate2List().hashCode();
    }
    if (!internalGetCountryRate().getMap().isEmpty()) {
      hash = (37 * hash) + COUNTRYRATE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCountryRate().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.tomj0101.grpc.MarketSummaryRequest parseFrom(
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
  public static Builder newBuilder(com.github.tomj0101.grpc.MarketSummaryRequest prototype) {
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
   * <pre>
   * The request message containing the user's name.
   * </pre>
   *
   * Protobuf type {@code market.MarketSummaryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:market.MarketSummaryRequest)
      com.github.tomj0101.grpc.MarketSummaryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.tomj0101.grpc.MarketProto.internal_static_market_MarketSummaryRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetCountryRate();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableCountryRate();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.tomj0101.grpc.MarketProto.internal_static_market_MarketSummaryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.tomj0101.grpc.MarketSummaryRequest.class, com.github.tomj0101.grpc.MarketSummaryRequest.Builder.class);
    }

    // Construct using com.github.tomj0101.grpc.MarketSummaryRequest.newBuilder()
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
      symbol_ = "";

      rate_ = 0;

      rate2_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableCountryRate().clear();
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.tomj0101.grpc.MarketProto.internal_static_market_MarketSummaryRequest_descriptor;
    }

    @java.lang.Override
    public com.github.tomj0101.grpc.MarketSummaryRequest getDefaultInstanceForType() {
      return com.github.tomj0101.grpc.MarketSummaryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.tomj0101.grpc.MarketSummaryRequest build() {
      com.github.tomj0101.grpc.MarketSummaryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.tomj0101.grpc.MarketSummaryRequest buildPartial() {
      com.github.tomj0101.grpc.MarketSummaryRequest result = new com.github.tomj0101.grpc.MarketSummaryRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.symbol_ = symbol_;
      result.rate_ = rate_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        rate2_ = rate2_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.rate2_ = rate2_;
      result.countryRate_ = internalGetCountryRate();
      result.countryRate_.makeImmutable();
      result.status_ = status_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.tomj0101.grpc.MarketSummaryRequest) {
        return mergeFrom((com.github.tomj0101.grpc.MarketSummaryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.tomj0101.grpc.MarketSummaryRequest other) {
      if (other == com.github.tomj0101.grpc.MarketSummaryRequest.getDefaultInstance()) return this;
      if (!other.getSymbol().isEmpty()) {
        symbol_ = other.symbol_;
        onChanged();
      }
      if (other.getRate() != 0) {
        setRate(other.getRate());
      }
      if (!other.rate2_.isEmpty()) {
        if (rate2_.isEmpty()) {
          rate2_ = other.rate2_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureRate2IsMutable();
          rate2_.addAll(other.rate2_);
        }
        onChanged();
      }
      internalGetMutableCountryRate().mergeFrom(
          other.internalGetCountryRate());
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      com.github.tomj0101.grpc.MarketSummaryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.tomj0101.grpc.MarketSummaryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object symbol_ = "";
    /**
     * <code>string symbol = 1;</code>
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 1;</code>
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      symbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1;</code>
     */
    public Builder clearSymbol() {
      
      symbol_ = getDefaultInstance().getSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1;</code>
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      symbol_ = value;
      onChanged();
      return this;
    }

    private int rate_ ;
    /**
     * <code>int32 rate = 2;</code>
     */
    public int getRate() {
      return rate_;
    }
    /**
     * <code>int32 rate = 2;</code>
     */
    public Builder setRate(int value) {
      
      rate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rate = 2;</code>
     */
    public Builder clearRate() {
      
      rate_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList rate2_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureRate2IsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        rate2_ = new com.google.protobuf.LazyStringArrayList(rate2_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getRate2List() {
      return rate2_.getUnmodifiableView();
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public int getRate2Count() {
      return rate2_.size();
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public java.lang.String getRate2(int index) {
      return rate2_.get(index);
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRate2Bytes(int index) {
      return rate2_.getByteString(index);
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public Builder setRate2(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRate2IsMutable();
      rate2_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public Builder addRate2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRate2IsMutable();
      rate2_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public Builder addAllRate2(
        java.lang.Iterable<java.lang.String> values) {
      ensureRate2IsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, rate2_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public Builder clearRate2() {
      rate2_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string rate2 = 3;</code>
     */
    public Builder addRate2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureRate2IsMutable();
      rate2_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> countryRate_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetCountryRate() {
      if (countryRate_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CountryRateDefaultEntryHolder.defaultEntry);
      }
      return countryRate_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableCountryRate() {
      onChanged();;
      if (countryRate_ == null) {
        countryRate_ = com.google.protobuf.MapField.newMapField(
            CountryRateDefaultEntryHolder.defaultEntry);
      }
      if (!countryRate_.isMutable()) {
        countryRate_ = countryRate_.copy();
      }
      return countryRate_;
    }

    public int getCountryRateCount() {
      return internalGetCountryRate().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; countryRate = 4;</code>
     */

    public boolean containsCountryRate(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetCountryRate().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCountryRateMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getCountryRate() {
      return getCountryRateMap();
    }
    /**
     * <code>map&lt;string, string&gt; countryRate = 4;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getCountryRateMap() {
      return internalGetCountryRate().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; countryRate = 4;</code>
     */

    public java.lang.String getCountryRateOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCountryRate().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; countryRate = 4;</code>
     */

    public java.lang.String getCountryRateOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCountryRate().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCountryRate() {
      internalGetMutableCountryRate().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; countryRate = 4;</code>
     */

    public Builder removeCountryRate(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableCountryRate().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableCountryRate() {
      return internalGetMutableCountryRate().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; countryRate = 4;</code>
     */
    public Builder putCountryRate(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableCountryRate().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; countryRate = 4;</code>
     */

    public Builder putAllCountryRate(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableCountryRate().getMutableMap()
          .putAll(values);
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.market.Status status = 5;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.market.Status status = 5;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.market.Status status = 5;</code>
     */
    public com.github.tomj0101.grpc.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.github.tomj0101.grpc.Status result = com.github.tomj0101.grpc.Status.valueOf(status_);
      return result == null ? com.github.tomj0101.grpc.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.market.Status status = 5;</code>
     */
    public Builder setStatus(com.github.tomj0101.grpc.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.market.Status status = 5;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:market.MarketSummaryRequest)
  }

  // @@protoc_insertion_point(class_scope:market.MarketSummaryRequest)
  private static final com.github.tomj0101.grpc.MarketSummaryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.tomj0101.grpc.MarketSummaryRequest();
  }

  public static com.github.tomj0101.grpc.MarketSummaryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarketSummaryRequest>
      PARSER = new com.google.protobuf.AbstractParser<MarketSummaryRequest>() {
    @java.lang.Override
    public MarketSummaryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MarketSummaryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MarketSummaryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarketSummaryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.tomj0101.grpc.MarketSummaryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

