# CollectionApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProjectsTo**](CollectionApi.md#addProjectsTo) | **POST** /orgs/{org_id}/collections/{collection_id}/relationships/projects | Add projects to a collection |
| [**createNew**](CollectionApi.md#createNew) | **POST** /orgs/{org_id}/collections | Create a collection |
| [**editCollection**](CollectionApi.md#editCollection) | **PATCH** /orgs/{org_id}/collections/{collection_id} | Edit a collection |
| [**getById**](CollectionApi.md#getById) | **GET** /orgs/{org_id}/collections/{collection_id} | Get a collection |
| [**getList**](CollectionApi.md#getList) | **GET** /orgs/{org_id}/collections | Get collections |
| [**getProjects**](CollectionApi.md#getProjects) | **GET** /orgs/{org_id}/collections/{collection_id}/relationships/projects | Get projects from the specified collection |
| [**removeById**](CollectionApi.md#removeById) | **DELETE** /orgs/{org_id}/collections/{collection_id} | Delete a collection |
| [**removeProjects**](CollectionApi.md#removeProjects) | **DELETE** /orgs/{org_id}/collections/{collection_id}/relationships/projects | Remove projects from a collection |


<a name="addProjectsTo"></a>
# **addProjectsTo**
> addProjectsTo(version, orgId, collectionId).updateCollectionWithProjectsRequest(updateCollectionWithProjectsRequest).execute();

Add projects to a collection

Add projects to a collection by specifying an array of either project ids or target ids (for targets, the respective projects will be added, but they won&#39;t be updated when the target changes)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollectionApi;
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
    List<DeleteProjectsFromCollectionRequestDataInner> data = Arrays.asList(); // IDs of items to add to a collection
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID collectionId = UUID.randomUUID(); // Unique identifier for a collection
    try {
      client
              .collection
              .addProjectsTo(data, version, orgId, collectionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#addProjectsTo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .collection
              .addProjectsTo(data, version, orgId, collectionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#addProjectsTo");
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
| **collectionId** | **UUID**| Unique identifier for a collection | |
| **updateCollectionWithProjectsRequest** | [**UpdateCollectionWithProjectsRequest**](UpdateCollectionWithProjectsRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successfully adding projects to a collection |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="createNew"></a>
# **createNew**
> CollectionCreateNewResponse createNew(version, orgId).createCollectionRequest(createCollectionRequest).execute();

Create a collection

Create a collection

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollectionApi;
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
    CreateCollectionRequestData data = new CreateCollectionRequestData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    try {
      CollectionCreateNewResponse result = client
              .collection
              .createNew(data, version, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionCreateNewResponse> response = client
              .collection
              .createNew(data, version, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#createNew");
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
| **createCollectionRequest** | [**CreateCollectionRequest**](CreateCollectionRequest.md)|  | [optional] |

### Return type

[**CollectionCreateNewResponse**](CollectionCreateNewResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned collection |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="editCollection"></a>
# **editCollection**
> CollectionEditCollectionResponse editCollection(version, orgId, collectionId).updateCollectionRequest(updateCollectionRequest).execute();

Edit a collection

Edit a collection

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollectionApi;
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
    UpdateCollectionRequestData data = new UpdateCollectionRequestData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID collectionId = UUID.randomUUID(); // Unique identifier for a collection
    try {
      CollectionEditCollectionResponse result = client
              .collection
              .editCollection(data, version, orgId, collectionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#editCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionEditCollectionResponse> response = client
              .collection
              .editCollection(data, version, orgId, collectionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#editCollection");
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
| **collectionId** | **UUID**| Unique identifier for a collection | |
| **updateCollectionRequest** | [**UpdateCollectionRequest**](UpdateCollectionRequest.md)|  | [optional] |

### Return type

[**CollectionEditCollectionResponse**](CollectionEditCollectionResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned collection |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getById"></a>
# **getById**
> CollectionGetByIdResponse getById(version, orgId, collectionId).execute();

Get a collection

Get a collection

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollectionApi;
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
    UUID collectionId = UUID.randomUUID(); // Unique identifier for a collection
    try {
      CollectionGetByIdResponse result = client
              .collection
              .getById(version, orgId, collectionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionGetByIdResponse> response = client
              .collection
              .getById(version, orgId, collectionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#getById");
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
| **collectionId** | **UUID**| Unique identifier for a collection | |

### Return type

[**CollectionGetByIdResponse**](CollectionGetByIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned collection |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getList"></a>
# **getList**
> CollectionGetListResponse getList(version, orgId).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).sort(sort).direction(direction).name(name).isGenerated(isGenerated).execute();

Get collections

Return a list of organization&#39;s collections with issues counts  and projects count.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollectionApi;
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
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    String sort = "name"; // Return collections sorted by the specified attributes
    String direction = "ASC"; // Return collections sorted in the specified direction
    String name = "name_example"; // Return collections which names include the provided string
    Boolean isGenerated = true; // Return collections where is_generated matches the provided boolean
    try {
      CollectionGetListResponse result = client
              .collection
              .getList(version, orgId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .sort(sort)
              .direction(direction)
              .name(name)
              .isGenerated(isGenerated)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionGetListResponse> response = client
              .collection
              .getList(version, orgId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .sort(sort)
              .direction(direction)
              .name(name)
              .isGenerated(isGenerated)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#getList");
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
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |
| **sort** | **String**| Return collections sorted by the specified attributes | [optional] [enum: name, projectsCount, issues] |
| **direction** | **String**| Return collections sorted in the specified direction | [optional] [default to DESC] [enum: ASC, DESC] |
| **name** | **String**| Return collections which names include the provided string | [optional] |
| **isGenerated** | **Boolean**| Return collections where is_generated matches the provided boolean | [optional] |

### Return type

[**CollectionGetListResponse**](CollectionGetListResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of collections |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getProjects"></a>
# **getProjects**
> GetProjectsOfCollectionResponse getProjects(version, orgId, collectionId).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).sort(sort).direction(direction).targetId(targetId).show(show).integration(integration).execute();

Get projects from the specified collection

Return a list of organization&#39;s projects that are from the specified collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollectionApi;
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
    UUID collectionId = UUID.randomUUID(); // Unique identifier for a collection
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    String sort = "imported"; // Return projects sorted by the specified attributes
    String direction = "ASC"; // Return projects sorted in the specified direction
    List<UUID> targetId = Arrays.asList(); // Return projects that belong to the provided targets
    List<String> show = Arrays.asList(); // Return projects that are with or without issues
    List<String> integration = Arrays.asList(); // Return projects that match the provided integration types
    try {
      GetProjectsOfCollectionResponse result = client
              .collection
              .getProjects(version, orgId, collectionId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .sort(sort)
              .direction(direction)
              .targetId(targetId)
              .show(show)
              .integration(integration)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#getProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetProjectsOfCollectionResponse> response = client
              .collection
              .getProjects(version, orgId, collectionId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .sort(sort)
              .direction(direction)
              .targetId(targetId)
              .show(show)
              .integration(integration)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#getProjects");
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
| **collectionId** | **UUID**| Unique identifier for a collection | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |
| **sort** | **String**| Return projects sorted by the specified attributes | [optional] [enum: imported, last_tested_at, issues] |
| **direction** | **String**| Return projects sorted in the specified direction | [optional] [default to DESC] [enum: ASC, DESC] |
| **targetId** | [**List&lt;UUID&gt;**](UUID.md)| Return projects that belong to the provided targets | [optional] |
| **show** | [**List&lt;String&gt;**](String.md)| Return projects that are with or without issues | [optional] [enum: vuln-groups, clean-groups] |
| **integration** | [**List&lt;String&gt;**](String.md)| Return projects that match the provided integration types | [optional] [enum: acr, api, artifactory-cr, aws-lambda, azure-functions, azure-repos, bitbucket-cloud, bitbucket-connect-app, bitbucket-server, cli, cloud-foundry, digitalocean-cr, docker-hub, ecr, gcr, github-cr, github-enterprise, github, gitlab-cr, gitlab, google-artifact-cr, harbor-cr, heroku, ibm-cloud, kubernetes, nexus-cr, pivotal, quay-cr, terraform-cloud] |

### Return type

[**GetProjectsOfCollectionResponse**](GetProjectsOfCollectionResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of projects from the specified collection |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="removeById"></a>
# **removeById**
> removeById(version, orgId, collectionId).execute();

Delete a collection

Delete a collection

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollectionApi;
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
    UUID collectionId = UUID.randomUUID(); // Unique identifier for a collection
    try {
      client
              .collection
              .removeById(version, orgId, collectionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .collection
              .removeById(version, orgId, collectionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#removeById");
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
| **collectionId** | **UUID**| Unique identifier for a collection | |

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
| **204** | Collection was deleted successfully |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="removeProjects"></a>
# **removeProjects**
> removeProjects(version, orgId, collectionId).deleteProjectsFromCollectionRequest(deleteProjectsFromCollectionRequest).execute();

Remove projects from a collection

Remove projects from a collection by specifying an array of either project ids or target ids (for targets, the respective projects will be removed)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollectionApi;
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
    List<DeleteProjectsFromCollectionRequestDataInner> data = Arrays.asList(); // IDs of items to remove from a collection
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID collectionId = UUID.randomUUID(); // Unique identifier for a collection
    try {
      client
              .collection
              .removeProjects(data, version, orgId, collectionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#removeProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .collection
              .removeProjects(data, version, orgId, collectionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionApi#removeProjects");
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
| **collectionId** | **UUID**| Unique identifier for a collection | |
| **deleteProjectsFromCollectionRequest** | [**DeleteProjectsFromCollectionRequest**](DeleteProjectsFromCollectionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successfully removing projects from a collection |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

