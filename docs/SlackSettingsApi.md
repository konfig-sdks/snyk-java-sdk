# SlackSettingsApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDefaultNotificationSettings**](SlackSettingsApi.md#createDefaultNotificationSettings) | **POST** /orgs/{org_id}/slack_app/{bot_id} | Create new Slack notification default settings. |
| [**getDefaultNotificationSettings**](SlackSettingsApi.md#getDefaultNotificationSettings) | **GET** /orgs/{org_id}/slack_app/{bot_id} | Get Slack integration default notification settings. |
| [**getOverridesForProjects**](SlackSettingsApi.md#getOverridesForProjects) | **GET** /orgs/{org_id}/slack_app/{bot_id}/projects | Slack notification settings overrides for projects |
| [**projectOverride**](SlackSettingsApi.md#projectOverride) | **POST** /orgs/{org_id}/slack_app/{bot_id}/projects/{project_id} | Create a new Slack settings override for a given project. |
| [**removeIntegration**](SlackSettingsApi.md#removeIntegration) | **DELETE** /orgs/{org_id}/slack_app/{bot_id} | Remove the given Slack App integration |
| [**removeProjectOverride**](SlackSettingsApi.md#removeProjectOverride) | **DELETE** /orgs/{org_id}/slack_app/{bot_id}/projects/{project_id} | Remove Slack settings override for a project. |
| [**updateNotificationSettingsForProject**](SlackSettingsApi.md#updateNotificationSettingsForProject) | **PATCH** /orgs/{org_id}/slack_app/{bot_id}/projects/{project_id} | Update Slack notification settings for a project. |


<a name="createDefaultNotificationSettings"></a>
# **createDefaultNotificationSettings**
> SlackSettingsCreateDefaultNotificationSettingsResponse createDefaultNotificationSettings(version, orgId, botId).settingsRequest(settingsRequest).execute();

Create new Slack notification default settings.

Create new Slack notification default settings for a given tenant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackSettingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.snyk.io/rest";
    
    configuration.aPIToken  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    Snyk client = new Snyk(configuration);
    SettingsRequestData data = new SettingsRequestData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID botId = UUID.randomUUID(); // Bot ID
    try {
      SlackSettingsCreateDefaultNotificationSettingsResponse result = client
              .slackSettings
              .createDefaultNotificationSettings(data, version, orgId, botId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#createDefaultNotificationSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SlackSettingsCreateDefaultNotificationSettingsResponse> response = client
              .slackSettings
              .createDefaultNotificationSettings(data, version, orgId, botId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#createDefaultNotificationSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The requested version of the endpoint to process the request | |
| **orgId** | **UUID**| Org ID | |
| **botId** | **UUID**| Bot ID | |
| **settingsRequest** | [**SettingsRequest**](SettingsRequest.md)| Create new Slack notification default settings for a tenant. | [optional] |

### Return type

[**SlackSettingsCreateDefaultNotificationSettingsResponse**](SlackSettingsCreateDefaultNotificationSettingsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Default settings created successfully |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getDefaultNotificationSettings"></a>
# **getDefaultNotificationSettings**
> SlackSettingsGetDefaultNotificationSettingsResponse getDefaultNotificationSettings(version, orgId, botId).execute();

Get Slack integration default notification settings.

Get Slack integration default notification settings for the provided tenant ID and bot ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackSettingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.snyk.io/rest";
    
    configuration.aPIToken  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    Snyk client = new Snyk(configuration);
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID botId = UUID.randomUUID(); // Bot ID
    try {
      SlackSettingsGetDefaultNotificationSettingsResponse result = client
              .slackSettings
              .getDefaultNotificationSettings(version, orgId, botId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#getDefaultNotificationSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SlackSettingsGetDefaultNotificationSettingsResponse> response = client
              .slackSettings
              .getDefaultNotificationSettings(version, orgId, botId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#getDefaultNotificationSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The requested version of the endpoint to process the request | |
| **orgId** | **UUID**| Org ID | |
| **botId** | **UUID**| Bot ID | |

### Return type

[**SlackSettingsGetDefaultNotificationSettingsResponse**](SlackSettingsGetDefaultNotificationSettingsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default settings created successfully |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getOverridesForProjects"></a>
# **getOverridesForProjects**
> GetProjectSettingsCollection getOverridesForProjects(version, orgId, botId).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).execute();

Slack notification settings overrides for projects

Slack notification settings overrides for projects. These settings overrides the default settings configured for the tenant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackSettingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.snyk.io/rest";
    
    configuration.aPIToken  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    Snyk client = new Snyk(configuration);
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID botId = UUID.randomUUID(); // Bot ID
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    try {
      GetProjectSettingsCollection result = client
              .slackSettings
              .getOverridesForProjects(version, orgId, botId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#getOverridesForProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetProjectSettingsCollection> response = client
              .slackSettings
              .getOverridesForProjects(version, orgId, botId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#getOverridesForProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The requested version of the endpoint to process the request | |
| **orgId** | **UUID**| Org ID | |
| **botId** | **UUID**| Bot ID | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |

### Return type

[**GetProjectSettingsCollection**](GetProjectSettingsCollection.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return default settings for a tenant |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="projectOverride"></a>
# **projectOverride**
> SlackSettingsProjectOverrideResponse projectOverride(version, orgId, projectId, botId).settingsRequest(settingsRequest).execute();

Create a new Slack settings override for a given project.

Create Slack settings override for a project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackSettingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.snyk.io/rest";
    
    configuration.aPIToken  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    Snyk client = new Snyk(configuration);
    SettingsRequestData data = new SettingsRequestData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID projectId = UUID.randomUUID(); // Project ID
    UUID botId = UUID.randomUUID(); // Bot ID
    try {
      SlackSettingsProjectOverrideResponse result = client
              .slackSettings
              .projectOverride(data, version, orgId, projectId, botId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#projectOverride");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SlackSettingsProjectOverrideResponse> response = client
              .slackSettings
              .projectOverride(data, version, orgId, projectId, botId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#projectOverride");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The requested version of the endpoint to process the request | |
| **orgId** | **UUID**| Org ID | |
| **projectId** | **UUID**| Project ID | |
| **botId** | **UUID**| Bot ID | |
| **settingsRequest** | [**SettingsRequest**](SettingsRequest.md)| Create new Slack notification default settings for a tenant. | [optional] |

### Return type

[**SlackSettingsProjectOverrideResponse**](SlackSettingsProjectOverrideResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Project settings created successfully |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="removeIntegration"></a>
# **removeIntegration**
> removeIntegration(version, orgId, botId).execute();

Remove the given Slack App integration

Remove the given Slack App integration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackSettingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.snyk.io/rest";
    
    configuration.aPIToken  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    Snyk client = new Snyk(configuration);
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID botId = UUID.randomUUID(); // Bot ID
    try {
      client
              .slackSettings
              .removeIntegration(version, orgId, botId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#removeIntegration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .slackSettings
              .removeIntegration(version, orgId, botId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#removeIntegration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The requested version of the endpoint to process the request | |
| **orgId** | **UUID**| Org ID | |
| **botId** | **UUID**| Bot ID | |

### Return type

null (empty response body)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Slack App integration successfully removed |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="removeProjectOverride"></a>
# **removeProjectOverride**
> removeProjectOverride(version, orgId, projectId, botId).execute();

Remove Slack settings override for a project.

Remove Slack settings override for a project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackSettingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.snyk.io/rest";
    
    configuration.aPIToken  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    Snyk client = new Snyk(configuration);
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID projectId = UUID.randomUUID(); // Project ID
    UUID botId = UUID.randomUUID(); // Bot ID
    try {
      client
              .slackSettings
              .removeProjectOverride(version, orgId, projectId, botId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#removeProjectOverride");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .slackSettings
              .removeProjectOverride(version, orgId, projectId, botId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#removeProjectOverride");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The requested version of the endpoint to process the request | |
| **orgId** | **UUID**| Org ID | |
| **projectId** | **UUID**| Project ID | |
| **botId** | **UUID**| Bot ID | |

### Return type

null (empty response body)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Slack settings override for the project removed successfully. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="updateNotificationSettingsForProject"></a>
# **updateNotificationSettingsForProject**
> SlackSettingsUpdateNotificationSettingsForProjectResponse updateNotificationSettingsForProject(version, orgId, botId, projectId).projectSettingsPatchRequest(projectSettingsPatchRequest).execute();

Update Slack notification settings for a project.

Update Slack notification settings for a project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackSettingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.snyk.io/rest";
    
    configuration.aPIToken  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    Snyk client = new Snyk(configuration);
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID botId = UUID.randomUUID(); // Bot ID
    UUID projectId = UUID.randomUUID(); // Project ID
    ProjectSettingsPatchRequestData data = new ProjectSettingsPatchRequestData();
    try {
      SlackSettingsUpdateNotificationSettingsForProjectResponse result = client
              .slackSettings
              .updateNotificationSettingsForProject(version, orgId, botId, projectId)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#updateNotificationSettingsForProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SlackSettingsUpdateNotificationSettingsForProjectResponse> response = client
              .slackSettings
              .updateNotificationSettingsForProject(version, orgId, botId, projectId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackSettingsApi#updateNotificationSettingsForProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The requested version of the endpoint to process the request | |
| **orgId** | **UUID**| Org ID | |
| **botId** | **UUID**| Bot ID | |
| **projectId** | **UUID**| Project ID | |
| **projectSettingsPatchRequest** | [**ProjectSettingsPatchRequest**](ProjectSettingsPatchRequest.md)| Update existing project specific settings for a project. | [optional] |

### Return type

[**SlackSettingsUpdateNotificationSettingsForProjectResponse**](SlackSettingsUpdateNotificationSettingsForProjectResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Slack notification settings for a project updated successfully. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

