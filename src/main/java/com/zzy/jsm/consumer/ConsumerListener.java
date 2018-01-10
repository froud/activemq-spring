package com.zzy.jsm.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by zzy on 2018/1/10 0010.
 */
public class ConsumerListener implements MessageListener {

    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("接收到消息 ： " + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
