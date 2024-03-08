

# CustomBaseImageAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**includeInRecommendations** | **Boolean** | Whether this image should be recommended as a base image upgrade.  If set to true, this image could be shown as a base image upgrade to other projects. If set to false this image will never be recommended as an upgrade.  |  |
|**projectId** | **UUID** | The ID of the container project that the custom base image is based off of. The attributes of this custom base image are taken from the latest snapshot at the time of creation. This means that no changes should be made to the original project after the creation of the custom base image, as new snapshots created from any changes will NOT be picked up.  |  |
|**versioningSchema** | [**VersioningSchema**](VersioningSchema.md) |  |  [optional] |



