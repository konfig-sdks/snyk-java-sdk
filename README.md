<div align="center">

[![Visit Snyk](./header.png)](https://docs.snyk.io&#x2F;snyk-api&#x2F;snyk-rest-api-overview)

# [Snyk](https://docs.snyk.io&#x2F;snyk-api&#x2F;snyk-rest-api-overview)

Missing description placeholder

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Snyk&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>snyk-java-sdk</artifactId>
  <version>REST</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:snyk-java-sdk:REST"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/snyk-java-sdk-REST.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Snyk;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    UUID orgId = UUID.randomUUID(); // Org ID
    UUID installId = UUID.randomUUID(); // Install ID
    try {
      client
              .apps
              .byInstallId(version, orgId, installId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#byInstallId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .apps
              .byInstallId(version, orgId, installId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#byInstallId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.snyk.io/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppsApi* | [**byInstallId**](docs/AppsApi.md#byInstallId) | **DELETE** /orgs/{org_id}/apps/installs/{install_id} | Revoke app authorization for an Snyk Organization with install ID.
*AppsApi* | [**createInstallSecret**](docs/AppsApi.md#createInstallSecret) | **POST** /groups/{group_id}/apps/installs/{install_id}/secrets | Manage client secret for non-interactive Snyk App installations.
*AppsApi* | [**createNewAppForOrganization**](docs/AppsApi.md#createNewAppForOrganization) | **POST** /orgs/{org_id}/apps/creations | Create a new Snyk App for an organization.
*AppsApi* | [**createOrganizationApp**](docs/AppsApi.md#createOrganizationApp) | **POST** /orgs/{org_id}/apps | Create a new app for an organization.
*AppsApi* | [**deleteAppById**](docs/AppsApi.md#deleteAppById) | **DELETE** /orgs/{org_id}/apps/{client_id} | Delete an app
*AppsApi* | [**deleteByAppId**](docs/AppsApi.md#deleteByAppId) | **DELETE** /orgs/{org_id}/apps/creations/{app_id} | Delete an app by its App ID.
*AppsApi* | [**getActiveSessions**](docs/AppsApi.md#getActiveSessions) | **GET** /self/apps/{app_id}/sessions | Get a list of active OAuth sessions for the app.
*AppsApi* | [**getByAppId**](docs/AppsApi.md#getByAppId) | **GET** /orgs/{org_id}/apps/creations/{app_id} | Get a Snyk App by its App ID.
*AppsApi* | [**getByClientId**](docs/AppsApi.md#getByClientId) | **GET** /orgs/{org_id}/apps/{client_id} | Get an app by client id
*AppsApi* | [**installGroupApp**](docs/AppsApi.md#installGroupApp) | **POST** /groups/{group_id}/apps/installs | Install a Snyk Apps to this group.
*AppsApi* | [**installSnykAppToOrg**](docs/AppsApi.md#installSnykAppToOrg) | **POST** /orgs/{org_id}/apps/installs | Install a Snyk Apps to this organization.
*AppsApi* | [**listAppBots**](docs/AppsApi.md#listAppBots) | **GET** /orgs/{org_id}/app_bots | Get a list of app bots authorized to an organization.
*AppsApi* | [**listApps**](docs/AppsApi.md#listApps) | **GET** /self/apps | Get a list of apps that can act on your behalf.
*AppsApi* | [**listGroupAppInstalls**](docs/AppsApi.md#listGroupAppInstalls) | **GET** /groups/{group_id}/apps/installs | Get a list of apps installed for a group.
*AppsApi* | [**listOrgApps**](docs/AppsApi.md#listOrgApps) | **GET** /orgs/{org_id}/apps | Get a list of apps created by an organization.
*AppsApi* | [**listOrgCreations**](docs/AppsApi.md#listOrgCreations) | **GET** /orgs/{org_id}/apps/creations | Get a list of apps created by an organization.
*AppsApi* | [**listOrgInstalls**](docs/AppsApi.md#listOrgInstalls) | **GET** /orgs/{org_id}/apps/installs | Get a list of apps installed for an organization.
*AppsApi* | [**listUserInstalledApps**](docs/AppsApi.md#listUserInstalledApps) | **GET** /self/apps/installs | Get a list of apps installed for an user.
*AppsApi* | [**manageClientSecretForSnykApp**](docs/AppsApi.md#manageClientSecretForSnykApp) | **POST** /orgs/{org_id}/apps/creations/{app_id}/secrets | Manage client secret for the Snyk App.
*AppsApi* | [**manageClientSecretForSnykApp_0**](docs/AppsApi.md#manageClientSecretForSnykApp_0) | **POST** /orgs/{org_id}/apps/installs/{install_id}/secrets | Manage client secret for non-interactive Snyk App installations.
*AppsApi* | [**manageClientSecrets**](docs/AppsApi.md#manageClientSecrets) | **POST** /orgs/{org_id}/apps/{client_id}/secrets | Manage client secrets for an app.
*AppsApi* | [**revokeAppById**](docs/AppsApi.md#revokeAppById) | **DELETE** /self/apps/{app_id} | Revoke an app
*AppsApi* | [**revokeBotAuthorization**](docs/AppsApi.md#revokeBotAuthorization) | **DELETE** /orgs/{org_id}/app_bots/{bot_id} | Revoke app bot authorization
*AppsApi* | [**revokeByInstallId**](docs/AppsApi.md#revokeByInstallId) | **DELETE** /self/apps/installs/{install_id} | Revoke access for an app by install ID.
*AppsApi* | [**revokeGroupAppInstall**](docs/AppsApi.md#revokeGroupAppInstall) | **DELETE** /groups/{group_id}/apps/installs/{install_id} | Revoke app authorization for an Snyk Group with install ID.
*AppsApi* | [**revokeUserAppSession**](docs/AppsApi.md#revokeUserAppSession) | **DELETE** /self/apps/{app_id}/sessions/{session_id} | Revoke an active user app session.
*AppsApi* | [**updateAttributes**](docs/AppsApi.md#updateAttributes) | **PATCH** /orgs/{org_id}/apps/{client_id} | Update app attributes that are name, redirect URIs, and access token time to live
*AppsApi* | [**updateCreationAttributesById**](docs/AppsApi.md#updateCreationAttributesById) | **PATCH** /orgs/{org_id}/apps/creations/{app_id} | Update app creation attributes such as name, redirect URIs, and access token time to live using the App ID.
*AuditLogsApi* | [**searchGroupAuditLogs**](docs/AuditLogsApi.md#searchGroupAuditLogs) | **GET** /groups/{group_id}/audit_logs/search | Search Group audit logs.
*AuditLogsApi* | [**searchOrganizationAuditLogs**](docs/AuditLogsApi.md#searchOrganizationAuditLogs) | **GET** /orgs/{org_id}/audit_logs/search | Search Organization audit logs.
*CollectionApi* | [**addProjectsTo**](docs/CollectionApi.md#addProjectsTo) | **POST** /orgs/{org_id}/collections/{collection_id}/relationships/projects | Add projects to a collection
*CollectionApi* | [**createNew**](docs/CollectionApi.md#createNew) | **POST** /orgs/{org_id}/collections | Create a collection
*CollectionApi* | [**editCollection**](docs/CollectionApi.md#editCollection) | **PATCH** /orgs/{org_id}/collections/{collection_id} | Edit a collection
*CollectionApi* | [**getById**](docs/CollectionApi.md#getById) | **GET** /orgs/{org_id}/collections/{collection_id} | Get a collection
*CollectionApi* | [**getList**](docs/CollectionApi.md#getList) | **GET** /orgs/{org_id}/collections | Get collections
*CollectionApi* | [**getProjects**](docs/CollectionApi.md#getProjects) | **GET** /orgs/{org_id}/collections/{collection_id}/relationships/projects | Get projects from the specified collection
*CollectionApi* | [**removeById**](docs/CollectionApi.md#removeById) | **DELETE** /orgs/{org_id}/collections/{collection_id} | Delete a collection
*CollectionApi* | [**removeProjects**](docs/CollectionApi.md#removeProjects) | **DELETE** /orgs/{org_id}/collections/{collection_id}/relationships/projects | Remove projects from a collection
*ContainerImageApi* | [**getInstance**](docs/ContainerImageApi.md#getInstance) | **GET** /orgs/{org_id}/container_images/{image_id} | Get instance of container image
*ContainerImageApi* | [**listImageTargetRefs**](docs/ContainerImageApi.md#listImageTargetRefs) | **GET** /orgs/{org_id}/container_images/{image_id}/relationships/image_target_refs | List instances of image target references for a container image
*ContainerImageApi* | [**listInstancesOfContainerImage**](docs/ContainerImageApi.md#listInstancesOfContainerImage) | **GET** /orgs/{org_id}/container_images | List instances of container image
*CustomBaseImagesApi* | [**getById**](docs/CustomBaseImagesApi.md#getById) | **GET** /custom_base_images/{custombaseimage_id} | Get a custom base image
*CustomBaseImagesApi* | [**list**](docs/CustomBaseImagesApi.md#list) | **GET** /custom_base_images | Get a custom base image collection
*CustomBaseImagesApi* | [**markImageAsCustomBase**](docs/CustomBaseImagesApi.md#markImageAsCustomBase) | **POST** /custom_base_images | Create a Custom Base Image from an existing container project
*CustomBaseImagesApi* | [**removeCustomBaseImage**](docs/CustomBaseImagesApi.md#removeCustomBaseImage) | **DELETE** /custom_base_images/{custombaseimage_id} | Delete a custom base image
*CustomBaseImagesApi* | [**updateAttributes**](docs/CustomBaseImagesApi.md#updateAttributes) | **PATCH** /custom_base_images/{custombaseimage_id} | Update a custom base image
*IacSettingsApi* | [**getForGroup**](docs/IacSettingsApi.md#getForGroup) | **GET** /groups/{group_id}/settings/iac | Get the Infrastructure as Code Settings for a group
*IacSettingsApi* | [**getForOrgIac**](docs/IacSettingsApi.md#getForOrgIac) | **GET** /orgs/{org_id}/settings/iac | Get the Infrastructure as Code Settings for an org.
*IacSettingsApi* | [**updateForGroup**](docs/IacSettingsApi.md#updateForGroup) | **PATCH** /groups/{group_id}/settings/iac | Update the Infrastructure as Code Settings for a group
*IacSettingsApi* | [**updateForOrg**](docs/IacSettingsApi.md#updateForOrg) | **PATCH** /orgs/{org_id}/settings/iac | Update the Infrastructure as Code Settings for an org
*InvitesApi* | [**cancelPendingInvitation**](docs/InvitesApi.md#cancelPendingInvitation) | **DELETE** /orgs/{org_id}/invites/{invite_id} | Cancel a pending user invitations to an organization.
*InvitesApi* | [**listPendingUserInvitations**](docs/InvitesApi.md#listPendingUserInvitations) | **GET** /orgs/{org_id}/invites | List pending user invitations to an organization.
*InvitesApi* | [**userToOrganization**](docs/InvitesApi.md#userToOrganization) | **POST** /orgs/{org_id}/invites | Invite a user to an organization
*IssuesApi* | [**byGroupId**](docs/IssuesApi.md#byGroupId) | **GET** /groups/{group_id}/issues | Get issues by group ID
*IssuesApi* | [**getById**](docs/IssuesApi.md#getById) | **GET** /orgs/{org_id}/issues/{issue_id} | Get an issue
*IssuesApi* | [**getByIssueId**](docs/IssuesApi.md#getByIssueId) | **GET** /groups/{group_id}/issues/{issue_id} | Get an issue
*IssuesApi* | [**listByOrgId**](docs/IssuesApi.md#listByOrgId) | **GET** /orgs/{org_id}/issues | Get issues by org ID
*IssuesApi* | [**listByPackage**](docs/IssuesApi.md#listByPackage) | **GET** /orgs/{org_id}/packages/{purl}/issues | List issues for a package
*IssuesApi* | [**queryForPackages**](docs/IssuesApi.md#queryForPackages) | **POST** /orgs/{org_id}/packages/issues | List issues for a given set of packages  (Currently not available to all customers)
*OpenApiApi* | [**getEffectiveVersion**](docs/OpenApiApi.md#getEffectiveVersion) | **GET** /openapi/{version} | 
*OpenApiApi* | [**listAvailableVersions**](docs/OpenApiApi.md#listAvailableVersions) | **GET** /openapi | 
*OrgsApi* | [**getDetails**](docs/OrgsApi.md#getDetails) | **GET** /orgs/{org_id} | Get organization
*OrgsApi* | [**listAccessibleOrganizations**](docs/OrgsApi.md#listAccessibleOrganizations) | **GET** /orgs | List accessible organizations
*OrgsApi* | [**listGroupOrgs**](docs/OrgsApi.md#listGroupOrgs) | **GET** /groups/{group_id}/orgs | List all organizations in group
*OrgsApi* | [**updateDetails**](docs/OrgsApi.md#updateDetails) | **PATCH** /orgs/{org_id} | Update organization
*ProjectsApi* | [**deleteByProjectId**](docs/ProjectsApi.md#deleteByProjectId) | **DELETE** /orgs/{org_id}/projects/{project_id} | Delete project by project ID.
*ProjectsApi* | [**getByProjectId**](docs/ProjectsApi.md#getByProjectId) | **GET** /orgs/{org_id}/projects/{project_id} | Get project by project ID.
*ProjectsApi* | [**listForOrg**](docs/ProjectsApi.md#listForOrg) | **GET** /orgs/{org_id}/projects | List all Projects for an Org with the given Org ID.
*ProjectsApi* | [**updateByProjectId**](docs/ProjectsApi.md#updateByProjectId) | **PATCH** /orgs/{org_id}/projects/{project_id} | Updates project by project ID.
*SbomApi* | [**getProjectDocument**](docs/SbomApi.md#getProjectDocument) | **GET** /orgs/{org_id}/projects/{project_id}/sbom | Get a project’s SBOM document
*SastSettingsApi* | [**getForOrg**](docs/SastSettingsApi.md#getForOrg) | **GET** /orgs/{org_id}/settings/sast | Retrieves the SAST settings for an org
*SastSettingsApi* | [**toggleSnykCodeSettings**](docs/SastSettingsApi.md#toggleSnykCodeSettings) | **PATCH** /orgs/{org_id}/settings/sast | Enable/Disable the Snyk Code settings for an org
*ServiceAccountsApi* | [**createForOrganization**](docs/ServiceAccountsApi.md#createForOrganization) | **POST** /orgs/{org_id}/service_accounts | Create a service account for an organization.
*ServiceAccountsApi* | [**createGroup**](docs/ServiceAccountsApi.md#createGroup) | **POST** /groups/{group_id}/service_accounts | Create a service account for a group.
*ServiceAccountsApi* | [**deleteGroupServiceAccount**](docs/ServiceAccountsApi.md#deleteGroupServiceAccount) | **DELETE** /groups/{group_id}/service_accounts/{serviceaccount_id} | Delete a group service account.
*ServiceAccountsApi* | [**deleteOrgServiceAccount**](docs/ServiceAccountsApi.md#deleteOrgServiceAccount) | **DELETE** /orgs/{org_id}/service_accounts/{serviceaccount_id} | Delete a service account in an organization.
*ServiceAccountsApi* | [**getGroupServiceAccount**](docs/ServiceAccountsApi.md#getGroupServiceAccount) | **GET** /groups/{group_id}/service_accounts/{serviceaccount_id} | Get a group service account.
*ServiceAccountsApi* | [**getOrganizationAccountById**](docs/ServiceAccountsApi.md#getOrganizationAccountById) | **GET** /orgs/{org_id}/service_accounts/{serviceaccount_id} | Get an organization service account.
*ServiceAccountsApi* | [**listGroupServiceAccounts**](docs/ServiceAccountsApi.md#listGroupServiceAccounts) | **GET** /groups/{group_id}/service_accounts | Get a list of group service accounts.
*ServiceAccountsApi* | [**listOrganizationServiceAccounts**](docs/ServiceAccountsApi.md#listOrganizationServiceAccounts) | **GET** /orgs/{org_id}/service_accounts | Get a list of organization service accounts.
*ServiceAccountsApi* | [**manageClientSecret**](docs/ServiceAccountsApi.md#manageClientSecret) | **POST** /groups/{group_id}/service_accounts/{serviceaccount_id}/secrets | Manage a group service account&#39;s client secret.
*ServiceAccountsApi* | [**manageClientSecretForOrganizationServiceAccount**](docs/ServiceAccountsApi.md#manageClientSecretForOrganizationServiceAccount) | **POST** /orgs/{org_id}/service_accounts/{serviceaccount_id}/secrets | Manage an organization service account&#39;s client secret.
*ServiceAccountsApi* | [**updateGroupNameById**](docs/ServiceAccountsApi.md#updateGroupNameById) | **PATCH** /groups/{group_id}/service_accounts/{serviceaccount_id} | Update a group service account.
*ServiceAccountsApi* | [**updateOrganizationServiceAccountName**](docs/ServiceAccountsApi.md#updateOrganizationServiceAccountName) | **PATCH** /orgs/{org_id}/service_accounts/{serviceaccount_id} | Update an organization service account.
*SlackApi* | [**getChannelNameById**](docs/SlackApi.md#getChannelNameById) | **GET** /orgs/{org_id}/slack_app/{tenant_id}/channels/{channel_id} | Get Slack Channel name by Slack Channel ID.
*SlackApi* | [**getChannels**](docs/SlackApi.md#getChannels) | **GET** /orgs/{org_id}/slack_app/{tenant_id}/channels | Get a list of Slack channels
*SlackSettingsApi* | [**createDefaultNotificationSettings**](docs/SlackSettingsApi.md#createDefaultNotificationSettings) | **POST** /orgs/{org_id}/slack_app/{bot_id} | Create new Slack notification default settings.
*SlackSettingsApi* | [**getDefaultNotificationSettings**](docs/SlackSettingsApi.md#getDefaultNotificationSettings) | **GET** /orgs/{org_id}/slack_app/{bot_id} | Get Slack integration default notification settings.
*SlackSettingsApi* | [**getOverridesForProjects**](docs/SlackSettingsApi.md#getOverridesForProjects) | **GET** /orgs/{org_id}/slack_app/{bot_id}/projects | Slack notification settings overrides for projects
*SlackSettingsApi* | [**projectOverride**](docs/SlackSettingsApi.md#projectOverride) | **POST** /orgs/{org_id}/slack_app/{bot_id}/projects/{project_id} | Create a new Slack settings override for a given project.
*SlackSettingsApi* | [**removeIntegration**](docs/SlackSettingsApi.md#removeIntegration) | **DELETE** /orgs/{org_id}/slack_app/{bot_id} | Remove the given Slack App integration
*SlackSettingsApi* | [**removeProjectOverride**](docs/SlackSettingsApi.md#removeProjectOverride) | **DELETE** /orgs/{org_id}/slack_app/{bot_id}/projects/{project_id} | Remove Slack settings override for a project.
*SlackSettingsApi* | [**updateNotificationSettingsForProject**](docs/SlackSettingsApi.md#updateNotificationSettingsForProject) | **PATCH** /orgs/{org_id}/slack_app/{bot_id}/projects/{project_id} | Update Slack notification settings for a project.
*TargetsApi* | [**deleteById**](docs/TargetsApi.md#deleteById) | **DELETE** /orgs/{org_id}/targets/{target_id} | Delete target by target ID
*TargetsApi* | [**getById**](docs/TargetsApi.md#getById) | **GET** /orgs/{org_id}/targets/{target_id} | Get target by target ID
*TargetsApi* | [**listByOrgId**](docs/TargetsApi.md#listByOrgId) | **GET** /orgs/{org_id}/targets | Get targets by org ID


## Documentation for Models

 - [AppBot](docs/AppBot.md)
 - [AppBotRelationships](docs/AppBotRelationships.md)
 - [AppBotRelationshipsApp](docs/AppBotRelationshipsApp.md)
 - [AppData](docs/AppData.md)
 - [AppDataWithSecret](docs/AppDataWithSecret.md)
 - [AppInstallData](docs/AppInstallData.md)
 - [AppInstallDataAttributes](docs/AppInstallDataAttributes.md)
 - [AppInstallDataRelationships](docs/AppInstallDataRelationships.md)
 - [AppInstallDataRelationshipsApp](docs/AppInstallDataRelationshipsApp.md)
 - [AppInstallDataWithSecret](docs/AppInstallDataWithSecret.md)
 - [AppInstallDataWithSecretAttributes](docs/AppInstallDataWithSecretAttributes.md)
 - [AppInstallWithClient](docs/AppInstallWithClient.md)
 - [AppInstallWithClientAttributes](docs/AppInstallWithClientAttributes.md)
 - [AppInstallWithClientRelationships](docs/AppInstallWithClientRelationships.md)
 - [AppInstallWithClientRelationshipsApp](docs/AppInstallWithClientRelationshipsApp.md)
 - [AppInstallWithClientRelationshipsAppData](docs/AppInstallWithClientRelationshipsAppData.md)
 - [AppPatchRequest](docs/AppPatchRequest.md)
 - [AppPatchRequestData](docs/AppPatchRequestData.md)
 - [AppPatchRequestDataAttributes](docs/AppPatchRequestDataAttributes.md)
 - [AppPostRequest](docs/AppPostRequest.md)
 - [AppPostRequestData](docs/AppPostRequestData.md)
 - [AppPostRequestDataAttributes](docs/AppPostRequestDataAttributes.md)
 - [AppPostResponse](docs/AppPostResponse.md)
 - [AppResourceAttributes](docs/AppResourceAttributes.md)
 - [AppResourceAttributesWithSecret](docs/AppResourceAttributesWithSecret.md)
 - [AppsCreateInstallSecretRequest](docs/AppsCreateInstallSecretRequest.md)
 - [AppsCreateInstallSecretRequestData](docs/AppsCreateInstallSecretRequestData.md)
 - [AppsCreateInstallSecretRequestDataAttributes](docs/AppsCreateInstallSecretRequestDataAttributes.md)
 - [AppsCreateInstallSecretResponse](docs/AppsCreateInstallSecretResponse.md)
 - [AppsGetActiveSessionsResponse](docs/AppsGetActiveSessionsResponse.md)
 - [AppsGetByAppIdResponse](docs/AppsGetByAppIdResponse.md)
 - [AppsGetByClientIdResponse](docs/AppsGetByClientIdResponse.md)
 - [AppsInstallGroupAppRequest](docs/AppsInstallGroupAppRequest.md)
 - [AppsInstallGroupAppRequestData](docs/AppsInstallGroupAppRequestData.md)
 - [AppsInstallGroupAppRequestRelationships](docs/AppsInstallGroupAppRequestRelationships.md)
 - [AppsInstallGroupAppRequestRelationshipsApp](docs/AppsInstallGroupAppRequestRelationshipsApp.md)
 - [AppsInstallGroupAppRequestRelationshipsAppData](docs/AppsInstallGroupAppRequestRelationshipsAppData.md)
 - [AppsInstallGroupAppResponse](docs/AppsInstallGroupAppResponse.md)
 - [AppsInstallSnykAppToOrgRequest](docs/AppsInstallSnykAppToOrgRequest.md)
 - [AppsInstallSnykAppToOrgRequestData](docs/AppsInstallSnykAppToOrgRequestData.md)
 - [AppsInstallSnykAppToOrgRequestRelationships](docs/AppsInstallSnykAppToOrgRequestRelationships.md)
 - [AppsInstallSnykAppToOrgRequestRelationshipsApp](docs/AppsInstallSnykAppToOrgRequestRelationshipsApp.md)
 - [AppsInstallSnykAppToOrgRequestRelationshipsAppData](docs/AppsInstallSnykAppToOrgRequestRelationshipsAppData.md)
 - [AppsInstallSnykAppToOrgResponse](docs/AppsInstallSnykAppToOrgResponse.md)
 - [AppsListAppBotsResponse](docs/AppsListAppBotsResponse.md)
 - [AppsListAppsResponse](docs/AppsListAppsResponse.md)
 - [AppsListGroupAppInstallsResponse](docs/AppsListGroupAppInstallsResponse.md)
 - [AppsListOrgAppsResponse](docs/AppsListOrgAppsResponse.md)
 - [AppsListOrgCreationsResponse](docs/AppsListOrgCreationsResponse.md)
 - [AppsListOrgInstallsResponse](docs/AppsListOrgInstallsResponse.md)
 - [AppsListUserInstalledAppsResponse](docs/AppsListUserInstalledAppsResponse.md)
 - [AppsManageClientSecretForSnykApp200Response](docs/AppsManageClientSecretForSnykApp200Response.md)
 - [AppsManageClientSecretForSnykAppRequest](docs/AppsManageClientSecretForSnykAppRequest.md)
 - [AppsManageClientSecretForSnykAppRequest1](docs/AppsManageClientSecretForSnykAppRequest1.md)
 - [AppsManageClientSecretForSnykAppResponse](docs/AppsManageClientSecretForSnykAppResponse.md)
 - [AppsManageClientSecretsRequest](docs/AppsManageClientSecretsRequest.md)
 - [AppsManageClientSecretsResponse](docs/AppsManageClientSecretsResponse.md)
 - [AppsUpdateAttributesResponse](docs/AppsUpdateAttributesResponse.md)
 - [AppsUpdateCreationAttributesByIdResponse](docs/AppsUpdateCreationAttributesByIdResponse.md)
 - [AuditLogSearch](docs/AuditLogSearch.md)
 - [AuditLogSearchItemsInner](docs/AuditLogSearchItemsInner.md)
 - [AuditLogsSearchGroupAuditLogsResponse](docs/AuditLogsSearchGroupAuditLogsResponse.md)
 - [AuditLogsSearchOrganizationAuditLogsResponse](docs/AuditLogsSearchOrganizationAuditLogsResponse.md)
 - [AutoDependencyUpgradeSettings](docs/AutoDependencyUpgradeSettings.md)
 - [AutoRemediationPRsSettings](docs/AutoRemediationPRsSettings.md)
 - [BulkPackageUrlsRequestBody](docs/BulkPackageUrlsRequestBody.md)
 - [BulkPackageUrlsRequestBodyData](docs/BulkPackageUrlsRequestBodyData.md)
 - [BulkPackageUrlsRequestBodyDataAttributes](docs/BulkPackageUrlsRequestBodyDataAttributes.md)
 - [ClassTypeDef](docs/ClassTypeDef.md)
 - [CloudResource](docs/CloudResource.md)
 - [CollectionAttributes](docs/CollectionAttributes.md)
 - [CollectionCreateNewResponse](docs/CollectionCreateNewResponse.md)
 - [CollectionCreateNewResponseData](docs/CollectionCreateNewResponseData.md)
 - [CollectionEditCollectionResponse](docs/CollectionEditCollectionResponse.md)
 - [CollectionGetByIdResponse](docs/CollectionGetByIdResponse.md)
 - [CollectionGetListResponse](docs/CollectionGetListResponse.md)
 - [CollectionMeta](docs/CollectionMeta.md)
 - [CollectionRelationships](docs/CollectionRelationships.md)
 - [CollectionRelationshipsCreatedByUser](docs/CollectionRelationshipsCreatedByUser.md)
 - [CollectionRelationshipsCreatedByUserData](docs/CollectionRelationshipsCreatedByUserData.md)
 - [CollectionRelationshipsOrg](docs/CollectionRelationshipsOrg.md)
 - [CollectionRelationshipsOrgData](docs/CollectionRelationshipsOrgData.md)
 - [CollectionResponse](docs/CollectionResponse.md)
 - [CommonIssueModel](docs/CommonIssueModel.md)
 - [CommonIssueModelAttributes](docs/CommonIssueModelAttributes.md)
 - [CommonIssueModelAttributesCoordinatesInner](docs/CommonIssueModelAttributesCoordinatesInner.md)
 - [CommonIssueModelAttributesCoordinatesInnerRemediesInner](docs/CommonIssueModelAttributesCoordinatesInnerRemediesInner.md)
 - [CommonIssueModelAttributesCoordinatesInnerRemediesInnerDetails](docs/CommonIssueModelAttributesCoordinatesInnerRemediesInnerDetails.md)
 - [CommonIssueModelAttributesProblemsInner](docs/CommonIssueModelAttributesProblemsInner.md)
 - [CommonIssueModelVTwo](docs/CommonIssueModelVTwo.md)
 - [CommonIssueModelVTwoAttributes](docs/CommonIssueModelVTwoAttributes.md)
 - [CommonIssueModelVTwoAttributesProblemsInner](docs/CommonIssueModelVTwoAttributesProblemsInner.md)
 - [ContainerBuildArgs](docs/ContainerBuildArgs.md)
 - [ContainerImageGetInstanceResponse](docs/ContainerImageGetInstanceResponse.md)
 - [ContainerImageListImageTargetRefsResponse](docs/ContainerImageListImageTargetRefsResponse.md)
 - [ContainerImageListInstancesOfContainerImageResponse](docs/ContainerImageListInstancesOfContainerImageResponse.md)
 - [Context](docs/Context.md)
 - [Coordinate](docs/Coordinate.md)
 - [CoordinateVTwo](docs/CoordinateVTwo.md)
 - [CoordinateVTwoRemediesInner](docs/CoordinateVTwoRemediesInner.md)
 - [CoordinateVTwoRemediesInnerDetails](docs/CoordinateVTwoRemediesInnerDetails.md)
 - [CreateCollectionRequest](docs/CreateCollectionRequest.md)
 - [CreateCollectionRequestData](docs/CreateCollectionRequestData.md)
 - [CreateCollectionRequestDataAttributes](docs/CreateCollectionRequestDataAttributes.md)
 - [CustomBaseImageAttributes](docs/CustomBaseImageAttributes.md)
 - [CustomBaseImageCollectionResponse](docs/CustomBaseImageCollectionResponse.md)
 - [CustomBaseImageCollectionResponseDataInner](docs/CustomBaseImageCollectionResponseDataInner.md)
 - [CustomBaseImagePatchRequest](docs/CustomBaseImagePatchRequest.md)
 - [CustomBaseImagePatchRequestData](docs/CustomBaseImagePatchRequestData.md)
 - [CustomBaseImagePatchRequestDataAttributes](docs/CustomBaseImagePatchRequestDataAttributes.md)
 - [CustomBaseImagePostRequest](docs/CustomBaseImagePostRequest.md)
 - [CustomBaseImagePostRequestData](docs/CustomBaseImagePostRequestData.md)
 - [CustomBaseImageResource](docs/CustomBaseImageResource.md)
 - [CustomBaseImageResponse](docs/CustomBaseImageResponse.md)
 - [CustomBaseImageSnapshot](docs/CustomBaseImageSnapshot.md)
 - [CycloneDxComponent](docs/CycloneDxComponent.md)
 - [CycloneDxDependency](docs/CycloneDxDependency.md)
 - [CycloneDxDocument](docs/CycloneDxDocument.md)
 - [CycloneDxMetadata](docs/CycloneDxMetadata.md)
 - [CycloneDxProperty](docs/CycloneDxProperty.md)
 - [CycloneDxTool](docs/CycloneDxTool.md)
 - [CycloneDxXmlDocument](docs/CycloneDxXmlDocument.md)
 - [DeleteProjectsFromCollectionRequest](docs/DeleteProjectsFromCollectionRequest.md)
 - [DeleteProjectsFromCollectionRequestDataInner](docs/DeleteProjectsFromCollectionRequestDataInner.md)
 - [Dependency](docs/Dependency.md)
 - [DeployedRiskFactor](docs/DeployedRiskFactor.md)
 - [Environment](docs/Environment.md)
 - [EnvironmentTypeDef](docs/EnvironmentTypeDef.md)
 - [Error](docs/Error.md)
 - [ErrorLink](docs/ErrorLink.md)
 - [ErrorSource](docs/ErrorSource.md)
 - [FilePosition](docs/FilePosition.md)
 - [GetProjectSettingsCollection](docs/GetProjectSettingsCollection.md)
 - [GetProjectsOfCollectionResponse](docs/GetProjectsOfCollectionResponse.md)
 - [GrantType](docs/GrantType.md)
 - [GroupIacSettingsRequest](docs/GroupIacSettingsRequest.md)
 - [GroupIacSettingsRequestAttributes](docs/GroupIacSettingsRequestAttributes.md)
 - [GroupIacSettingsRequestAttributesCustomRules](docs/GroupIacSettingsRequestAttributesCustomRules.md)
 - [GroupIacSettingsResponse](docs/GroupIacSettingsResponse.md)
 - [GroupIacSettingsResponseAttributes](docs/GroupIacSettingsResponseAttributes.md)
 - [GroupIacSettingsResponseAttributesCustomRules](docs/GroupIacSettingsResponseAttributesCustomRules.md)
 - [HelloWorld](docs/HelloWorld.md)
 - [HelloWorldAttributes](docs/HelloWorldAttributes.md)
 - [HelloWorldAttributesRequestSubject](docs/HelloWorldAttributesRequestSubject.md)
 - [IacSettingsGetForGroupResponse](docs/IacSettingsGetForGroupResponse.md)
 - [IacSettingsGetForOrgIacResponse](docs/IacSettingsGetForOrgIacResponse.md)
 - [IacSettingsUpdateForGroupRequest](docs/IacSettingsUpdateForGroupRequest.md)
 - [IacSettingsUpdateForGroupResponse](docs/IacSettingsUpdateForGroupResponse.md)
 - [IacSettingsUpdateForOrgRequest](docs/IacSettingsUpdateForOrgRequest.md)
 - [IacSettingsUpdateForOrgResponse](docs/IacSettingsUpdateForOrgResponse.md)
 - [IgnoreType](docs/IgnoreType.md)
 - [Image](docs/Image.md)
 - [ImageAttributes](docs/ImageAttributes.md)
 - [ImageRelationships](docs/ImageRelationships.md)
 - [ImageRelationshipsImageTargetRefs](docs/ImageRelationshipsImageTargetRefs.md)
 - [ImageTargetRef](docs/ImageTargetRef.md)
 - [ImageTargetRefAttributes](docs/ImageTargetRefAttributes.md)
 - [InheritFromParent](docs/InheritFromParent.md)
 - [InvitesListPendingUserInvitationsResponse](docs/InvitesListPendingUserInvitationsResponse.md)
 - [InvitesUserToOrganizationRequest](docs/InvitesUserToOrganizationRequest.md)
 - [InvitesUserToOrganizationResponse](docs/InvitesUserToOrganizationResponse.md)
 - [Issue](docs/Issue.md)
 - [IssueAttributes](docs/IssueAttributes.md)
 - [IssueRelationships](docs/IssueRelationships.md)
 - [IssueRelationshipsIgnore](docs/IssueRelationshipsIgnore.md)
 - [IssueRelationshipsIgnoreData](docs/IssueRelationshipsIgnoreData.md)
 - [IssueRelationshipsOrganization](docs/IssueRelationshipsOrganization.md)
 - [IssueRelationshipsOrganizationData](docs/IssueRelationshipsOrganizationData.md)
 - [IssueRelationshipsScanItem](docs/IssueRelationshipsScanItem.md)
 - [IssueRelationshipsScanItemData](docs/IssueRelationshipsScanItemData.md)
 - [IssueRelationshipsTestExecutions](docs/IssueRelationshipsTestExecutions.md)
 - [IssueRelationshipsTestExecutionsDataInner](docs/IssueRelationshipsTestExecutionsDataInner.md)
 - [IssueType](docs/IssueType.md)
 - [IssuesByGroupIdResponse](docs/IssuesByGroupIdResponse.md)
 - [IssuesGetByIssueIdResponse](docs/IssuesGetByIssueIdResponse.md)
 - [IssuesMeta](docs/IssuesMeta.md)
 - [IssuesResponse](docs/IssuesResponse.md)
 - [IssuesWithPurlsResponse](docs/IssuesWithPurlsResponse.md)
 - [IssuesWithPurlsResponseMeta](docs/IssuesWithPurlsResponseMeta.md)
 - [JsonApi](docs/JsonApi.md)
 - [LatestDependencyTotal](docs/LatestDependencyTotal.md)
 - [LatestIssueCounts](docs/LatestIssueCounts.md)
 - [Links](docs/Links.md)
 - [ManualRemediationPRsSettings](docs/ManualRemediationPRsSettings.md)
 - [MemberRoleRelationship](docs/MemberRoleRelationship.md)
 - [MemberRoleRelationshipData](docs/MemberRoleRelationshipData.md)
 - [ModelClass](docs/ModelClass.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [NugetBuildArgs](docs/NugetBuildArgs.md)
 - [OSConditionRiskFactor](docs/OSConditionRiskFactor.md)
 - [Org](docs/Org.md)
 - [OrgAttributes](docs/OrgAttributes.md)
 - [OrgIacSettingsRequest](docs/OrgIacSettingsRequest.md)
 - [OrgIacSettingsRequestAttributes](docs/OrgIacSettingsRequestAttributes.md)
 - [OrgIacSettingsRequestAttributesCustomRules](docs/OrgIacSettingsRequestAttributesCustomRules.md)
 - [OrgIacSettingsResponse](docs/OrgIacSettingsResponse.md)
 - [OrgIacSettingsResponseAttributes](docs/OrgIacSettingsResponseAttributes.md)
 - [OrgIacSettingsResponseAttributesCustomRules](docs/OrgIacSettingsResponseAttributesCustomRules.md)
 - [OrgIacSettingsResponseAttributesCustomRulesParents](docs/OrgIacSettingsResponseAttributesCustomRulesParents.md)
 - [OrgIacSettingsResponseAttributesCustomRulesParentsGroup](docs/OrgIacSettingsResponseAttributesCustomRulesParentsGroup.md)
 - [OrgInvitation](docs/OrgInvitation.md)
 - [OrgInvitationAttributes](docs/OrgInvitationAttributes.md)
 - [OrgInvitationPostAttributes](docs/OrgInvitationPostAttributes.md)
 - [OrgInvitationPostData](docs/OrgInvitationPostData.md)
 - [OrgInvitationRelationships](docs/OrgInvitationRelationships.md)
 - [OrgRelationships](docs/OrgRelationships.md)
 - [OrgRoleAttributes](docs/OrgRoleAttributes.md)
 - [OrgUpdateAttributes](docs/OrgUpdateAttributes.md)
 - [OrgWithRelationships](docs/OrgWithRelationships.md)
 - [OrganizationType](docs/OrganizationType.md)
 - [OrgsGetDetailsResponse](docs/OrgsGetDetailsResponse.md)
 - [OrgsListAccessibleOrganizationsResponse](docs/OrgsListAccessibleOrganizationsResponse.md)
 - [OrgsListGroupOrgsResponse](docs/OrgsListGroupOrgsResponse.md)
 - [OrgsUpdateDetailsRequest](docs/OrgsUpdateDetailsRequest.md)
 - [OrgsUpdateDetailsRequestData](docs/OrgsUpdateDetailsRequestData.md)
 - [OrgsUpdateDetailsResponse](docs/OrgsUpdateDetailsResponse.md)
 - [OrgsUpdateDetailsResponseData](docs/OrgsUpdateDetailsResponseData.md)
 - [PackageMeta](docs/PackageMeta.md)
 - [PackageRepresentation](docs/PackageRepresentation.md)
 - [PaginatedLinks](docs/PaginatedLinks.md)
 - [PatchProjectRequest](docs/PatchProjectRequest.md)
 - [PatchProjectRequestData](docs/PatchProjectRequestData.md)
 - [PatchProjectRequestDataAttributes](docs/PatchProjectRequestDataAttributes.md)
 - [PatchProjectRequestDataAttributesTagsInner](docs/PatchProjectRequestDataAttributesTagsInner.md)
 - [PatchProjectRequestDataRelationships](docs/PatchProjectRequestDataRelationships.md)
 - [PatchProjectRequestDataRelationshipsOwner](docs/PatchProjectRequestDataRelationshipsOwner.md)
 - [PatchProjectRequestDataRelationshipsOwnerData](docs/PatchProjectRequestDataRelationshipsOwnerData.md)
 - [Platform](docs/Platform.md)
 - [Problem](docs/Problem.md)
 - [ProblemTypeDef](docs/ProblemTypeDef.md)
 - [ProjectAttributes](docs/ProjectAttributes.md)
 - [ProjectAttributesTagsInner](docs/ProjectAttributesTagsInner.md)
 - [ProjectMeta](docs/ProjectMeta.md)
 - [ProjectOfCollection](docs/ProjectOfCollection.md)
 - [ProjectRelationships](docs/ProjectRelationships.md)
 - [ProjectRelationshipsTarget](docs/ProjectRelationshipsTarget.md)
 - [ProjectRelationshipsTargetData](docs/ProjectRelationshipsTargetData.md)
 - [ProjectRelationshipsTargetDataAttributes](docs/ProjectRelationshipsTargetDataAttributes.md)
 - [ProjectRelationshipsTargetDataMeta](docs/ProjectRelationshipsTargetDataMeta.md)
 - [ProjectRelationshipsTargetLinks](docs/ProjectRelationshipsTargetLinks.md)
 - [ProjectSettings](docs/ProjectSettings.md)
 - [ProjectSettingsData](docs/ProjectSettingsData.md)
 - [ProjectSettingsDataAttributes](docs/ProjectSettingsDataAttributes.md)
 - [ProjectSettingsPatchRequest](docs/ProjectSettingsPatchRequest.md)
 - [ProjectSettingsPatchRequestData](docs/ProjectSettingsPatchRequestData.md)
 - [ProjectSettingsPatchRequestDataAttributes](docs/ProjectSettingsPatchRequestDataAttributes.md)
 - [ProjectsGetByProjectIdResponse](docs/ProjectsGetByProjectIdResponse.md)
 - [ProjectsGetByProjectIdResponseData](docs/ProjectsGetByProjectIdResponseData.md)
 - [ProjectsGetByProjectIdResponseDataMeta](docs/ProjectsGetByProjectIdResponseDataMeta.md)
 - [ProjectsGetByProjectIdResponseDataRelationships](docs/ProjectsGetByProjectIdResponseDataRelationships.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsImporter](docs/ProjectsGetByProjectIdResponseDataRelationshipsImporter.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsImporterData](docs/ProjectsGetByProjectIdResponseDataRelationshipsImporterData.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsImporterLinks](docs/ProjectsGetByProjectIdResponseDataRelationshipsImporterLinks.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsOrganization](docs/ProjectsGetByProjectIdResponseDataRelationshipsOrganization.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsOrganizationData](docs/ProjectsGetByProjectIdResponseDataRelationshipsOrganizationData.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsOrganizationLinks](docs/ProjectsGetByProjectIdResponseDataRelationshipsOrganizationLinks.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsOwner](docs/ProjectsGetByProjectIdResponseDataRelationshipsOwner.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsOwnerData](docs/ProjectsGetByProjectIdResponseDataRelationshipsOwnerData.md)
 - [ProjectsGetByProjectIdResponseDataRelationshipsOwnerLinks](docs/ProjectsGetByProjectIdResponseDataRelationshipsOwnerLinks.md)
 - [ProjectsListForOrgResponse](docs/ProjectsListForOrgResponse.md)
 - [ProjectsListForOrgResponseDataInner](docs/ProjectsListForOrgResponseDataInner.md)
 - [ProjectsListForOrgResponseDataInnerMeta](docs/ProjectsListForOrgResponseDataInnerMeta.md)
 - [ProjectsListForOrgResponseDataInnerRelationships](docs/ProjectsListForOrgResponseDataInnerRelationships.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsImporter](docs/ProjectsListForOrgResponseDataInnerRelationshipsImporter.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsImporterData](docs/ProjectsListForOrgResponseDataInnerRelationshipsImporterData.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsImporterLinks](docs/ProjectsListForOrgResponseDataInnerRelationshipsImporterLinks.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsOrganization](docs/ProjectsListForOrgResponseDataInnerRelationshipsOrganization.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsOrganizationData](docs/ProjectsListForOrgResponseDataInnerRelationshipsOrganizationData.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsOrganizationLinks](docs/ProjectsListForOrgResponseDataInnerRelationshipsOrganizationLinks.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsOwner](docs/ProjectsListForOrgResponseDataInnerRelationshipsOwner.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsOwnerData](docs/ProjectsListForOrgResponseDataInnerRelationshipsOwnerData.md)
 - [ProjectsListForOrgResponseDataInnerRelationshipsOwnerLinks](docs/ProjectsListForOrgResponseDataInnerRelationshipsOwnerLinks.md)
 - [ProjectsListForOrgResponseMeta](docs/ProjectsListForOrgResponseMeta.md)
 - [ProjectsUpdateByProjectIdResponse](docs/ProjectsUpdateByProjectIdResponse.md)
 - [ProjectsUpdateByProjectIdResponseData](docs/ProjectsUpdateByProjectIdResponseData.md)
 - [ProjectsUpdateByProjectIdResponseDataMeta](docs/ProjectsUpdateByProjectIdResponseDataMeta.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationships](docs/ProjectsUpdateByProjectIdResponseDataRelationships.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsImporter](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsImporter.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsImporterData](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsImporterData.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsImporterLinks](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsImporterLinks.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsOrganization](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsOrganization.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsOrganizationData](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsOrganizationData.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsOrganizationLinks](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsOrganizationLinks.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsOwner](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsOwner.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsOwnerData](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsOwnerData.md)
 - [ProjectsUpdateByProjectIdResponseDataRelationshipsOwnerLinks](docs/ProjectsUpdateByProjectIdResponseDataRelationshipsOwnerLinks.md)
 - [PublicApp](docs/PublicApp.md)
 - [PublicAppAttributes](docs/PublicAppAttributes.md)
 - [PublicAppData](docs/PublicAppData.md)
 - [PublicAppDataAttributes](docs/PublicAppDataAttributes.md)
 - [PublicFacingRiskFactor](docs/PublicFacingRiskFactor.md)
 - [PublicTarget](docs/PublicTarget.md)
 - [PublicTargetAttributes](docs/PublicTargetAttributes.md)
 - [PublicTargetRelationships](docs/PublicTargetRelationships.md)
 - [PublicTargetRelationshipsIntegration](docs/PublicTargetRelationshipsIntegration.md)
 - [PublicTargetRelationshipsIntegrationData](docs/PublicTargetRelationshipsIntegrationData.md)
 - [PublicTargetRelationshipsIntegrationDataAttributes](docs/PublicTargetRelationshipsIntegrationDataAttributes.md)
 - [PublicTargetRelationshipsOrganization](docs/PublicTargetRelationshipsOrganization.md)
 - [PublicTargetRelationshipsOrganizationData](docs/PublicTargetRelationshipsOrganizationData.md)
 - [PullRequestAssignmentSettings](docs/PullRequestAssignmentSettings.md)
 - [PullRequestsSettings](docs/PullRequestsSettings.md)
 - [RPRepresentation](docs/RPRepresentation.md)
 - [RecurringTestsSettings](docs/RecurringTestsSettings.md)
 - [Region](docs/Region.md)
 - [RelatedLink](docs/RelatedLink.md)
 - [Relationship](docs/Relationship.md)
 - [RelationshipData](docs/RelationshipData.md)
 - [RelationshipLinks](docs/RelationshipLinks.md)
 - [Remedy](docs/Remedy.md)
 - [RemedyMetadata](docs/RemedyMetadata.md)
 - [Resolution](docs/Resolution.md)
 - [ResolutionTypeDef](docs/ResolutionTypeDef.md)
 - [Resource](docs/Resource.md)
 - [ResourcePathRepresentation](docs/ResourcePathRepresentation.md)
 - [Risk](docs/Risk.md)
 - [RiskFactorLinks](docs/RiskFactorLinks.md)
 - [RiskScore](docs/RiskScore.md)
 - [SastEnablement](docs/SastEnablement.md)
 - [SastEnablementAttributes](docs/SastEnablementAttributes.md)
 - [SastSettingsGetForOrgResponse](docs/SastSettingsGetForOrgResponse.md)
 - [SastSettingsToggleSnykCodeSettingsRequest](docs/SastSettingsToggleSnykCodeSettingsRequest.md)
 - [SastSettingsToggleSnykCodeSettingsRequestData](docs/SastSettingsToggleSnykCodeSettingsRequestData.md)
 - [SastSettingsToggleSnykCodeSettingsRequestDataAttributes](docs/SastSettingsToggleSnykCodeSettingsRequestDataAttributes.md)
 - [SastSettingsToggleSnykCodeSettingsResponse](docs/SastSettingsToggleSnykCodeSettingsResponse.md)
 - [SbomResource](docs/SbomResource.md)
 - [SbomResponse](docs/SbomResponse.md)
 - [ScanItemType](docs/ScanItemType.md)
 - [SelfLink](docs/SelfLink.md)
 - [ServiceAccount](docs/ServiceAccount.md)
 - [ServiceAccountAttributes](docs/ServiceAccountAttributes.md)
 - [ServiceAccountLinks](docs/ServiceAccountLinks.md)
 - [ServiceAccountsCreateForOrganizationRequest](docs/ServiceAccountsCreateForOrganizationRequest.md)
 - [ServiceAccountsCreateForOrganizationRequestData](docs/ServiceAccountsCreateForOrganizationRequestData.md)
 - [ServiceAccountsCreateForOrganizationRequestDataAttributes](docs/ServiceAccountsCreateForOrganizationRequestDataAttributes.md)
 - [ServiceAccountsCreateForOrganizationResponse](docs/ServiceAccountsCreateForOrganizationResponse.md)
 - [ServiceAccountsCreateGroupRequest](docs/ServiceAccountsCreateGroupRequest.md)
 - [ServiceAccountsCreateGroupRequestData](docs/ServiceAccountsCreateGroupRequestData.md)
 - [ServiceAccountsCreateGroupRequestDataAttributes](docs/ServiceAccountsCreateGroupRequestDataAttributes.md)
 - [ServiceAccountsCreateGroupResponse](docs/ServiceAccountsCreateGroupResponse.md)
 - [ServiceAccountsGetGroupServiceAccountResponse](docs/ServiceAccountsGetGroupServiceAccountResponse.md)
 - [ServiceAccountsGetOrganizationAccountByIdResponse](docs/ServiceAccountsGetOrganizationAccountByIdResponse.md)
 - [ServiceAccountsListGroupServiceAccountsResponse](docs/ServiceAccountsListGroupServiceAccountsResponse.md)
 - [ServiceAccountsListGroupServiceAccountsResponseDataInner](docs/ServiceAccountsListGroupServiceAccountsResponseDataInner.md)
 - [ServiceAccountsListOrganizationServiceAccountsResponse](docs/ServiceAccountsListOrganizationServiceAccountsResponse.md)
 - [ServiceAccountsManageClientSecretForOrganizationServiceAccountRequest](docs/ServiceAccountsManageClientSecretForOrganizationServiceAccountRequest.md)
 - [ServiceAccountsManageClientSecretForOrganizationServiceAccountResponse](docs/ServiceAccountsManageClientSecretForOrganizationServiceAccountResponse.md)
 - [ServiceAccountsManageClientSecretRequest](docs/ServiceAccountsManageClientSecretRequest.md)
 - [ServiceAccountsManageClientSecretRequestData](docs/ServiceAccountsManageClientSecretRequestData.md)
 - [ServiceAccountsManageClientSecretRequestDataAttributes](docs/ServiceAccountsManageClientSecretRequestDataAttributes.md)
 - [ServiceAccountsManageClientSecretResponse](docs/ServiceAccountsManageClientSecretResponse.md)
 - [ServiceAccountsUpdateGroupNameByIdRequest](docs/ServiceAccountsUpdateGroupNameByIdRequest.md)
 - [ServiceAccountsUpdateGroupNameByIdRequestData](docs/ServiceAccountsUpdateGroupNameByIdRequestData.md)
 - [ServiceAccountsUpdateGroupNameByIdRequestDataAttributes](docs/ServiceAccountsUpdateGroupNameByIdRequestDataAttributes.md)
 - [ServiceAccountsUpdateGroupNameByIdResponse](docs/ServiceAccountsUpdateGroupNameByIdResponse.md)
 - [ServiceAccountsUpdateOrganizationServiceAccountNameRequest](docs/ServiceAccountsUpdateOrganizationServiceAccountNameRequest.md)
 - [ServiceAccountsUpdateOrganizationServiceAccountNameRequestData](docs/ServiceAccountsUpdateOrganizationServiceAccountNameRequestData.md)
 - [ServiceAccountsUpdateOrganizationServiceAccountNameRequestDataAttributes](docs/ServiceAccountsUpdateOrganizationServiceAccountNameRequestDataAttributes.md)
 - [ServiceAccountsUpdateOrganizationServiceAccountNameResponse](docs/ServiceAccountsUpdateOrganizationServiceAccountNameResponse.md)
 - [SessionAttributes](docs/SessionAttributes.md)
 - [SessionData](docs/SessionData.md)
 - [SettingsAttributes](docs/SettingsAttributes.md)
 - [SettingsRequest](docs/SettingsRequest.md)
 - [SettingsRequestData](docs/SettingsRequestData.md)
 - [Severity](docs/Severity.md)
 - [SeverityThreshold](docs/SeverityThreshold.md)
 - [SlackChannel](docs/SlackChannel.md)
 - [SlackChannelAttributes](docs/SlackChannelAttributes.md)
 - [SlackDefaultSettingsData](docs/SlackDefaultSettingsData.md)
 - [SlackDefaultSettingsDataAttributes](docs/SlackDefaultSettingsDataAttributes.md)
 - [SlackGetChannelNameByIdResponse](docs/SlackGetChannelNameByIdResponse.md)
 - [SlackGetChannelsResponse](docs/SlackGetChannelsResponse.md)
 - [SlackSettingsCreateDefaultNotificationSettingsResponse](docs/SlackSettingsCreateDefaultNotificationSettingsResponse.md)
 - [SlackSettingsGetDefaultNotificationSettingsResponse](docs/SlackSettingsGetDefaultNotificationSettingsResponse.md)
 - [SlackSettingsProjectOverrideResponse](docs/SlackSettingsProjectOverrideResponse.md)
 - [SlackSettingsUpdateNotificationSettingsForProjectResponse](docs/SlackSettingsUpdateNotificationSettingsForProjectResponse.md)
 - [Slots](docs/Slots.md)
 - [SlotsReferencesInner](docs/SlotsReferencesInner.md)
 - [SourceLocation](docs/SourceLocation.md)
 - [TargetsGetByIdResponse](docs/TargetsGetByIdResponse.md)
 - [TargetsListByOrgIdResponse](docs/TargetsListByOrgIdResponse.md)
 - [TargetsListByOrgIdResponseMeta](docs/TargetsListByOrgIdResponseMeta.md)
 - [TestExecutionType](docs/TestExecutionType.md)
 - [TypeDef](docs/TypeDef.md)
 - [UpdateCollectionRequest](docs/UpdateCollectionRequest.md)
 - [UpdateCollectionRequestData](docs/UpdateCollectionRequestData.md)
 - [UpdateCollectionWithProjectsRequest](docs/UpdateCollectionWithProjectsRequest.md)
 - [VersioningSchema](docs/VersioningSchema.md)
 - [VersioningSchemaCustomType](docs/VersioningSchemaCustomType.md)
 - [VersioningSchemaSemverType](docs/VersioningSchemaSemverType.md)
 - [VersioningSchemaSingleSelectionType](docs/VersioningSchemaSingleSelectionType.md)
 - [YarnBuildArgs](docs/YarnBuildArgs.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
