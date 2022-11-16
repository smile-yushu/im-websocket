package com.example.imwebsocket.job;

import com.example.imwebsocket.service.WsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * 消息生成job
 */
@Slf4j
@Component
public class MessageJob {
    @Autowired
    WsService wsService;

    /**
     * 每5s发送
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void run(){
        try {
            System.out.println("定时消息："+LocalDateTime.now().toString());
            wsService.broadcastMsg("自动生成消息 "  + LocalDateTime.now().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

