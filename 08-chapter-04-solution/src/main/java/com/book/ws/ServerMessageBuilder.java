package com.book.ws;

/**
 * Created by iuliana.cosmina on 10/1/15.
 */
public class ServerMessageBuilder {

    public static ServerMessage build(ChatMessage message) {
        if (message.getContent() != null && !message.getContent().isEmpty()) {
            if (message.getContent().contains("bomb")) {
                return new ServerMessage("[" + message.getName() + "]: " + message.getContent().replace("bomb", "****"));
            }
            return new ServerMessage("[" + message.getName() + "]: " + message.getContent());
        }
        return new ServerMessage("[server]: Welcome " +message.getName());
    }
}
