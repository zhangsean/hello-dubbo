package com.sean.hello;

import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sean on 2015-12-15.
 */
public class ServiceTest {
    @Autowired
    private HelloService priHelloService;

    public void setPriHelloService(HelloService service) {
        this.priHelloService = service;
    }

    public void start() throws Exception {
        int i = 0;
        while (true) {
            i++;
            try {
                String name = "Sean " + i;
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Request] " + name);
                String hello = priHelloService.sayHello(name);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Receive] " + hello);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Thread.sleep(1000);
        }
    }
}
