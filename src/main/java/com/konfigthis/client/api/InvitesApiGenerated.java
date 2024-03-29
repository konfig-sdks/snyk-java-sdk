/*
 * Snyk API
 * Snyk helps software-driven businesses develop fast and stay secure. Continuously find and fix vulnerabilities for npm, Maven, NuGet, RubyGems, PyPI and more.
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


import com.konfigthis.client.model.InvitesListPendingUserInvitationsResponse;
import com.konfigthis.client.model.InvitesUserToOrganizationRequest;
import com.konfigthis.client.model.InvitesUserToOrganizationResponse;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.OrgInvitationPostData;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InvitesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InvitesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public InvitesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call cancelPendingInvitationCall(UUID orgId, UUID inviteId, String version, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/orgs/{org_id}/invites/{invite_id}"
            .replace("{" + "org_id" + "}", localVarApiClient.escapeString(orgId.toString()))
            .replace("{" + "invite_id" + "}", localVarApiClient.escapeString(inviteId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelPendingInvitationValidateBeforeCall(UUID orgId, UUID inviteId, String version, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling cancelPendingInvitation(Async)");
        }

        // verify the required parameter 'inviteId' is set
        if (inviteId == null) {
            throw new ApiException("Missing the required parameter 'inviteId' when calling cancelPendingInvitation(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling cancelPendingInvitation(Async)");
        }

        return cancelPendingInvitationCall(orgId, inviteId, version, _callback);

    }


    private ApiResponse<Void> cancelPendingInvitationWithHttpInfo(UUID orgId, UUID inviteId, String version) throws ApiException {
        okhttp3.Call localVarCall = cancelPendingInvitationValidateBeforeCall(orgId, inviteId, version, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call cancelPendingInvitationAsync(UUID orgId, UUID inviteId, String version, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelPendingInvitationValidateBeforeCall(orgId, inviteId, version, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class CancelPendingInvitationRequestBuilder {
        private final UUID orgId;
        private final UUID inviteId;
        private final String version;

        private CancelPendingInvitationRequestBuilder(UUID orgId, UUID inviteId, String version) {
            this.orgId = orgId;
            this.inviteId = inviteId;
            this.version = version;
        }

        /**
         * Build call for cancelPendingInvitation
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The operation completed successfully with no content </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return cancelPendingInvitationCall(orgId, inviteId, version, _callback);
        }


        /**
         * Execute cancelPendingInvitation request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The operation completed successfully with no content </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            cancelPendingInvitationWithHttpInfo(orgId, inviteId, version);
        }

        /**
         * Execute cancelPendingInvitation request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The operation completed successfully with no content </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return cancelPendingInvitationWithHttpInfo(orgId, inviteId, version);
        }

        /**
         * Execute cancelPendingInvitation request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The operation completed successfully with no content </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return cancelPendingInvitationAsync(orgId, inviteId, version, _callback);
        }
    }

    /**
     * Cancel a pending user invitations to an organization.
     * Cancel a pending user invitations to an organization.
     * @param orgId The id of the org the user is being invited to (required)
     * @param inviteId The id of the pending invite to cancel (required)
     * @param version The requested version of the endpoint to process the request (required)
     * @return CancelPendingInvitationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The operation completed successfully with no content </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public CancelPendingInvitationRequestBuilder cancelPendingInvitation(UUID orgId, UUID inviteId, String version) throws IllegalArgumentException {
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        if (inviteId == null) throw new IllegalArgumentException("\"inviteId\" is required but got null");
            

        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        return new CancelPendingInvitationRequestBuilder(orgId, inviteId, version);
    }
    private okhttp3.Call listPendingUserInvitationsCall(UUID orgId, String version, String startingAfter, String endingBefore, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/orgs/{org_id}/invites"
            .replace("{" + "org_id" + "}", localVarApiClient.escapeString(orgId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (startingAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("starting_after", startingAfter));
        }

        if (endingBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ending_before", endingBefore));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call listPendingUserInvitationsValidateBeforeCall(UUID orgId, String version, String startingAfter, String endingBefore, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling listPendingUserInvitations(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling listPendingUserInvitations(Async)");
        }

        return listPendingUserInvitationsCall(orgId, version, startingAfter, endingBefore, limit, _callback);

    }


    private ApiResponse<InvitesListPendingUserInvitationsResponse> listPendingUserInvitationsWithHttpInfo(UUID orgId, String version, String startingAfter, String endingBefore, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listPendingUserInvitationsValidateBeforeCall(orgId, version, startingAfter, endingBefore, limit, null);
        Type localVarReturnType = new TypeToken<InvitesListPendingUserInvitationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listPendingUserInvitationsAsync(UUID orgId, String version, String startingAfter, String endingBefore, Integer limit, final ApiCallback<InvitesListPendingUserInvitationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPendingUserInvitationsValidateBeforeCall(orgId, version, startingAfter, endingBefore, limit, _callback);
        Type localVarReturnType = new TypeToken<InvitesListPendingUserInvitationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListPendingUserInvitationsRequestBuilder {
        private final UUID orgId;
        private final String version;
        private String startingAfter;
        private String endingBefore;
        private Integer limit;

        private ListPendingUserInvitationsRequestBuilder(UUID orgId, String version) {
            this.orgId = orgId;
            this.version = version;
        }

        /**
         * Set startingAfter
         * @param startingAfter Return the page of results immediately after this cursor (optional)
         * @return ListPendingUserInvitationsRequestBuilder
         */
        public ListPendingUserInvitationsRequestBuilder startingAfter(String startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }
        
        /**
         * Set endingBefore
         * @param endingBefore Return the page of results immediately before this cursor (optional)
         * @return ListPendingUserInvitationsRequestBuilder
         */
        public ListPendingUserInvitationsRequestBuilder endingBefore(String endingBefore) {
            this.endingBefore = endingBefore;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Number of results to return per page (optional, default to 10)
         * @return ListPendingUserInvitationsRequestBuilder
         */
        public ListPendingUserInvitationsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Build call for listPendingUserInvitations
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of pending invitations to an organization. </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listPendingUserInvitationsCall(orgId, version, startingAfter, endingBefore, limit, _callback);
        }


        /**
         * Execute listPendingUserInvitations request
         * @return InvitesListPendingUserInvitationsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of pending invitations to an organization. </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public InvitesListPendingUserInvitationsResponse execute() throws ApiException {
            ApiResponse<InvitesListPendingUserInvitationsResponse> localVarResp = listPendingUserInvitationsWithHttpInfo(orgId, version, startingAfter, endingBefore, limit);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listPendingUserInvitations request with HTTP info returned
         * @return ApiResponse&lt;InvitesListPendingUserInvitationsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of pending invitations to an organization. </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<InvitesListPendingUserInvitationsResponse> executeWithHttpInfo() throws ApiException {
            return listPendingUserInvitationsWithHttpInfo(orgId, version, startingAfter, endingBefore, limit);
        }

        /**
         * Execute listPendingUserInvitations request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of pending invitations to an organization. </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<InvitesListPendingUserInvitationsResponse> _callback) throws ApiException {
            return listPendingUserInvitationsAsync(orgId, version, startingAfter, endingBefore, limit, _callback);
        }
    }

    /**
     * List pending user invitations to an organization.
     * List pending user invitations to an organization.
     * @param orgId The id of the org the user is being invited to (required)
     * @param version The requested version of the endpoint to process the request (required)
     * @return ListPendingUserInvitationsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of pending invitations to an organization. </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public ListPendingUserInvitationsRequestBuilder listPendingUserInvitations(UUID orgId, String version) throws IllegalArgumentException {
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        return new ListPendingUserInvitationsRequestBuilder(orgId, version);
    }
    private okhttp3.Call userToOrganizationCall(String version, UUID orgId, InvitesUserToOrganizationRequest invitesUserToOrganizationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = invitesUserToOrganizationRequest;

        // create path and map variables
        String localVarPath = "/orgs/{org_id}/invites"
            .replace("{" + "org_id" + "}", localVarApiClient.escapeString(orgId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIToken", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userToOrganizationValidateBeforeCall(String version, UUID orgId, InvitesUserToOrganizationRequest invitesUserToOrganizationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling userToOrganization(Async)");
        }

        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling userToOrganization(Async)");
        }

        return userToOrganizationCall(version, orgId, invitesUserToOrganizationRequest, _callback);

    }


    private ApiResponse<InvitesUserToOrganizationResponse> userToOrganizationWithHttpInfo(String version, UUID orgId, InvitesUserToOrganizationRequest invitesUserToOrganizationRequest) throws ApiException {
        okhttp3.Call localVarCall = userToOrganizationValidateBeforeCall(version, orgId, invitesUserToOrganizationRequest, null);
        Type localVarReturnType = new TypeToken<InvitesUserToOrganizationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call userToOrganizationAsync(String version, UUID orgId, InvitesUserToOrganizationRequest invitesUserToOrganizationRequest, final ApiCallback<InvitesUserToOrganizationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = userToOrganizationValidateBeforeCall(version, orgId, invitesUserToOrganizationRequest, _callback);
        Type localVarReturnType = new TypeToken<InvitesUserToOrganizationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UserToOrganizationRequestBuilder {
        private final OrgInvitationPostData data;
        private final String version;
        private final UUID orgId;

        private UserToOrganizationRequestBuilder(OrgInvitationPostData data, String version, UUID orgId) {
            this.data = data;
            this.version = version;
            this.orgId = orgId;
        }

        /**
         * Build call for userToOrganization
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> A new organization invitation has been created </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            InvitesUserToOrganizationRequest invitesUserToOrganizationRequest = buildBodyParams();
            return userToOrganizationCall(version, orgId, invitesUserToOrganizationRequest, _callback);
        }

        private InvitesUserToOrganizationRequest buildBodyParams() {
            InvitesUserToOrganizationRequest invitesUserToOrganizationRequest = new InvitesUserToOrganizationRequest();
            invitesUserToOrganizationRequest.data(this.data);
            return invitesUserToOrganizationRequest;
        }

        /**
         * Execute userToOrganization request
         * @return InvitesUserToOrganizationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> A new organization invitation has been created </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public InvitesUserToOrganizationResponse execute() throws ApiException {
            InvitesUserToOrganizationRequest invitesUserToOrganizationRequest = buildBodyParams();
            ApiResponse<InvitesUserToOrganizationResponse> localVarResp = userToOrganizationWithHttpInfo(version, orgId, invitesUserToOrganizationRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute userToOrganization request with HTTP info returned
         * @return ApiResponse&lt;InvitesUserToOrganizationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> A new organization invitation has been created </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<InvitesUserToOrganizationResponse> executeWithHttpInfo() throws ApiException {
            InvitesUserToOrganizationRequest invitesUserToOrganizationRequest = buildBodyParams();
            return userToOrganizationWithHttpInfo(version, orgId, invitesUserToOrganizationRequest);
        }

        /**
         * Execute userToOrganization request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> A new organization invitation has been created </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<InvitesUserToOrganizationResponse> _callback) throws ApiException {
            InvitesUserToOrganizationRequest invitesUserToOrganizationRequest = buildBodyParams();
            return userToOrganizationAsync(version, orgId, invitesUserToOrganizationRequest, _callback);
        }
    }

    /**
     * Invite a user to an organization
     * Invite a user to an organization with a role.
     * @param version The requested version of the endpoint to process the request (required)
     * @param orgId The id of the org the user is being invited to (required)
     * @return UserToOrganizationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A new organization invitation has been created </td><td>  * deprecation -  <br>  * location -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public UserToOrganizationRequestBuilder userToOrganization(OrgInvitationPostData data, String version, UUID orgId) throws IllegalArgumentException {
        if (data == null) throw new IllegalArgumentException("\"data\" is required but got null");
        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new UserToOrganizationRequestBuilder(data, version, orgId);
    }
}
