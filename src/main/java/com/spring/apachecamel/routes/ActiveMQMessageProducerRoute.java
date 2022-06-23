package com.spring.apachecamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageProducerRoute extends RouteBuilder {
    @Override
    public void configure()throws Exception{

        from("timer://test?period=2000")
                .transform()
                .constant("Welcome to Apache Camel")
                .to("activemq:testmq");

    }
}
