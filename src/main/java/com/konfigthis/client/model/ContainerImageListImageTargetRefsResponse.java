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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ImageTargetRef;
import com.konfigthis.client.model.JsonApi;
import com.konfigthis.client.model.PaginatedLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ContainerImageListImageTargetRefsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ContainerImageListImageTargetRefsResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ImageTargetRef> data = null;

  public static final String SERIALIZED_NAME_JSONAPI = "jsonapi";
  @SerializedName(SERIALIZED_NAME_JSONAPI)
  private JsonApi jsonapi;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginatedLinks links;

  public ContainerImageListImageTargetRefsResponse() {
  }

  public ContainerImageListImageTargetRefsResponse data(List<ImageTargetRef> data) {
    
    
    
    
    this.data = data;
    return this;
  }

  public ContainerImageListImageTargetRefsResponse addDataItem(ImageTargetRef dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ImageTargetRef> getData() {
    return data;
  }


  public void setData(List<ImageTargetRef> data) {
    
    
    
    this.data = data;
  }


  public ContainerImageListImageTargetRefsResponse jsonapi(JsonApi jsonapi) {
    
    
    
    
    this.jsonapi = jsonapi;
    return this;
  }

   /**
   * Get jsonapi
   * @return jsonapi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonApi getJsonapi() {
    return jsonapi;
  }


  public void setJsonapi(JsonApi jsonapi) {
    
    
    
    this.jsonapi = jsonapi;
  }


  public ContainerImageListImageTargetRefsResponse links(PaginatedLinks links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginatedLinks getLinks() {
    return links;
  }


  public void setLinks(PaginatedLinks links) {
    
    
    
    this.links = links;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ContainerImageListImageTargetRefsResponse instance itself
   */
  public ContainerImageListImageTargetRefsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerImageListImageTargetRefsResponse containerImageListImageTargetRefsResponse = (ContainerImageListImageTargetRefsResponse) o;
    return Objects.equals(this.data, containerImageListImageTargetRefsResponse.data) &&
        Objects.equals(this.jsonapi, containerImageListImageTargetRefsResponse.jsonapi) &&
        Objects.equals(this.links, containerImageListImageTargetRefsResponse.links)&&
        Objects.equals(this.additionalProperties, containerImageListImageTargetRefsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, jsonapi, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerImageListImageTargetRefsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    jsonapi: ").append(toIndentedString(jsonapi)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("data");
    openapiFields.add("jsonapi");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContainerImageListImageTargetRefsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContainerImageListImageTargetRefsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerImageListImageTargetRefsResponse is not found in the empty JSON string", ContainerImageListImageTargetRefsResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            ImageTargetRef.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `jsonapi`
      if (jsonObj.get("jsonapi") != null && !jsonObj.get("jsonapi").isJsonNull()) {
        JsonApi.validateJsonObject(jsonObj.getAsJsonObject("jsonapi"));
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        PaginatedLinks.validateJsonObject(jsonObj.getAsJsonObject("links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerImageListImageTargetRefsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerImageListImageTargetRefsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerImageListImageTargetRefsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerImageListImageTargetRefsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerImageListImageTargetRefsResponse>() {
           @Override
           public void write(JsonWriter out, ContainerImageListImageTargetRefsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerImageListImageTargetRefsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContainerImageListImageTargetRefsResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContainerImageListImageTargetRefsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContainerImageListImageTargetRefsResponse
  * @throws IOException if the JSON string is invalid with respect to ContainerImageListImageTargetRefsResponse
  */
  public static ContainerImageListImageTargetRefsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerImageListImageTargetRefsResponse.class);
  }

 /**
  * Convert an instance of ContainerImageListImageTargetRefsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

