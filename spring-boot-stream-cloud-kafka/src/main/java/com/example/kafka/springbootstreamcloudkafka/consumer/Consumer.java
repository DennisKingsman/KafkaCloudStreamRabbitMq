package com.example.kafka.springbootstreamcloudkafka.consumer;

import com.example.kafka.springbootstreamcloudkafka.model.Employee;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class Consumer {

    @StreamListener(Sink.INPUT)
    public void consume(Employee employee) {
        System.out.printf(employee.toString());
    }

}
