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


import java.time.OffsetDateTime;
import com.konfigthis.client.model.SastSettingsGetForOrgResponse;
import com.konfigthis.client.model.SastSettingsToggleSnykCodeSettingsRequest;
import com.konfigthis.client.model.SastSettingsToggleSnykCodeSettingsRequestData;
import com.konfigthis.client.model.SastSettingsToggleSnykCodeSettingsResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SastSettingsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SastSettingsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SastSettingsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getForOrgCall(String version, UUID orgId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/orgs/{org_id}/settings/sast"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIToken", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getForOrgValidateBeforeCall(String version, UUID orgId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getForOrg(Async)");
        }

        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling getForOrg(Async)");
        }

        return getForOrgCall(version, orgId, _callback);

    }


    private ApiResponse<SastSettingsGetForOrgResponse> getForOrgWithHttpInfo(String version, UUID orgId) throws ApiException {
        okhttp3.Call localVarCall = getForOrgValidateBeforeCall(version, orgId, null);
        Type localVarReturnType = new TypeToken<SastSettingsGetForOrgResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getForOrgAsync(String version, UUID orgId, final ApiCallback<SastSettingsGetForOrgResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getForOrgValidateBeforeCall(version, orgId, _callback);
        Type localVarReturnType = new TypeToken<SastSettingsGetForOrgResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetForOrgRequestBuilder {
        private final String version;
        private final UUID orgId;

        private GetForOrgRequestBuilder(String version, UUID orgId) {
            this.version = version;
            this.orgId = orgId;
        }

        /**
         * Build call for getForOrg
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The SAST settings for the org are being retrieved </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getForOrgCall(version, orgId, _callback);
        }


        /**
         * Execute getForOrg request
         * @return SastSettingsGetForOrgResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The SAST settings for the org are being retrieved </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public SastSettingsGetForOrgResponse execute() throws ApiException {
            ApiResponse<SastSettingsGetForOrgResponse> localVarResp = getForOrgWithHttpInfo(version, orgId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getForOrg request with HTTP info returned
         * @return ApiResponse&lt;SastSettingsGetForOrgResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The SAST settings for the org are being retrieved </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<SastSettingsGetForOrgResponse> executeWithHttpInfo() throws ApiException {
            return getForOrgWithHttpInfo(version, orgId);
        }

        /**
         * Execute getForOrg request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The SAST settings for the org are being retrieved </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SastSettingsGetForOrgResponse> _callback) throws ApiException {
            return getForOrgAsync(version, orgId, _callback);
        }
    }

    /**
     * Retrieves the SAST settings for an org
     * Retrieves the SAST settings for an org
     * @param version The requested version of the endpoint to process the request (required)
     * @param orgId The id of the org for which we want to retrieve the SAST settings (required)
     * @return GetForOrgRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The SAST settings for the org are being retrieved </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public GetForOrgRequestBuilder getForOrg(String version, UUID orgId) throws IllegalArgumentException {
        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new GetForOrgRequestBuilder(version, orgId);
    }
    private okhttp3.Call toggleSnykCodeSettingsCall(String version, UUID orgId, SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = sastSettingsToggleSnykCodeSettingsRequest;

        // create path and map variables
        String localVarPath = "/orgs/{org_id}/settings/sast"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call toggleSnykCodeSettingsValidateBeforeCall(String version, UUID orgId, SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling toggleSnykCodeSettings(Async)");
        }

        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling toggleSnykCodeSettings(Async)");
        }

        // verify the required parameter 'sastSettingsToggleSnykCodeSettingsRequest' is set
        if (sastSettingsToggleSnykCodeSettingsRequest == null) {
            throw new ApiException("Missing the required parameter 'sastSettingsToggleSnykCodeSettingsRequest' when calling toggleSnykCodeSettings(Async)");
        }

        return toggleSnykCodeSettingsCall(version, orgId, sastSettingsToggleSnykCodeSettingsRequest, _callback);

    }


    private ApiResponse<SastSettingsToggleSnykCodeSettingsResponse> toggleSnykCodeSettingsWithHttpInfo(String version, UUID orgId, SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest) throws ApiException {
        okhttp3.Call localVarCall = toggleSnykCodeSettingsValidateBeforeCall(version, orgId, sastSettingsToggleSnykCodeSettingsRequest, null);
        Type localVarReturnType = new TypeToken<SastSettingsToggleSnykCodeSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call toggleSnykCodeSettingsAsync(String version, UUID orgId, SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest, final ApiCallback<SastSettingsToggleSnykCodeSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = toggleSnykCodeSettingsValidateBeforeCall(version, orgId, sastSettingsToggleSnykCodeSettingsRequest, _callback);
        Type localVarReturnType = new TypeToken<SastSettingsToggleSnykCodeSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ToggleSnykCodeSettingsRequestBuilder {
        private final SastSettingsToggleSnykCodeSettingsRequestData data;
        private final String version;
        private final UUID orgId;

        private ToggleSnykCodeSettingsRequestBuilder(SastSettingsToggleSnykCodeSettingsRequestData data, String version, UUID orgId) {
            this.data = data;
            this.version = version;
            this.orgId = orgId;
        }

        /**
         * Build call for toggleSnykCodeSettings
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> The SAST settings for the org are being updated </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest = buildBodyParams();
            return toggleSnykCodeSettingsCall(version, orgId, sastSettingsToggleSnykCodeSettingsRequest, _callback);
        }

        private SastSettingsToggleSnykCodeSettingsRequest buildBodyParams() {
            SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest = new SastSettingsToggleSnykCodeSettingsRequest();
            sastSettingsToggleSnykCodeSettingsRequest.data(this.data);
            return sastSettingsToggleSnykCodeSettingsRequest;
        }

        /**
         * Execute toggleSnykCodeSettings request
         * @return SastSettingsToggleSnykCodeSettingsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> The SAST settings for the org are being updated </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public SastSettingsToggleSnykCodeSettingsResponse execute() throws ApiException {
            SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest = buildBodyParams();
            ApiResponse<SastSettingsToggleSnykCodeSettingsResponse> localVarResp = toggleSnykCodeSettingsWithHttpInfo(version, orgId, sastSettingsToggleSnykCodeSettingsRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute toggleSnykCodeSettings request with HTTP info returned
         * @return ApiResponse&lt;SastSettingsToggleSnykCodeSettingsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> The SAST settings for the org are being updated </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<SastSettingsToggleSnykCodeSettingsResponse> executeWithHttpInfo() throws ApiException {
            SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest = buildBodyParams();
            return toggleSnykCodeSettingsWithHttpInfo(version, orgId, sastSettingsToggleSnykCodeSettingsRequest);
        }

        /**
         * Execute toggleSnykCodeSettings request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> The SAST settings for the org are being updated </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SastSettingsToggleSnykCodeSettingsResponse> _callback) throws ApiException {
            SastSettingsToggleSnykCodeSettingsRequest sastSettingsToggleSnykCodeSettingsRequest = buildBodyParams();
            return toggleSnykCodeSettingsAsync(version, orgId, sastSettingsToggleSnykCodeSettingsRequest, _callback);
        }
    }

    /**
     * Enable/Disable the Snyk Code settings for an org
     * Enable/Disable the Snyk Code settings for an org
     * @param version The requested version of the endpoint to process the request (required)
     * @param orgId The id of the org for which we want to update the Snyk Code setting (required)
     * @param sastSettingsToggleSnykCodeSettingsRequest  (required)
     * @return ToggleSnykCodeSettingsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The SAST settings for the org are being updated </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public ToggleSnykCodeSettingsRequestBuilder toggleSnykCodeSettings(SastSettingsToggleSnykCodeSettingsRequestData data, String version, UUID orgId) throws IllegalArgumentException {
        if (data == null) throw new IllegalArgumentException("\"data\" is required but got null");
        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        return new ToggleSnykCodeSettingsRequestBuilder(data, version, orgId);
    }
}
