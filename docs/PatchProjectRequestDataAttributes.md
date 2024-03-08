

# PatchProjectRequestDataAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;PatchProjectRequestDataAttributesTagsInner&gt;**](PatchProjectRequestDataAttributesTagsInner.md) |  |  [optional] |
|**businessCriticality** | [**List&lt;BusinessCriticalityEnum&gt;**](#List&lt;BusinessCriticalityEnum&gt;) |  |  [optional] |
|**environment** | [**List&lt;EnvironmentEnum&gt;**](#List&lt;EnvironmentEnum&gt;) |  |  [optional] |
|**lifecycle** | [**List&lt;LifecycleEnum&gt;**](#List&lt;LifecycleEnum&gt;) |  |  [optional] |
|**testFrequency** | [**TestFrequencyEnum**](#TestFrequencyEnum) | Test frequency of a project. Also controls when automated PRs may be created. |  [optional] |



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



## Enum: TestFrequencyEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| NEVER | &quot;never&quot; |



