# ProjectsApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteByProjectId**](ProjectsApi.md#deleteByProjectId) | **DELETE** /orgs/{org_id}/projects/{project_id} | Delete project by project ID. |
| [**getByProjectId**](ProjectsApi.md#getByProjectId) | **GET** /orgs/{org_id}/projects/{project_id} | Get project by project ID. |
| [**listForOrg**](ProjectsApi.md#listForOrg) | **GET** /orgs/{org_id}/projects | List all Projects for an Org with the given Org ID. |
| [**updateByProjectId**](ProjectsApi.md#updateByProjectId) | **PATCH** /orgs/{org_id}/projects/{project_id} | Updates project by project ID. |


<a name="deleteByProjectId"></a>
# **deleteByProjectId**
> deleteByProjectId(orgId, projectId, version).execute();

Delete project by project ID.

Delete one project in the organization by project ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    UUID orgId = UUID.randomUUID(); // The ID of the org to which the project belongs to.
    UUID projectId = UUID.randomUUID(); // The ID of the project.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      client
              .projects
              .deleteByProjectId(orgId, projectId, version)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteByProjectId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projects
              .deleteByProjectId(orgId, projectId, version)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteByProjectId");
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
| **orgId** | **UUID**| The ID of the org to which the project belongs to. | |
| **projectId** | **UUID**| The ID of the project. | |
| **version** | **String**| The requested version of the endpoint to process the request | |

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
| **204** | The project has been deleted |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getByProjectId"></a>
# **getByProjectId**
> ProjectsGetByProjectIdResponse getByProjectId(orgId, projectId, version).expand(expand).metaLatestIssueCounts(metaLatestIssueCounts).metaLatestDependencyTotal(metaLatestDependencyTotal).execute();

Get project by project ID.

Get one project of the organization by project ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    UUID orgId = UUID.randomUUID(); // The ID of the org to which the project belongs to.
    UUID projectId = UUID.randomUUID(); // The ID of the project.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    List<String> expand = Arrays.asList(); // Expand relationships.
    Boolean metaLatestIssueCounts = true; // Include a summary count for the issues found in the most recent scan of this project
    Boolean metaLatestDependencyTotal = true; // Include the total number of dependencies found in the most recent scan of this project
    try {
      ProjectsGetByProjectIdResponse result = client
              .projects
              .getByProjectId(orgId, projectId, version)
              .expand(expand)
              .metaLatestIssueCounts(metaLatestIssueCounts)
              .metaLatestDependencyTotal(metaLatestDependencyTotal)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getByProjectId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsGetByProjectIdResponse> response = client
              .projects
              .getByProjectId(orgId, projectId, version)
              .expand(expand)
              .metaLatestIssueCounts(metaLatestIssueCounts)
              .metaLatestDependencyTotal(metaLatestDependencyTotal)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getByProjectId");
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
| **orgId** | **UUID**| The ID of the org to which the project belongs to. | |
| **projectId** | **UUID**| The ID of the project. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **expand** | [**List&lt;String&gt;**](String.md)| Expand relationships. | [optional] [enum: target] |
| **metaLatestIssueCounts** | **Boolean**| Include a summary count for the issues found in the most recent scan of this project | [optional] |
| **metaLatestDependencyTotal** | **Boolean**| Include the total number of dependencies found in the most recent scan of this project | [optional] |

### Return type

[**ProjectsGetByProjectIdResponse**](ProjectsGetByProjectIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A project is returned for the targeted org |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listForOrg"></a>
# **listForOrg**
> ProjectsListForOrgResponse listForOrg(orgId, version).targetId(targetId).targetReference(targetReference).targetFile(targetFile).targetRuntime(targetRuntime).metaCount(metaCount).ids(ids).names(names).namesStartWith(namesStartWith).origins(origins).types(types).expand(expand).metaLatestIssueCounts(metaLatestIssueCounts).metaLatestDependencyTotal(metaLatestDependencyTotal).cliMonitoredBefore(cliMonitoredBefore).cliMonitoredAfter(cliMonitoredAfter).importingUserPublicId(importingUserPublicId).tags(tags).businessCriticality(businessCriticality).environment(environment).lifecycle(lifecycle).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).execute();

List all Projects for an Org with the given Org ID.

List all Projects for an Org.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    UUID orgId = UUID.randomUUID(); // The ID of the org that the projects belong to.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    List<UUID> targetId = Arrays.asList(); // Return projects that belong to the provided targets
    String targetReference = "targetReference_example"; // Return projects that match the provided target reference
    String targetFile = "targetFile_example"; // Return projects that match the provided target file
    String targetRuntime = "targetRuntime_example"; // Return projects that match the provided target runtime
    String metaCount = "only"; // The collection count.
    List<UUID> ids = Arrays.asList(); // Return projects that match the provided IDs.
    List<String> names = Arrays.asList(); // Return projects that match the provided names.
    List<String> namesStartWith = Arrays.asList(); // Return projects with names starting with the specified prefix.
    List<String> origins = Arrays.asList(); // Return projects that match the provided origins.
    List<String> types = Arrays.asList(); // Return projects that match the provided types.
    List<String> expand = Arrays.asList(); // Expand relationships.
    Boolean metaLatestIssueCounts = true; // Include a summary count for the issues found in the most recent scan of this project
    Boolean metaLatestDependencyTotal = true; // Include the total number of dependencies found in the most recent scan of this project
    OffsetDateTime cliMonitoredBefore = OffsetDateTime.parse("2021-05-29T09:50:54.014Z"); // Filter projects uploaded and monitored before this date (encoded value)
    OffsetDateTime cliMonitoredAfter = OffsetDateTime.parse("2021-05-29T09:50:54.014Z"); // Filter projects uploaded and monitored after this date (encoded value)
    List<String> importingUserPublicId = Arrays.asList(); // Return projects that match the provided importing user public ids.
    List<String> tags = Arrays.asList(); // Return projects that match all the provided tags
    List<String> businessCriticality = Arrays.asList(); // Return projects that match all the provided business_criticality value
    List<String> environment = Arrays.asList(); // Return projects that match all the provided environment values
    List<String> lifecycle = Arrays.asList(); // Return projects that match all the provided lifecycle values
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    try {
      ProjectsListForOrgResponse result = client
              .projects
              .listForOrg(orgId, version)
              .targetId(targetId)
              .targetReference(targetReference)
              .targetFile(targetFile)
              .targetRuntime(targetRuntime)
              .metaCount(metaCount)
              .ids(ids)
              .names(names)
              .namesStartWith(namesStartWith)
              .origins(origins)
              .types(types)
              .expand(expand)
              .metaLatestIssueCounts(metaLatestIssueCounts)
              .metaLatestDependencyTotal(metaLatestDependencyTotal)
              .cliMonitoredBefore(cliMonitoredBefore)
              .cliMonitoredAfter(cliMonitoredAfter)
              .importingUserPublicId(importingUserPublicId)
              .tags(tags)
              .businessCriticality(businessCriticality)
              .environment(environment)
              .lifecycle(lifecycle)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listForOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsListForOrgResponse> response = client
              .projects
              .listForOrg(orgId, version)
              .targetId(targetId)
              .targetReference(targetReference)
              .targetFile(targetFile)
              .targetRuntime(targetRuntime)
              .metaCount(metaCount)
              .ids(ids)
              .names(names)
              .namesStartWith(namesStartWith)
              .origins(origins)
              .types(types)
              .expand(expand)
              .metaLatestIssueCounts(metaLatestIssueCounts)
              .metaLatestDependencyTotal(metaLatestDependencyTotal)
              .cliMonitoredBefore(cliMonitoredBefore)
              .cliMonitoredAfter(cliMonitoredAfter)
              .importingUserPublicId(importingUserPublicId)
              .tags(tags)
              .businessCriticality(businessCriticality)
              .environment(environment)
              .lifecycle(lifecycle)
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
      System.err.println("Exception when calling ProjectsApi#listForOrg");
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
| **orgId** | **UUID**| The ID of the org that the projects belong to. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **targetId** | [**List&lt;UUID&gt;**](UUID.md)| Return projects that belong to the provided targets | [optional] |
| **targetReference** | **String**| Return projects that match the provided target reference | [optional] |
| **targetFile** | **String**| Return projects that match the provided target file | [optional] |
| **targetRuntime** | **String**| Return projects that match the provided target runtime | [optional] |
| **metaCount** | **String**| The collection count. | [optional] [enum: only] |
| **ids** | [**List&lt;UUID&gt;**](UUID.md)| Return projects that match the provided IDs. | [optional] |
| **names** | [**List&lt;String&gt;**](String.md)| Return projects that match the provided names. | [optional] |
| **namesStartWith** | [**List&lt;String&gt;**](String.md)| Return projects with names starting with the specified prefix. | [optional] |
| **origins** | [**List&lt;String&gt;**](String.md)| Return projects that match the provided origins. | [optional] |
| **types** | [**List&lt;String&gt;**](String.md)| Return projects that match the provided types. | [optional] |
| **expand** | [**List&lt;String&gt;**](String.md)| Expand relationships. | [optional] [enum: target] |
| **metaLatestIssueCounts** | **Boolean**| Include a summary count for the issues found in the most recent scan of this project | [optional] |
| **metaLatestDependencyTotal** | **Boolean**| Include the total number of dependencies found in the most recent scan of this project | [optional] |
| **cliMonitoredBefore** | **OffsetDateTime**| Filter projects uploaded and monitored before this date (encoded value) | [optional] |
| **cliMonitoredAfter** | **OffsetDateTime**| Filter projects uploaded and monitored after this date (encoded value) | [optional] |
| **importingUserPublicId** | [**List&lt;String&gt;**](String.md)| Return projects that match the provided importing user public ids. | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| Return projects that match all the provided tags | [optional] |
| **businessCriticality** | [**List&lt;String&gt;**](String.md)| Return projects that match all the provided business_criticality value | [optional] [enum: critical, high, medium, low] |
| **environment** | [**List&lt;String&gt;**](String.md)| Return projects that match all the provided environment values | [optional] [enum: frontend, backend, internal, external, mobile, saas, onprem, hosted, distributed] |
| **lifecycle** | [**List&lt;String&gt;**](String.md)| Return projects that match all the provided lifecycle values | [optional] [enum: production, development, sandbox] |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |

### Return type

[**ProjectsListForOrgResponse**](ProjectsListForOrgResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of projects is returned for the targeted org |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="updateByProjectId"></a>
# **updateByProjectId**
> ProjectsUpdateByProjectIdResponse updateByProjectId(version, orgId, projectId).expand(expand).patchProjectRequest(patchProjectRequest).execute();

Updates project by project ID.

Updates one project of the organization by project ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    PatchProjectRequestData data = new PatchProjectRequestData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // The ID of the Org the project belongs to.
    UUID projectId = UUID.randomUUID(); // The ID of the project to patch.
    List<String> expand = Arrays.asList(); // Expand relationships.
    try {
      ProjectsUpdateByProjectIdResponse result = client
              .projects
              .updateByProjectId(data, version, orgId, projectId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateByProjectId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsUpdateByProjectIdResponse> response = client
              .projects
              .updateByProjectId(data, version, orgId, projectId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateByProjectId");
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
| **orgId** | **UUID**| The ID of the Org the project belongs to. | |
| **projectId** | **UUID**| The ID of the project to patch. | |
| **expand** | [**List&lt;String&gt;**](String.md)| Expand relationships. | [optional] [enum: target] |
| **patchProjectRequest** | [**PatchProjectRequest**](PatchProjectRequest.md)| The project attributes to be updated. | [optional] |

### Return type

[**ProjectsUpdateByProjectIdResponse**](ProjectsUpdateByProjectIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A project is updated for the targeted org |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

