package com.book.ws;

import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;
import java.util.Random;

/**
 * Created by iuliana.cosmina on 10/1/15.
 */
@Controller
public class ChatController {

    @MessageMapping("/mirc")
    @SendTo("/topic/chat")
    public ServerMessage process(ChatMessage message) throws Exception {
        //generate random lag
        Random rn = new Random();
        Thread.sleep((rn.nextInt(5) + 1) * 1000);
        return MessageProcessor.build(message);
    }

    @Autowired
    SimpMessagingTemplate template;


    @Scheduled(fixedDelay = 60000)
    public void setNotification() throws Exception {
        LocalTime now = LocalTime.now();
        this.template.convertAndSend("/topic/chat", new ServerMessage("[server]: It is " + now.getHour() + ":" + now.getMinute()));
    }
}
