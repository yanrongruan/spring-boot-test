package com.test.demo.controller;

public class MessageBean {
    private long id;
    private String author;
    private String message;

    public MessageBean(long id, String author, String info) {
        this.id = id;
        this.author = author;
        this.message = info;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
