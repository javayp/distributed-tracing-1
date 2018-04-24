package com.microservice.backend.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.PercentageBasedSampler;
import org.springframework.cloud.sleuth.sampler.SamplerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SamplerConfiguration {
	
	    @Bean
	    public Sampler defaultSampler(SamplerProperties samplerProperties) {
	        return new PercentageBasedSampler(samplerProperties);
	    }
}
