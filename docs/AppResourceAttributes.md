

# AppResourceAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTokenTtlSeconds** | **Double** | The access token time to live for your app, in seconds. It only affects the newly generated access tokens, existing access token will  continue to have their previous time to live as expiration. |  |
|**clientId** | **UUID** | The oauth2 client id for the app. |  [optional] |
|**context** | **Context** |  |  |
|**grantType** | **GrantType** |  |  |
|**isConfidential** | **Boolean** | A boolean to indicate if an app is confidential or not as per the OAuth2 RFC. Confidential apps can securely store secrets. Examples of non-confidential apps are full web-based or CLIs. |  |
|**isPublic** | **Boolean** | A boolean to indicate if an app is publicly available or not. |  |
|**name** | **String** | New name of the app to display to users during authorization flow. |  |
|**orgPublicId** | **UUID** |  |  [optional] |
|**redirectUris** | **List&lt;URI&gt;** | List of allowed redirect URIs to call back after authentication. |  [optional] |
|**scopes** | **List&lt;String&gt;** | The scopes this app is allowed to request during authorization. |  |



