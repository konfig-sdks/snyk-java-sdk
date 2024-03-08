

# ProjectAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;ProjectAttributesTagsInner&gt;**](ProjectAttributesTagsInner.md) |  |  [optional] |
|**buildArgs** | **Object** |  |  [optional] |
|**businessCriticality** | [**List&lt;BusinessCriticalityEnum&gt;**](#List&lt;BusinessCriticalityEnum&gt;) |  |  [optional] |
|**created** | **OffsetDateTime** | The date that the project was created on |  |
|**environment** | [**List&lt;EnvironmentEnum&gt;**](#List&lt;EnvironmentEnum&gt;) |  |  [optional] |
|**lifecycle** | [**List&lt;LifecycleEnum&gt;**](#List&lt;LifecycleEnum&gt;) |  |  [optional] |
|**name** | **String** | Project name. |  |
|**origin** | **String** | The origin the project was added from. |  |
|**readOnly** | **Boolean** | Whether the project is read-only |  |
|**settings** | [**ProjectSettings**](ProjectSettings.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Describes if a project is currently monitored or it is de-activated. |  |
|**targetFile** | **String** | Path within the target to identify a specific file/directory/image etc. when scanning just part  of the target, and not the entity. |  |
|**targetReference** | **String** | The additional information required to resolve which revision of the resource should be scanned. |  |
|**targetRuntime** | **String** | Dotnet Target, for relevant projects |  [optional] |
|**type** | **String** | The package manager of the project. |  |



## Enum: List&lt;BusinessCriticalityEnum&gt;

| Name | Value |
|---- | -----|
| CRITICAL | &quot;critical&quot; |
| HIGH | &quot;high&quot; |
| MEDIUM | &quot;medium&quot; |
| LOW | &quot;low&quot; |



## Enum: List&lt;EnvironmentEnum&gt;

| Name | Value |
|---- | -----|
| FRONTEND | &quot;frontend&quot; |
| BACKEND | &quot;backend&quot; |
| INTERNAL | &quot;internal&quot; |
| EXTERNAL | &quot;external&quot; |
| MOBILE | &quot;mobile&quot; |
| SAAS | &quot;saas&quot; |
| ONPREM | &quot;onprem&quot; |
| HOSTED | &quot;hosted&quot; |
| DISTRIBUTED | &quot;distributed&quot; |



## Enum: List&lt;LifecycleEnum&gt;

| Name | Value |
|---- | -----|
| PRODUCTION | &quot;production&quot; |
| DEVELOPMENT | &quot;development&quot; |
| SANDBOX | &quot;sandbox&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



