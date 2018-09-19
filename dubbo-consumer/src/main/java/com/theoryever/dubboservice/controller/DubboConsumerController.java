package com.theoryever.dubboservice.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.theoryever.dubboservice.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboConsumerController {

    @Reference(
            version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345"
    )
    private HelloService helloService;

    @RequestMapping("/say")
    public String sayHello(@RequestParam String name) {
        return helloService.sayHello(name);
    }
}
