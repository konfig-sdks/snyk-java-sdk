# AuditLogsApi

All URIs are relative to *https://api.snyk.io/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchGroupAuditLogs**](AuditLogsApi.md#searchGroupAuditLogs) | **GET** /groups/{group_id}/audit_logs/search | Search Group audit logs. |
| [**searchOrganizationAuditLogs**](AuditLogsApi.md#searchOrganizationAuditLogs) | **GET** /orgs/{org_id}/audit_logs/search | Search Organization audit logs. |


<a name="searchGroupAuditLogs"></a>
# **searchGroupAuditLogs**
> AuditLogsSearchGroupAuditLogsResponse searchGroupAuditLogs(version, groupId).cursor(cursor).from(from).to(to).size(size).sortOrder(sortOrder).userId(userId).projectId(projectId).event(event).excludeEvent(excludeEvent).execute();

Search Group audit logs.

Search audit logs for a Group. Some Organization level events are supported as well as the following Group level events:   - api.access   - group.cloud_config.settings.edit   - group.create   - group.delete   - group.edit   - group.notification_settings.edit   - group.org.add   - group.org.remove   - group.policy.create   - group.policy.delete   - group.policy.edit   - group.request_access_settings.edit   - group.role.create   - group.role.delete   - group.role.edit   - group.service_account.create   - group.service_account.delete   - group.service_account.edit   - group.settings.edit   - group.settings.feature_flag.edit   - group.sso.add   - group.sso.auth0_connection.create   - group.sso.auth0_connection.edit   - group.sso.create   - group.sso.delete   - group.sso.edit   - group.sso.membership.sync   - group.sso.remove   - group.tag.create   - group.tag.delete   - group.user.add   - group.user.remove   - group.user.role.edit 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuditLogsApi;
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
    UUID groupId = UUID.fromString("0d3728ec-eebf-484d-9907-ba238019f10b"); // The ID of the Group.
    String cursor = "cursor_example"; // The ID for the next page of results.
    LocalDate from = LocalDate.now(); // The start date (inclusive) of the audit logs search. Example: 2023-07-27 
    LocalDate to = LocalDate.now(); // The end date (inclusive) of the audit logs search. Example: 2023-07-27 
    Integer size = 10; // Number of results to return per page.
    String sortOrder = "ASC"; // Order in which results are returned.
    UUID userId = UUID.fromString("0d3728ec-eebf-484d-9907-ba238019f10b"); // Filter logs by user ID.
    UUID projectId = UUID.fromString("0d3728ec-eebf-484d-9907-ba238019f10b"); // Filter logs by project ID.
    String event = "api.access"; // Filter logs by event type, cannot be used in conjunction with exclude_event parameter.
    String excludeEvent = "api.access"; // Exclude event type from results, cannot be used in conjunctions with event parameter.
    try {
      AuditLogsSearchGroupAuditLogsResponse result = client
              .auditLogs
              .searchGroupAuditLogs(version, groupId)
              .cursor(cursor)
              .from(from)
              .to(to)
              .size(size)
              .sortOrder(sortOrder)
              .userId(userId)
              .projectId(projectId)
              .event(event)
              .excludeEvent(excludeEvent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#searchGroupAuditLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuditLogsSearchGroupAuditLogsResponse> response = client
              .auditLogs
              .searchGroupAuditLogs(version, groupId)
              .cursor(cursor)
              .from(from)
              .to(to)
              .size(size)
              .sortOrder(sortOrder)
              .userId(userId)
              .projectId(projectId)
              .event(event)
              .excludeEvent(excludeEvent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#searchGroupAuditLogs");
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
| **groupId** | **UUID**| The ID of the Group. | |
| **cursor** | **String**| The ID for the next page of results. | [optional] |
| **from** | **LocalDate**| The start date (inclusive) of the audit logs search. Example: 2023-07-27  | [optional] |
| **to** | **LocalDate**| The end date (inclusive) of the audit logs search. Example: 2023-07-27  | [optional] |
| **size** | **Integer**| Number of results to return per page. | [optional] |
| **sortOrder** | **String**| Order in which results are returned. | [optional] [default to DESC] [enum: ASC, DESC] |
| **userId** | **UUID**| Filter logs by user ID. | [optional] |
| **projectId** | **UUID**| Filter logs by project ID. | [optional] |
| **event** | **String**| Filter logs by event type, cannot be used in conjunction with exclude_event parameter. | [optional] |
| **excludeEvent** | **String**| Exclude event type from results, cannot be used in conjunctions with event parameter. | [optional] |

### Return type

[**AuditLogsSearchGroupAuditLogsResponse**](AuditLogsSearchGroupAuditLogsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group Audit Logs. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

<a name="searchOrganizationAuditLogs"></a>
# **searchOrganizationAuditLogs**
> AuditLogsSearchOrganizationAuditLogsResponse searchOrganizationAuditLogs(version, orgId).cursor(cursor).from(from).to(to).size(size).sortOrder(sortOrder).userId(userId).projectId(projectId).event(event).excludeEvent(excludeEvent).execute();

Search Organization audit logs.

Search audit logs for an Organization. Supported event types:   - api.access   - org.app_bot.create   - org.app.create   - org.app.delete   - org.app.edit   - org.cloud_config.settings.edit   - org.collection.create   - org.collection.delete   - org.collection.edit   - org.create   - org.delete   - org.edit   - org.ignore_policy.edit   - org.integration.create   - org.integration.delete   - org.integration.edit   - org.integration.settings.edit   - org.language_settings.edit   - org.notification_settings.edit   - org.org_source.create   - org.org_source.delete   - org.org_source.edit   - org.policy.edit   - org.project_filter.create   - org.project_filter.delete   - org.project.add   - org.project.attributes.edit   - org.project.delete   - org.project.edit   - org.project.fix_pr.auto_open   - org.project.fix_pr.manual_open   - org.project.ignore.create   - org.project.ignore.delete   - org.project.ignore.edit   - org.project.monitor   - org.project.pr_check.edit   - org.project.remove   - org.project.settings.delete   - org.project.settings.edit   - org.project.stop_monitor   - org.project.tag.add   - org.project.tag.remove   - org.project.test   - org.request_access_settings.edit   - org.sast_settings.edit   - org.service_account.create   - org.service_account.delete   - org.service_account.edit   - org.settings.feature_flag.edit   - org.target.create   - org.target.delete   - org.user.add   - org.user.invite   - org.user.invite.accept   - org.user.invite.revoke   - org.user.invite_link.accept   - org.user.invite_link.create   - org.user.invite_link.revoke   - org.user.leave   - org.user.provision.accept   - org.user.provision.create   - org.user.provision.delete   - org.user.remove   - org.user.role.create   - org.user.role.delete   - org.user.role.details.edit   - org.user.role.edit   - org.user.role.permissions.edit   - org.webhook.add   - org.webhook.delete   - user.org.notification_settings.edit 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuditLogsApi;
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
    UUID orgId = UUID.fromString("0d3728ec-eebf-484d-9907-ba238019f10b"); // The ID of the organization.
    String cursor = "cursor_example"; // The ID for the next page of results.
    LocalDate from = LocalDate.now(); // The start date (inclusive) of the audit logs search. Example: 2023-07-27 
    LocalDate to = LocalDate.now(); // The end date (inclusive) of the audit logs search. Example: 2023-07-27 
    Integer size = 10; // Number of results to return per page.
    String sortOrder = "ASC"; // Order in which results are returned.
    UUID userId = UUID.fromString("0d3728ec-eebf-484d-9907-ba238019f10b"); // Filter logs by user ID.
    UUID projectId = UUID.fromString("0d3728ec-eebf-484d-9907-ba238019f10b"); // Filter logs by project ID.
    String event = "api.access"; // Filter logs by event type, cannot be used in conjunction with exclude_event parameter.
    String excludeEvent = "api.access"; // Exclude event type from results, cannot be used in conjunctions with event parameter.
    try {
      AuditLogsSearchOrganizationAuditLogsResponse result = client
              .auditLogs
              .searchOrganizationAuditLogs(version, orgId)
              .cursor(cursor)
              .from(from)
              .to(to)
              .size(size)
              .sortOrder(sortOrder)
              .userId(userId)
              .projectId(projectId)
              .event(event)
              .excludeEvent(excludeEvent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getJsonapi());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#searchOrganizationAuditLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuditLogsSearchOrganizationAuditLogsResponse> response = client
              .auditLogs
              .searchOrganizationAuditLogs(version, orgId)
              .cursor(cursor)
              .from(from)
              .to(to)
              .size(size)
              .sortOrder(sortOrder)
              .userId(userId)
              .projectId(projectId)
              .event(event)
              .excludeEvent(excludeEvent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#searchOrganizationAuditLogs");
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
| **orgId** | **UUID**| The ID of the organization. | |
| **cursor** | **String**| The ID for the next page of results. | [optional] |
| **from** | **LocalDate**| The start date (inclusive) of the audit logs search. Example: 2023-07-27  | [optional] |
| **to** | **LocalDate**| The end date (inclusive) of the audit logs search. Example: 2023-07-27  | [optional] |
| **size** | **Integer**| Number of results to return per page. | [optional] |
| **sortOrder** | **String**| Order in which results are returned. | [optional] [default to DESC] [enum: ASC, DESC] |
| **userId** | **UUID**| Filter logs by user ID. | [optional] |
| **projectId** | **UUID**| Filter logs by project ID. | [optional] |
| **event** | **String**| Filter logs by event type, cannot be used in conjunction with exclude_event parameter. | [optional] |
| **excludeEvent** | **String**| Exclude event type from results, cannot be used in conjunctions with event parameter. | [optional] |

### Return type

[**AuditLogsSearchOrganizationAuditLogsResponse**](AuditLogsSearchOrganizationAuditLogsResponse.md)

### Authorization

[APIToken](../README.md#APIToken), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization Audit Logs. |  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  |

