package org.luojin.mq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/11 21:49
 */
@Component
public class Producer {
    @Resource
    private RabbitTemplate rabbitTemplate;
    public void send() {
        for (int i = 0; i < 100; i++) {
            rabbitTemplate.convertAndSend("mail.exchange","mail", "你好" + i);
        }
    }
}
