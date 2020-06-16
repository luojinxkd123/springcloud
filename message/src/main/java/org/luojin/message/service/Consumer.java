package org.luojin.message.service;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-06-12 10:40
 */
@Component
public class Consumer {
    @RabbitListener(queues = "luojin")
    public String listener(Message message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws InterruptedException {

        System.out.println(message);
        try {
            channel.basicAck(tag, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "成功";
    }
}
