# TargetsApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteById**](TargetsApi.md#deleteById) | **DELETE** /orgs/{org_id}/targets/{target_id} | Delete target by target ID |
| [**getById**](TargetsApi.md#getById) | **GET** /orgs/{org_id}/targets/{target_id} | Get target by target ID |
| [**listByOrgId**](TargetsApi.md#listByOrgId) | **GET** /orgs/{org_id}/targets | Get targets by org ID |


<a name="deleteById"></a>
# **deleteById**
> deleteById(version, orgId, targetId).execute();

Delete target by target ID

Delete the specified target.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TargetsApi;
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
    UUID orgId = UUID.randomUUID(); // The id of the org to delete
    UUID targetId = UUID.randomUUID(); // The id of the target to delete
    try {
      client
              .targets
              .deleteById(version, orgId, targetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .targets
              .deleteById(version, orgId, targetId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetsApi#deleteById");
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
| **orgId** | **UUID**| The id of the org to delete | |
| **targetId** | **UUID**| The id of the target to delete | |

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
| **204** | The target is deleted with all projects, if it is found in the specified org. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getById"></a>
# **getById**
> TargetsGetByIdResponse getById(version, orgId, targetId).execute();

Get target by target ID

Get a specified target for an organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TargetsApi;
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
    UUID orgId = UUID.randomUUID(); // The id of the org to return the target from
    UUID targetId = UUID.randomUUID(); // The id of the target to return
    try {
      TargetsGetByIdResponse result = client
              .targets
              .getById(version, orgId, targetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TargetsGetByIdResponse> response = client
              .targets
              .getById(version, orgId, targetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetsApi#getById");
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
| **orgId** | **UUID**| The id of the org to return the target from | |
| **targetId** | **UUID**| The id of the target to return | |

### Return type

[**TargetsGetByIdResponse**](TargetsGetByIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single target is returned if it is found in the specified org |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listByOrgId"></a>
# **listByOrgId**
> TargetsListByOrgIdResponse listByOrgId(version, orgId).startingAfter(startingAfter).endingBefore(endingBefore).count(count).limit(limit).isPrivate(isPrivate).excludeEmpty(excludeEmpty).url(url).sourceTypes(sourceTypes).displayName(displayName).createdGte(createdGte).execute();

Get targets by org ID

Get a list of an organization&#39;s targets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TargetsApi;
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
    UUID orgId = UUID.randomUUID(); // The id of the org to return a list of targets
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Boolean count = true; // Calculate total amount of filtered results
    Integer limit = 10; // Number of results to return per page
    Boolean isPrivate = true; // Return targets that match the provided value of is_private
    Boolean excludeEmpty = true; // Return only the targets that has projects
    String url = "url_example"; // Return targets that match the provided remote_url.
    List<String> sourceTypes = Arrays.asList(); // Return targets that match the provided source_types
    String displayName = "displayName_example"; // Return targets with display names starting with the provided string
    OffsetDateTime createdGte = OffsetDateTime.parse("2022-01-01T16:00:00Z"); // Return only targets which have been created at or after the specified date. 
    try {
      TargetsListByOrgIdResponse result = client
              .targets
              .listByOrgId(version, orgId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .count(count)
              .limit(limit)
              .isPrivate(isPrivate)
              .excludeEmpty(excludeEmpty)
              .url(url)
              .sourceTypes(sourceTypes)
              .displayName(displayName)
              .createdGte(createdGte)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetsApi#listByOrgId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TargetsListByOrgIdResponse> response = client
              .targets
              .listByOrgId(version, orgId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .count(count)
              .limit(limit)
              .isPrivate(isPrivate)
              .excludeEmpty(excludeEmpty)
              .url(url)
              .sourceTypes(sourceTypes)
              .displayName(displayName)
              .createdGte(createdGte)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetsApi#listByOrgId");
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
| **orgId** | **UUID**| The id of the org to return a list of targets | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **count** | **Boolean**| Calculate total amount of filtered results | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |
| **isPrivate** | **Boolean**| Return targets that match the provided value of is_private | [optional] |
| **excludeEmpty** | **Boolean**| Return only the targets that has projects | [optional] [default to true] |
| **url** | **String**| Return targets that match the provided remote_url. | [optional] |
| **sourceTypes** | [**List&lt;String&gt;**](String.md)| Return targets that match the provided source_types | [optional] [enum: bitbucket-server, gitlab, github-enterprise, bitbucket-cloud, bitbucket-connect-app, azure-repos, github, github-cloud-app, github-server-app, cli, docker-hub, in-memory-fs, acr, ecr, gcr, artifactory-cr, harbor-cr, quay-cr, github-cr, nexus-cr, nexus-private-repo, digitalocean-cr, gitlab-cr, google-artifact-cr, heroku, kubernetes, api, aws-lambda, azure-functions, cloud-foundry, pivotal, ibm-cloud, terraform-cloud] |
| **displayName** | **String**| Return targets with display names starting with the provided string | [optional] |
| **createdGte** | **OffsetDateTime**| Return only targets which have been created at or after the specified date.  | [optional] |

### Return type

[**TargetsListByOrgIdResponse**](TargetsListByOrgIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of targets is returned for the targeted org |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

