package com.sean.hello;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.alibaba.dubbo.rpc.RpcContext;

/**
 * Created by Sean on 2015-12-14.
 */
public class HelloServiceImpl implements HelloService {
    /**
     * Say Hello.
     *
     * @param name 姓名
     * @return 问好内容
     */
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Receive] " + name + ", from consumer: " + RpcContext.getContext().getRemoteAddress());
        String hello = "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Response] " + hello);
        return hello;
    }
}
