# InvitesApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPendingInvitation**](InvitesApi.md#cancelPendingInvitation) | **DELETE** /orgs/{org_id}/invites/{invite_id} | Cancel a pending user invitations to an organization. |
| [**listPendingUserInvitations**](InvitesApi.md#listPendingUserInvitations) | **GET** /orgs/{org_id}/invites | List pending user invitations to an organization. |
| [**userToOrganization**](InvitesApi.md#userToOrganization) | **POST** /orgs/{org_id}/invites | Invite a user to an organization |


<a name="cancelPendingInvitation"></a>
# **cancelPendingInvitation**
> cancelPendingInvitation(orgId, inviteId, version).execute();

Cancel a pending user invitations to an organization.

Cancel a pending user invitations to an organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvitesApi;
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
    UUID orgId = UUID.randomUUID(); // The id of the org the user is being invited to
    UUID inviteId = UUID.randomUUID(); // The id of the pending invite to cancel
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      client
              .invites
              .cancelPendingInvitation(orgId, inviteId, version)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#cancelPendingInvitation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .invites
              .cancelPendingInvitation(orgId, inviteId, version)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#cancelPendingInvitation");
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
| **orgId** | **UUID**| The id of the org the user is being invited to | |
| **inviteId** | **UUID**| The id of the pending invite to cancel | |
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
| **204** | The operation completed successfully with no content |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listPendingUserInvitations"></a>
# **listPendingUserInvitations**
> InvitesListPendingUserInvitationsResponse listPendingUserInvitations(orgId, version).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).execute();

List pending user invitations to an organization.

List pending user invitations to an organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvitesApi;
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
    UUID orgId = UUID.randomUUID(); // The id of the org the user is being invited to
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    try {
      InvitesListPendingUserInvitationsResponse result = client
              .invites
              .listPendingUserInvitations(orgId, version)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#listPendingUserInvitations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvitesListPendingUserInvitationsResponse> response = client
              .invites
              .listPendingUserInvitations(orgId, version)
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
      System.err.println("Exception when calling InvitesApi#listPendingUserInvitations");
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
| **orgId** | **UUID**| The id of the org the user is being invited to | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |

### Return type

[**InvitesListPendingUserInvitationsResponse**](InvitesListPendingUserInvitationsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of pending invitations to an organization. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="userToOrganization"></a>
# **userToOrganization**
> InvitesUserToOrganizationResponse userToOrganization(version, orgId).invitesUserToOrganizationRequest(invitesUserToOrganizationRequest).execute();

Invite a user to an organization

Invite a user to an organization with a role.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvitesApi;
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
    OrgInvitationPostData data = new OrgInvitationPostData();
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    UUID orgId = UUID.randomUUID(); // The id of the org the user is being invited to
    try {
      InvitesUserToOrganizationResponse result = client
              .invites
              .userToOrganization(data, version, orgId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#userToOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvitesUserToOrganizationResponse> response = client
              .invites
              .userToOrganization(data, version, orgId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitesApi#userToOrganization");
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
| **orgId** | **UUID**| The id of the org the user is being invited to | |
| **invitesUserToOrganizationRequest** | [**InvitesUserToOrganizationRequest**](InvitesUserToOrganizationRequest.md)|  | [optional] |

### Return type

[**InvitesUserToOrganizationResponse**](InvitesUserToOrganizationResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A new organization invitation has been created |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

