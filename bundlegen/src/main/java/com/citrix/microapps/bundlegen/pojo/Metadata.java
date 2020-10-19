package com.citrix.microapps.bundlegen.pojo;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;

/**
 * Metadata of a bundle loaded from `metadata.json`, common parts.
 */
public abstract class Metadata {
    private final Type type;
    private final String vendor;
    private final UUID trackingUuid;
    private final String title;
    private final String description;
    private final URI iconUrl;
    private final String masVersion;
    private final List<Category> categories;
    private final String created;
    private final String deprecatedDate;
    private final boolean supportsOAuthForActions;
    private final List<String> i18nLanguages;
    private final List<App> apps;
    private final List<VaResolver> vaResolvers;
    private final List<Tag> tags;

    public Metadata(
            Type type,
            String vendor,
            UUID trackingUuid,
            String title,
            String description,
            URI iconUrl,
            String masVersion,
            List<Category> categories,
            String created,
            String deprecatedDate,
            boolean supportsOAuthForActions,
            List<String> i18nLanguages,
            List<App> apps,
            List<VaResolver> vaResolvers,
            List<Tag> tags
    ) {
        this.type = type;
        this.vendor = vendor;
        this.trackingUuid = trackingUuid;
        this.title = title;
        this.description = ofNullable(description).orElse("");
        this.iconUrl = iconUrl;
        this.masVersion = masVersion;
        this.categories = ofNullable(categories).orElse(emptyList());
        this.created = created;
        this.deprecatedDate = deprecatedDate;
        this.supportsOAuthForActions = supportsOAuthForActions;
        this.i18nLanguages = ofNullable(i18nLanguages).orElse(emptyList());
        this.apps = ofNullable(apps).orElse(emptyList());
        this.vaResolvers = ofNullable(vaResolvers).orElse(emptyList());
        this.tags = ofNullable(tags).orElse(emptyList());
    }

    public Type getType() {
        return type;
    }

    public String getVendor() {
        return vendor;
    }

    public UUID getTrackingUuid() {
        return trackingUuid;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public URI getIconUrl() {
        return iconUrl;
    }

    public String getMasVersion() {
        return masVersion;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public String getCreated() {
        return created;
    }

    public String getDeprecatedDate() {
        return deprecatedDate;
    }

    public boolean isSupportsOAuthForActions() {
        return supportsOAuthForActions;
    }

    public List<String> getI18nLanguages() {
        return i18nLanguages;
    }

    public List<App> getApps() {
        return apps;
    }

    public List<VaResolver> getVaResolvers() {
        return vaResolvers;
    }

    public List<Tag> getTags() {
        return tags;
    }
}
