

# Resource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |
|**iacMappingsCount** | **Long** | Amount of IaC resources this resource maps to. |  [optional] |
|**id** | **UUID** | Internal ID for a resource. |  |
|**inputType** | [**InputTypeEnum**](#InputTypeEnum) |  |  |
|**location** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**nativeId** | **String** | An optional native identifier for this resource. For example, a cloud resource id. |  [optional] |
|**platform** | **String** |  |  |
|**resourceType** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: InputTypeEnum

| Name | Value |
|---- | -----|
| CLOUD_SCAN | &quot;cloud_scan&quot; |
| ARM | &quot;arm&quot; |
| K8S | &quot;k8s&quot; |
| TF | &quot;tf&quot; |
| TF_HCL | &quot;tf_hcl&quot; |
| TF_PLAN | &quot;tf_plan&quot; |
| TF_STATE | &quot;tf_state&quot; |
| CFN | &quot;cfn&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CLOUD | &quot;cloud&quot; |
| IAC | &quot;iac&quot; |



