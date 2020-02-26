package com.lhespinel.springboot.demo_consume_soap.dtos;

public class MessageReponse {
    private String message;
    private String requestId;

    public MessageReponse(String message, String requestId) {
        this.message = message;
        this.requestId = requestId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
