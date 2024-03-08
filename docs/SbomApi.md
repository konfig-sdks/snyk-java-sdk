# SbomApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProjectDocument**](SbomApi.md#getProjectDocument) | **GET** /orgs/{org_id}/projects/{project_id}/sbom | Get a project’s SBOM document |


<a name="getProjectDocument"></a>
# **getProjectDocument**
> Map&lt;String, Object&gt; getProjectDocument(version, orgId, projectId).format(format).execute();

Get a project’s SBOM document

This endpoint lets you retrieve the SBOM document of a software project. It supports the following formats: * CycloneDX version 1.4 in JSON (set &#x60;format&#x60; to &#x60;cyclonedx1.4+json&#x60;). * CycloneDX version 1.4 in XML (set &#x60;format&#x60; to &#x60;cyclonedx1.4+xml&#x60;). * SPDX version 2.3 in JSON (set &#x60;format&#x60; to &#x60;spdx2.3+json&#x60;).  By default it will respond with an empty JSON:API response.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SbomApi;
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
    UUID orgId = UUID.randomUUID(); // Unique identifier for an organization
    UUID projectId = UUID.randomUUID(); // Unique identifier for a project
    String format = "cyclonedx1.4+json"; // The desired SBOM format of the response.
    try {
      Map<String, Object> result = client
              .sbom
              .getProjectDocument(version, orgId, projectId)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SbomApi#getProjectDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .sbom
              .getProjectDocument(version, orgId, projectId)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SbomApi#getProjectDocument");
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
| **projectId** | **UUID**| Unique identifier for a project | |
| **format** | **String**| The desired SBOM format of the response. | [optional] [enum: cyclonedx1.4+json, cyclonedx1.4+xml, spdx2.3+json] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.api+json, application/vnd.cyclonedx+json, application/vnd.cyclonedx+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the SBOM document of a project |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

