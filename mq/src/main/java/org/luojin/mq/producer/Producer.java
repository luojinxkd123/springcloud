package org.luojin.mq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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
    private AmqpTemplate rabbitTemplate;
    public void send() {
        rabbitTemplate.convertAndSend("luojin","你好");
    }
}
