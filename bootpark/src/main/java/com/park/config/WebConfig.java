package com.park.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.park.interceptor.Interceptor;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	
        registry.addInterceptor(new Interceptor())
        	.excludePathPatterns("/login.action")
        	.excludePathPatterns("/parkIndex.action")
        	.addPathPatterns("/**");
        
  
    }

}
