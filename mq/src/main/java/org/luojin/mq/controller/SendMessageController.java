package org.luojin.mq.controller;

import org.luojin.mq.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/11 21:53
 */
@RestController
@RequestMapping("/mail")
public class SendMessageController {
    @Autowired
    private Producer producer;
    @GetMapping("/send")
    public String send() {
        producer.send();
        return "发送成功";
    }
}
