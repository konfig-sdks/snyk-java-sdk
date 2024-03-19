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
import com.konfigthis.client.model.Coordinate;
import com.konfigthis.client.model.ModelClass;
import com.konfigthis.client.model.Problem;
import com.konfigthis.client.model.Resolution;
import com.konfigthis.client.model.Risk;
import com.konfigthis.client.model.TypeDef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * issue attributes
 */
@ApiModel(description = "issue attributes")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IssueAttributes {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CLASSES = "classes";
  @SerializedName(SERIALIZED_NAME_CLASSES)
  private List<ModelClass> classes = null;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private List<Coordinate> coordinates = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * The computed effective severity of this issue. This is either the highest level from all included severities, or an overridden value set via group level policy. 
   */
  @JsonAdapter(EffectiveSeverityLevelEnum.Adapter.class)
 public enum EffectiveSeverityLevelEnum {
    INFO("info"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high"),
    
    CRITICAL("critical");

    private String value;

    EffectiveSeverityLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EffectiveSeverityLevelEnum fromValue(String value) {
      for (EffectiveSeverityLevelEnum b : EffectiveSeverityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EffectiveSeverityLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectiveSeverityLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EffectiveSeverityLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EffectiveSeverityLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EFFECTIVE_SEVERITY_LEVEL = "effective_severity_level";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_SEVERITY_LEVEL)
  private EffectiveSeverityLevelEnum effectiveSeverityLevel;

  public static final String SERIALIZED_NAME_IGNORED = "ignored";
  @SerializedName(SERIALIZED_NAME_IGNORED)
  private Boolean ignored;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_PROBLEMS = "problems";
  @SerializedName(SERIALIZED_NAME_PROBLEMS)
  private List<Problem> problems = null;

  public static final String SERIALIZED_NAME_RESOLUTION = "resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private Resolution resolution;

  public static final String SERIALIZED_NAME_RISK = "risk";
  @SerializedName(SERIALIZED_NAME_RISK)
  private Risk risk;

  /**
   * The issue&#39;s status. Derived from the issue&#39;s resolution, which provides more details.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    OPEN("open"),
    
    RESOLVED("resolved");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TOOL = "tool";
  @SerializedName(SERIALIZED_NAME_TOOL)
  private String tool;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeDef type;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public IssueAttributes() {
  }

  public IssueAttributes title(String title) {
    
    
    if (title != null && title.length() < 1) {
      throw new IllegalArgumentException("Invalid value for title. Length must be greater than or equal to 1.");
    }
    
    this.title = title;
    return this;
  }

   /**
   * A human-readable title for this issue.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Insecure hash function used", required = true, value = "A human-readable title for this issue.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    if (title != null && title.length() < 1) {
      throw new IllegalArgumentException("Invalid value for title. Length must be greater than or equal to 1.");
    }
    this.title = title;
  }


  public IssueAttributes description(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    
    this.description = description;
    return this;
  }

   /**
   * A markdown-formatted optional description of this issue. Links are not permitted.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Affected versions of this package are vulnerable to Prototype Pollution. The utilities function allow modification of the `Object` prototype. If an attacker can control part of the structure passed to this function, they could add or modify an existing property. ", value = "A markdown-formatted optional description of this issue. Links are not permitted.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    this.description = description;
  }


  public IssueAttributes classes(List<ModelClass> classes) {
    
    
    
    
    this.classes = classes;
    return this;
  }

  public IssueAttributes addClassesItem(ModelClass classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * A list of details for weakness data, policy, etc that are the class of this issue&#39;s source.
   * @return classes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of details for weakness data, policy, etc that are the class of this issue's source.")

  public List<ModelClass> getClasses() {
    return classes;
  }


  public void setClasses(List<ModelClass> classes) {
    
    
    
    this.classes = classes;
  }


  public IssueAttributes coordinates(List<Coordinate> coordinates) {
    
    
    
    
    this.coordinates = coordinates;
    return this;
  }

  public IssueAttributes addCoordinatesItem(Coordinate coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Where the issue originated, specific to issue type. Details on what code, package, etc introduced the issue. An issue may be caused by more than one coordinate. 
   * @return coordinates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Where the issue originated, specific to issue type. Details on what code, package, etc introduced the issue. An issue may be caused by more than one coordinate. ")

  public List<Coordinate> getCoordinates() {
    return coordinates;
  }


  public void setCoordinates(List<Coordinate> coordinates) {
    
    
    
    this.coordinates = coordinates;
  }


  public IssueAttributes createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The creation time of this issue.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The creation time of this issue.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public IssueAttributes effectiveSeverityLevel(EffectiveSeverityLevelEnum effectiveSeverityLevel) {
    
    
    
    
    this.effectiveSeverityLevel = effectiveSeverityLevel;
    return this;
  }

   /**
   * The computed effective severity of this issue. This is either the highest level from all included severities, or an overridden value set via group level policy. 
   * @return effectiveSeverityLevel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The computed effective severity of this issue. This is either the highest level from all included severities, or an overridden value set via group level policy. ")

  public EffectiveSeverityLevelEnum getEffectiveSeverityLevel() {
    return effectiveSeverityLevel;
  }


  public void setEffectiveSeverityLevel(EffectiveSeverityLevelEnum effectiveSeverityLevel) {
    
    
    
    this.effectiveSeverityLevel = effectiveSeverityLevel;
  }


  public IssueAttributes ignored(Boolean ignored) {
    
    
    
    
    this.ignored = ignored;
    return this;
  }

   /**
   * A flag indicating if the issue is being ignored. Derived from the issue&#39;s ignore, which provides more details.
   * @return ignored
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A flag indicating if the issue is being ignored. Derived from the issue's ignore, which provides more details.")

  public Boolean getIgnored() {
    return ignored;
  }


  public void setIgnored(Boolean ignored) {
    
    
    
    this.ignored = ignored;
  }


  public IssueAttributes key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * An opaque key used for uniquely identifying this issue across test runs, within a project.
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "24018479-6bb1-4196-a41b-e54c7c5dcc82:1c6ddc45.7f41fd64.a214ef38.72ad650e.f0ecbaa5.18c3080a.b570850e.89112ac5.1a6d2cd5.71413d6f.a924ef28.71cdd50e.d0e1bea5.52c3a80a.1a0c4319.a9127ac5:1", required = true, value = "An opaque key used for uniquely identifying this issue across test runs, within a project.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


  public IssueAttributes problems(List<Problem> problems) {
    
    
    
    
    this.problems = problems;
    return this;
  }

  public IssueAttributes addProblemsItem(Problem problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

   /**
   * A list of details for vulnerability data, policy, etc that are the source of this issue.
   * @return problems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of details for vulnerability data, policy, etc that are the source of this issue.")

  public List<Problem> getProblems() {
    return problems;
  }


  public void setProblems(List<Problem> problems) {
    
    
    
    this.problems = problems;
  }


  public IssueAttributes resolution(Resolution resolution) {
    
    
    
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Resolution getResolution() {
    return resolution;
  }


  public void setResolution(Resolution resolution) {
    
    
    
    this.resolution = resolution;
  }


  public IssueAttributes risk(Risk risk) {
    
    
    
    
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Risk getRisk() {
    return risk;
  }


  public void setRisk(Risk risk) {
    
    
    
    this.risk = risk;
  }


  public IssueAttributes status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The issue&#39;s status. Derived from the issue&#39;s resolution, which provides more details.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The issue's status. Derived from the issue's resolution, which provides more details.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public IssueAttributes tool(String tool) {
    
    
    if (tool != null && tool.length() < 1) {
      throw new IllegalArgumentException("Invalid value for tool. Length must be greater than or equal to 1.");
    }
    
    this.tool = tool;
    return this;
  }

   /**
   * An opaque identifier for corelating across test runs.
   * @return tool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "snyk://npm-deps", value = "An opaque identifier for corelating across test runs.")

  public String getTool() {
    return tool;
  }


  public void setTool(String tool) {
    
    
    if (tool != null && tool.length() < 1) {
      throw new IllegalArgumentException("Invalid value for tool. Length must be greater than or equal to 1.");
    }
    this.tool = tool;
  }


  public IssueAttributes type(TypeDef type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeDef getType() {
    return type;
  }


  public void setType(TypeDef type) {
    
    
    
    this.type = type;
  }


  public IssueAttributes updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time when this issue was last modified.
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time when this issue was last modified.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
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
   * @return the IssueAttributes instance itself
   */
  public IssueAttributes putAdditionalProperty(String key, Object value) {
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
    IssueAttributes issueAttributes = (IssueAttributes) o;
    return Objects.equals(this.title, issueAttributes.title) &&
        Objects.equals(this.description, issueAttributes.description) &&
        Objects.equals(this.classes, issueAttributes.classes) &&
        Objects.equals(this.coordinates, issueAttributes.coordinates) &&
        Objects.equals(this.createdAt, issueAttributes.createdAt) &&
        Objects.equals(this.effectiveSeverityLevel, issueAttributes.effectiveSeverityLevel) &&
        Objects.equals(this.ignored, issueAttributes.ignored) &&
        Objects.equals(this.key, issueAttributes.key) &&
        Objects.equals(this.problems, issueAttributes.problems) &&
        Objects.equals(this.resolution, issueAttributes.resolution) &&
        Objects.equals(this.risk, issueAttributes.risk) &&
        Objects.equals(this.status, issueAttributes.status) &&
        Objects.equals(this.tool, issueAttributes.tool) &&
        Objects.equals(this.type, issueAttributes.type) &&
        Objects.equals(this.updatedAt, issueAttributes.updatedAt)&&
        Objects.equals(this.additionalProperties, issueAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, classes, coordinates, createdAt, effectiveSeverityLevel, ignored, key, problems, resolution, risk, status, tool, type, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueAttributes {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    effectiveSeverityLevel: ").append(toIndentedString(effectiveSeverityLevel)).append("\n");
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("classes");
    openapiFields.add("coordinates");
    openapiFields.add("created_at");
    openapiFields.add("effective_severity_level");
    openapiFields.add("ignored");
    openapiFields.add("key");
    openapiFields.add("problems");
    openapiFields.add("resolution");
    openapiFields.add("risk");
    openapiFields.add("status");
    openapiFields.add("tool");
    openapiFields.add("type");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("effective_severity_level");
    openapiRequiredFields.add("ignored");
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssueAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueAttributes is not found in the empty JSON string", IssueAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("classes") != null && !jsonObj.get("classes").isJsonNull()) {
        JsonArray jsonArrayclasses = jsonObj.getAsJsonArray("classes");
        if (jsonArrayclasses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("classes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `classes` to be an array in the JSON string but got `%s`", jsonObj.get("classes").toString()));
          }

          // validate the optional field `classes` (array)
          for (int i = 0; i < jsonArrayclasses.size(); i++) {
            ModelClass.validateJsonObject(jsonArrayclasses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("coordinates") != null && !jsonObj.get("coordinates").isJsonNull()) {
        JsonArray jsonArraycoordinates = jsonObj.getAsJsonArray("coordinates");
        if (jsonArraycoordinates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("coordinates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `coordinates` to be an array in the JSON string but got `%s`", jsonObj.get("coordinates").toString()));
          }

          // validate the optional field `coordinates` (array)
          for (int i = 0; i < jsonArraycoordinates.size(); i++) {
            Coordinate.validateJsonObject(jsonArraycoordinates.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("effective_severity_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_severity_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_severity_level").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("problems") != null && !jsonObj.get("problems").isJsonNull()) {
        JsonArray jsonArrayproblems = jsonObj.getAsJsonArray("problems");
        if (jsonArrayproblems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("problems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `problems` to be an array in the JSON string but got `%s`", jsonObj.get("problems").toString()));
          }

          // validate the optional field `problems` (array)
          for (int i = 0; i < jsonArrayproblems.size(); i++) {
            Problem.validateJsonObject(jsonArrayproblems.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `resolution`
      if (jsonObj.get("resolution") != null && !jsonObj.get("resolution").isJsonNull()) {
        Resolution.validateJsonObject(jsonObj.getAsJsonObject("resolution"));
      }
      // validate the optional field `risk`
      if (jsonObj.get("risk") != null && !jsonObj.get("risk").isJsonNull()) {
        Risk.validateJsonObject(jsonObj.getAsJsonObject("risk"));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("tool") != null && !jsonObj.get("tool").isJsonNull()) && !jsonObj.get("tool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tool").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueAttributes>() {
           @Override
           public void write(JsonWriter out, IssueAttributes value) throws IOException {
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
           public IssueAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssueAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IssueAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueAttributes
  * @throws IOException if the JSON string is invalid with respect to IssueAttributes
  */
  public static IssueAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueAttributes.class);
  }

 /**
  * Convert an instance of IssueAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

