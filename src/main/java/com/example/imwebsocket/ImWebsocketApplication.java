package com.example.imwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ImWebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImWebsocketApplication.class, args);
    }

}
