package org.luojin.message.service;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-06-12 10:40
 */
@Component
public class Consumer {
    @RabbitListener(queues = "mail.queue")
    public void listener1(Message message, Channel channel) throws Exception {
        System.out.println("消费者1"+message.toString());
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }

    @RabbitListener(queues = "mail.queue")
    public void listener2(Message message, Channel channel) throws Exception {
        System.out.println("消费者2"+message.toString());
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }
}
