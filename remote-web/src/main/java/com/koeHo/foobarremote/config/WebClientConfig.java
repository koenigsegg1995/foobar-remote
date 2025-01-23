package com.koeHo.foobarremote.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * 配置 WebClient 對 beefweb 發送請求
 */
@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                // 設定基礎 URL ，所有請求都會加在這後面
                .baseUrl("http://localhost:8880/api")
                // 設定預設 Header ，指定內容為 JSON
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

}



