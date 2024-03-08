

# PullRequestsSettings

Settings which describe how pull requests for a project are tested.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failOnlyForIssuesWithFix** | **Boolean** | Only fail when the issues found have a fix available. |  [optional] |
|**policy** | [**PolicyEnum**](#PolicyEnum) | Fail if the project has any issues (\&quot;all\&quot;), or fail if a PR is introducing a new dependency with issues (\&quot;only_new\&quot;). If this value is unset, the setting is inherited from the org default. |  [optional] |
|**severityThreshold** | [**SeverityThresholdEnum**](#SeverityThresholdEnum) | Only fail for issues greater than or equal to the specified severity. If this value is unset, the setting is inherited from the org default. |  [optional] |



## Enum: PolicyEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| ONLY_NEW | &quot;only_new&quot; |



## Enum: SeverityThresholdEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |



