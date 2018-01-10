package com.zzy.jsm.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by zzy on 2018/1/10 0010.
 */
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    JmsTemplate jmsTemplate;
    @Resource (name = "topicDestination")
    Destination destination;
    public void sendMessage(final String message) {
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                System.out.println("·¢ËÍÏûÏ¢" + textMessage.getText());
                return textMessage;
            }
        });

    }
}
