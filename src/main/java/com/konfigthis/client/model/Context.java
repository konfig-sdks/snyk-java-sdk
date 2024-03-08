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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Allow installing the app to a org/group or to a user, default tenant.
 */
@JsonAdapter(Context.Adapter.class)public enum Context {
  
  TENANT("tenant"),
  
  USER("user");

  private String value;

  Context(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Context fromValue(String value) {
    for (Context b : Context.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Context> {
    @Override
    public void write(final JsonWriter jsonWriter, final Context enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Context read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Context.fromValue(value);
    }
  }
}
