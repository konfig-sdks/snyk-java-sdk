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
import com.konfigthis.client.model.InheritFromParent;
import com.konfigthis.client.model.OrgIacSettingsResponseAttributesCustomRulesParents;
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
 * The Infrastructure as Code custom rules settings for an org.
 */
@ApiModel(description = "The Infrastructure as Code custom rules settings for an org.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrgIacSettingsResponseAttributesCustomRules {
  public static final String SERIALIZED_NAME_INHERIT_FROM_PARENT = "inherit_from_parent";
  @SerializedName(SERIALIZED_NAME_INHERIT_FROM_PARENT)
  private InheritFromParent inheritFromParent;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_OCI_REGISTRY_TAG = "oci_registry_tag";
  @SerializedName(SERIALIZED_NAME_OCI_REGISTRY_TAG)
  private String ociRegistryTag;

  public static final String SERIALIZED_NAME_OCI_REGISTRY_URL = "oci_registry_url";
  @SerializedName(SERIALIZED_NAME_OCI_REGISTRY_URL)
  private String ociRegistryUrl;

  public static final String SERIALIZED_NAME_PARENTS = "parents";
  @SerializedName(SERIALIZED_NAME_PARENTS)
  private OrgIacSettingsResponseAttributesCustomRulesParents parents;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public OrgIacSettingsResponseAttributesCustomRules() {
  }

  public OrgIacSettingsResponseAttributesCustomRules inheritFromParent(InheritFromParent inheritFromParent) {
    
    
    
    
    this.inheritFromParent = inheritFromParent;
    return this;
  }

   /**
   * Get inheritFromParent
   * @return inheritFromParent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InheritFromParent getInheritFromParent() {
    return inheritFromParent;
  }


  public void setInheritFromParent(InheritFromParent inheritFromParent) {
    
    
    
    this.inheritFromParent = inheritFromParent;
  }


  public OrgIacSettingsResponseAttributesCustomRules isEnabled(Boolean isEnabled) {
    
    
    
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether the custom rules feature is enabled or not.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the custom rules feature is enabled or not.")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    
    
    
    this.isEnabled = isEnabled;
  }


  public OrgIacSettingsResponseAttributesCustomRules ociRegistryTag(String ociRegistryTag) {
    
    
    
    
    this.ociRegistryTag = ociRegistryTag;
    return this;
  }

   /**
   * The tag for an OCI artifact inside an OCI registry.
   * @return ociRegistryTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "latest", value = "The tag for an OCI artifact inside an OCI registry.")

  public String getOciRegistryTag() {
    return ociRegistryTag;
  }


  public void setOciRegistryTag(String ociRegistryTag) {
    
    
    
    this.ociRegistryTag = ociRegistryTag;
  }


  public OrgIacSettingsResponseAttributesCustomRules ociRegistryUrl(String ociRegistryUrl) {
    
    
    
    
    this.ociRegistryUrl = ociRegistryUrl;
    return this;
  }

   /**
   * The URL to an OCI registry.
   * @return ociRegistryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://registry-1.docker.io/account/bundle", value = "The URL to an OCI registry.")

  public String getOciRegistryUrl() {
    return ociRegistryUrl;
  }


  public void setOciRegistryUrl(String ociRegistryUrl) {
    
    
    
    this.ociRegistryUrl = ociRegistryUrl;
  }


  public OrgIacSettingsResponseAttributesCustomRules parents(OrgIacSettingsResponseAttributesCustomRulesParents parents) {
    
    
    
    
    this.parents = parents;
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrgIacSettingsResponseAttributesCustomRulesParents getParents() {
    return parents;
  }


  public void setParents(OrgIacSettingsResponseAttributesCustomRulesParents parents) {
    
    
    
    this.parents = parents;
  }


  public OrgIacSettingsResponseAttributesCustomRules updated(OffsetDateTime updated) {
    
    
    
    
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
   * @return the OrgIacSettingsResponseAttributesCustomRules instance itself
   */
  public OrgIacSettingsResponseAttributesCustomRules putAdditionalProperty(String key, Object value) {
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
    OrgIacSettingsResponseAttributesCustomRules orgIacSettingsResponseAttributesCustomRules = (OrgIacSettingsResponseAttributesCustomRules) o;
    return Objects.equals(this.inheritFromParent, orgIacSettingsResponseAttributesCustomRules.inheritFromParent) &&
        Objects.equals(this.isEnabled, orgIacSettingsResponseAttributesCustomRules.isEnabled) &&
        Objects.equals(this.ociRegistryTag, orgIacSettingsResponseAttributesCustomRules.ociRegistryTag) &&
        Objects.equals(this.ociRegistryUrl, orgIacSettingsResponseAttributesCustomRules.ociRegistryUrl) &&
        Objects.equals(this.parents, orgIacSettingsResponseAttributesCustomRules.parents) &&
        Objects.equals(this.updated, orgIacSettingsResponseAttributesCustomRules.updated)&&
        Objects.equals(this.additionalProperties, orgIacSettingsResponseAttributesCustomRules.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inheritFromParent, isEnabled, ociRegistryTag, ociRegistryUrl, parents, updated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgIacSettingsResponseAttributesCustomRules {\n");
    sb.append("    inheritFromParent: ").append(toIndentedString(inheritFromParent)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    ociRegistryTag: ").append(toIndentedString(ociRegistryTag)).append("\n");
    sb.append("    ociRegistryUrl: ").append(toIndentedString(ociRegistryUrl)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
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
    openapiFields.add("inherit_from_parent");
    openapiFields.add("is_enabled");
    openapiFields.add("oci_registry_tag");
    openapiFields.add("oci_registry_url");
    openapiFields.add("parents");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrgIacSettingsResponseAttributesCustomRules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrgIacSettingsResponseAttributesCustomRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgIacSettingsResponseAttributesCustomRules is not found in the empty JSON string", OrgIacSettingsResponseAttributesCustomRules.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("oci_registry_tag") != null && !jsonObj.get("oci_registry_tag").isJsonNull()) && !jsonObj.get("oci_registry_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oci_registry_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oci_registry_tag").toString()));
      }
      if ((jsonObj.get("oci_registry_url") != null && !jsonObj.get("oci_registry_url").isJsonNull()) && !jsonObj.get("oci_registry_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oci_registry_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oci_registry_url").toString()));
      }
      // validate the optional field `parents`
      if (jsonObj.get("parents") != null && !jsonObj.get("parents").isJsonNull()) {
        OrgIacSettingsResponseAttributesCustomRulesParents.validateJsonObject(jsonObj.getAsJsonObject("parents"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgIacSettingsResponseAttributesCustomRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgIacSettingsResponseAttributesCustomRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgIacSettingsResponseAttributesCustomRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgIacSettingsResponseAttributesCustomRules.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgIacSettingsResponseAttributesCustomRules>() {
           @Override
           public void write(JsonWriter out, OrgIacSettingsResponseAttributesCustomRules value) throws IOException {
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
           public OrgIacSettingsResponseAttributesCustomRules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrgIacSettingsResponseAttributesCustomRules instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrgIacSettingsResponseAttributesCustomRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrgIacSettingsResponseAttributesCustomRules
  * @throws IOException if the JSON string is invalid with respect to OrgIacSettingsResponseAttributesCustomRules
  */
  public static OrgIacSettingsResponseAttributesCustomRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgIacSettingsResponseAttributesCustomRules.class);
  }

 /**
  * Convert an instance of OrgIacSettingsResponseAttributesCustomRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

