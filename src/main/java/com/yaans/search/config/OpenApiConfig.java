package com.yaans.search.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .version("v1.0")
                .title("Blog Search Application Document")
                .description("Blog Search Document with Open API");

        return new OpenAPI()
                .info(info);
    }

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("All")
                .pathsToMatch("/v1/api/**")
                .packagesToScan("com.yaans.search")
                .build();
    }

    // TODO : 하단 코드를 이용해 도큐먼트 그룹화
//    @Bean
//    public GroupedOpenApi sampleApi() {
//        return GroupedOpenApi.builder()
//                .group("sample name")
//                .pathsToMatch("/v1/api/sample/**")
//                .packagesToScan("com.yaans.search.sample")
//                .build();
//    }

}
