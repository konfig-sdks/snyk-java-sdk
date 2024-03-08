

# AutoDependencyUpgradeSettings

Automatically create pull requests on recurring tests for dependencies as upgrades become available. If not specified, settings will be inherited from the Project's integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ignoredDependencies** | **List&lt;String&gt;** | Dependencies which should NOT be included in an automatic upgrade operation. |  [optional] |
|**isEnabled** | **Boolean** | Automatically raise pull requests to update out-of-date dependencies. |  [optional] |
|**isInherited** | **Boolean** | Apply the auto dependency integration settings of the Organization to this project. |  [optional] |
|**isMajorUpgradeEnabled** | **Boolean** | Include major version in dependency upgrade recommendation. |  [optional] |
|**limit** | **Double** | Limit of dependency upgrade PRs which can be opened simultaneously. When the limit is reached, no new upgrade PRs are created. If specified, must be between 1 and 10. |  [optional] |
|**minimumAge** | **Double** | Minimum dependency maturity period in days. If specified, must be between 1 and 365. |  [optional] |



