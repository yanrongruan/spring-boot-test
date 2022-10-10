package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestController {
    private final AtomicLong counter = new AtomicLong();

    //    @RequestMapping(value = "/message", method = RequestMethod.GET)
    @RequestMapping(value="/message",produces = "application/json")
    @GetMapping("/message")
    public MessageBean message(@RequestParam (name = "author", defaultValue = "jzman") String author,
                               @RequestParam(name = "message", defaultValue = "Hello world!") String message) {
        return new MessageBean(counter.incrementAndGet(), author, message);
    }
}
