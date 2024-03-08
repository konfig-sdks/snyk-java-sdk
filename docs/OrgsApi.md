# OrgsApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](OrgsApi.md#getDetails) | **GET** /orgs/{org_id} | Get organization |
| [**listAccessibleOrganizations**](OrgsApi.md#listAccessibleOrganizations) | **GET** /orgs | List accessible organizations |
| [**listGroupOrgs**](OrgsApi.md#listGroupOrgs) | **GET** /groups/{group_id}/orgs | List all organizations in group |
| [**updateDetails**](OrgsApi.md#updateDetails) | **PATCH** /orgs/{org_id} | Update organization |


<a name="getDetails"></a>
# **getDetails**
> OrgsGetDetailsResponse getDetails(version, orgId).execute();

Get organization

Get the full details of an organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgsApi;
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
    UUID orgId = UUID.fromString("b667f176-df52-4b0a-9954-117af6b05ab7"); // Unique identifier for org
    try {
      OrgsGetDetailsResponse result = client
              .orgs
              .getDetails(version, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgsGetDetailsResponse> response = client
              .orgs
              .getDetails(version, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#getDetails");
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
| **orgId** | **UUID**| Unique identifier for org | |

### Return type

[**OrgsGetDetailsResponse**](OrgsGetDetailsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an instance of an organization |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listAccessibleOrganizations"></a>
# **listAccessibleOrganizations**
> OrgsListAccessibleOrganizationsResponse listAccessibleOrganizations(version).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).groupId(groupId).isPersonal(isPersonal).slug(slug).name(name).expand(expand).execute();

List accessible organizations

Get a paginated list of organizations you have access to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgsApi;
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
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    UUID groupId = UUID.randomUUID(); // If set, only return organizations within the specified group
    Boolean isPersonal = true; // If true, only return organizations that are not part of a group.
    String slug = "slug_example"; // Only return orgs whose slug exactly matches this value.
    String name = "name_example"; // Only return orgs whose name contains this value.
    List<String> expand = Arrays.asList(); // Expand the specified related resources in the response to include their attributes.
    try {
      OrgsListAccessibleOrganizationsResponse result = client
              .orgs
              .listAccessibleOrganizations(version)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .groupId(groupId)
              .isPersonal(isPersonal)
              .slug(slug)
              .name(name)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#listAccessibleOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgsListAccessibleOrganizationsResponse> response = client
              .orgs
              .listAccessibleOrganizations(version)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .groupId(groupId)
              .isPersonal(isPersonal)
              .slug(slug)
              .name(name)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#listAccessibleOrganizations");
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
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |
| **groupId** | **UUID**| If set, only return organizations within the specified group | [optional] |
| **isPersonal** | **Boolean**| If true, only return organizations that are not part of a group. | [optional] |
| **slug** | **String**| Only return orgs whose slug exactly matches this value. | [optional] |
| **name** | **String**| Only return orgs whose name contains this value. | [optional] |
| **expand** | [**List&lt;String&gt;**](String.md)| Expand the specified related resources in the response to include their attributes. | [optional] [enum: member_role] |

### Return type

[**OrgsListAccessibleOrganizationsResponse**](OrgsListAccessibleOrganizationsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of organizations you have access to. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listGroupOrgs"></a>
# **listGroupOrgs**
> OrgsListGroupOrgsResponse listGroupOrgs(version, groupId).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).name(name).slug(slug).execute();

List all organizations in group

Get a paginated list of all the organizations belonging to the group. By default, this endpoint returns the organizations in alphabetical order of their name.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgsApi;
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
    UUID groupId = UUID.fromString("b667f176-df52-4b0a-9954-117af6b05ab7"); // Unique identifier for group
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    String name = "name_example"; // Only return organizations whose name contains this value. Case insensitive.
    String slug = "slug_example"; // Only return organizations whose slug exactly matches this value. Case sensitive.
    try {
      OrgsListGroupOrgsResponse result = client
              .orgs
              .listGroupOrgs(version, groupId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .name(name)
              .slug(slug)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#listGroupOrgs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgsListGroupOrgsResponse> response = client
              .orgs
              .listGroupOrgs(version, groupId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .name(name)
              .slug(slug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#listGroupOrgs");
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
| **groupId** | **UUID**| Unique identifier for group | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |
| **name** | **String**| Only return organizations whose name contains this value. Case insensitive. | [optional] |
| **slug** | **String**| Only return organizations whose slug exactly matches this value. Case sensitive. | [optional] |

### Return type

[**OrgsListGroupOrgsResponse**](OrgsListGroupOrgsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of organizations in the group. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="updateDetails"></a>
# **updateDetails**
> OrgsUpdateDetailsResponse updateDetails(version, orgId).orgsUpdateDetailsRequest(orgsUpdateDetailsRequest).execute();

Update organization

Update the details of an organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgsApi;
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
    OrgsUpdateDetailsRequestData data = new OrgsUpdateDetailsRequestData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.fromString("b667f176-df52-4b0a-9954-117af6b05ab7"); // Unique identifier for org
    try {
      OrgsUpdateDetailsResponse result = client
              .orgs
              .updateDetails(data, version, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgsUpdateDetailsResponse> response = client
              .orgs
              .updateDetails(data, version, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgsApi#updateDetails");
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
| **orgId** | **UUID**| Unique identifier for org | |
| **orgsUpdateDetailsRequest** | [**OrgsUpdateDetailsRequest**](OrgsUpdateDetailsRequest.md)|  | [optional] |

### Return type

[**OrgsUpdateDetailsResponse**](OrgsUpdateDetailsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Instance of org is updated |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |
| **204** | The operation completed successfully with no content |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

