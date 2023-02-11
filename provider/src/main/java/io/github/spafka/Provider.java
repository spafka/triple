package io.github.spafka;

import org.apache.dubbo.config.spring.ServiceBean;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@EnableDubbo
@SpringBootApplication(scanBasePackages = "io.github.spafka")
public class Provider
{
    public static void main( String[] args ) {
//        new EmbeddedZooKeeper(2181, false).start();

        ConfigurableApplicationContext context = SpringApplication.run(Provider.class, args);

        FooService bean = context.getBean(FooService.class);

        String[] beanNamesForType = context.getBeanNamesForType(ServiceBean.class);
        System.out.println(beanNamesForType);

    }
}