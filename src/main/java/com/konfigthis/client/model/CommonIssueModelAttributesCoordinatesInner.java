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
import com.konfigthis.client.model.CommonIssueModelAttributesCoordinatesInnerRemediesInner;
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
 * CommonIssueModelAttributesCoordinatesInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CommonIssueModelAttributesCoordinatesInner {
  public static final String SERIALIZED_NAME_REMEDIES = "remedies";
  @SerializedName(SERIALIZED_NAME_REMEDIES)
  private List<CommonIssueModelAttributesCoordinatesInnerRemediesInner> remedies = null;

  public static final String SERIALIZED_NAME_REPRESENTATION = "representation";
  @SerializedName(SERIALIZED_NAME_REPRESENTATION)
  private List<String> representation = null;

  public CommonIssueModelAttributesCoordinatesInner() {
  }

  public CommonIssueModelAttributesCoordinatesInner remedies(List<CommonIssueModelAttributesCoordinatesInnerRemediesInner> remedies) {
    
    
    
    
    this.remedies = remedies;
    return this;
  }

  public CommonIssueModelAttributesCoordinatesInner addRemediesItem(CommonIssueModelAttributesCoordinatesInnerRemediesInner remediesItem) {
    if (this.remedies == null) {
      this.remedies = new ArrayList<>();
    }
    this.remedies.add(remediesItem);
    return this;
  }

   /**
   * Get remedies
   * @return remedies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommonIssueModelAttributesCoordinatesInnerRemediesInner> getRemedies() {
    return remedies;
  }


  public void setRemedies(List<CommonIssueModelAttributesCoordinatesInnerRemediesInner> remedies) {
    
    
    
    this.remedies = remedies;
  }


  public CommonIssueModelAttributesCoordinatesInner representation(List<String> representation) {
    
    
    
    
    this.representation = representation;
    return this;
  }

  public CommonIssueModelAttributesCoordinatesInner addRepresentationItem(String representationItem) {
    if (this.representation == null) {
      this.representation = new ArrayList<>();
    }
    this.representation.add(representationItem);
    return this;
  }

   /**
   * The affected versions of this vulnerability.
   * @return representation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The affected versions of this vulnerability.")

  public List<String> getRepresentation() {
    return representation;
  }


  public void setRepresentation(List<String> representation) {
    
    
    
    this.representation = representation;
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
   * @return the CommonIssueModelAttributesCoordinatesInner instance itself
   */
  public CommonIssueModelAttributesCoordinatesInner putAdditionalProperty(String key, Object value) {
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
    CommonIssueModelAttributesCoordinatesInner commonIssueModelAttributesCoordinatesInner = (CommonIssueModelAttributesCoordinatesInner) o;
    return Objects.equals(this.remedies, commonIssueModelAttributesCoordinatesInner.remedies) &&
        Objects.equals(this.representation, commonIssueModelAttributesCoordinatesInner.representation)&&
        Objects.equals(this.additionalProperties, commonIssueModelAttributesCoordinatesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remedies, representation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonIssueModelAttributesCoordinatesInner {\n");
    sb.append("    remedies: ").append(toIndentedString(remedies)).append("\n");
    sb.append("    representation: ").append(toIndentedString(representation)).append("\n");
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
    openapiFields.add("remedies");
    openapiFields.add("representation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommonIssueModelAttributesCoordinatesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommonIssueModelAttributesCoordinatesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommonIssueModelAttributesCoordinatesInner is not found in the empty JSON string", CommonIssueModelAttributesCoordinatesInner.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("remedies") != null && !jsonObj.get("remedies").isJsonNull()) {
        JsonArray jsonArrayremedies = jsonObj.getAsJsonArray("remedies");
        if (jsonArrayremedies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("remedies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `remedies` to be an array in the JSON string but got `%s`", jsonObj.get("remedies").toString()));
          }

          // validate the optional field `remedies` (array)
          for (int i = 0; i < jsonArrayremedies.size(); i++) {
            CommonIssueModelAttributesCoordinatesInnerRemediesInner.validateJsonObject(jsonArrayremedies.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("representation") != null && !jsonObj.get("representation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `representation` to be an array in the JSON string but got `%s`", jsonObj.get("representation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommonIssueModelAttributesCoordinatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommonIssueModelAttributesCoordinatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommonIssueModelAttributesCoordinatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommonIssueModelAttributesCoordinatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CommonIssueModelAttributesCoordinatesInner>() {
           @Override
           public void write(JsonWriter out, CommonIssueModelAttributesCoordinatesInner value) throws IOException {
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
           public CommonIssueModelAttributesCoordinatesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CommonIssueModelAttributesCoordinatesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CommonIssueModelAttributesCoordinatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommonIssueModelAttributesCoordinatesInner
  * @throws IOException if the JSON string is invalid with respect to CommonIssueModelAttributesCoordinatesInner
  */
  public static CommonIssueModelAttributesCoordinatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommonIssueModelAttributesCoordinatesInner.class);
  }

 /**
  * Convert an instance of CommonIssueModelAttributesCoordinatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
