# IacSettingsApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getForGroup**](IacSettingsApi.md#getForGroup) | **GET** /groups/{group_id}/settings/iac | Get the Infrastructure as Code Settings for a group |
| [**getForOrgIac**](IacSettingsApi.md#getForOrgIac) | **GET** /orgs/{org_id}/settings/iac | Get the Infrastructure as Code Settings for an org. |
| [**updateForGroup**](IacSettingsApi.md#updateForGroup) | **PATCH** /groups/{group_id}/settings/iac | Update the Infrastructure as Code Settings for a group |
| [**updateForOrg**](IacSettingsApi.md#updateForOrg) | **PATCH** /orgs/{org_id}/settings/iac | Update the Infrastructure as Code Settings for an org |


<a name="getForGroup"></a>
# **getForGroup**
> IacSettingsGetForGroupResponse getForGroup(version, groupId).execute();

Get the Infrastructure as Code Settings for a group

Get the Infrastructure as Code Settings for a group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IacSettingsApi;
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
    UUID groupId = UUID.randomUUID(); // The id of the group whose Infrastructure as Code settings are requested
    try {
      IacSettingsGetForGroupResponse result = client
              .iacSettings
              .getForGroup(version, groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling IacSettingsApi#getForGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IacSettingsGetForGroupResponse> response = client
              .iacSettings
              .getForGroup(version, groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IacSettingsApi#getForGroup");
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
| **groupId** | **UUID**| The id of the group whose Infrastructure as Code settings are requested | |

### Return type

[**IacSettingsGetForGroupResponse**](IacSettingsGetForGroupResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Infrastructure as Code Settings of the group. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getForOrgIac"></a>
# **getForOrgIac**
> IacSettingsGetForOrgIacResponse getForOrgIac(version, orgId).execute();

Get the Infrastructure as Code Settings for an org.

Get the Infrastructure as Code Settings for an org.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IacSettingsApi;
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
    UUID orgId = UUID.randomUUID(); // The id of the org whose Infrastructure as Code settings are requested.
    try {
      IacSettingsGetForOrgIacResponse result = client
              .iacSettings
              .getForOrgIac(version, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling IacSettingsApi#getForOrgIac");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IacSettingsGetForOrgIacResponse> response = client
              .iacSettings
              .getForOrgIac(version, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IacSettingsApi#getForOrgIac");
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
| **orgId** | **UUID**| The id of the org whose Infrastructure as Code settings are requested. | |

### Return type

[**IacSettingsGetForOrgIacResponse**](IacSettingsGetForOrgIacResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Infrastructure as Code Settings of the org. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="updateForGroup"></a>
# **updateForGroup**
> IacSettingsUpdateForGroupResponse updateForGroup(version, groupId).iacSettingsUpdateForGroupRequest(iacSettingsUpdateForGroupRequest).execute();

Update the Infrastructure as Code Settings for a group

Update the Infrastructure as Code Settings for a group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IacSettingsApi;
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
    UUID groupId = UUID.randomUUID(); // The id of the group whose Infrastructure as Code settings are getting updated
    GroupIacSettingsRequest data = new GroupIacSettingsRequest();
    try {
      IacSettingsUpdateForGroupResponse result = client
              .iacSettings
              .updateForGroup(version, groupId)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling IacSettingsApi#updateForGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IacSettingsUpdateForGroupResponse> response = client
              .iacSettings
              .updateForGroup(version, groupId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IacSettingsApi#updateForGroup");
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
| **groupId** | **UUID**| The id of the group whose Infrastructure as Code settings are getting updated | |
| **iacSettingsUpdateForGroupRequest** | [**IacSettingsUpdateForGroupRequest**](IacSettingsUpdateForGroupRequest.md)|  | [optional] |

### Return type

[**IacSettingsUpdateForGroupResponse**](IacSettingsUpdateForGroupResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Infrastructure as Code Settings of the group were updated. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="updateForOrg"></a>
# **updateForOrg**
> IacSettingsUpdateForOrgResponse updateForOrg(version, orgId).iacSettingsUpdateForOrgRequest(iacSettingsUpdateForOrgRequest).execute();

Update the Infrastructure as Code Settings for an org

Update the Infrastructure as Code Settings for an org.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IacSettingsApi;
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
    UUID orgId = UUID.randomUUID(); // The id of the org whose Infrastructure as Code settings are getting updated
    OrgIacSettingsRequest data = new OrgIacSettingsRequest();
    try {
      IacSettingsUpdateForOrgResponse result = client
              .iacSettings
              .updateForOrg(version, orgId)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling IacSettingsApi#updateForOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IacSettingsUpdateForOrgResponse> response = client
              .iacSettings
              .updateForOrg(version, orgId)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IacSettingsApi#updateForOrg");
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
| **orgId** | **UUID**| The id of the org whose Infrastructure as Code settings are getting updated | |
| **iacSettingsUpdateForOrgRequest** | [**IacSettingsUpdateForOrgRequest**](IacSettingsUpdateForOrgRequest.md)|  | [optional] |

### Return type

[**IacSettingsUpdateForOrgResponse**](IacSettingsUpdateForOrgResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Infrastructure as Code Settings of the org were updated. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

