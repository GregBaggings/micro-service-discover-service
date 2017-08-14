package io.git.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Gergely_Agnecz on 8/14/2017.
 */
@SpringBootApplication
@ComponentScan
@EnableEurekaServer
public class Application
{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
