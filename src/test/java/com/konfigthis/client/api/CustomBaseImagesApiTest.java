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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CustomBaseImageCollectionResponse;
import com.konfigthis.client.model.CustomBaseImagePatchRequest;
import com.konfigthis.client.model.CustomBaseImagePatchRequestData;
import com.konfigthis.client.model.CustomBaseImagePostRequest;
import com.konfigthis.client.model.CustomBaseImagePostRequestData;
import com.konfigthis.client.model.CustomBaseImageResponse;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomBaseImagesApi
 */
@Disabled
public class CustomBaseImagesApiTest {

    private static CustomBaseImagesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CustomBaseImagesApi(apiClient);
    }

    /**
     * Get a custom base image
     *
     * Get a custom base image
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String version = null;
        UUID custombaseimageId = null;
        CustomBaseImageResponse response = api.getById(version, custombaseimageId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a custom base image collection
     *
     * Get a list of custom base images with support for ordering and filtering. Either the org_id or group_id parameters must be set to authorize successfully. If sorting by version, the repository filter is required. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String version = null;
        String startingAfter = null;
        String endingBefore = null;
        Integer limit = null;
        UUID projectId = null;
        UUID orgId = null;
        UUID groupId = null;
        String repository = null;
        String tag = null;
        Boolean includeInRecommendations = null;
        String sortBy = null;
        String sortDirection = null;
        CustomBaseImageCollectionResponse response = api.list(version)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .limit(limit)
                .projectId(projectId)
                .orgId(orgId)
                .groupId(groupId)
                .repository(repository)
                .tag(tag)
                .includeInRecommendations(includeInRecommendations)
                .sortBy(sortBy)
                .sortDirection(sortDirection)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a Custom Base Image from an existing container project
     *
     * In order to create a custom base image, you first need to import your base images into Snyk. You can do this through the CLI, UI, or API.  This endpoint marks an image as a custom base image. This means that the image will get added to the pool of images from which Snyk can recommend base image upgrades.  Note, after the first image in a repository gets added, a versioning schema cannot be passed in this endpoint. To update the versioning schema, the PATCH endpoint must be used. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void markImageAsCustomBaseTest() throws ApiException {
        CustomBaseImagePostRequestData data = null;
        String version = null;
        CustomBaseImageResponse response = api.markImageAsCustomBase(data, version)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a custom base image
     *
     * Delete a custom base image resource. (the related container project is unaffected)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCustomBaseImageTest() throws ApiException {
        String version = null;
        UUID custombaseimageId = null;
        api.removeCustomBaseImage(version, custombaseimageId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a custom base image
     *
     * Updates a custom base image&#39;s attributes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAttributesTest() throws ApiException {
        CustomBaseImagePatchRequestData data = null;
        String version = null;
        UUID custombaseimageId = null;
        CustomBaseImageResponse response = api.updateAttributes(data, version, custombaseimageId)
                .execute();
        // TODO: test validations
    }

}