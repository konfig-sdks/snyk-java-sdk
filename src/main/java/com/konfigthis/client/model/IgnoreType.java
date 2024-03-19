/*
 * Snyk API
 * Snyk helps software-driven businesses develop fast and stay secure. Continuously find and fix vulnerabilities for npm, Maven, NuGet, RubyGems, PyPI and more.
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
 * Gets or Sets IgnoreType
 */
@JsonAdapter(IgnoreType.Adapter.class)public enum IgnoreType {
  
  IGNORE("ignore");

  private String value;

  IgnoreType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IgnoreType fromValue(String value) {
    for (IgnoreType b : IgnoreType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IgnoreType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IgnoreType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IgnoreType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IgnoreType.fromValue(value);
    }
  }
}

