package org.luojin.mq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/11 21:45
 */
@Configuration
public class MqConfig {
    /*
    思路：消息先到交换机（存储着绑定信息），经过信道（routeKey为标识的实体路由），发送到队列（queue：每个都是一个进程）
     */
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setConfirmCallback((correlationData, b, s) -> {
            if (b) {
                System.out.println("投递成功");
            } else {
                System.out.println("投递失败");
            }
        });
        return rabbitTemplate;
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("mail.exchange",true,false);
    }

    @Bean
    public Queue sendQueue() {
        return new Queue("mail.queue", true);
    }

    @Bean
    public Binding sendBindingOne() {
        return BindingBuilder.bind(sendQueue()).to(topicExchange()).with("mail");
    }
}
