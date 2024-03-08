

# AppPostRequestDataAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTokenTtlSeconds** | **Double** | The access token time to live for your app, in seconds. It only affects the newly generated access tokens, existing access token will  continue to have their previous time to live as expiration. |  [optional] |
|**context** | **Context** |  |  |
|**name** | **String** | New name of the app to display to users during authorization flow. |  |
|**redirectUris** | **List&lt;URI&gt;** | List of allowed redirect URIs to call back after authentication. |  |
|**scopes** | **List&lt;String&gt;** | The scopes this app is allowed to request during authorization. |  |



