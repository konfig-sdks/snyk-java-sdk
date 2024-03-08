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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

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
 * ServiceAccountAttributes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ServiceAccountAttributes {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN_TTL_SECONDS = "access_token_ttl_seconds";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_TTL_SECONDS)
  private Double accessTokenTtlSeconds;

  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  /**
   * The authentication strategy for the service account:   * api_key - Regular Snyk API Key.   * oauth_client_secret - OAuth2 client_credentials grant, which returns a client secret that can be used to retrieve an access token.   * oauth_private_key_jwt - OAuth2 client_credentials grant, using private_key_jwt client_assertion as laid out OIDC Connect Core 1.0, section 9.
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
 public enum AuthTypeEnum {
    API_KEY("api_key"),
    
    OAUTH_CLIENT_SECRET("oauth_client_secret"),
    
    OAUTH_PRIVATE_KEY_JWT("oauth_private_key_jwt");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeEnum authType;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_JWKS_URL = "jwks_url";
  @SerializedName(SERIALIZED_NAME_JWKS_URL)
  private String jwksUrl;

  /**
   * The level of access for the service account:   * Group - the service account was created at the Group level.   * Org - the service account was created at the Org level.
   */
  @JsonAdapter(LevelEnum.Adapter.class)
 public enum LevelEnum {
    GROUP("Group"),
    
    ORG("Org");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelEnum fromValue(String value) {
      for (LevelEnum b : LevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private LevelEnum level;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private UUID roleId;

  public ServiceAccountAttributes() {
  }

  public ServiceAccountAttributes accessTokenTtlSeconds(Double accessTokenTtlSeconds) {
    
    
    
    
    this.accessTokenTtlSeconds = accessTokenTtlSeconds;
    return this;
  }

  public ServiceAccountAttributes accessTokenTtlSeconds(Integer accessTokenTtlSeconds) {
    
    
    
    
    this.accessTokenTtlSeconds = accessTokenTtlSeconds.doubleValue();
    return this;
  }

   /**
   * The time, in seconds, that a generated access token will be valid for. Defaults to 1hr if unset. Only provided when auth_type is oauth_private_key_jwt.
   * @return accessTokenTtlSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time, in seconds, that a generated access token will be valid for. Defaults to 1hr if unset. Only provided when auth_type is oauth_private_key_jwt.")

  public Double getAccessTokenTtlSeconds() {
    return accessTokenTtlSeconds;
  }


  public void setAccessTokenTtlSeconds(Double accessTokenTtlSeconds) {
    
    
    
    this.accessTokenTtlSeconds = accessTokenTtlSeconds;
  }


  public ServiceAccountAttributes apiKey(String apiKey) {
    
    
    
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The Snyk API Key for this service account. Only returned on creation, and only when auth_type is api_key.
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Snyk API Key for this service account. Only returned on creation, and only when auth_type is api_key.")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    
    
    
    this.apiKey = apiKey;
  }


  public ServiceAccountAttributes authType(AuthTypeEnum authType) {
    
    
    
    
    this.authType = authType;
    return this;
  }

   /**
   * The authentication strategy for the service account:   * api_key - Regular Snyk API Key.   * oauth_client_secret - OAuth2 client_credentials grant, which returns a client secret that can be used to retrieve an access token.   * oauth_private_key_jwt - OAuth2 client_credentials grant, using private_key_jwt client_assertion as laid out OIDC Connect Core 1.0, section 9.
   * @return authType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The authentication strategy for the service account:   * api_key - Regular Snyk API Key.   * oauth_client_secret - OAuth2 client_credentials grant, which returns a client secret that can be used to retrieve an access token.   * oauth_private_key_jwt - OAuth2 client_credentials grant, using private_key_jwt client_assertion as laid out OIDC Connect Core 1.0, section 9.")

  public AuthTypeEnum getAuthType() {
    return authType;
  }


  public void setAuthType(AuthTypeEnum authType) {
    
    
    
    this.authType = authType;
  }


  public ServiceAccountAttributes clientId(String clientId) {
    
    
    
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The service account&#39;s attached client-id. Used to request an access-token. Only provided when auth_type is oauth_private_key_jwt.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The service account's attached client-id. Used to request an access-token. Only provided when auth_type is oauth_private_key_jwt.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    
    
    
    this.clientId = clientId;
  }


  public ServiceAccountAttributes clientSecret(String clientSecret) {
    
    
    
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The client secret used for obtaining access tokens. Only sent on creation of new service accounts and cannot be retrieved thereafter. Only provided when auth_type is oauth_client_secret.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client secret used for obtaining access tokens. Only sent on creation of new service accounts and cannot be retrieved thereafter. Only provided when auth_type is oauth_client_secret.")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    
    
    
    this.clientSecret = clientSecret;
  }


  public ServiceAccountAttributes jwksUrl(String jwksUrl) {
    
    
    
    
    this.jwksUrl = jwksUrl;
    return this;
  }

   /**
   * A JWKs URL used to verify signed JWT requests against. Must be https. Only provided when auth_type is oauth_private_key_jwt.
   * @return jwksUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JWKs URL used to verify signed JWT requests against. Must be https. Only provided when auth_type is oauth_private_key_jwt.")

  public String getJwksUrl() {
    return jwksUrl;
  }


  public void setJwksUrl(String jwksUrl) {
    
    
    
    this.jwksUrl = jwksUrl;
  }


  public ServiceAccountAttributes level(LevelEnum level) {
    
    
    
    
    this.level = level;
    return this;
  }

   /**
   * The level of access for the service account:   * Group - the service account was created at the Group level.   * Org - the service account was created at the Org level.
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The level of access for the service account:   * Group - the service account was created at the Group level.   * Org - the service account was created at the Org level.")

  public LevelEnum getLevel() {
    return level;
  }


  public void setLevel(LevelEnum level) {
    
    
    
    this.level = level;
  }


  public ServiceAccountAttributes name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name of the service account.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human-friendly name of the service account.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ServiceAccountAttributes roleId(UUID roleId) {
    
    
    
    
    this.roleId = roleId;
    return this;
  }

   /**
   * The ID of the role which the Service Account is associated with.
   * @return roleId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the role which the Service Account is associated with.")

  public UUID getRoleId() {
    return roleId;
  }


  public void setRoleId(UUID roleId) {
    
    
    
    this.roleId = roleId;
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
   * @return the ServiceAccountAttributes instance itself
   */
  public ServiceAccountAttributes putAdditionalProperty(String key, Object value) {
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
    ServiceAccountAttributes serviceAccountAttributes = (ServiceAccountAttributes) o;
    return Objects.equals(this.accessTokenTtlSeconds, serviceAccountAttributes.accessTokenTtlSeconds) &&
        Objects.equals(this.apiKey, serviceAccountAttributes.apiKey) &&
        Objects.equals(this.authType, serviceAccountAttributes.authType) &&
        Objects.equals(this.clientId, serviceAccountAttributes.clientId) &&
        Objects.equals(this.clientSecret, serviceAccountAttributes.clientSecret) &&
        Objects.equals(this.jwksUrl, serviceAccountAttributes.jwksUrl) &&
        Objects.equals(this.level, serviceAccountAttributes.level) &&
        Objects.equals(this.name, serviceAccountAttributes.name) &&
        Objects.equals(this.roleId, serviceAccountAttributes.roleId)&&
        Objects.equals(this.additionalProperties, serviceAccountAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenTtlSeconds, apiKey, authType, clientId, clientSecret, jwksUrl, level, name, roleId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountAttributes {\n");
    sb.append("    accessTokenTtlSeconds: ").append(toIndentedString(accessTokenTtlSeconds)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    jwksUrl: ").append(toIndentedString(jwksUrl)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
    openapiFields.add("access_token_ttl_seconds");
    openapiFields.add("api_key");
    openapiFields.add("auth_type");
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("jwks_url");
    openapiFields.add("level");
    openapiFields.add("name");
    openapiFields.add("role_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("auth_type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("role_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceAccountAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceAccountAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceAccountAttributes is not found in the empty JSON string", ServiceAccountAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceAccountAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("api_key") != null && !jsonObj.get("api_key").isJsonNull()) && !jsonObj.get("api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_key").toString()));
      }
      if (!jsonObj.get("auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_type").toString()));
      }
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if ((jsonObj.get("client_secret") != null && !jsonObj.get("client_secret").isJsonNull()) && !jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      if ((jsonObj.get("jwks_url") != null && !jsonObj.get("jwks_url").isJsonNull()) && !jsonObj.get("jwks_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwks_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwks_url").toString()));
      }
      if ((jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceAccountAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceAccountAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceAccountAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceAccountAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceAccountAttributes>() {
           @Override
           public void write(JsonWriter out, ServiceAccountAttributes value) throws IOException {
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
           public ServiceAccountAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceAccountAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceAccountAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceAccountAttributes
  * @throws IOException if the JSON string is invalid with respect to ServiceAccountAttributes
  */
  public static ServiceAccountAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceAccountAttributes.class);
  }

 /**
  * Convert an instance of ServiceAccountAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

