

# ServiceAccountAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessTokenTtlSeconds** | **Double** | The time, in seconds, that a generated access token will be valid for. Defaults to 1hr if unset. Only provided when auth_type is oauth_private_key_jwt. |  [optional] |
|**apiKey** | **String** | The Snyk API Key for this service account. Only returned on creation, and only when auth_type is api_key. |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | The authentication strategy for the service account:   * api_key - Regular Snyk API Key.   * oauth_client_secret - OAuth2 client_credentials grant, which returns a client secret that can be used to retrieve an access token.   * oauth_private_key_jwt - OAuth2 client_credentials grant, using private_key_jwt client_assertion as laid out OIDC Connect Core 1.0, section 9. |  |
|**clientId** | **String** | The service account&#39;s attached client-id. Used to request an access-token. Only provided when auth_type is oauth_private_key_jwt. |  [optional] |
|**clientSecret** | **String** | The client secret used for obtaining access tokens. Only sent on creation of new service accounts and cannot be retrieved thereafter. Only provided when auth_type is oauth_client_secret. |  [optional] |
|**jwksUrl** | **String** | A JWKs URL used to verify signed JWT requests against. Must be https. Only provided when auth_type is oauth_private_key_jwt. |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) | The level of access for the service account:   * Group - the service account was created at the Group level.   * Org - the service account was created at the Org level. |  [optional] |
|**name** | **String** | A human-friendly name of the service account. |  |
|**roleId** | **UUID** | The ID of the role which the Service Account is associated with. |  |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| API_KEY | &quot;api_key&quot; |
| OAUTH_CLIENT_SECRET | &quot;oauth_client_secret&quot; |
| OAUTH_PRIVATE_KEY_JWT | &quot;oauth_private_key_jwt&quot; |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;Group&quot; |
| ORG | &quot;Org&quot; |



