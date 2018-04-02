package com.minlia.cloud.context.starter.configuration;

import com.minlia.cloud.context.ContextHolder;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author will
 */
@Configuration
@AutoConfigureOrder
public class ContextHolderAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  @ConditionalOnProperty(prefix = "system.context-holder", name = "enabled", havingValue = "true")
  public ContextHolder applicationContextHolder() {
    return new ContextHolder();
  }

}