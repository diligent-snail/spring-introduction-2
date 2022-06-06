package org.diligentsnail.springintroduction2.dependencyinjection;

import org.springframework.stereotype.Component;

// @Component
public class HelloService {
    public String sayHello(String name) {
        return "Hi, %s".formatted(name);
    }
}
