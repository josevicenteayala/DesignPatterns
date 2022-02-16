package com.pattern.spring.controller.singleton;

import com.pattern.spring.creational.singleton.Pool;
import com.pattern.spring.creational.singleton.PoolConnection;
import com.pattern.spring.creational.singleton.PoolThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("singleton")
public class PoolConnectionController {

    @Autowired
    private PoolThread poolThread;

    @GetMapping("connection")
    public Pool getPoolConnection() {
        return PoolConnection.getInstance();
    }

    @GetMapping("thread")
    public Pool getPoolThread() {
        return poolThread;
    }

}
