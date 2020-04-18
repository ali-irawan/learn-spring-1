package com.devtalks.spring.session1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ConfigurationProperties
@ImportResource({"classpath:com/devtalks/spring/session1/app-context.xml"})
public class AppConfig {

}
