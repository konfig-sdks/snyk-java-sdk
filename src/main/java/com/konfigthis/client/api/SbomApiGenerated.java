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


import com.konfigthis.client.model.CycloneDxDocument;
import com.konfigthis.client.model.CycloneDxXmlDocument;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.SbomResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SbomApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SbomApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SbomApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getProjectDocumentCall(String version, UUID orgId, UUID projectId, String format, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/orgs/{org_id}/projects/{project_id}/sbom"
            .replace("{" + "org_id" + "}", localVarApiClient.escapeString(orgId.toString()))
            .replace("{" + "project_id" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (format != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("format", format));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/vnd.api+json",
            "application/vnd.cyclonedx+json",
            "application/vnd.cyclonedx+xml"
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
    private okhttp3.Call getProjectDocumentValidateBeforeCall(String version, UUID orgId, UUID projectId, String format, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getProjectDocument(Async)");
        }

        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling getProjectDocument(Async)");
        }

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getProjectDocument(Async)");
        }

        return getProjectDocumentCall(version, orgId, projectId, format, _callback);

    }


    private ApiResponse<Map<String, Object>> getProjectDocumentWithHttpInfo(String version, UUID orgId, UUID projectId, String format) throws ApiException {
        okhttp3.Call localVarCall = getProjectDocumentValidateBeforeCall(version, orgId, projectId, format, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getProjectDocumentAsync(String version, UUID orgId, UUID projectId, String format, final ApiCallback<Map<String, Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProjectDocumentValidateBeforeCall(version, orgId, projectId, format, _callback);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetProjectDocumentRequestBuilder {
        private final String version;
        private final UUID orgId;
        private final UUID projectId;
        private String format;

        private GetProjectDocumentRequestBuilder(String version, UUID orgId, UUID projectId) {
            this.version = version;
            this.orgId = orgId;
            this.projectId = projectId;
        }

        /**
         * Set format
         * @param format The desired SBOM format of the response. (optional)
         * @return GetProjectDocumentRequestBuilder
         */
        public GetProjectDocumentRequestBuilder format(String format) {
            this.format = format;
            return this;
        }
        
        /**
         * Build call for getProjectDocument
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the SBOM document of a project </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getProjectDocumentCall(version, orgId, projectId, format, _callback);
        }


        /**
         * Execute getProjectDocument request
         * @return Map&lt;String, Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the SBOM document of a project </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public Map<String, Object> execute() throws ApiException {
            ApiResponse<Map<String, Object>> localVarResp = getProjectDocumentWithHttpInfo(version, orgId, projectId, format);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getProjectDocument request with HTTP info returned
         * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the SBOM document of a project </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<Map<String, Object>> executeWithHttpInfo() throws ApiException {
            return getProjectDocumentWithHttpInfo(version, orgId, projectId, format);
        }

        /**
         * Execute getProjectDocument request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the SBOM document of a project </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Map<String, Object>> _callback) throws ApiException {
            return getProjectDocumentAsync(version, orgId, projectId, format, _callback);
        }
    }

    /**
     * Get a project’s SBOM document
     * This endpoint lets you retrieve the SBOM document of a software project. It supports the following formats: * CycloneDX version 1.4 in JSON (set &#x60;format&#x60; to &#x60;cyclonedx1.4+json&#x60;). * CycloneDX version 1.4 in XML (set &#x60;format&#x60; to &#x60;cyclonedx1.4+xml&#x60;). * SPDX version 2.3 in JSON (set &#x60;format&#x60; to &#x60;spdx2.3+json&#x60;).  By default it will respond with an empty JSON:API response.
     * @param version The requested version of the endpoint to process the request (required)
     * @param orgId Unique identifier for an organization (required)
     * @param projectId Unique identifier for a project (required)
     * @return GetProjectDocumentRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the SBOM document of a project </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public GetProjectDocumentRequestBuilder getProjectDocument(String version, UUID orgId, UUID projectId) throws IllegalArgumentException {
        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        if (projectId == null) throw new IllegalArgumentException("\"projectId\" is required but got null");
            

        return new GetProjectDocumentRequestBuilder(version, orgId, projectId);
    }
}
