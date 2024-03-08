

# ServiceAccountsManageClientSecretRequestDataAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Operation to perform:   * &#x60;replace&#x60; - Replace existing secrets with a new generated secret.   * &#x60;create&#x60; - Add a new secret, preserving existing secrets. A maximum of to two secrets can exist at a time.   * &#x60;delete&#x60; - Remove an existing secret by value. At least one secret must remain per service account.  |  |
|**secret** | **String** | Secret to delete when using &#x60;delete&#x60; mode |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;replace&quot; |
| CREATE | &quot;create&quot; |
| DELETE | &quot;delete&quot; |



