package com.mervyn.learn.quarkus;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Gauge;
import io.prometheus.client.exporter.PushGateway;
import picocli.CommandLine;

import java.io.IOException;

/**
 * @author cs-mervyn
 * @version 1.0
 * @date 2023/1/4 13:19
 */

@CommandLine.Command(name = "update", mixinStandardHelpOptions = true)
public class CustomCommand implements Runnable {
    @Override
    public void run() {
        CollectorRegistry registry = new CollectorRegistry();

        Gauge.build()
                .name("_job_duration_seconds")
                .help("gauge_blog_fans")
                .register(registry);
        PushGateway pg = new PushGateway("127.0.0.1:9091");
        try {
            pg.pushAdd(registry, "pushgateway");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Coming");
    }
}
