package io.github.spafka;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication(scanBasePackages = "io.github.spafka")
public class Provider
{
    public static void main( String[] args ) {
//        new EmbeddedZooKeeper(2181, false).start();

        SpringApplication.run(Provider.class,args);
    }
}