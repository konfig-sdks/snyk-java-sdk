

# PublicAppDataAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **UUID** |  |  |
|**context** | [**ContextEnum**](#ContextEnum) | Allow installing the app to a org/group or to a user, default tenant. |  [optional] |
|**name** | **String** | New name of the app to display to users during authorization flow. |  |
|**scopes** | **List&lt;String&gt;** | The scopes this app is allowed to request during authorization. |  [optional] |



## Enum: ContextEnum

| Name | Value |
|---- | -----|
| TENANT | &quot;tenant&quot; |
| USER | &quot;user&quot; |



