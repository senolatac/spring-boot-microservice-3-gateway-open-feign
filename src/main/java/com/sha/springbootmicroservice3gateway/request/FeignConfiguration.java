package com.sha.springbootmicroservice3gateway.request;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sa
 * @date 16.01.2022
 * @time 14:32
 */
@Configuration
public class FeignConfiguration
{
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(
            @Value("${service.security-secure-key-username}") String username,
            @Value("${service.security-secure-key-password}") String password)
    {
        return new BasicAuthRequestInterceptor(username, password);
    }
}
