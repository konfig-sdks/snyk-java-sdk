package com.konfigthis.client;

import com.konfigthis.client.api.AppsApi;
import com.konfigthis.client.api.AuditLogsApi;
import com.konfigthis.client.api.CollectionApi;
import com.konfigthis.client.api.ContainerImageApi;
import com.konfigthis.client.api.CustomBaseImagesApi;
import com.konfigthis.client.api.IacSettingsApi;
import com.konfigthis.client.api.InvitesApi;
import com.konfigthis.client.api.IssuesApi;
import com.konfigthis.client.api.OpenApiApi;
import com.konfigthis.client.api.OrgsApi;
import com.konfigthis.client.api.ProjectsApi;
import com.konfigthis.client.api.SbomApi;
import com.konfigthis.client.api.SastSettingsApi;
import com.konfigthis.client.api.ServiceAccountsApi;
import com.konfigthis.client.api.SlackApi;
import com.konfigthis.client.api.SlackSettingsApi;
import com.konfigthis.client.api.TargetsApi;

public class Snyk {
    private ApiClient apiClient;
    public final AppsApi apps;
    public final AuditLogsApi auditLogs;
    public final CollectionApi collection;
    public final ContainerImageApi containerImage;
    public final CustomBaseImagesApi customBaseImages;
    public final IacSettingsApi iacSettings;
    public final InvitesApi invites;
    public final IssuesApi issues;
    public final OpenApiApi openApi;
    public final OrgsApi orgs;
    public final ProjectsApi projects;
    public final SbomApi sbom;
    public final SastSettingsApi sastSettings;
    public final ServiceAccountsApi serviceAccounts;
    public final SlackApi slack;
    public final SlackSettingsApi slackSettings;
    public final TargetsApi targets;

    public Snyk() {
        this(null);
    }

    public Snyk(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.apps = new AppsApi(this.apiClient);
        this.auditLogs = new AuditLogsApi(this.apiClient);
        this.collection = new CollectionApi(this.apiClient);
        this.containerImage = new ContainerImageApi(this.apiClient);
        this.customBaseImages = new CustomBaseImagesApi(this.apiClient);
        this.iacSettings = new IacSettingsApi(this.apiClient);
        this.invites = new InvitesApi(this.apiClient);
        this.issues = new IssuesApi(this.apiClient);
        this.openApi = new OpenApiApi(this.apiClient);
        this.orgs = new OrgsApi(this.apiClient);
        this.projects = new ProjectsApi(this.apiClient);
        this.sbom = new SbomApi(this.apiClient);
        this.sastSettings = new SastSettingsApi(this.apiClient);
        this.serviceAccounts = new ServiceAccountsApi(this.apiClient);
        this.slack = new SlackApi(this.apiClient);
        this.slackSettings = new SlackSettingsApi(this.apiClient);
        this.targets = new TargetsApi(this.apiClient);
    }

}
