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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Minimum Snyk issue severity to send a notification for, messages will not be sent for any issue below this value
 */
@JsonAdapter(SeverityThreshold.Adapter.class)public enum SeverityThreshold {
  
  LOW("low"),
  
  MEDIUM("medium"),
  
  HIGH("high"),
  
  CRITICAL("critical");

  private String value;

  SeverityThreshold(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SeverityThreshold fromValue(String value) {
    for (SeverityThreshold b : SeverityThreshold.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SeverityThreshold> {
    @Override
    public void write(final JsonWriter jsonWriter, final SeverityThreshold enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SeverityThreshold read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SeverityThreshold.fromValue(value);
    }
  }
}

