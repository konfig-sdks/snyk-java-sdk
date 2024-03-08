

# VersioningSchemaCustomType

The Custom Schema type is a way for Snyk to understand your company’s container image tag versioning scheme, enabling Snyk to give more accurate base image upgrade recommendations.  This schema type is essentially a regular expression that groups the different parts of an image’s tag into comparable sections.  If your container image's tags follow a versioning scheme other than Semantic Versioning (SemVer),  it is highly recommended that you select the \"Custom Versioning\" schema for your image repositories. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expression** | **String** | The regular expression used to describe the format of tags. Keep in mind that backslashes in the expression need to be escaped due to being encompassed in a JSON string.  |  |
|**label** | **String** | A customizable string that can be set for a custom versioning schema to describe its meaning. This label has no function.  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;custom&quot; |



