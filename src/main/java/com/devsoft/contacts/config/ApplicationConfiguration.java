package com.devsoft.contacts.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Sergey_PC on 21.04.2016.
 */

@Configuration
@ImportResource({"classpath:context.xml"})
public class ApplicationConfiguration {

    ApplicationConfiguration() {
    }
}
