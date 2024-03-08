

# ServiceAccountsCreateGroupRequestDataAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTokenTtlSeconds** | **Double** | The time, in seconds, that a generated access token will be valid for. Defaults to 1 hour if unset. Only used when auth_type is one of the oauth_* variants. |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Authentication strategy for the service account:   * api_key - Regular Snyk API Key.   * oauth_client_secret - OAuth2 client_credentials grant, which returns a client secret that can be used to retrieve an access token.   * oauth_private_key_jwt - OAuth2 client_credentials grant, using private_key_jwt client_assertion as laid out in OIDC Connect Core 1.0, section 9. |  |
|**jwksUrl** | **String** | A JWKs URL hosting your public keys, used to verify signed JWT requests. Must be https. Required only when auth_type is oauth_private_key_jwt. |  [optional] |
|**name** | **String** | A human-friendly name for the service account. |  |
|**roleId** | **UUID** | The ID of the role which the created service account should use. |  |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| API_KEY | &quot;api_key&quot; |
| OAUTH_CLIENT_SECRET | &quot;oauth_client_secret&quot; |
| OAUTH_PRIVATE_KEY_JWT | &quot;oauth_private_key_jwt&quot; |



