

# PullRequestAssignmentSettings

Automatically assign pull requests created by Snyk (limited to private repos). If not specified, settings will be inherited from the Project's integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignees** | **List&lt;String&gt;** | Manually specify users to assign (and all will be assigned). |  [optional] |
|**isEnabled** | **Boolean** | Automatically assign pull requests created by Snyk. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Automatically assign the last user to change the manifest file (\&quot;auto\&quot;), or manually specify a list of users (\&quot;manual\&quot;). |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| MANUAL | &quot;manual&quot; |



