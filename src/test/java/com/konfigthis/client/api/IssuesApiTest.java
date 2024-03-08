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
import com.konfigthis.client.model.BulkPackageUrlsRequestBody;
import com.konfigthis.client.model.BulkPackageUrlsRequestBodyData;
import com.konfigthis.client.model.IssuesByGroupIdResponse;
import com.konfigthis.client.model.IssuesGetByIssueIdResponse;
import com.konfigthis.client.model.IssuesResponse;
import com.konfigthis.client.model.IssuesWithPurlsResponse;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.ScanItemType;
import com.konfigthis.client.model.TypeDef;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssuesApi
 */
@Disabled
public class IssuesApiTest {

    private static IssuesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IssuesApi(apiClient);
    }

    /**
     * Get issues by group ID
     *
     * Get a list of a group&#39;s issues.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void byGroupIdTest() throws ApiException {
        String version = null;
        UUID groupId = null;
        String startingAfter = null;
        String endingBefore = null;
        Integer limit = null;
        UUID scanItemId = null;
        ScanItemType scanItemType = null;
        TypeDef type = null;
        OffsetDateTime updatedBefore = null;
        OffsetDateTime updatedAfter = null;
        OffsetDateTime createdBefore = null;
        OffsetDateTime createdAfter = null;
        List<String> effectiveSeverityLevel = null;
        List<String> status = null;
        Boolean ignored = null;
        IssuesByGroupIdResponse response = api.byGroupId(version, groupId)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .limit(limit)
                .scanItemId(scanItemId)
                .scanItemType(scanItemType)
                .type(type)
                .updatedBefore(updatedBefore)
                .updatedAfter(updatedAfter)
                .createdBefore(createdBefore)
                .createdAfter(createdAfter)
                .effectiveSeverityLevel(effectiveSeverityLevel)
                .status(status)
                .ignored(ignored)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an issue
     *
     * Get an issue
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String version = null;
        UUID orgId = null;
        UUID issueId = null;
        IssuesGetByIssueIdResponse response = api.getById(version, orgId, issueId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an issue
     *
     * Get an issue
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIssueIdTest() throws ApiException {
        String version = null;
        UUID groupId = null;
        UUID issueId = null;
        IssuesGetByIssueIdResponse response = api.getByIssueId(version, groupId, issueId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get issues by org ID
     *
     * Get a list of an organization&#39;s issues.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listByOrgIdTest() throws ApiException {
        String version = null;
        UUID orgId = null;
        String startingAfter = null;
        String endingBefore = null;
        Integer limit = null;
        UUID scanItemId = null;
        ScanItemType scanItemType = null;
        TypeDef type = null;
        OffsetDateTime updatedBefore = null;
        OffsetDateTime updatedAfter = null;
        OffsetDateTime createdBefore = null;
        OffsetDateTime createdAfter = null;
        List<String> effectiveSeverityLevel = null;
        List<String> status = null;
        Boolean ignored = null;
        IssuesByGroupIdResponse response = api.listByOrgId(version, orgId)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .limit(limit)
                .scanItemId(scanItemId)
                .scanItemType(scanItemType)
                .type(type)
                .updatedBefore(updatedBefore)
                .updatedAfter(updatedAfter)
                .createdBefore(createdBefore)
                .createdAfter(createdAfter)
                .effectiveSeverityLevel(effectiveSeverityLevel)
                .status(status)
                .ignored(ignored)
                .execute();
        // TODO: test validations
    }

    /**
     * List issues for a package
     *
     * Query issues for a specific package version identified by Package URL (purl). Snyk returns only direct vulnerabilities. Transitive vulnerabilities (from dependencies) are not returned because they can vary depending on context.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listByPackageTest() throws ApiException {
        String version = null;
        String purl = null;
        UUID orgId = null;
        Double offset = null;
        Double limit = null;
        IssuesResponse response = api.listByPackage(version, purl, orgId)
                .offset(offset)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * List issues for a given set of packages  (Currently not available to all customers)
     *
     * This endpoint is not available to all customers. If you are interested please contact support. Query issues for a batch of packages identified by Package URL (purl). Only direct vulnerabilities are returned, transitive vulnerabilities (from dependencies) are not returned because they can vary depending on context.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryForPackagesTest() throws ApiException {
        BulkPackageUrlsRequestBodyData data = null;
        String version = null;
        UUID orgId = null;
        IssuesWithPurlsResponse response = api.queryForPackages(data, version, orgId)
                .execute();
        // TODO: test validations
    }

}