package com.ecommerce.spring_ecommerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceWebConfiguration implements WebMvcConfigurer {
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// TODO Auto-generated method stub
	WebMvcConfigurer.super.addResourceHandlers(registry);
	registry.addResourceHandler("/images/**").addResourceLocations("file.images/");
}
}
