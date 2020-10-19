package com.citrix.microapps.bundlegen.pojo;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata loaded from `metadata.json` for Coming Soon integrations.
 */
public class ComingSoonMetadata extends Metadata {

    private final String id;
    private final String version;

    @JsonCreator
    public ComingSoonMetadata(
            @JsonProperty(value = "type", required = true) Type type,
            @JsonProperty(value = "vendor", required = true) String vendor,
            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonProperty(value = "trackingUuid") UUID trackingUuid,
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "version") String version,
            @JsonProperty(value = "title", required = true) String title,
            @JsonProperty(value = "description") String description,
            @JsonProperty(value = "iconUrl", required = true) URI iconUrl,
            @JsonProperty(value = "categories") List<Category> categories,
            @JsonProperty(value = "created") String created,
            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonProperty(value = "deprecatedDate") String deprecatedDate,
            @JsonProperty(value = "tags") List<Tag> tags
    ) {
        super(type,
                vendor,
                trackingUuid,
                title,
                description,
                iconUrl,
                null,
                categories,
                created,
                deprecatedDate,
                false,
                null,
                null,
                null,
                tags);
        this.id = id;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }
}
