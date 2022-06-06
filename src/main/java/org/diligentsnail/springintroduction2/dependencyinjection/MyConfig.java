package org.diligentsnail.springintroduction2.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService0() {
        return new HelloService();
    }
}
