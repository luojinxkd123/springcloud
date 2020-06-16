package org.luojin.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/11 21:45
 */
@Configuration
public class MqConfig {
    @Bean
    public Queue myQueue() {
        return new Queue("luojin");
    }
}
