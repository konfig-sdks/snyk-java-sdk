/*
 * Snyk API
 * Missing description placeholder
 *
 * The version of the OpenAPI document: REST
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ScanItemType
 */
@JsonAdapter(ScanItemType.Adapter.class)public enum ScanItemType {
  
  PROJECT("project"),
  
  ENVIRONMENT("environment");

  private String value;

  ScanItemType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScanItemType fromValue(String value) {
    for (ScanItemType b : ScanItemType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ScanItemType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScanItemType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScanItemType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScanItemType.fromValue(value);
    }
  }
}
