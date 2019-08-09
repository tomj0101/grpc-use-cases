// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: market.proto

package com.github.tomj0101.grpc;

public interface MarketSummaryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:market.MarketSummaryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string symbol = 1;</code>
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 1;</code>
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>int32 rate = 2;</code>
   */
  int getRate();

  /**
   * <code>repeated string rate2 = 3;</code>
   */
  java.util.List<java.lang.String>
      getRate2List();
  /**
   * <code>repeated string rate2 = 3;</code>
   */
  int getRate2Count();
  /**
   * <code>repeated string rate2 = 3;</code>
   */
  java.lang.String getRate2(int index);
  /**
   * <code>repeated string rate2 = 3;</code>
   */
  com.google.protobuf.ByteString
      getRate2Bytes(int index);

  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */
  int getCountryRateCount();
  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */
  boolean containsCountryRate(
      java.lang.String key);
  /**
   * Use {@link #getCountryRateMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getCountryRate();
  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCountryRateMap();
  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */

  java.lang.String getCountryRateOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; countryRate = 4;</code>
   */

  java.lang.String getCountryRateOrThrow(
      java.lang.String key);

  /**
   * <code>.market.Status status = 5;</code>
   */
  int getStatusValue();
  /**
   * <code>.market.Status status = 5;</code>
   */
  com.github.tomj0101.grpc.Status getStatus();

  /**
   * <code>repeated .market.PhoneNumber phones = 6;</code>
   */
  java.util.List<com.github.tomj0101.grpc.PhoneNumber> 
      getPhonesList();
  /**
   * <code>repeated .market.PhoneNumber phones = 6;</code>
   */
  com.github.tomj0101.grpc.PhoneNumber getPhones(int index);
  /**
   * <code>repeated .market.PhoneNumber phones = 6;</code>
   */
  int getPhonesCount();
  /**
   * <code>repeated .market.PhoneNumber phones = 6;</code>
   */
  java.util.List<? extends com.github.tomj0101.grpc.PhoneNumberOrBuilder> 
      getPhonesOrBuilderList();
  /**
   * <code>repeated .market.PhoneNumber phones = 6;</code>
   */
  com.github.tomj0101.grpc.PhoneNumberOrBuilder getPhonesOrBuilder(
      int index);
}
