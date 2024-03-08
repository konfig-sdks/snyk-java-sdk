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
import java.time.OffsetDateTime;
import com.konfigthis.client.model.TargetsGetByIdResponse;
import com.konfigthis.client.model.TargetsListByOrgIdResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TargetsApi
 */
@Disabled
public class TargetsApiTest {

    private static TargetsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TargetsApi(apiClient);
    }

    /**
     * Delete target by target ID
     *
     * Delete the specified target.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByIdTest() throws ApiException {
        String version = null;
        UUID orgId = null;
        UUID targetId = null;
        api.deleteById(version, orgId, targetId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get target by target ID
     *
     * Get a specified target for an organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String version = null;
        UUID orgId = null;
        UUID targetId = null;
        TargetsGetByIdResponse response = api.getById(version, orgId, targetId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get targets by org ID
     *
     * Get a list of an organization&#39;s targets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listByOrgIdTest() throws ApiException {
        String version = null;
        UUID orgId = null;
        String startingAfter = null;
        String endingBefore = null;
        Boolean count = null;
        Integer limit = null;
        Boolean isPrivate = null;
        Boolean excludeEmpty = null;
        String url = null;
        List<String> sourceTypes = null;
        String displayName = null;
        OffsetDateTime createdGte = null;
        TargetsListByOrgIdResponse response = api.listByOrgId(version, orgId)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .count(count)
                .limit(limit)
                .isPrivate(isPrivate)
                .excludeEmpty(excludeEmpty)
                .url(url)
                .sourceTypes(sourceTypes)
                .displayName(displayName)
                .createdGte(createdGte)
                .execute();
        // TODO: test validations
    }

}