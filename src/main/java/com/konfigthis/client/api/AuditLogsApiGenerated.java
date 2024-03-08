/*
 * Snyk API
 * Missing description placeholder
 *
 * The version of the OpenAPI document: REST
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.AuditLogsSearchGroupAuditLogsResponse;
import com.konfigthis.client.model.AuditLogsSearchOrganizationAuditLogsResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuditLogsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuditLogsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuditLogsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call searchGroupAuditLogsCall(String version, UUID groupId, String cursor, LocalDate from, LocalDate to, Integer size, String sortOrder, UUID userId, UUID projectId, String event, String excludeEvent, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/groups/{group_id}/audit_logs/search"
            .replace("{" + "group_id" + "}", localVarApiClient.escapeString(groupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort_order", sortOrder));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (projectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("project_id", projectId));
        }

        if (event != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("event", event));
        }

        if (excludeEvent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("exclude_event", excludeEvent));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIToken", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchGroupAuditLogsValidateBeforeCall(String version, UUID groupId, String cursor, LocalDate from, LocalDate to, Integer size, String sortOrder, UUID userId, UUID projectId, String event, String excludeEvent, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling searchGroupAuditLogs(Async)");
        }

        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling searchGroupAuditLogs(Async)");
        }

        return searchGroupAuditLogsCall(version, groupId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, _callback);

    }


    private ApiResponse<AuditLogsSearchGroupAuditLogsResponse> searchGroupAuditLogsWithHttpInfo(String version, UUID groupId, String cursor, LocalDate from, LocalDate to, Integer size, String sortOrder, UUID userId, UUID projectId, String event, String excludeEvent) throws ApiException {
        okhttp3.Call localVarCall = searchGroupAuditLogsValidateBeforeCall(version, groupId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, null);
        Type localVarReturnType = new TypeToken<AuditLogsSearchGroupAuditLogsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call searchGroupAuditLogsAsync(String version, UUID groupId, String cursor, LocalDate from, LocalDate to, Integer size, String sortOrder, UUID userId, UUID projectId, String event, String excludeEvent, final ApiCallback<AuditLogsSearchGroupAuditLogsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchGroupAuditLogsValidateBeforeCall(version, groupId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, _callback);
        Type localVarReturnType = new TypeToken<AuditLogsSearchGroupAuditLogsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SearchGroupAuditLogsRequestBuilder {
        private final String version;
        private final UUID groupId;
        private String cursor;
        private LocalDate from;
        private LocalDate to;
        private Integer size;
        private String sortOrder;
        private UUID userId;
        private UUID projectId;
        private String event;
        private String excludeEvent;

        private SearchGroupAuditLogsRequestBuilder(String version, UUID groupId) {
            this.version = version;
            this.groupId = groupId;
        }

        /**
         * Set cursor
         * @param cursor The ID for the next page of results. (optional)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        /**
         * Set from
         * @param from The start date (inclusive) of the audit logs search. Example: 2023-07-27  (optional)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder from(LocalDate from) {
            this.from = from;
            return this;
        }
        
        /**
         * Set to
         * @param to The end date (inclusive) of the audit logs search. Example: 2023-07-27  (optional)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder to(LocalDate to) {
            this.to = to;
            return this;
        }
        
        /**
         * Set size
         * @param size Number of results to return per page. (optional)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder size(Integer size) {
            this.size = size;
            return this;
        }
        
        /**
         * Set sortOrder
         * @param sortOrder Order in which results are returned. (optional, default to DESC)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        
        /**
         * Set userId
         * @param userId Filter logs by user ID. (optional)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder userId(UUID userId) {
            this.userId = userId;
            return this;
        }
        
        /**
         * Set projectId
         * @param projectId Filter logs by project ID. (optional)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder projectId(UUID projectId) {
            this.projectId = projectId;
            return this;
        }
        
        /**
         * Set event
         * @param event Filter logs by event type, cannot be used in conjunction with exclude_event parameter. (optional)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder event(String event) {
            this.event = event;
            return this;
        }
        
        /**
         * Set excludeEvent
         * @param excludeEvent Exclude event type from results, cannot be used in conjunctions with event parameter. (optional)
         * @return SearchGroupAuditLogsRequestBuilder
         */
        public SearchGroupAuditLogsRequestBuilder excludeEvent(String excludeEvent) {
            this.excludeEvent = excludeEvent;
            return this;
        }
        
        /**
         * Build call for searchGroupAuditLogs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Group Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return searchGroupAuditLogsCall(version, groupId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, _callback);
        }


        /**
         * Execute searchGroupAuditLogs request
         * @return AuditLogsSearchGroupAuditLogsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Group Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public AuditLogsSearchGroupAuditLogsResponse execute() throws ApiException {
            ApiResponse<AuditLogsSearchGroupAuditLogsResponse> localVarResp = searchGroupAuditLogsWithHttpInfo(version, groupId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute searchGroupAuditLogs request with HTTP info returned
         * @return ApiResponse&lt;AuditLogsSearchGroupAuditLogsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Group Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<AuditLogsSearchGroupAuditLogsResponse> executeWithHttpInfo() throws ApiException {
            return searchGroupAuditLogsWithHttpInfo(version, groupId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent);
        }

        /**
         * Execute searchGroupAuditLogs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Group Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AuditLogsSearchGroupAuditLogsResponse> _callback) throws ApiException {
            return searchGroupAuditLogsAsync(version, groupId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, _callback);
        }
    }

    /**
     * Search Group audit logs.
     * Search audit logs for a Group. Some Organization level events are supported as well as the following Group level events:   - api.access   - group.cloud_config.settings.edit   - group.create   - group.delete   - group.edit   - group.notification_settings.edit   - group.org.add   - group.org.remove   - group.policy.create   - group.policy.delete   - group.policy.edit   - group.request_access_settings.edit   - group.role.create   - group.role.delete   - group.role.edit   - group.service_account.create   - group.service_account.delete   - group.service_account.edit   - group.settings.edit   - group.settings.feature_flag.edit   - group.sso.add   - group.sso.auth0_connection.create   - group.sso.auth0_connection.edit   - group.sso.create   - group.sso.delete   - group.sso.edit   - group.sso.membership.sync   - group.sso.remove   - group.tag.create   - group.tag.delete   - group.user.add   - group.user.remove   - group.user.role.edit 
     * @param version The requested version of the endpoint to process the request (required)
     * @param groupId The ID of the Group. (required)
     * @return SearchGroupAuditLogsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Group Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public SearchGroupAuditLogsRequestBuilder searchGroupAuditLogs(String version, UUID groupId) throws IllegalArgumentException {
        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        if (groupId == null) throw new IllegalArgumentException("\"groupId\" is required but got null");
            

        return new SearchGroupAuditLogsRequestBuilder(version, groupId);
    }
    private okhttp3.Call searchOrganizationAuditLogsCall(String version, UUID orgId, String cursor, LocalDate from, LocalDate to, Integer size, String sortOrder, UUID userId, UUID projectId, String event, String excludeEvent, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/orgs/{org_id}/audit_logs/search"
            .replace("{" + "org_id" + "}", localVarApiClient.escapeString(orgId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort_order", sortOrder));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (projectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("project_id", projectId));
        }

        if (event != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("event", event));
        }

        if (excludeEvent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("exclude_event", excludeEvent));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIToken", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchOrganizationAuditLogsValidateBeforeCall(String version, UUID orgId, String cursor, LocalDate from, LocalDate to, Integer size, String sortOrder, UUID userId, UUID projectId, String event, String excludeEvent, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling searchOrganizationAuditLogs(Async)");
        }

        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling searchOrganizationAuditLogs(Async)");
        }

        return searchOrganizationAuditLogsCall(version, orgId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, _callback);

    }


    private ApiResponse<AuditLogsSearchOrganizationAuditLogsResponse> searchOrganizationAuditLogsWithHttpInfo(String version, UUID orgId, String cursor, LocalDate from, LocalDate to, Integer size, String sortOrder, UUID userId, UUID projectId, String event, String excludeEvent) throws ApiException {
        okhttp3.Call localVarCall = searchOrganizationAuditLogsValidateBeforeCall(version, orgId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, null);
        Type localVarReturnType = new TypeToken<AuditLogsSearchOrganizationAuditLogsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call searchOrganizationAuditLogsAsync(String version, UUID orgId, String cursor, LocalDate from, LocalDate to, Integer size, String sortOrder, UUID userId, UUID projectId, String event, String excludeEvent, final ApiCallback<AuditLogsSearchOrganizationAuditLogsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchOrganizationAuditLogsValidateBeforeCall(version, orgId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, _callback);
        Type localVarReturnType = new TypeToken<AuditLogsSearchOrganizationAuditLogsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SearchOrganizationAuditLogsRequestBuilder {
        private final String version;
        private final UUID orgId;
        private String cursor;
        private LocalDate from;
        private LocalDate to;
        private Integer size;
        private String sortOrder;
        private UUID userId;
        private UUID projectId;
        private String event;
        private String excludeEvent;

        private SearchOrganizationAuditLogsRequestBuilder(String version, UUID orgId) {
            this.version = version;
            this.orgId = orgId;
        }

        /**
         * Set cursor
         * @param cursor The ID for the next page of results. (optional)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        /**
         * Set from
         * @param from The start date (inclusive) of the audit logs search. Example: 2023-07-27  (optional)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder from(LocalDate from) {
            this.from = from;
            return this;
        }
        
        /**
         * Set to
         * @param to The end date (inclusive) of the audit logs search. Example: 2023-07-27  (optional)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder to(LocalDate to) {
            this.to = to;
            return this;
        }
        
        /**
         * Set size
         * @param size Number of results to return per page. (optional)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder size(Integer size) {
            this.size = size;
            return this;
        }
        
        /**
         * Set sortOrder
         * @param sortOrder Order in which results are returned. (optional, default to DESC)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        
        /**
         * Set userId
         * @param userId Filter logs by user ID. (optional)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder userId(UUID userId) {
            this.userId = userId;
            return this;
        }
        
        /**
         * Set projectId
         * @param projectId Filter logs by project ID. (optional)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder projectId(UUID projectId) {
            this.projectId = projectId;
            return this;
        }
        
        /**
         * Set event
         * @param event Filter logs by event type, cannot be used in conjunction with exclude_event parameter. (optional)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder event(String event) {
            this.event = event;
            return this;
        }
        
        /**
         * Set excludeEvent
         * @param excludeEvent Exclude event type from results, cannot be used in conjunctions with event parameter. (optional)
         * @return SearchOrganizationAuditLogsRequestBuilder
         */
        public SearchOrganizationAuditLogsRequestBuilder excludeEvent(String excludeEvent) {
            this.excludeEvent = excludeEvent;
            return this;
        }
        
        /**
         * Build call for searchOrganizationAuditLogs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Organization Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return searchOrganizationAuditLogsCall(version, orgId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, _callback);
        }


        /**
         * Execute searchOrganizationAuditLogs request
         * @return AuditLogsSearchOrganizationAuditLogsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Organization Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public AuditLogsSearchOrganizationAuditLogsResponse execute() throws ApiException {
            ApiResponse<AuditLogsSearchOrganizationAuditLogsResponse> localVarResp = searchOrganizationAuditLogsWithHttpInfo(version, orgId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute searchOrganizationAuditLogs request with HTTP info returned
         * @return ApiResponse&lt;AuditLogsSearchOrganizationAuditLogsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Organization Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<AuditLogsSearchOrganizationAuditLogsResponse> executeWithHttpInfo() throws ApiException {
            return searchOrganizationAuditLogsWithHttpInfo(version, orgId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent);
        }

        /**
         * Execute searchOrganizationAuditLogs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Organization Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AuditLogsSearchOrganizationAuditLogsResponse> _callback) throws ApiException {
            return searchOrganizationAuditLogsAsync(version, orgId, cursor, from, to, size, sortOrder, userId, projectId, event, excludeEvent, _callback);
        }
    }

    /**
     * Search Organization audit logs.
     * Search audit logs for an Organization. Supported event types:   - api.access   - org.app_bot.create   - org.app.create   - org.app.delete   - org.app.edit   - org.cloud_config.settings.edit   - org.collection.create   - org.collection.delete   - org.collection.edit   - org.create   - org.delete   - org.edit   - org.ignore_policy.edit   - org.integration.create   - org.integration.delete   - org.integration.edit   - org.integration.settings.edit   - org.language_settings.edit   - org.notification_settings.edit   - org.org_source.create   - org.org_source.delete   - org.org_source.edit   - org.policy.edit   - org.project_filter.create   - org.project_filter.delete   - org.project.add   - org.project.attributes.edit   - org.project.delete   - org.project.edit   - org.project.fix_pr.auto_open   - org.project.fix_pr.manual_open   - org.project.ignore.create   - org.project.ignore.delete   - org.project.ignore.edit   - org.project.monitor   - org.project.pr_check.edit   - org.project.remove   - org.project.settings.delete   - org.project.settings.edit   - org.project.stop_monitor   - org.project.tag.add   - org.project.tag.remove   - org.project.test   - org.request_access_settings.edit   - org.sast_settings.edit   - org.service_account.create   - org.service_account.delete   - org.service_account.edit   - org.settings.feature_flag.edit   - org.target.create   - org.target.delete   - org.user.add   - org.user.invite   - org.user.invite.accept   - org.user.invite.revoke   - org.user.invite_link.accept   - org.user.invite_link.create   - org.user.invite_link.revoke   - org.user.leave   - org.user.provision.accept   - org.user.provision.create   - org.user.provision.delete   - org.user.remove   - org.user.role.create   - org.user.role.delete   - org.user.role.details.edit   - org.user.role.edit   - org.user.role.permissions.edit   - org.webhook.add   - org.webhook.delete   - user.org.notification_settings.edit 
     * @param version The requested version of the endpoint to process the request (required)
     * @param orgId The ID of the organization. (required)
     * @return SearchOrganizationAuditLogsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Organization Audit Logs. </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public SearchOrganizationAuditLogsRequestBuilder searchOrganizationAuditLogs(String version, UUID orgId) throws IllegalArgumentException {
        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new SearchOrganizationAuditLogsRequestBuilder(version, orgId);
    }
}
