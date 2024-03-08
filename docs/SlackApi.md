# SlackApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getChannelNameById**](SlackApi.md#getChannelNameById) | **GET** /orgs/{org_id}/slack_app/{tenant_id}/channels/{channel_id} | Get Slack Channel name by Slack Channel ID. |
| [**getChannels**](SlackApi.md#getChannels) | **GET** /orgs/{org_id}/slack_app/{tenant_id}/channels | Get a list of Slack channels |


<a name="getChannelNameById"></a>
# **getChannelNameById**
> SlackGetChannelNameByIdResponse getChannelNameById(version, orgId, channelId, tenantId).execute();

Get Slack Channel name by Slack Channel ID.

Requires the Snyk Slack App to be set up for this org. It will return the Slack channel name for the provided Slack channel ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackApi;
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
    URI channelId = new URI(); // Slack Channel ID
    UUID tenantId = UUID.randomUUID(); // Tenant ID
    try {
      SlackGetChannelNameByIdResponse result = client
              .slack
              .getChannelNameById(version, orgId, channelId, tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackApi#getChannelNameById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SlackGetChannelNameByIdResponse> response = client
              .slack
              .getChannelNameById(version, orgId, channelId, tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackApi#getChannelNameById");
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
| **channelId** | **URI**| Slack Channel ID | |
| **tenantId** | **UUID**| Tenant ID | |

### Return type

[**SlackGetChannelNameByIdResponse**](SlackGetChannelNameByIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Slack channels |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getChannels"></a>
# **getChannels**
> SlackGetChannelsResponse getChannels(version, orgId, tenantId).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).execute();

Get a list of Slack channels

Requires the Snyk Slack App to be set up for this org, will retrieve a list of channels the Snyk Slack App can access. Note that it is currently only possible to page forwards through this collection, no prev links will be generated and the ending_before parameter will not function.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SlackApi;
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
    UUID tenantId = UUID.randomUUID(); // Tenant ID
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 1000; // Number of results to return per page
    try {
      SlackGetChannelsResponse result = client
              .slack
              .getChannels(version, orgId, tenantId)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackApi#getChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SlackGetChannelsResponse> response = client
              .slack
              .getChannels(version, orgId, tenantId)
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
      System.err.println("Exception when calling SlackApi#getChannels");
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
| **tenantId** | **UUID**| Tenant ID | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 1000] |

### Return type

[**SlackGetChannelsResponse**](SlackGetChannelsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Slack channels |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

