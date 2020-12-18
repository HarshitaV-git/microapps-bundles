package com.citrix.microapps.bundlegen.pojo.template;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceConfiguration {

    @JsonCreator
    public ServiceConfiguration(@JsonProperty(value = "security") SecurityConfiguration security,
                                @JsonProperty(value = "dataEndpoints") List<Endpoint> dataEndpoints,
                                @JsonProperty(value = "serviceActions") List<ServiceAction> serviceActions) {
        this.security = security;
        this.dataEndpoints = dataEndpoints;
        this.serviceActions = serviceActions;
    }

    private final SecurityConfiguration security;
    private final List<Endpoint> dataEndpoints;
    private final List<ServiceAction> serviceActions;
}
