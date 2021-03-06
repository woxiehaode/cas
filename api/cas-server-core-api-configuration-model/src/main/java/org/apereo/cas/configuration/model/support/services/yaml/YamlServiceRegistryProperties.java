package org.apereo.cas.configuration.model.support.services.yaml;

import org.apereo.cas.configuration.model.SpringResourceProperties;
import org.apereo.cas.configuration.support.RequiresModule;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.core.io.ClassPathResource;

/**
 * This is {@link YamlServiceRegistryProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@RequiresModule(name = "cas-server-support-yaml-service-registry")
@Getter
@Setter
@Accessors(chain = true)
public class YamlServiceRegistryProperties extends SpringResourceProperties {

    private static final long serialVersionUID = 4863603996990314548L;

    public YamlServiceRegistryProperties() {
        setLocation(new ClassPathResource("services"));
    }
}
