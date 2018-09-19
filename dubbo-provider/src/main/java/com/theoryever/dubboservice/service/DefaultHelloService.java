package com.theoryever.dubboservice.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)!";
    }
}
