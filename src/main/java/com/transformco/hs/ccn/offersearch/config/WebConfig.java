package com.transformco.hs.ccn.offersearch.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.handler.MappedInterceptor;

import com.searshc.hs.utils.web.interceptor.SecurityWebMvcInterceptor;

@Configuration
public class WebConfig {
	
	private static final String COMPONENT = "HSCCNContractSearchService";

	@Value("${token.pubkey.loc}")
	private Resource keyLocation;

	@Value("${server.servlet.context-path}")
	private String contextPath;
	
	@Bean
	@ConditionalOnProperty(name = "token.enabled", matchIfMissing = true, havingValue = "true")
	public MappedInterceptor mappedInterceptor() {
		return new MappedInterceptor(new String[] { "/services/contracts/**" }, securityInterceptor());
	}
	@Bean
	public SecurityWebMvcInterceptor securityInterceptor() {
	    SecurityWebMvcInterceptor securityWebMvcInterceptor = new SecurityWebMvcInterceptor(keyLocation, COMPONENT);
	    securityWebMvcInterceptor.addPathToIgnore(contextPath + "/swagger-ui.html");
	    securityWebMvcInterceptor.addPathToIgnore(contextPath + "/error");
	    return securityWebMvcInterceptor;
	}

}
