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
 * Gets or Sets OrganizationType
 */
@JsonAdapter(OrganizationType.Adapter.class)public enum OrganizationType {
  
  ORGANIZATION("organization");

  private String value;

  OrganizationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrganizationType fromValue(String value) {
    for (OrganizationType b : OrganizationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrganizationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrganizationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrganizationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrganizationType.fromValue(value);
    }
  }
}

