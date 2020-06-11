package org.luojin.mq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/11 21:49
 */
@Component
public class Consumer {
    @RabbitListener(queues = "luojin")
    public void listener(String message) {
        System.out.println(message);
    }
}
