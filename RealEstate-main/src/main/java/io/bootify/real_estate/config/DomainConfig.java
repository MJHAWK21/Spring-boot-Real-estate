package io.bootify.real_estate.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("io.bootify.real_estate.domain")
@EnableJpaRepositories("io.bootify.real_estate.repos")
@EnableTransactionManagement
public class DomainConfig {
}
