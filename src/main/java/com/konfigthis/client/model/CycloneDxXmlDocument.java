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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.CycloneDxComponent;
import com.konfigthis.client.model.CycloneDxDependency;
import com.konfigthis.client.model.CycloneDxMetadata;
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
 * CycloneDxXmlDocument
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CycloneDxXmlDocument {
  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<CycloneDxComponent> components = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<CycloneDxDependency> dependencies = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private CycloneDxMetadata metadata;

  public CycloneDxXmlDocument() {
  }

  public CycloneDxXmlDocument components(List<CycloneDxComponent> components) {
    
    
    
    
    this.components = components;
    return this;
  }

  public CycloneDxXmlDocument addComponentsItem(CycloneDxComponent componentsItem) {
    this.components.add(componentsItem);
    return this;
  }

   /**
   * A list of included software components
   * @return components
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of included software components")

  public List<CycloneDxComponent> getComponents() {
    return components;
  }


  public void setComponents(List<CycloneDxComponent> components) {
    
    
    
    this.components = components;
  }


  public CycloneDxXmlDocument dependencies(List<CycloneDxDependency> dependencies) {
    
    
    
    
    this.dependencies = dependencies;
    return this;
  }

  public CycloneDxXmlDocument addDependenciesItem(CycloneDxDependency dependenciesItem) {
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CycloneDxDependency> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<CycloneDxDependency> dependencies) {
    
    
    
    this.dependencies = dependencies;
  }


  public CycloneDxXmlDocument metadata(CycloneDxMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CycloneDxMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(CycloneDxMetadata metadata) {
    
    
    
    this.metadata = metadata;
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
   * @return the CycloneDxXmlDocument instance itself
   */
  public CycloneDxXmlDocument putAdditionalProperty(String key, Object value) {
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
    CycloneDxXmlDocument cycloneDxXmlDocument = (CycloneDxXmlDocument) o;
    return Objects.equals(this.components, cycloneDxXmlDocument.components) &&
        Objects.equals(this.dependencies, cycloneDxXmlDocument.dependencies) &&
        Objects.equals(this.metadata, cycloneDxXmlDocument.metadata)&&
        Objects.equals(this.additionalProperties, cycloneDxXmlDocument.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components, dependencies, metadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycloneDxXmlDocument {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("components");
    openapiFields.add("dependencies");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("components");
    openapiRequiredFields.add("dependencies");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CycloneDxXmlDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CycloneDxXmlDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CycloneDxXmlDocument is not found in the empty JSON string", CycloneDxXmlDocument.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CycloneDxXmlDocument.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("components").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
      }

      JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
      // validate the required field `components` (array)
      for (int i = 0; i < jsonArraycomponents.size(); i++) {
        CycloneDxComponent.validateJsonObject(jsonArraycomponents.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("dependencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependencies` to be an array in the JSON string but got `%s`", jsonObj.get("dependencies").toString()));
      }

      JsonArray jsonArraydependencies = jsonObj.getAsJsonArray("dependencies");
      // validate the required field `dependencies` (array)
      for (int i = 0; i < jsonArraydependencies.size(); i++) {
        CycloneDxDependency.validateJsonObject(jsonArraydependencies.get(i).getAsJsonObject());
      };
      // validate the required field `metadata`
      CycloneDxMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CycloneDxXmlDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CycloneDxXmlDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CycloneDxXmlDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CycloneDxXmlDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<CycloneDxXmlDocument>() {
           @Override
           public void write(JsonWriter out, CycloneDxXmlDocument value) throws IOException {
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
           public CycloneDxXmlDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CycloneDxXmlDocument instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CycloneDxXmlDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CycloneDxXmlDocument
  * @throws IOException if the JSON string is invalid with respect to CycloneDxXmlDocument
  */
  public static CycloneDxXmlDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CycloneDxXmlDocument.class);
  }

 /**
  * Convert an instance of CycloneDxXmlDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

