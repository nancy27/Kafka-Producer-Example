package com.kafka.springbootkafkaproducer.controller;

import com.kafka.springbootkafkaproducer.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {
    private static final String TOPIC="kafka-example";
    @Autowired
    private KafkaTemplate<String, Customer> kafkaTemplate;
    /*
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("/publish/{name}")
    public String getMessage(@PathVariable String name ){
        kafkaTemplate.send(TOPIC,name);
        return "Published Successfully";

    }

     */

    @GetMapping("/publish/{userName}")
    public String publishJson(@PathVariable String userName){
        kafkaTemplate.send(TOPIC,new Customer(userName,"Technology",12000));
        return "Published Successfully";

    }
}
