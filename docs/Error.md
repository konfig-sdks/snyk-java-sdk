

# Error


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | A short, human-readable summary of the problem that SHOULD NOT change from occurrence to occurrence of the problem, except for purposes of localization. |  [optional] |
|**code** | **String** | An application-specific error code, expressed as a string value. |  [optional] |
|**detail** | **String** | A human-readable explanation specific to this occurrence of the problem. |  |
|**id** | **UUID** | A unique identifier for this particular occurrence of the problem. |  [optional] |
|**links** | [**ErrorLink**](ErrorLink.md) |  |  [optional] |
|**meta** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**source** | [**ErrorSource**](ErrorSource.md) |  |  [optional] |
|**status** | **String** | The HTTP status code applicable to this problem, expressed as a string value. |  |



