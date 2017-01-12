package com.book.ws;

/**
 * Created by iuliana.cosmina on 10/1/15.
 */
public class MessageProcessor {

    public static ServerMessage build(ChatMessage message) {
        if (message.getContent() != null && !message.getContent().isEmpty()) {
            if (message.getContent().contains("bomb")) {
                return new ServerMessage("[" + message.getName() + "]: " + message.getContent().replace("bomb", "****"));
            } else if (message.getContent().contains("murder")) {
                return new ServerMessage("[" + message.getName() + "]: " + message.getContent().replace("murder", "****"));
            }
            return new ServerMessage("[" + message.getName() + "]: " + message.getContent());
        }

        return new ServerMessage("[server]: Welcome " +message.getName());
    }
}
