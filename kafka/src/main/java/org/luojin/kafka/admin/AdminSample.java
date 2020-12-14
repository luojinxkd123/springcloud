package org.luojin.kafka.admin;


import org.apache.kafka.clients.admin.*;

import java.util.Arrays;
import java.util.Properties;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-14 14:49
 */
public class AdminSample {

    public static void main(String[] args) {
        //createTop();
        getTopics();
    }
    public static AdminClient adminClient() {
        Properties properties = new Properties();
        properties.setProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.85.131:9092");
        return AdminClient.create(properties);
    }

    public static void createTop() {
        AdminClient client = adminClient();
        Short rs = 1;
        NewTopic topic = new NewTopic("test", 1, rs);
        CreateTopicsResult topics = client.createTopics(Arrays.asList(topic));
        //System.out.println(topics);

    }
    public static void getTopics() {
        ListTopicsResult result = adminClient().listTopics();
        System.out.println(result.names());
    }

}
