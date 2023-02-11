package com.alibaba.nacos;

import com.alibaba.nacos.sys.env.EnvUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(
        scanBasePackages = {"com.alibaba.nacos"}
)
@ServletComponentScan
@EnableScheduling
public class Nacos {


    @Autowired
    ConfigurableEnvironment env;

    @Bean
    EnvUtil envUtil() {
        EnvUtil.setEnvironment(env);
        return new EnvUtil();
    }

    public static void main(String[] args) {

        System.setProperty("nacos.standalone", "true");

        SpringApplication.run(Nacos.class, args);

    }
}
