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


import com.konfigthis.client.model.ContainerImageGetInstanceResponse;
import com.konfigthis.client.model.ContainerImageListImageTargetRefsResponse;
import com.konfigthis.client.model.ContainerImageListInstancesOfContainerImageResponse;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.Platform;
import java.net.URI;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ContainerImageApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContainerImageApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ContainerImageApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getInstanceCall(String version, UUID orgId, URI imageId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/orgs/{org_id}/container_images/{image_id}"
            .replace("{" + "org_id" + "}", localVarApiClient.escapeString(orgId.toString()))
            .replace("{" + "image_id" + "}", localVarApiClient.escapeString(imageId.toString()));

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
    private okhttp3.Call getInstanceValidateBeforeCall(String version, UUID orgId, URI imageId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getInstance(Async)");
        }

        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling getInstance(Async)");
        }

        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new ApiException("Missing the required parameter 'imageId' when calling getInstance(Async)");
        }

        return getInstanceCall(version, orgId, imageId, _callback);

    }


    private ApiResponse<ContainerImageGetInstanceResponse> getInstanceWithHttpInfo(String version, UUID orgId, URI imageId) throws ApiException {
        okhttp3.Call localVarCall = getInstanceValidateBeforeCall(version, orgId, imageId, null);
        Type localVarReturnType = new TypeToken<ContainerImageGetInstanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getInstanceAsync(String version, UUID orgId, URI imageId, final ApiCallback<ContainerImageGetInstanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInstanceValidateBeforeCall(version, orgId, imageId, _callback);
        Type localVarReturnType = new TypeToken<ContainerImageGetInstanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetInstanceRequestBuilder {
        private final String version;
        private final UUID orgId;
        private final URI imageId;

        private GetInstanceRequestBuilder(String version, UUID orgId, URI imageId) {
            this.version = version;
            this.orgId = orgId;
            this.imageId = imageId;
        }

        /**
         * Build call for getInstance
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns an instance of container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getInstanceCall(version, orgId, imageId, _callback);
        }


        /**
         * Execute getInstance request
         * @return ContainerImageGetInstanceResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns an instance of container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ContainerImageGetInstanceResponse execute() throws ApiException {
            ApiResponse<ContainerImageGetInstanceResponse> localVarResp = getInstanceWithHttpInfo(version, orgId, imageId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getInstance request with HTTP info returned
         * @return ApiResponse&lt;ContainerImageGetInstanceResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns an instance of container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<ContainerImageGetInstanceResponse> executeWithHttpInfo() throws ApiException {
            return getInstanceWithHttpInfo(version, orgId, imageId);
        }

        /**
         * Execute getInstance request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns an instance of container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ContainerImageGetInstanceResponse> _callback) throws ApiException {
            return getInstanceAsync(version, orgId, imageId, _callback);
        }
    }

    /**
     * Get instance of container image
     * Get instance of container image
     * @param version The requested version of the endpoint to process the request (required)
     * @param orgId Org ID (required)
     * @param imageId Image ID (required)
     * @return GetInstanceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns an instance of container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public GetInstanceRequestBuilder getInstance(String version, UUID orgId, URI imageId) throws IllegalArgumentException {
        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        if (imageId == null) throw new IllegalArgumentException("\"imageId\" is required but got null");
            

        return new GetInstanceRequestBuilder(version, orgId, imageId);
    }
    private okhttp3.Call listImageTargetRefsCall(UUID orgId, URI imageId, String version, Integer limit, String startingAfter, String endingBefore, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/orgs/{org_id}/container_images/{image_id}/relationships/image_target_refs"
            .replace("{" + "org_id" + "}", localVarApiClient.escapeString(orgId.toString()))
            .replace("{" + "image_id" + "}", localVarApiClient.escapeString(imageId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (startingAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("starting_after", startingAfter));
        }

        if (endingBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ending_before", endingBefore));
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
    private okhttp3.Call listImageTargetRefsValidateBeforeCall(UUID orgId, URI imageId, String version, Integer limit, String startingAfter, String endingBefore, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling listImageTargetRefs(Async)");
        }

        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new ApiException("Missing the required parameter 'imageId' when calling listImageTargetRefs(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling listImageTargetRefs(Async)");
        }

        return listImageTargetRefsCall(orgId, imageId, version, limit, startingAfter, endingBefore, _callback);

    }


    private ApiResponse<ContainerImageListImageTargetRefsResponse> listImageTargetRefsWithHttpInfo(UUID orgId, URI imageId, String version, Integer limit, String startingAfter, String endingBefore) throws ApiException {
        okhttp3.Call localVarCall = listImageTargetRefsValidateBeforeCall(orgId, imageId, version, limit, startingAfter, endingBefore, null);
        Type localVarReturnType = new TypeToken<ContainerImageListImageTargetRefsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listImageTargetRefsAsync(UUID orgId, URI imageId, String version, Integer limit, String startingAfter, String endingBefore, final ApiCallback<ContainerImageListImageTargetRefsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listImageTargetRefsValidateBeforeCall(orgId, imageId, version, limit, startingAfter, endingBefore, _callback);
        Type localVarReturnType = new TypeToken<ContainerImageListImageTargetRefsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListImageTargetRefsRequestBuilder {
        private final UUID orgId;
        private final URI imageId;
        private final String version;
        private Integer limit;
        private String startingAfter;
        private String endingBefore;

        private ListImageTargetRefsRequestBuilder(UUID orgId, URI imageId, String version) {
            this.orgId = orgId;
            this.imageId = imageId;
            this.version = version;
        }

        /**
         * Set limit
         * @param limit Number of results to return per page (optional, default to 10)
         * @return ListImageTargetRefsRequestBuilder
         */
        public ListImageTargetRefsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set startingAfter
         * @param startingAfter Return the page of results immediately after this cursor (optional)
         * @return ListImageTargetRefsRequestBuilder
         */
        public ListImageTargetRefsRequestBuilder startingAfter(String startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }
        
        /**
         * Set endingBefore
         * @param endingBefore Return the page of results immediately before this cursor (optional)
         * @return ListImageTargetRefsRequestBuilder
         */
        public ListImageTargetRefsRequestBuilder endingBefore(String endingBefore) {
            this.endingBefore = endingBefore;
            return this;
        }
        
        /**
         * Build call for listImageTargetRefs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a list of image target references for a container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listImageTargetRefsCall(orgId, imageId, version, limit, startingAfter, endingBefore, _callback);
        }


        /**
         * Execute listImageTargetRefs request
         * @return ContainerImageListImageTargetRefsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a list of image target references for a container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ContainerImageListImageTargetRefsResponse execute() throws ApiException {
            ApiResponse<ContainerImageListImageTargetRefsResponse> localVarResp = listImageTargetRefsWithHttpInfo(orgId, imageId, version, limit, startingAfter, endingBefore);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listImageTargetRefs request with HTTP info returned
         * @return ApiResponse&lt;ContainerImageListImageTargetRefsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a list of image target references for a container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<ContainerImageListImageTargetRefsResponse> executeWithHttpInfo() throws ApiException {
            return listImageTargetRefsWithHttpInfo(orgId, imageId, version, limit, startingAfter, endingBefore);
        }

        /**
         * Execute listImageTargetRefs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a list of image target references for a container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ContainerImageListImageTargetRefsResponse> _callback) throws ApiException {
            return listImageTargetRefsAsync(orgId, imageId, version, limit, startingAfter, endingBefore, _callback);
        }
    }

    /**
     * List instances of image target references for a container image
     * List instances of image target references for a container image
     * @param orgId Org ID (required)
     * @param imageId Image ID (required)
     * @param version The requested version of the endpoint to process the request (required)
     * @return ListImageTargetRefsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of image target references for a container image </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public ListImageTargetRefsRequestBuilder listImageTargetRefs(UUID orgId, URI imageId, String version) throws IllegalArgumentException {
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        if (imageId == null) throw new IllegalArgumentException("\"imageId\" is required but got null");
            

        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        return new ListImageTargetRefsRequestBuilder(orgId, imageId, version);
    }
    private okhttp3.Call listInstancesOfContainerImageCall(UUID orgId, String version, List<URI> imageIds, Platform platform, List<String> names, Integer limit, String startingAfter, String endingBefore, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/orgs/{org_id}/container_images"
            .replace("{" + "org_id" + "}", localVarApiClient.escapeString(orgId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (imageIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "image_ids", imageIds));
        }

        if (platform != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("platform", platform));
        }

        if (names != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "names", names));
        }

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (startingAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("starting_after", startingAfter));
        }

        if (endingBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ending_before", endingBefore));
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
    private okhttp3.Call listInstancesOfContainerImageValidateBeforeCall(UUID orgId, String version, List<URI> imageIds, Platform platform, List<String> names, Integer limit, String startingAfter, String endingBefore, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'orgId' is set
        if (orgId == null) {
            throw new ApiException("Missing the required parameter 'orgId' when calling listInstancesOfContainerImage(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling listInstancesOfContainerImage(Async)");
        }

        return listInstancesOfContainerImageCall(orgId, version, imageIds, platform, names, limit, startingAfter, endingBefore, _callback);

    }


    private ApiResponse<ContainerImageListInstancesOfContainerImageResponse> listInstancesOfContainerImageWithHttpInfo(UUID orgId, String version, List<URI> imageIds, Platform platform, List<String> names, Integer limit, String startingAfter, String endingBefore) throws ApiException {
        okhttp3.Call localVarCall = listInstancesOfContainerImageValidateBeforeCall(orgId, version, imageIds, platform, names, limit, startingAfter, endingBefore, null);
        Type localVarReturnType = new TypeToken<ContainerImageListInstancesOfContainerImageResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listInstancesOfContainerImageAsync(UUID orgId, String version, List<URI> imageIds, Platform platform, List<String> names, Integer limit, String startingAfter, String endingBefore, final ApiCallback<ContainerImageListInstancesOfContainerImageResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listInstancesOfContainerImageValidateBeforeCall(orgId, version, imageIds, platform, names, limit, startingAfter, endingBefore, _callback);
        Type localVarReturnType = new TypeToken<ContainerImageListInstancesOfContainerImageResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListInstancesOfContainerImageRequestBuilder {
        private final UUID orgId;
        private final String version;
        private List<URI> imageIds;
        private Platform platform;
        private List<String> names;
        private Integer limit;
        private String startingAfter;
        private String endingBefore;

        private ListInstancesOfContainerImageRequestBuilder(UUID orgId, String version) {
            this.orgId = orgId;
            this.version = version;
        }

        /**
         * Set imageIds
         * @param imageIds A comma-separated list of Image IDs (optional)
         * @return ListInstancesOfContainerImageRequestBuilder
         */
        public ListInstancesOfContainerImageRequestBuilder imageIds(List<URI> imageIds) {
            this.imageIds = imageIds;
            return this;
        }
        
        /**
         * Set platform
         * @param platform The image Operating System and processor architecture (optional)
         * @return ListInstancesOfContainerImageRequestBuilder
         */
        public ListInstancesOfContainerImageRequestBuilder platform(Platform platform) {
            this.platform = platform;
            return this;
        }
        
        /**
         * Set names
         * @param names The container registry names (optional)
         * @return ListInstancesOfContainerImageRequestBuilder
         */
        public ListInstancesOfContainerImageRequestBuilder names(List<String> names) {
            this.names = names;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Number of results to return per page (optional, default to 10)
         * @return ListInstancesOfContainerImageRequestBuilder
         */
        public ListInstancesOfContainerImageRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set startingAfter
         * @param startingAfter Return the page of results immediately after this cursor (optional)
         * @return ListInstancesOfContainerImageRequestBuilder
         */
        public ListInstancesOfContainerImageRequestBuilder startingAfter(String startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }
        
        /**
         * Set endingBefore
         * @param endingBefore Return the page of results immediately before this cursor (optional)
         * @return ListInstancesOfContainerImageRequestBuilder
         */
        public ListInstancesOfContainerImageRequestBuilder endingBefore(String endingBefore) {
            this.endingBefore = endingBefore;
            return this;
        }
        
        /**
         * Build call for listInstancesOfContainerImage
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a list of container image instances </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listInstancesOfContainerImageCall(orgId, version, imageIds, platform, names, limit, startingAfter, endingBefore, _callback);
        }


        /**
         * Execute listInstancesOfContainerImage request
         * @return ContainerImageListInstancesOfContainerImageResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a list of container image instances </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ContainerImageListInstancesOfContainerImageResponse execute() throws ApiException {
            ApiResponse<ContainerImageListInstancesOfContainerImageResponse> localVarResp = listInstancesOfContainerImageWithHttpInfo(orgId, version, imageIds, platform, names, limit, startingAfter, endingBefore);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listInstancesOfContainerImage request with HTTP info returned
         * @return ApiResponse&lt;ContainerImageListInstancesOfContainerImageResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a list of container image instances </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<ContainerImageListInstancesOfContainerImageResponse> executeWithHttpInfo() throws ApiException {
            return listInstancesOfContainerImageWithHttpInfo(orgId, version, imageIds, platform, names, limit, startingAfter, endingBefore);
        }

        /**
         * Execute listInstancesOfContainerImage request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a list of container image instances </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ContainerImageListInstancesOfContainerImageResponse> _callback) throws ApiException {
            return listInstancesOfContainerImageAsync(orgId, version, imageIds, platform, names, limit, startingAfter, endingBefore, _callback);
        }
    }

    /**
     * List instances of container image
     * List instances of container image
     * @param orgId Org ID (required)
     * @param version The requested version of the endpoint to process the request (required)
     * @return ListInstancesOfContainerImageRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of container image instances </td><td>  * deprecation -  <br>  * snyk-request-id -  <br>  * snyk-version-lifecycle-stage -  <br>  * snyk-version-requested -  <br>  * snyk-version-served -  <br>  * sunset -  <br>  </td></tr>
     </table>
     */
    public ListInstancesOfContainerImageRequestBuilder listInstancesOfContainerImage(UUID orgId, String version) throws IllegalArgumentException {
        if (orgId == null) throw new IllegalArgumentException("\"orgId\" is required but got null");
            

        if (version == null) throw new IllegalArgumentException("\"version\" is required but got null");
            

        return new ListInstancesOfContainerImageRequestBuilder(orgId, version);
    }
}
