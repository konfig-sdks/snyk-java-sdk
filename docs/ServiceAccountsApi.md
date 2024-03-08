# ServiceAccountsApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createForOrganization**](ServiceAccountsApi.md#createForOrganization) | **POST** /orgs/{org_id}/service_accounts | Create a service account for an organization. |
| [**createGroup**](ServiceAccountsApi.md#createGroup) | **POST** /groups/{group_id}/service_accounts | Create a service account for a group. |
| [**deleteGroupServiceAccount**](ServiceAccountsApi.md#deleteGroupServiceAccount) | **DELETE** /groups/{group_id}/service_accounts/{serviceaccount_id} | Delete a group service account. |
| [**deleteOrgServiceAccount**](ServiceAccountsApi.md#deleteOrgServiceAccount) | **DELETE** /orgs/{org_id}/service_accounts/{serviceaccount_id} | Delete a service account in an organization. |
| [**getGroupServiceAccount**](ServiceAccountsApi.md#getGroupServiceAccount) | **GET** /groups/{group_id}/service_accounts/{serviceaccount_id} | Get a group service account. |
| [**getOrganizationAccountById**](ServiceAccountsApi.md#getOrganizationAccountById) | **GET** /orgs/{org_id}/service_accounts/{serviceaccount_id} | Get an organization service account. |
| [**listGroupServiceAccounts**](ServiceAccountsApi.md#listGroupServiceAccounts) | **GET** /groups/{group_id}/service_accounts | Get a list of group service accounts. |
| [**listOrganizationServiceAccounts**](ServiceAccountsApi.md#listOrganizationServiceAccounts) | **GET** /orgs/{org_id}/service_accounts | Get a list of organization service accounts. |
| [**manageClientSecret**](ServiceAccountsApi.md#manageClientSecret) | **POST** /groups/{group_id}/service_accounts/{serviceaccount_id}/secrets | Manage a group service account&#39;s client secret. |
| [**manageClientSecretForOrganizationServiceAccount**](ServiceAccountsApi.md#manageClientSecretForOrganizationServiceAccount) | **POST** /orgs/{org_id}/service_accounts/{serviceaccount_id}/secrets | Manage an organization service account&#39;s client secret. |
| [**updateGroupNameById**](ServiceAccountsApi.md#updateGroupNameById) | **PATCH** /groups/{group_id}/service_accounts/{serviceaccount_id} | Update a group service account. |
| [**updateOrganizationServiceAccountName**](ServiceAccountsApi.md#updateOrganizationServiceAccountName) | **PATCH** /orgs/{org_id}/service_accounts/{serviceaccount_id} | Update an organization service account. |


<a name="createForOrganization"></a>
# **createForOrganization**
> ServiceAccountsCreateForOrganizationResponse createForOrganization(orgId, version, serviceAccountsCreateForOrganizationRequest).execute();

Create a service account for an organization.

Create a service account for an organization. The service account can be used to generate access tokens.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    ServiceAccountsCreateForOrganizationRequestData data = new ServiceAccountsCreateForOrganizationRequestData();
    UUID orgId = UUID.randomUUID(); // The ID of the Snyk Organization that is creating and will own the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      ServiceAccountsCreateForOrganizationResponse result = client
              .serviceAccounts
              .createForOrganization(data, orgId, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#createForOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsCreateForOrganizationResponse> response = client
              .serviceAccounts
              .createForOrganization(data, orgId, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#createForOrganization");
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
| **orgId** | **UUID**| The ID of the Snyk Organization that is creating and will own the service account. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **serviceAccountsCreateForOrganizationRequest** | [**ServiceAccountsCreateForOrganizationRequest**](ServiceAccountsCreateForOrganizationRequest.md)|  | |

### Return type

[**ServiceAccountsCreateForOrganizationResponse**](ServiceAccountsCreateForOrganizationResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A new service account has been created |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="createGroup"></a>
# **createGroup**
> ServiceAccountsCreateGroupResponse createGroup(groupId, version, serviceAccountsCreateGroupRequest).execute();

Create a service account for a group.

Create a service account for a group. The service account can be used to generate access tokens. Currently, we only allow group service accounts using default group roles.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    ServiceAccountsCreateGroupRequestData data = new ServiceAccountsCreateGroupRequestData();
    UUID groupId = UUID.randomUUID(); // The ID of the Snyk Group that is creating and owns the service account
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      ServiceAccountsCreateGroupResponse result = client
              .serviceAccounts
              .createGroup(data, groupId, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#createGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsCreateGroupResponse> response = client
              .serviceAccounts
              .createGroup(data, groupId, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#createGroup");
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
| **groupId** | **UUID**| The ID of the Snyk Group that is creating and owns the service account | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **serviceAccountsCreateGroupRequest** | [**ServiceAccountsCreateGroupRequest**](ServiceAccountsCreateGroupRequest.md)|  | |

### Return type

[**ServiceAccountsCreateGroupResponse**](ServiceAccountsCreateGroupResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A new service account has been created |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="deleteGroupServiceAccount"></a>
# **deleteGroupServiceAccount**
> deleteGroupServiceAccount(groupId, serviceaccountId, version).execute();

Delete a group service account.

Permanently delete a group-level service account by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    UUID groupId = UUID.randomUUID(); // The ID of the Snyk Group that owns the service account.
    UUID serviceaccountId = UUID.randomUUID(); // The ID of the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      client
              .serviceAccounts
              .deleteGroupServiceAccount(groupId, serviceaccountId, version)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#deleteGroupServiceAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .serviceAccounts
              .deleteGroupServiceAccount(groupId, serviceaccountId, version)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#deleteGroupServiceAccount");
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
| **groupId** | **UUID**| The ID of the Snyk Group that owns the service account. | |
| **serviceaccountId** | **UUID**| The ID of the service account. | |
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
| **204** | Service account was successfully deleted. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="deleteOrgServiceAccount"></a>
# **deleteOrgServiceAccount**
> deleteOrgServiceAccount(orgId, serviceaccountId, version).execute();

Delete a service account in an organization.

Delete a service account in an organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    UUID orgId = UUID.randomUUID(); // The ID of org to which the service account belongs.
    UUID serviceaccountId = UUID.randomUUID(); // The ID of the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      client
              .serviceAccounts
              .deleteOrgServiceAccount(orgId, serviceaccountId, version)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#deleteOrgServiceAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .serviceAccounts
              .deleteOrgServiceAccount(orgId, serviceaccountId, version)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#deleteOrgServiceAccount");
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
| **orgId** | **UUID**| The ID of org to which the service account belongs. | |
| **serviceaccountId** | **UUID**| The ID of the service account. | |
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
| **204** | The service account has been deleted. |  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getGroupServiceAccount"></a>
# **getGroupServiceAccount**
> ServiceAccountsGetGroupServiceAccountResponse getGroupServiceAccount(groupId, serviceaccountId, version).execute();

Get a group service account.

Get a group-level service account by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    UUID groupId = UUID.randomUUID(); // The ID of the Snyk Group that owns the service account.
    UUID serviceaccountId = UUID.randomUUID(); // The ID of the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      ServiceAccountsGetGroupServiceAccountResponse result = client
              .serviceAccounts
              .getGroupServiceAccount(groupId, serviceaccountId, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#getGroupServiceAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsGetGroupServiceAccountResponse> response = client
              .serviceAccounts
              .getGroupServiceAccount(groupId, serviceaccountId, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#getGroupServiceAccount");
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
| **groupId** | **UUID**| The ID of the Snyk Group that owns the service account. | |
| **serviceaccountId** | **UUID**| The ID of the service account. | |
| **version** | **String**| The requested version of the endpoint to process the request | |

### Return type

[**ServiceAccountsGetGroupServiceAccountResponse**](ServiceAccountsGetGroupServiceAccountResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service account is returned. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="getOrganizationAccountById"></a>
# **getOrganizationAccountById**
> ServiceAccountsGetOrganizationAccountByIdResponse getOrganizationAccountById(orgId, serviceaccountId, version).execute();

Get an organization service account.

Get an organization-level service account by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    UUID orgId = UUID.randomUUID(); // The ID of the Snyk Organization that owns the service account.
    UUID serviceaccountId = UUID.randomUUID(); // The ID of the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      ServiceAccountsGetOrganizationAccountByIdResponse result = client
              .serviceAccounts
              .getOrganizationAccountById(orgId, serviceaccountId, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#getOrganizationAccountById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsGetOrganizationAccountByIdResponse> response = client
              .serviceAccounts
              .getOrganizationAccountById(orgId, serviceaccountId, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#getOrganizationAccountById");
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
| **orgId** | **UUID**| The ID of the Snyk Organization that owns the service account. | |
| **serviceaccountId** | **UUID**| The ID of the service account. | |
| **version** | **String**| The requested version of the endpoint to process the request | |

### Return type

[**ServiceAccountsGetOrganizationAccountByIdResponse**](ServiceAccountsGetOrganizationAccountByIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service account is returned. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listGroupServiceAccounts"></a>
# **listGroupServiceAccounts**
> ServiceAccountsListGroupServiceAccountsResponse listGroupServiceAccounts(groupId, version).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).execute();

Get a list of group service accounts.

Get all service accounts for a group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    UUID groupId = UUID.randomUUID(); // The ID of the Snyk Group that owns the service accounts.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    try {
      ServiceAccountsListGroupServiceAccountsResponse result = client
              .serviceAccounts
              .listGroupServiceAccounts(groupId, version)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#listGroupServiceAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsListGroupServiceAccountsResponse> response = client
              .serviceAccounts
              .listGroupServiceAccounts(groupId, version)
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
      System.err.println("Exception when calling ServiceAccountsApi#listGroupServiceAccounts");
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
| **groupId** | **UUID**| The ID of the Snyk Group that owns the service accounts. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |

### Return type

[**ServiceAccountsListGroupServiceAccountsResponse**](ServiceAccountsListGroupServiceAccountsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of service accounts is returned. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="listOrganizationServiceAccounts"></a>
# **listOrganizationServiceAccounts**
> ServiceAccountsListOrganizationServiceAccountsResponse listOrganizationServiceAccounts(orgId, version).startingAfter(startingAfter).endingBefore(endingBefore).limit(limit).execute();

Get a list of organization service accounts.

Get all service accounts for an organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    UUID orgId = UUID.randomUUID(); // The ID of the Snyk Organization that owns the service accounts.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    String startingAfter = "v1.eyJpZCI6IjEwMDAifQo="; // Return the page of results immediately after this cursor
    String endingBefore = "v1.eyJpZCI6IjExMDAifQo="; // Return the page of results immediately before this cursor
    Integer limit = 10; // Number of results to return per page
    try {
      ServiceAccountsListOrganizationServiceAccountsResponse result = client
              .serviceAccounts
              .listOrganizationServiceAccounts(orgId, version)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#listOrganizationServiceAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsListOrganizationServiceAccountsResponse> response = client
              .serviceAccounts
              .listOrganizationServiceAccounts(orgId, version)
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
      System.err.println("Exception when calling ServiceAccountsApi#listOrganizationServiceAccounts");
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
| **orgId** | **UUID**| The ID of the Snyk Organization that owns the service accounts. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **startingAfter** | **String**| Return the page of results immediately after this cursor | [optional] |
| **endingBefore** | **String**| Return the page of results immediately before this cursor | [optional] |
| **limit** | **Integer**| Number of results to return per page | [optional] [default to 10] |

### Return type

[**ServiceAccountsListOrganizationServiceAccountsResponse**](ServiceAccountsListOrganizationServiceAccountsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of service accounts is returned. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="manageClientSecret"></a>
# **manageClientSecret**
> ServiceAccountsManageClientSecretResponse manageClientSecret(groupId, serviceaccountId, version, serviceAccountsManageClientSecretRequest).execute();

Manage a group service account&#39;s client secret.

Manage the client secret of a group service account by the service account ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    ServiceAccountsManageClientSecretRequestData data = new ServiceAccountsManageClientSecretRequestData();
    UUID groupId = UUID.randomUUID(); // The ID of the Snyk Group that owns the service account.
    UUID serviceaccountId = UUID.randomUUID(); // The ID of the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      ServiceAccountsManageClientSecretResponse result = client
              .serviceAccounts
              .manageClientSecret(data, groupId, serviceaccountId, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#manageClientSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsManageClientSecretResponse> response = client
              .serviceAccounts
              .manageClientSecret(data, groupId, serviceaccountId, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#manageClientSecret");
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
| **groupId** | **UUID**| The ID of the Snyk Group that owns the service account. | |
| **serviceaccountId** | **UUID**| The ID of the service account. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **serviceAccountsManageClientSecretRequest** | [**ServiceAccountsManageClientSecretRequest**](ServiceAccountsManageClientSecretRequest.md)|  | |

### Return type

[**ServiceAccountsManageClientSecretResponse**](ServiceAccountsManageClientSecretResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service account client secret has been updated. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="manageClientSecretForOrganizationServiceAccount"></a>
# **manageClientSecretForOrganizationServiceAccount**
> ServiceAccountsManageClientSecretForOrganizationServiceAccountResponse manageClientSecretForOrganizationServiceAccount(orgId, serviceaccountId, version, serviceAccountsManageClientSecretForOrganizationServiceAccountRequest).execute();

Manage an organization service account&#39;s client secret.

Manage the client secret of an organization-level service account by the service account ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    ServiceAccountsManageClientSecretRequestData data = new ServiceAccountsManageClientSecretRequestData();
    UUID orgId = UUID.randomUUID(); // The ID of the Snyk Organization that owns the service account.
    UUID serviceaccountId = UUID.randomUUID(); // The ID of the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      ServiceAccountsManageClientSecretForOrganizationServiceAccountResponse result = client
              .serviceAccounts
              .manageClientSecretForOrganizationServiceAccount(data, orgId, serviceaccountId, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#manageClientSecretForOrganizationServiceAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsManageClientSecretForOrganizationServiceAccountResponse> response = client
              .serviceAccounts
              .manageClientSecretForOrganizationServiceAccount(data, orgId, serviceaccountId, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#manageClientSecretForOrganizationServiceAccount");
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
| **orgId** | **UUID**| The ID of the Snyk Organization that owns the service account. | |
| **serviceaccountId** | **UUID**| The ID of the service account. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **serviceAccountsManageClientSecretForOrganizationServiceAccountRequest** | [**ServiceAccountsManageClientSecretForOrganizationServiceAccountRequest**](ServiceAccountsManageClientSecretForOrganizationServiceAccountRequest.md)|  | |

### Return type

[**ServiceAccountsManageClientSecretForOrganizationServiceAccountResponse**](ServiceAccountsManageClientSecretForOrganizationServiceAccountResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service account client secret has been updated. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="updateGroupNameById"></a>
# **updateGroupNameById**
> ServiceAccountsUpdateGroupNameByIdResponse updateGroupNameById(groupId, serviceaccountId, version, serviceAccountsUpdateGroupNameByIdRequest).execute();

Update a group service account.

Update the name of a group&#39;s service account by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    ServiceAccountsUpdateGroupNameByIdRequestData data = new ServiceAccountsUpdateGroupNameByIdRequestData();
    UUID groupId = UUID.randomUUID(); // The ID of the Snyk Group that owns the service account.
    UUID serviceaccountId = UUID.randomUUID(); // The ID of the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      ServiceAccountsUpdateGroupNameByIdResponse result = client
              .serviceAccounts
              .updateGroupNameById(data, groupId, serviceaccountId, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#updateGroupNameById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsUpdateGroupNameByIdResponse> response = client
              .serviceAccounts
              .updateGroupNameById(data, groupId, serviceaccountId, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#updateGroupNameById");
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
| **groupId** | **UUID**| The ID of the Snyk Group that owns the service account. | |
| **serviceaccountId** | **UUID**| The ID of the service account. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **serviceAccountsUpdateGroupNameByIdRequest** | [**ServiceAccountsUpdateGroupNameByIdRequest**](ServiceAccountsUpdateGroupNameByIdRequest.md)|  | |

### Return type

[**ServiceAccountsUpdateGroupNameByIdResponse**](ServiceAccountsUpdateGroupNameByIdResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service account is returned. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="updateOrganizationServiceAccountName"></a>
# **updateOrganizationServiceAccountName**
> ServiceAccountsUpdateOrganizationServiceAccountNameResponse updateOrganizationServiceAccountName(orgId, serviceaccountId, version, serviceAccountsUpdateOrganizationServiceAccountNameRequest).execute();

Update an organization service account.

Update the name of an organization-level service account by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceAccountsApi;
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
    ServiceAccountsUpdateOrganizationServiceAccountNameRequestData data = new ServiceAccountsUpdateOrganizationServiceAccountNameRequestData();
    UUID orgId = UUID.randomUUID(); // The ID of the Snyk Organization that owns the service account.
    UUID serviceaccountId = UUID.randomUUID(); // The ID of the service account.
    String version = "2021-06-04"; // The requested version of the endpoint to process the request
    try {
      ServiceAccountsUpdateOrganizationServiceAccountNameResponse result = client
              .serviceAccounts
              .updateOrganizationServiceAccountName(data, orgId, serviceaccountId, version)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#updateOrganizationServiceAccountName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceAccountsUpdateOrganizationServiceAccountNameResponse> response = client
              .serviceAccounts
              .updateOrganizationServiceAccountName(data, orgId, serviceaccountId, version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#updateOrganizationServiceAccountName");
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
| **orgId** | **UUID**| The ID of the Snyk Organization that owns the service account. | |
| **serviceaccountId** | **UUID**| The ID of the service account. | |
| **version** | **String**| The requested version of the endpoint to process the request | |
| **serviceAccountsUpdateOrganizationServiceAccountNameRequest** | [**ServiceAccountsUpdateOrganizationServiceAccountNameRequest**](ServiceAccountsUpdateOrganizationServiceAccountNameRequest.md)|  | |

### Return type

[**ServiceAccountsUpdateOrganizationServiceAccountNameResponse**](ServiceAccountsUpdateOrganizationServiceAccountNameResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service account is returned. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

