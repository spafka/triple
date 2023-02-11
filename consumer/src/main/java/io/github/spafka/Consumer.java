package io.github.spafka;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@RequestMapping
@EnableDubbo
@SpringBootApplication(scanBasePackages = "io.github.spafka")
public class Consumer {

    @Reference
    EchoService echoService;
    public static void main( String[] args ) {
        SpringApplication.run(Consumer.class,args);
    }



}
