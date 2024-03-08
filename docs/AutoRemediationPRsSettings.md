

# AutoRemediationPRsSettings

Automatically raise pull requests on recurring tests to fix new and existing vulnerabilities. If not specified, settings will be inherited from the Project's integration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isBacklogPrsEnabled** | **Boolean** | Automatically create pull requests on scheduled tests for known (backlog) vulnerabilities. |  [optional] |
|**isFreshPrsEnabled** | **Boolean** | Automatically create pull requests on scheduled tests for new vulnerabilities. |  [optional] |
|**isPatchRemediationEnabled** | **Boolean** | Include vulnerability patches in automatic pull requests. |  [optional] |



