

# CommonIssueModelAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | A human-readable title for this issue. |  [optional] |
|**description** | **String** | A description of the issue in Markdown format |  [optional] |
|**coordinates** | [**List&lt;CommonIssueModelAttributesCoordinatesInner&gt;**](CommonIssueModelAttributesCoordinatesInner.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**effectiveSeverityLevel** | [**EffectiveSeverityLevelEnum**](#EffectiveSeverityLevelEnum) | The type from enumeration of the issue’s severity level. This is usually set from the issue’s producer, but can be overridden by policies. |  [optional] |
|**key** | **String** | The Snyk vulnerability ID. |  [optional] |
|**problems** | [**List&lt;CommonIssueModelAttributesProblemsInner&gt;**](CommonIssueModelAttributesProblemsInner.md) |  |  [optional] |
|**severities** | [**List&lt;Severity&gt;**](Severity.md) | The severity level of the vulnerability: ‘low’, ‘medium’, ‘high’ or ‘critical’. |  [optional] |
|**slots** | [**Slots**](Slots.md) |  |  [optional] |
|**type** | **String** | The issue type |  [optional] |
|**updatedAt** | **OffsetDateTime** | When the vulnerability information was last modified. |  [optional] |



## Enum: EffectiveSeverityLevelEnum

| Name | Value |
|---- | -----|
| INFO | &quot;info&quot; |
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |



