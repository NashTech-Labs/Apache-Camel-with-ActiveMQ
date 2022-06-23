package com.spring.apachecamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMsgConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:testmq").log("log:receiving messages=>${body}");

    }
}
