package org.diligentsnail.springintroduction2.dependencyinjection;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DemoRunner implements ApplicationRunner {
    private final HelloService helloService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(helloService.sayHello("BSE-207"));
    }
}
