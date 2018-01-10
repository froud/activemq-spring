package com.zzy.jsm.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzy on 2018/1/10 0010.
 */
public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumerQueue.xml");
    }
}
