package com.mervyn.learn.quarkus;


import picocli.CommandLine;

import java.util.concurrent.TimeUnit;

/**
 * @author cs-mervyn
 * @version 1.0
 * @date 2023/1/4 13:19
 */

@CommandLine.Command(name = "update", mixinStandardHelpOptions = true)
public class CustomCommand implements Runnable{
    @Override
    @MTest
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Coming");
    }
}
