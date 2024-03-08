

# VersioningSchema

The versioning scheme used by images in the repository.  A versioning schema is a system for identifying and organizing different versions of a project.  It is used to track changes and updates to the project over time, and to help users identify which version they are using.  A versioning schema typically consists of a series of numbers or labels that are incremented to reflect the progression of versions.  For example, a versioning schema might use a series of numbers, such as \"1.0\", \"1.1\", \"2.0\", and so on, to indicate major and minor releases of a product.  A consistent and well-defined versioning schema helps users and tools understand and track the development of a project. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**expression** | **String** | The regular expression used to describe the format of tags. Keep in mind that backslashes in the expression need to be escaped due to being encompassed in a JSON string.  |  |
|**label** | **String** | A customizable string that can be set for a custom versioning schema to describe its meaning. This label has no function.  |  [optional] |
|**isSelected** | **Boolean** | Whether this image should be the recommendation. Only one image can be selected at a given time. Setting this as true will remove previous selection.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE_SELECTION | &quot;single-selection&quot; |



