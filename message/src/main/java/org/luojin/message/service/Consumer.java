package org.luojin.message.service;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-06-12 10:40
 */
@Component
public class Consumer {
    @Autowired
    private JavaMailSender javaMailSender;
    @RabbitListener(queues = "mail.queue")
    public void listener1(Message message, Channel channel) throws Exception {
        System.out.println("消费者1"+message.toString());
        try {
            //Thread.sleep(1000);
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo("luojin@ebigdata.org");
            mailMessage.setFrom("742411332@qq.com");
            mailMessage.setSubject("雪猪猪，我是发送者1");
            mailMessage.setText(new String(message.getBody()));
            javaMailSender.send(mailMessage);
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
        }
    }

    @RabbitListener(queues = "mail.queue")
    public void listener2(Message message, Channel channel) throws Exception {
        System.out.println("消费者2"+message.toString());
        try {
            //Thread.sleep(1000);
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo("luojin@ebigdata.org");
            mailMessage.setFrom("742411332@qq.com");
            mailMessage.setSubject("雪猪猪，我是发送者2");
            mailMessage.setText(new String(message.getBody()));
            javaMailSender.send(mailMessage);
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
        }
    }
}
