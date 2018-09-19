package com.theoryever.dubboservice;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderApplication.class)
                .web(WebApplicationType.NONE)   // 非 web 应用
                .run(args);
    }
}
