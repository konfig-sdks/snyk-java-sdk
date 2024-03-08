# IssuesApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byGroupId**](IssuesApi.md#byGroupId) | **GET** /groups/{group_id}/issues | Get issues by group ID |
| [**getById**](IssuesApi.md#getById) | **GET** /orgs/{org_id}/issues/{issue_id} | Get an issue |
| [**getByIssueId**](IssuesApi.md#getByIssueId) | **GET** /groups/{group_id}/issues/{issue_id} | Get an issue |
| [**listByOrgId**](IssuesApi.md#listByOrgId) | **GET** /orgs/{org_id}/issues | Get issues by org ID |
| [**listByPackage**](IssuesApi.md#listByPackage) | **GET** /orgs/{org_id}/packages/{purl}/issues | List issues for a package |
| [**queryForPackages**](IssuesApi.md#queryForPackages) | **POST** /orgs/{org_id}/packages/issues | List issues for a given set of packages  (Currently not available to all customers) |


<a name="byGroupId"></a>
# **byGroupId**
> IssuesByGroupIdResponse byGroupId(version, groupId).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).scanItemId(scanItemId).scanItemType(scanItemType).type(type).updatedBefore(updatedBefore).updatedAfter(updatedAfter).createdBefore(createdBefore).createdAfter(createdAfter).effectiveSeverityLevel(effectiveSeverityLevel).status(status).ignored(ignored).execute();

Get issues by group ID

Get a list of a group&#39;s issues.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    UUID groupId = UUID.fromString("4a18d42f-0706-4ad0-b127-24078731fbed"); // Group ID
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    UUID scanItemId = UUID.fromString("4a18d42f-0706-4ad0-b127-24078731fbee"); // A scan item id to filter issues through their scan item relationship.
    ScanItemType scanItemType = ScanItemType.fromValue("project"); // A scan item types to filter issues through their scan item relationship.
    TypeDef type = TypeDef.fromValue("package_vulnerability"); // An issue type to filter issues.
    OffsetDateTime updatedBefore = OffsetDateTime.now(); // A filter to select issues updated before this date.
    OffsetDateTime updatedAfter = OffsetDateTime.now(); // A filter to select issues updated after this date.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // A filter to select issues created before this date.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // A filter to select issues created after this date.
    List<String> effectiveSeverityLevel = Arrays.asList(); // One or more effective severity levels to filter issues.
    List<String> status = Arrays.asList(); // An issue's status
    Boolean ignored = true; // Whether an issue is ignored or not.
    try {
      IssuesByGroupIdResponse result = client
              .issues
              .byGroupId(version, groupId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .scanItemId(scanItemId)
              .scanItemType(scanItemType)
              .type(type)
              .updatedBefore(updatedBefore)
              .updatedAfter(updatedAfter)
              .createdBefore(createdBefore)
              .createdAfter(createdAfter)
              .effectiveSeverityLevel(effectiveSeverityLevel)
              .status(status)
              .ignored(ignored)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#byGroupId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssuesByGroupIdResponse> response = client
              .issues
              .byGroupId(version, groupId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .scanItemId(scanItemId)
              .scanItemType(scanItemType)
              .type(type)
              .updatedBefore(updatedBefore)
              .updatedAfter(updatedAfter)
              .createdBefore(createdBefore)
              .createdAfter(createdAfter)
              .effectiveSeverityLevel(effectiveSeverityLevel)
              .status(status)
              .ignored(ignored)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#byGroupId");
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
| **groupId** | **UUID**| Group ID | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |
| **scanItemId** | **UUID**| A scan item id to filter issues through their scan item relationship. | [optional] |
| **scanItemType** | [**ScanItemType**](.md)| A scan item types to filter issues through their scan item relationship. | [optional] [enum: project, environment] |
| **type** | [**TypeDef**](.md)| An issue type to filter issues. | [optional] [enum: package_vulnerability, license, cloud, code, custom, config] |
| **updatedBefore** | **OffsetDateTime**| A filter to select issues updated before this date. | [optional] |
| **updatedAfter** | **OffsetDateTime**| A filter to select issues updated after this date. | [optional] |
| **createdBefore** | **OffsetDateTime**| A filter to select issues created before this date. | [optional] |
| **createdAfter** | **OffsetDateTime**| A filter to select issues created after this date. | [optional] |
| **effectiveSeverityLevel** | [**List&lt;String&gt;**](String.md)| One or more effective severity levels to filter issues. | [optional] [enum: info, low, medium, high, critical] |
| **status** | [**List&lt;String&gt;**](String.md)| An issue&#39;s status | [optional] [enum: open, resolved] |
| **ignored** | **Boolean**| Whether an issue is ignored or not. | [optional] |

### Return type

[**IssuesByGroupIdResponse**](IssuesByGroupIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of issues. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getById"></a>
# **getById**
> IssuesGetByIssueIdResponse getById(version, orgId, issueId).execute();

Get an issue

Get an issue

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    UUID orgId = UUID.fromString("4a18d42f-0706-4ad0-b127-24078731fbed"); // Org ID
    UUID issueId = UUID.fromString("4a18d42f-0706-4ad0-b127-24078731fbed"); // Issue ID
    try {
      IssuesGetByIssueIdResponse result = client
              .issues
              .getById(version, orgId, issueId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssuesGetByIssueIdResponse> response = client
              .issues
              .getById(version, orgId, issueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getById");
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
| **issueId** | **UUID**| Issue ID | |

### Return type

[**IssuesGetByIssueIdResponse**](IssuesGetByIssueIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an instance of an issue |  * deprecation -  <br>  * location - A header providing a URL for the location of a resource  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getByIssueId"></a>
# **getByIssueId**
> IssuesGetByIssueIdResponse getByIssueId(version, groupId, issueId).execute();

Get an issue

Get an issue

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    UUID groupId = UUID.fromString("4a18d42f-0706-4ad0-b127-24078731fbed"); // Group ID
    UUID issueId = UUID.fromString("4a18d42f-0706-4ad0-b127-24078731fbed"); // Issue ID
    try {
      IssuesGetByIssueIdResponse result = client
              .issues
              .getByIssueId(version, groupId, issueId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getByIssueId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssuesGetByIssueIdResponse> response = client
              .issues
              .getByIssueId(version, groupId, issueId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#getByIssueId");
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
| **groupId** | **UUID**| Group ID | |
| **issueId** | **UUID**| Issue ID | |

### Return type

[**IssuesGetByIssueIdResponse**](IssuesGetByIssueIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an instance of an issue |  * deprecation -  <br>  * location - A header providing a URL for the location of a resource  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listByOrgId"></a>
# **listByOrgId**
> IssuesByGroupIdResponse listByOrgId(version, orgId).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).scanItemId(scanItemId).scanItemType(scanItemType).type(type).updatedBefore(updatedBefore).updatedAfter(updatedAfter).createdBefore(createdBefore).createdAfter(createdAfter).effectiveSeverityLevel(effectiveSeverityLevel).status(status).ignored(ignored).execute();

Get issues by org ID

Get a list of an organization&#39;s issues.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    UUID orgId = UUID.fromString("4a18d42f-0706-4ad0-b127-24078731fbed"); // Org ID
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    UUID scanItemId = UUID.fromString("4a18d42f-0706-4ad0-b127-24078731fbee"); // A scan item id to filter issues through their scan item relationship.
    ScanItemType scanItemType = ScanItemType.fromValue("project"); // A scan item types to filter issues through their scan item relationship.
    TypeDef type = TypeDef.fromValue("package_vulnerability"); // An issue type to filter issues.
    OffsetDateTime updatedBefore = OffsetDateTime.now(); // A filter to select issues updated before this date.
    OffsetDateTime updatedAfter = OffsetDateTime.now(); // A filter to select issues updated after this date.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // A filter to select issues created before this date.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // A filter to select issues created after this date.
    List<String> effectiveSeverityLevel = Arrays.asList(); // One or more effective severity levels to filter issues.
    List<String> status = Arrays.asList(); // An issue's status
    Boolean ignored = true; // Whether an issue is ignored or not.
    try {
      IssuesByGroupIdResponse result = client
              .issues
              .listByOrgId(version, orgId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .scanItemId(scanItemId)
              .scanItemType(scanItemType)
              .type(type)
              .updatedBefore(updatedBefore)
              .updatedAfter(updatedAfter)
              .createdBefore(createdBefore)
              .createdAfter(createdAfter)
              .effectiveSeverityLevel(effectiveSeverityLevel)
              .status(status)
              .ignored(ignored)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#listByOrgId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssuesByGroupIdResponse> response = client
              .issues
              .listByOrgId(version, orgId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .scanItemId(scanItemId)
              .scanItemType(scanItemType)
              .type(type)
              .updatedBefore(updatedBefore)
              .updatedAfter(updatedAfter)
              .createdBefore(createdBefore)
              .createdAfter(createdAfter)
              .effectiveSeverityLevel(effectiveSeverityLevel)
              .status(status)
              .ignored(ignored)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#listByOrgId");
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
| **scanItemId** | **UUID**| A scan item id to filter issues through their scan item relationship. | [optional] |
| **scanItemType** | [**ScanItemType**](.md)| A scan item types to filter issues through their scan item relationship. | [optional] [enum: project, environment] |
| **type** | [**TypeDef**](.md)| An issue type to filter issues. | [optional] [enum: package_vulnerability, license, cloud, code, custom, config] |
| **updatedBefore** | **OffsetDateTime**| A filter to select issues updated before this date. | [optional] |
| **updatedAfter** | **OffsetDateTime**| A filter to select issues updated after this date. | [optional] |
| **createdBefore** | **OffsetDateTime**| A filter to select issues created before this date. | [optional] |
| **createdAfter** | **OffsetDateTime**| A filter to select issues created after this date. | [optional] |
| **effectiveSeverityLevel** | [**List&lt;String&gt;**](String.md)| One or more effective severity levels to filter issues. | [optional] [enum: info, low, medium, high, critical] |
| **status** | [**List&lt;String&gt;**](String.md)| An issue&#39;s status | [optional] [enum: open, resolved] |
| **ignored** | **Boolean**| Whether an issue is ignored or not. | [optional] |

### Return type

[**IssuesByGroupIdResponse**](IssuesByGroupIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of issues. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listByPackage"></a>
# **listByPackage**
> IssuesResponse listByPackage(version, purl, orgId).offset(offset).limit(limit).execute();

List issues for a package

Query issues for a specific package version identified by Package URL (purl). Snyk returns only direct vulnerabilities. Transitive vulnerabilities (from dependencies) are not returned because they can vary depending on context.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String purl = "pkg%3Amaven%2Fcom.fasterxml.woodstox%2Fwoodstox-core%405.0.0"; // A URI-encoded Package URL (purl). Supported purl types are apk, cargo, cocoapods, composer, deb, gem, generic, golang, hex, maven, npm, nuget, pub, pypi, rpm, and swift. A version for the package is also required.
    UUID orgId = UUID.randomUUID(); // Unique identifier for an organization
    Double offset = 3.4D; // Specify the number of results to skip before returning results. Must be greater than or equal to 0. Default is 0.
    Double limit = 3.4D; // Specify the number of results to return. Must be greater than 0 and less than 1000. Default is 1000.
    try {
      IssuesResponse result = client
              .issues
              .listByPackage(version, purl, orgId)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#listByPackage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssuesResponse> response = client
              .issues
              .listByPackage(version, purl, orgId)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#listByPackage");
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
| **purl** | **String**| A URI-encoded Package URL (purl). Supported purl types are apk, cargo, cocoapods, composer, deb, gem, generic, golang, hex, maven, npm, nuget, pub, pypi, rpm, and swift. A version for the package is also required. | |
| **orgId** | **UUID**| Unique identifier for an organization | |
| **offset** | **Double**| Specify the number of results to skip before returning results. Must be greater than or equal to 0. Default is 0. | [optional] |
| **limit** | **Double**| Specify the number of results to return. Must be greater than 0 and less than 1000. Default is 1000. | [optional] |

### Return type

[**IssuesResponse**](IssuesResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an array of issues |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="queryForPackages"></a>
# **queryForPackages**
> IssuesWithPurlsResponse queryForPackages(version, orgId, bulkPackageUrlsRequestBody).execute();

List issues for a given set of packages  (Currently not available to all customers)

This endpoint is not available to all customers. If you are interested please contact support. Query issues for a batch of packages identified by Package URL (purl). Only direct vulnerabilities are returned, transitive vulnerabilities (from dependencies) are not returned because they can vary depending on context.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    BulkPackageUrlsRequestBodyData data = new BulkPackageUrlsRequestBodyData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // Unique identifier for an organization
    try {
      IssuesWithPurlsResponse result = client
              .issues
              .queryForPackages(data, version, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#queryForPackages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IssuesWithPurlsResponse> response = client
              .issues
              .queryForPackages(data, version, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#queryForPackages");
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
| **orgId** | **UUID**| Unique identifier for an organization | |
| **bulkPackageUrlsRequestBody** | [**BulkPackageUrlsRequestBody**](BulkPackageUrlsRequestBody.md)|  | |

### Return type

[**IssuesWithPurlsResponse**](IssuesWithPurlsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an array of issues with the purl identifier of the package that caused them |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

