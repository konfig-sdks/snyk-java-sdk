

# Remedy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A markdown-formatted optional description of this remedy. Links are not permitted. |  [optional] |
|**correlationId** | **String** | An optional identifier for correlating remedies between coordinates or across issues. They are scoped to a single Project and test run. Remedies with the same correlation_id must have the same contents.  |  [optional] |
|**meta** | [**RemedyMetadata**](RemedyMetadata.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDETERMINATE | &quot;indeterminate&quot; |
| MANUAL | &quot;manual&quot; |
| AUTOMATED | &quot;automated&quot; |
| RULE_RESULT_MESSAGE | &quot;rule_result_message&quot; |
| TERRAFORM | &quot;terraform&quot; |
| CLOUDFORMATION | &quot;cloudformation&quot; |
| CLI | &quot;cli&quot; |
| KUBERNETES | &quot;kubernetes&quot; |
| ARM | &quot;arm&quot; |



