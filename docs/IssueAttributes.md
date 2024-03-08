

# IssueAttributes

issue attributes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | A human-readable title for this issue. |  |
|**description** | **String** | A markdown-formatted optional description of this issue. Links are not permitted. |  [optional] |
|**classes** | [**List&lt;ModelClass&gt;**](ModelClass.md) | A list of details for weakness data, policy, etc that are the class of this issue&#39;s source. |  [optional] |
|**coordinates** | [**List&lt;Coordinate&gt;**](Coordinate.md) | Where the issue originated, specific to issue type. Details on what code, package, etc introduced the issue. An issue may be caused by more than one coordinate.  |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation time of this issue. |  |
|**effectiveSeverityLevel** | [**EffectiveSeverityLevelEnum**](#EffectiveSeverityLevelEnum) | The computed effective severity of this issue. This is either the highest level from all included severities, or an overridden value set via group level policy.  |  |
|**ignored** | **Boolean** | A flag indicating if the issue is being ignored. Derived from the issue&#39;s ignore, which provides more details. |  |
|**key** | **String** | An opaque key used for uniquely identifying this issue across test runs, within a project. |  |
|**problems** | [**List&lt;Problem&gt;**](Problem.md) | A list of details for vulnerability data, policy, etc that are the source of this issue. |  [optional] |
|**resolution** | [**Resolution**](Resolution.md) |  |  [optional] |
|**risk** | [**Risk**](Risk.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The issue&#39;s status. Derived from the issue&#39;s resolution, which provides more details. |  |
|**tool** | **String** | An opaque identifier for corelating across test runs. |  [optional] |
|**type** | **TypeDef** |  |  |
|**updatedAt** | **OffsetDateTime** | The time when this issue was last modified. |  |



## Enum: EffectiveSeverityLevelEnum

| Name | Value |
|---- | -----|
| INFO | &quot;info&quot; |
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| RESOLVED | &quot;resolved&quot; |



