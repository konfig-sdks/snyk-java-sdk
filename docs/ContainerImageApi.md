# ContainerImageApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInstance**](ContainerImageApi.md#getInstance) | **GET** /orgs/{org_id}/container_images/{image_id} | Get instance of container image |
| [**listImageTargetRefs**](ContainerImageApi.md#listImageTargetRefs) | **GET** /orgs/{org_id}/container_images/{image_id}/relationships/image_target_refs | List instances of image target references for a container image |
| [**listInstancesOfContainerImage**](ContainerImageApi.md#listInstancesOfContainerImage) | **GET** /orgs/{org_id}/container_images | List instances of container image |


<a name="getInstance"></a>
# **getInstance**
> ContainerImageGetInstanceResponse getInstance(version, orgId, imageId).execute();

Get instance of container image

Get instance of container image

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContainerImageApi;
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
    UUID orgId = UUID.fromString("f59045b3-f093-40c3-871d-a334ae30c568"); // Org ID
    URI imageId = new URI(); // Image ID
    try {
      ContainerImageGetInstanceResponse result = client
              .containerImage
              .getInstance(version, orgId, imageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerImageApi#getInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContainerImageGetInstanceResponse> response = client
              .containerImage
              .getInstance(version, orgId, imageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerImageApi#getInstance");
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
| **imageId** | **URI**| Image ID | |

### Return type

[**ContainerImageGetInstanceResponse**](ContainerImageGetInstanceResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an instance of container image |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listImageTargetRefs"></a>
# **listImageTargetRefs**
> ContainerImageListImageTargetRefsResponse listImageTargetRefs(orgId, imageId, version).limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List instances of image target references for a container image

List instances of image target references for a container image

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContainerImageApi;
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
    UUID orgId = UUID.fromString("f59045b3-f093-40c3-871d-a334ae30c568"); // Org ID
    URI imageId = new URI(); // Image ID
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    Integer limit = 10; // Number of results to return per page
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    try {
      ContainerImageListImageTargetRefsResponse result = client
              .containerImage
              .listImageTargetRefs(orgId, imageId, version)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerImageApi#listImageTargetRefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContainerImageListImageTargetRefsResponse> response = client
              .containerImage
              .listImageTargetRefs(orgId, imageId, version)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerImageApi#listImageTargetRefs");
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
| **orgId** | **UUID**| Org ID | |
| **imageId** | **URI**| Image ID | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |

### Return type

[**ContainerImageListImageTargetRefsResponse**](ContainerImageListImageTargetRefsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of image target references for a container image |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listInstancesOfContainerImage"></a>
# **listInstancesOfContainerImage**
> ContainerImageListInstancesOfContainerImageResponse listInstancesOfContainerImage(orgId, version).imageIds(imageIds).platform(platform).names(names).limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List instances of container image

List instances of container image

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContainerImageApi;
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
    UUID orgId = UUID.fromString("f59045b3-f093-40c3-871d-a334ae30c568"); // Org ID
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    List<URI> imageIds = Arrays.asList(); // A comma-separated list of Image IDs
    Platform platform = Platform.fromValue("aix/ppc64"); // The image Operating System and processor architecture
    List<String> names = Arrays.asList(); // The container registry names
    Integer limit = 10; // Number of results to return per page
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    try {
      ContainerImageListInstancesOfContainerImageResponse result = client
              .containerImage
              .listInstancesOfContainerImage(orgId, version)
              .imageIds(imageIds)
              .platform(platform)
              .names(names)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerImageApi#listInstancesOfContainerImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContainerImageListInstancesOfContainerImageResponse> response = client
              .containerImage
              .listInstancesOfContainerImage(orgId, version)
              .imageIds(imageIds)
              .platform(platform)
              .names(names)
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerImageApi#listInstancesOfContainerImage");
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
| **orgId** | **UUID**| Org ID | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **imageIds** | [**List&lt;URI&gt;**](URI.md)| A comma-separated list of Image IDs | [optional] |
| **platform** | [**Platform**](.md)| The image Operating System and processor architecture | [optional] [enum: aix/ppc64, android/386, android/amd64, android/arm, android/arm/v5, android/arm/v6, android/arm/v7, android/arm64, android/arm64/v8, darwin/amd64, darwin/arm, darwin/arm/v5, darwin/arm/v6, darwin/arm/v7, darwin/arm64, darwin/arm64/v8, dragonfly/amd64, freebsd/386, freebsd/amd64, freebsd/arm, freebsd/arm/v5, freebsd/arm/v6, freebsd/arm/v7, illumos/amd64, ios/arm64, ios/arm64/v8, js/wasm, linux/386, linux/amd64, linux/arm, linux/arm/v5, linux/arm/v6, linux/arm/v7, linux/arm64, linux/arm64/v8, linux/loong64, linux/mips, linux/mipsle, linux/mips64, linux/mips64le, linux/ppc64, linux/ppc64le, linux/riscv64, linux/s390x, linux/x86_64, netbsd/386, netbsd/amd64, netbsd/arm, netbsd/arm/v5, netbsd/arm/v6, netbsd/arm/v7, openbsd/386, openbsd/amd64, openbsd/arm, openbsd/arm/v5, openbsd/arm/v6, openbsd/arm/v7, openbsd/arm64, openbsd/arm64/v8, plan9/386, plan9/amd64, plan9/arm, plan9/arm/v5, plan9/arm/v6, plan9/arm/v7, solaris/amd64, windows/386, windows/amd64, windows/arm, windows/arm/v5, windows/arm/v6, windows/arm/v7, windows/arm64, windows/arm64/v8] |
| **names** | [**List&lt;String&gt;**](String.md)| The container registry names | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |

### Return type

[**ContainerImageListInstancesOfContainerImageResponse**](ContainerImageListInstancesOfContainerImageResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of container image instances |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

