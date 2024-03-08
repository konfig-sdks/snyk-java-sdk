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
import com.konfigthis.client.model.GroupIacSettingsResponseAttributesCustomRules;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * The Infrastructure as Code settings at the group level.
 */
@ApiModel(description = "The Infrastructure as Code settings at the group level.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrgIacSettingsResponseAttributesCustomRulesParentsGroup {
  public static final String SERIALIZED_NAME_CUSTOM_RULES = "custom_rules";
  @SerializedName(SERIALIZED_NAME_CUSTOM_RULES)
  private GroupIacSettingsResponseAttributesCustomRules customRules;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public OrgIacSettingsResponseAttributesCustomRulesParentsGroup() {
  }

  public OrgIacSettingsResponseAttributesCustomRulesParentsGroup customRules(GroupIacSettingsResponseAttributesCustomRules customRules) {
    
    
    
    
    this.customRules = customRules;
    return this;
  }

   /**
   * Get customRules
   * @return customRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupIacSettingsResponseAttributesCustomRules getCustomRules() {
    return customRules;
  }


  public void setCustomRules(GroupIacSettingsResponseAttributesCustomRules customRules) {
    
    
    
    this.customRules = customRules;
  }


  public OrgIacSettingsResponseAttributesCustomRulesParentsGroup updated(OffsetDateTime updated) {
    
    
    
    
    this.updated = updated;
    return this;
  }

   /**
   * The last time the settings were updated.
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-12T10:31:06.026Z", value = "The last time the settings were updated.")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    
    
    
    this.updated = updated;
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
   * @return the OrgIacSettingsResponseAttributesCustomRulesParentsGroup instance itself
   */
  public OrgIacSettingsResponseAttributesCustomRulesParentsGroup putAdditionalProperty(String key, Object value) {
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
    OrgIacSettingsResponseAttributesCustomRulesParentsGroup orgIacSettingsResponseAttributesCustomRulesParentsGroup = (OrgIacSettingsResponseAttributesCustomRulesParentsGroup) o;
    return Objects.equals(this.customRules, orgIacSettingsResponseAttributesCustomRulesParentsGroup.customRules) &&
        Objects.equals(this.updated, orgIacSettingsResponseAttributesCustomRulesParentsGroup.updated)&&
        Objects.equals(this.additionalProperties, orgIacSettingsResponseAttributesCustomRulesParentsGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customRules, updated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgIacSettingsResponseAttributesCustomRulesParentsGroup {\n");
    sb.append("    customRules: ").append(toIndentedString(customRules)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("custom_rules");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrgIacSettingsResponseAttributesCustomRulesParentsGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrgIacSettingsResponseAttributesCustomRulesParentsGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgIacSettingsResponseAttributesCustomRulesParentsGroup is not found in the empty JSON string", OrgIacSettingsResponseAttributesCustomRulesParentsGroup.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `custom_rules`
      if (jsonObj.get("custom_rules") != null && !jsonObj.get("custom_rules").isJsonNull()) {
        GroupIacSettingsResponseAttributesCustomRules.validateJsonObject(jsonObj.getAsJsonObject("custom_rules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgIacSettingsResponseAttributesCustomRulesParentsGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgIacSettingsResponseAttributesCustomRulesParentsGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgIacSettingsResponseAttributesCustomRulesParentsGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgIacSettingsResponseAttributesCustomRulesParentsGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgIacSettingsResponseAttributesCustomRulesParentsGroup>() {
           @Override
           public void write(JsonWriter out, OrgIacSettingsResponseAttributesCustomRulesParentsGroup value) throws IOException {
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
           public OrgIacSettingsResponseAttributesCustomRulesParentsGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrgIacSettingsResponseAttributesCustomRulesParentsGroup instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrgIacSettingsResponseAttributesCustomRulesParentsGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrgIacSettingsResponseAttributesCustomRulesParentsGroup
  * @throws IOException if the JSON string is invalid with respect to OrgIacSettingsResponseAttributesCustomRulesParentsGroup
  */
  public static OrgIacSettingsResponseAttributesCustomRulesParentsGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgIacSettingsResponseAttributesCustomRulesParentsGroup.class);
  }

 /**
  * Convert an instance of OrgIacSettingsResponseAttributesCustomRulesParentsGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

