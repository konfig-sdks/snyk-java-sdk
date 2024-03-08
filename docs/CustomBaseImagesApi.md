# CustomBaseImagesApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](CustomBaseImagesApi.md#getById) | **GET** /custom_base_images/{custombaseimage_id} | Get a custom base image |
| [**list**](CustomBaseImagesApi.md#list) | **GET** /custom_base_images | Get a custom base image collection |
| [**markImageAsCustomBase**](CustomBaseImagesApi.md#markImageAsCustomBase) | **POST** /custom_base_images | Create a Custom Base Image from an existing container project |
| [**removeCustomBaseImage**](CustomBaseImagesApi.md#removeCustomBaseImage) | **DELETE** /custom_base_images/{custombaseimage_id} | Delete a custom base image |
| [**updateAttributes**](CustomBaseImagesApi.md#updateAttributes) | **PATCH** /custom_base_images/{custombaseimage_id} | Update a custom base image |


<a name="getById"></a>
# **getById**
> CustomBaseImageResponse getById(version, custombaseimageId).execute();

Get a custom base image

Get a custom base image

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomBaseImagesApi;
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
    UUID custombaseimageId = UUID.randomUUID(); // Unique identifier for custom base image
    try {
      CustomBaseImageResponse result = client
              .customBaseImages
              .getById(version, custombaseimageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomBaseImageResponse> response = client
              .customBaseImages
              .getById(version, custombaseimageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#getById");
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
| **custombaseimageId** | **UUID**| Unique identifier for custom base image | |

### Return type

[**CustomBaseImageResponse**](CustomBaseImageResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a custom base image |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="list"></a>
# **list**
> CustomBaseImageCollectionResponse list(version).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).projectId(projectId).orgId(orgId).groupId(groupId).repository(repository).tag(tag).includeInRecommendations(includeInRecommendations).sortBy(sortBy).sortDirection(sortDirection).execute();

Get a custom base image collection

Get a list of custom base images with support for ordering and filtering. Either the org_id or group_id parameters must be set to authorize successfully. If sorting by version, the repository filter is required. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomBaseImagesApi;
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
    UUID projectId = UUID.randomUUID(); // The ID of the container project that the custom base image is based off of.
    UUID orgId = UUID.randomUUID(); // The organization ID of the custom base image
    UUID groupId = UUID.randomUUID(); // The group ID of the custom base image
    String repository = "repository_example"; // The image repository
    String tag = "tag_example"; // The image tag
    Boolean includeInRecommendations = true; // Whether this image should be recommended as a base image upgrade
    String sortBy = "repository"; // Which column to sort by.  If sorting by version, the versioning schema is used. 
    String sortDirection = "ASC"; // Which direction to sort
    try {
      CustomBaseImageCollectionResponse result = client
              .customBaseImages
              .list(version)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .projectId(projectId)
              .orgId(orgId)
              .groupId(groupId)
              .repository(repository)
              .tag(tag)
              .includeInRecommendations(includeInRecommendations)
              .sortBy(sortBy)
              .sortDirection(sortDirection)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomBaseImageCollectionResponse> response = client
              .customBaseImages
              .list(version)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .projectId(projectId)
              .orgId(orgId)
              .groupId(groupId)
              .repository(repository)
              .tag(tag)
              .includeInRecommendations(includeInRecommendations)
              .sortBy(sortBy)
              .sortDirection(sortDirection)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#list");
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
| **projectId** | **UUID**| The ID of the container project that the custom base image is based off of. | [optional] |
| **orgId** | **UUID**| The organization ID of the custom base image | [optional] |
| **groupId** | **UUID**| The group ID of the custom base image | [optional] |
| **repository** | **String**| The image repository | [optional] |
| **tag** | **String**| The image tag | [optional] |
| **includeInRecommendations** | **Boolean**| Whether this image should be recommended as a base image upgrade | [optional] |
| **sortBy** | **String**| Which column to sort by.  If sorting by version, the versioning schema is used.  | [optional] [enum: repository, tag, version] |
| **sortDirection** | **String**| Which direction to sort | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**CustomBaseImageCollectionResponse**](CustomBaseImageCollectionResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns custom base images |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="markImageAsCustomBase"></a>
# **markImageAsCustomBase**
> CustomBaseImageResponse markImageAsCustomBase(version).customBaseImagePostRequest(customBaseImagePostRequest).execute();

Create a Custom Base Image from an existing container project

In order to create a custom base image, you first need to import your base images into Snyk. You can do this through the CLI, UI, or API.  This endpoint marks an image as a custom base image. This means that the image will get added to the pool of images from which Snyk can recommend base image upgrades.  Note, after the first image in a repository gets added, a versioning schema cannot be passed in this endpoint. To update the versioning schema, the PATCH endpoint must be used. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomBaseImagesApi;
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
    CustomBaseImagePostRequestData data = new CustomBaseImagePostRequestData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      CustomBaseImageResponse result = client
              .customBaseImages
              .markImageAsCustomBase(data, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#markImageAsCustomBase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomBaseImageResponse> response = client
              .customBaseImages
              .markImageAsCustomBase(data, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#markImageAsCustomBase");
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
| **customBaseImagePostRequest** | [**CustomBaseImagePostRequest**](CustomBaseImagePostRequest.md)| The properties used in the creation of a custom base image | [optional] |

### Return type

[**CustomBaseImageResponse**](CustomBaseImageResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a custom base image |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="removeCustomBaseImage"></a>
# **removeCustomBaseImage**
> removeCustomBaseImage(version, custombaseimageId).execute();

Delete a custom base image

Delete a custom base image resource. (the related container project is unaffected)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomBaseImagesApi;
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
    UUID custombaseimageId = UUID.randomUUID(); // Unique identifier for custom base image
    try {
      client
              .customBaseImages
              .removeCustomBaseImage(version, custombaseimageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#removeCustomBaseImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customBaseImages
              .removeCustomBaseImage(version, custombaseimageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#removeCustomBaseImage");
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
| **custombaseimageId** | **UUID**| Unique identifier for custom base image | |

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
| **204** | Successfully deleted the custom base image |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="updateAttributes"></a>
# **updateAttributes**
> CustomBaseImageResponse updateAttributes(version, custombaseimageId).customBaseImagePatchRequest(customBaseImagePatchRequest).execute();

Update a custom base image

Updates a custom base image&#39;s attributes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomBaseImagesApi;
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
    CustomBaseImagePatchRequestData data = new CustomBaseImagePatchRequestData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID custombaseimageId = UUID.randomUUID(); // Unique identifier for custom base image
    try {
      CustomBaseImageResponse result = client
              .customBaseImages
              .updateAttributes(data, version, custombaseimageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#updateAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomBaseImageResponse> response = client
              .customBaseImages
              .updateAttributes(data, version, custombaseimageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomBaseImagesApi#updateAttributes");
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
| **custombaseimageId** | **UUID**| Unique identifier for custom base image | |
| **customBaseImagePatchRequest** | [**CustomBaseImagePatchRequest**](CustomBaseImagePatchRequest.md)| custom base image to be updated | [optional] |

### Return type

[**CustomBaseImageResponse**](CustomBaseImageResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated custom base image |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

