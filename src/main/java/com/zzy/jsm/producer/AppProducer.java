package com.zzy.jsm.producer;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzy on 2018/1/10 0010.
 */
public class AppProducer {

    public static void main(String[] args) {
       ApplicationContext context  = new ClassPathXmlApplicationContext("producerQueue.xml");
        ProducerService producerService = context.getBean(ProducerService.class);
        for (int i = 0; i <1000 ; i++) {
            producerService.sendMessage("queue" + i);
        }

    }
}
