

# VersioningSchemaSingleSelectionType

The Single Selection Versioning Schema allows manual setting of which image should be given as a recommendation.  Only one image can be set as the current recommendation. If no images are set as the current selection,  no recommendation will be given.  It is recommended to use this versioning schema if your repository's tags aren't supported by the other schemas. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isSelected** | **Boolean** | Whether this image should be the recommendation. Only one image can be selected at a given time. Setting this as true will remove previous selection.  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE_SELECTION | &quot;single-selection&quot; |



