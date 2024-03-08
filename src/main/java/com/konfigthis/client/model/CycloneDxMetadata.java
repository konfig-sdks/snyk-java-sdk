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
import com.konfigthis.client.model.CycloneDxComponent;
import com.konfigthis.client.model.CycloneDxProperty;
import com.konfigthis.client.model.CycloneDxTool;
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
 * CycloneDxMetadata
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CycloneDxMetadata {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private CycloneDxComponent component;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<CycloneDxProperty> properties = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private List<CycloneDxTool> tools = null;

  public CycloneDxMetadata() {
  }

  public CycloneDxMetadata component(CycloneDxComponent component) {
    
    
    
    
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CycloneDxComponent getComponent() {
    return component;
  }


  public void setComponent(CycloneDxComponent component) {
    
    
    
    this.component = component;
  }


  public CycloneDxMetadata properties(List<CycloneDxProperty> properties) {
    
    
    
    
    this.properties = properties;
    return this;
  }

  public CycloneDxMetadata addPropertiesItem(CycloneDxProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CycloneDxProperty> getProperties() {
    return properties;
  }


  public void setProperties(List<CycloneDxProperty> properties) {
    
    
    
    this.properties = properties;
  }


  public CycloneDxMetadata timestamp(String timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-09T20:40:32Z", value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    
    
    
    this.timestamp = timestamp;
  }


  public CycloneDxMetadata tools(List<CycloneDxTool> tools) {
    
    
    
    
    this.tools = tools;
    return this;
  }

  public CycloneDxMetadata addToolsItem(CycloneDxTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * Get tools
   * @return tools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CycloneDxTool> getTools() {
    return tools;
  }


  public void setTools(List<CycloneDxTool> tools) {
    
    
    
    this.tools = tools;
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
   * @return the CycloneDxMetadata instance itself
   */
  public CycloneDxMetadata putAdditionalProperty(String key, Object value) {
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
    CycloneDxMetadata cycloneDxMetadata = (CycloneDxMetadata) o;
    return Objects.equals(this.component, cycloneDxMetadata.component) &&
        Objects.equals(this.properties, cycloneDxMetadata.properties) &&
        Objects.equals(this.timestamp, cycloneDxMetadata.timestamp) &&
        Objects.equals(this.tools, cycloneDxMetadata.tools)&&
        Objects.equals(this.additionalProperties, cycloneDxMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, properties, timestamp, tools, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycloneDxMetadata {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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
    openapiFields.add("component");
    openapiFields.add("properties");
    openapiFields.add("timestamp");
    openapiFields.add("tools");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CycloneDxMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CycloneDxMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CycloneDxMetadata is not found in the empty JSON string", CycloneDxMetadata.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `component`
      if (jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) {
        CycloneDxComponent.validateJsonObject(jsonObj.getAsJsonObject("component"));
      }
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            CycloneDxProperty.validateJsonObject(jsonArrayproperties.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if (jsonObj.get("tools") != null && !jsonObj.get("tools").isJsonNull()) {
        JsonArray jsonArraytools = jsonObj.getAsJsonArray("tools");
        if (jsonArraytools != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tools").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tools` to be an array in the JSON string but got `%s`", jsonObj.get("tools").toString()));
          }

          // validate the optional field `tools` (array)
          for (int i = 0; i < jsonArraytools.size(); i++) {
            CycloneDxTool.validateJsonObject(jsonArraytools.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CycloneDxMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CycloneDxMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CycloneDxMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CycloneDxMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<CycloneDxMetadata>() {
           @Override
           public void write(JsonWriter out, CycloneDxMetadata value) throws IOException {
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
           public CycloneDxMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CycloneDxMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CycloneDxMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CycloneDxMetadata
  * @throws IOException if the JSON string is invalid with respect to CycloneDxMetadata
  */
  public static CycloneDxMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CycloneDxMetadata.class);
  }

 /**
  * Convert an instance of CycloneDxMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
