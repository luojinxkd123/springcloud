package org.luojin.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-14 16:23
 */
@SpringBootApplication
@EnableZipkinServer
public class SleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }

}
