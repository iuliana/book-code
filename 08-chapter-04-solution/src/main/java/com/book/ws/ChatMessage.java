package com.book.ws;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by iuliana.cosmina on 10/1/15.
 */
@JsonPropertyOrder({ "name", "content"})
public class ChatMessage {

    @JsonProperty("content")
    private String content;

    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

}
