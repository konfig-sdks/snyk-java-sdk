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
import com.konfigthis.client.model.ProjectsUpdateByProjectIdResponseDataRelationshipsImporterData;
import com.konfigthis.client.model.ProjectsUpdateByProjectIdResponseDataRelationshipsImporterLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * ProjectsUpdateByProjectIdResponseDataRelationshipsImporter
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectsUpdateByProjectIdResponseDataRelationshipsImporter {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ProjectsUpdateByProjectIdResponseDataRelationshipsImporterData data;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ProjectsUpdateByProjectIdResponseDataRelationshipsImporterLinks links;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, Object> meta = null;

  public ProjectsUpdateByProjectIdResponseDataRelationshipsImporter() {
  }

  public ProjectsUpdateByProjectIdResponseDataRelationshipsImporter data(ProjectsUpdateByProjectIdResponseDataRelationshipsImporterData data) {
    
    
    
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectsUpdateByProjectIdResponseDataRelationshipsImporterData getData() {
    return data;
  }


  public void setData(ProjectsUpdateByProjectIdResponseDataRelationshipsImporterData data) {
    
    
    
    this.data = data;
  }


  public ProjectsUpdateByProjectIdResponseDataRelationshipsImporter links(ProjectsUpdateByProjectIdResponseDataRelationshipsImporterLinks links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectsUpdateByProjectIdResponseDataRelationshipsImporterLinks getLinks() {
    return links;
  }


  public void setLinks(ProjectsUpdateByProjectIdResponseDataRelationshipsImporterLinks links) {
    
    
    
    this.links = links;
  }


  public ProjectsUpdateByProjectIdResponseDataRelationshipsImporter meta(Map<String, Object> meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

  public ProjectsUpdateByProjectIdResponseDataRelationshipsImporter putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Free-form object that may contain non-standard information.
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key1\":\"value1\",\"key2\":{\"sub_key\":\"sub_value\"},\"key3\":[\"array_value1\",\"array_value2\"]}", value = "Free-form object that may contain non-standard information.")

  public Map<String, Object> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, Object> meta) {
    
    
    
    this.meta = meta;
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
   * @return the ProjectsUpdateByProjectIdResponseDataRelationshipsImporter instance itself
   */
  public ProjectsUpdateByProjectIdResponseDataRelationshipsImporter putAdditionalProperty(String key, Object value) {
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
    ProjectsUpdateByProjectIdResponseDataRelationshipsImporter projectsUpdateByProjectIdResponseDataRelationshipsImporter = (ProjectsUpdateByProjectIdResponseDataRelationshipsImporter) o;
    return Objects.equals(this.data, projectsUpdateByProjectIdResponseDataRelationshipsImporter.data) &&
        Objects.equals(this.links, projectsUpdateByProjectIdResponseDataRelationshipsImporter.links) &&
        Objects.equals(this.meta, projectsUpdateByProjectIdResponseDataRelationshipsImporter.meta)&&
        Objects.equals(this.additionalProperties, projectsUpdateByProjectIdResponseDataRelationshipsImporter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsUpdateByProjectIdResponseDataRelationshipsImporter {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("links");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("links");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsUpdateByProjectIdResponseDataRelationshipsImporter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectsUpdateByProjectIdResponseDataRelationshipsImporter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsUpdateByProjectIdResponseDataRelationshipsImporter is not found in the empty JSON string", ProjectsUpdateByProjectIdResponseDataRelationshipsImporter.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectsUpdateByProjectIdResponseDataRelationshipsImporter.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `data`
      ProjectsUpdateByProjectIdResponseDataRelationshipsImporterData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      // validate the required field `links`
      ProjectsUpdateByProjectIdResponseDataRelationshipsImporterLinks.validateJsonObject(jsonObj.getAsJsonObject("links"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectsUpdateByProjectIdResponseDataRelationshipsImporter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsUpdateByProjectIdResponseDataRelationshipsImporter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsUpdateByProjectIdResponseDataRelationshipsImporter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsUpdateByProjectIdResponseDataRelationshipsImporter.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsUpdateByProjectIdResponseDataRelationshipsImporter>() {
           @Override
           public void write(JsonWriter out, ProjectsUpdateByProjectIdResponseDataRelationshipsImporter value) throws IOException {
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
           public ProjectsUpdateByProjectIdResponseDataRelationshipsImporter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectsUpdateByProjectIdResponseDataRelationshipsImporter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectsUpdateByProjectIdResponseDataRelationshipsImporter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsUpdateByProjectIdResponseDataRelationshipsImporter
  * @throws IOException if the JSON string is invalid with respect to ProjectsUpdateByProjectIdResponseDataRelationshipsImporter
  */
  public static ProjectsUpdateByProjectIdResponseDataRelationshipsImporter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsUpdateByProjectIdResponseDataRelationshipsImporter.class);
  }

 /**
  * Convert an instance of ProjectsUpdateByProjectIdResponseDataRelationshipsImporter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

